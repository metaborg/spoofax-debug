package org.strategoxt.debug.core.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.jdt.core.compiler.CompilationProgress;
import org.eclipse.jdt.internal.compiler.batch.Main;
import org.spoofax.interpreter.terms.BasicStrategoString;
import org.spoofax.interpreter.terms.BasicStrategoTuple;
import org.spoofax.interpreter.terms.IStrategoString;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.IStrategoTuple;
import org.strategoxt.lang.Context;


public class DebugCompiler {
	

	//public static final String WORKING_DIR = "/home/rlindeman/workspace/strj-dbg-app/working";
	private String workingDir = null;
	
	// jars needed for compiling java to class
	private static String strj_dbg_core = "/home/rlindeman/workspace/strj-dbg-core";

	protected static String strategoxtjar = strj_dbg_core + "/lib/strategoxt.jar";
	protected static String libstrategodebuglib = strj_dbg_core + "/lib/strj_dbg_runtime_lib.jar";
	protected static String strjdebugruntime = strj_dbg_core + "/lib/strj_dbg_runtime_lib-java.jar";
	
	private static String strategodebuglib_rtree_dir = strj_dbg_core + "/lib";
	
	public DebugCompiler(String workingDir)
	{
		this.workingDir = workingDir;
	}
	
	/**
	 * Clear the contents of the given project directory.
	 * 
	 * Folders 'stratego', 'java' and 'class' are completely cleaned.
	 * @param projectName
	 */
	public void cleanDirectories(String projectName)
	{
		String projectDir = this.workingDir + "/" + projectName;
		String projectStrategoDir = projectDir + "/stratego";
		String projectJavaDir = projectDir + "/java";
		String projectClassDir = projectDir + "/class";
		
		File dir = null;
		
		FileUtil.deleteFile(projectStrategoDir); // delete the 'stratego' dir
		FileUtil.deleteFile(projectJavaDir); // delete the 'java' dir
		FileUtil.deleteFile(projectClassDir); // delete the 'class' dir
		
		dir = new File(projectStrategoDir);
		dir.mkdirs();
		dir = new File(projectJavaDir);
		dir.mkdirs();
		dir = new File(projectClassDir);
		dir.mkdirs();
		
	}
	
	/**
	 * Compile a stratego program to java classes.
	 * 
	 * @param strategoFilePath strategoFilePath should point to the stratego file
	 * @param projectName projectName is the name of the project, used to create temp folders
	 * @return returns the basedir of the binary files
	 * @throws IOException
	 */
	public String runCompile(String strategoFilePath, String projectName) throws IOException
	{
		// throw exception if completeInputPath does not exist
		File f = new File(strategoFilePath);
		if (!f.exists())
		{
			throw new FileNotFoundException("Input file '" + strategoFilePath + "' does not exists!");
		}
		
		cleanDirectories(projectName); // create directory structure in the working dir
		// projectName should be the stratego filename without the dir and the extension		
		
		String projectDir = this.workingDir + "/" + projectName;
		String projectJavaDir = projectDir + "/java"; // save generated java classes in a temp working dir
		String projectClassDir = projectDir + "/class"; // save generated class files in a temp working dir
		
		String libraryName = projectName; // will be the packageName
		String className = projectName;
		String packageFolder = projectName;
		String compiledStrategoFilename = projectJavaDir + "/" + packageFolder + "/" + className + ".java"; // packageName + className
		String inputStrategoFilename = strategoFilePath;
		compileStratego(inputStrategoFilename, libraryName, compiledStrategoFilename); // stratego to java
		
		String sourceBasedir = projectJavaDir;
		String mainSourceFilename = packageFolder + "/" + className + ".java";
		String binBase = compileJava(sourceBasedir, mainSourceFilename, projectClassDir); // java to class
		
		return binBase;	
	}
	


	/**
	 * Compile a stratego program with debug information to java classes.
	 * 
	 * @param strategoFilePath strategoFilePath should point to the stratego file
	 * @param projectName projectName is the name of the project, used to create temp folders
	 * @return returns the basedir of the binary files
	 * @throws Exception 
	 */
	public String debugCompile(String strategoSourceBasedir, String strategoFilePath, String projectName) throws Exception
	{
		// throw exception if completeInputPath does not exist
		File absFilePath = new File(strategoSourceBasedir, strategoFilePath);
		//File f = new File(strategoFilePath);
		if (!absFilePath.exists())
		{
			throw new FileNotFoundException("Input file '" + absFilePath.getAbsolutePath() + "' does not exists!");
		}
		
		cleanDirectories(projectName); // create directory structure in the working dir
		// projectName should be the stratego filename without the dir and the extension
		
		File strategoFilePathFile = new File(strategoFilePath);
		String strFilename = strategoFilePathFile.getName(); // just the filename, no directory


		
		String projectDir = this.workingDir + "/" + projectName;
		String projectStrategoDir = projectDir + "/stratego";
		String projectJavaDir = projectDir + "/java";
		String projectClassDir = projectDir + "/class";

		String strOutputFilename = projectStrategoDir + "/" + strFilename;
		// outputFilename should stay the same
		strOutputFilename = generateStratego(strategoSourceBasedir, strategoFilePath, strOutputFilename); // str to str (with debug info) 
		// TODO check if file is actually created!
		if (strOutputFilename == null)
		{
			throw new Exception("Failed to compile stratego program with debug information");
		}
		
		// create lookup table
		generateLookupTable(strOutputFilename);
		
		String libraryName = projectName; // will be the packageName
		String className = projectName;
		String packageFolder = projectName;
		String compiledStrategoFilename = projectJavaDir + "/" + packageFolder + "/" + className + ".java"; // packageName + className
		String inputStrategoFilename = strOutputFilename; // the output of str to str is used as input
		compileStratego(inputStrategoFilename, libraryName, compiledStrategoFilename); // stratego to java
		
		String sourceBasedir = projectJavaDir;
		String mainSourceFilename = packageFolder + "/" + className + ".java";
		String binBase = compileJava(sourceBasedir, mainSourceFilename, projectClassDir); // java to class
		
		return binBase;
	}
	
	/**
	 * Add stratego debug information to the given strategofile at inputFilename, the output will be saved at outputFilename.
	 * The inputFilePath should be relative to the sourceBasedir. 
	 * 
	 * The inputFilePath will be saved in the debug information instead
	 * of the complete absolute path so it points to a relative file containing the original stratego source.
	 * The debugger needs to figure out what the actual absolute path is.
	 * 
	 * Method returns null when the generation failed.
	 * 
	 * @param sourceBasedir
	 * @param inputFilePath
	 * @param outputFilename
	 * @return
	 * @throws Exception 
	 */
	protected static String generateStratego(String sourceBasedir, String inputFilePath, String outputFilename) throws Exception
	{
		// assume f is a valid file
		File f = new File(sourceBasedir, inputFilePath);
		System.out.println("Adding debug information to " + f.getAbsolutePath());
		System.out.println("Please wait...");
		
		System.out.println(sourceBasedir);
		System.out.println(inputFilePath);
		System.out.println(outputFilename);
		
		//the package org.strjdbg.transformer transform a stratego program to a stratego program with debug information
		Context context = org.strjdbg.transformer.Main.init();
		// see trans-str.str#apply-debug-trans
		// (sourceBasedir, inputfilePath, outputfilename)
		// inputfilePath is relative to sourceBasedir.
		// sourceBasedir should be treated as a project directory
		// the generated file will be saved at outputfilename
		BasicStrategoString[] kids = new BasicStrategoString[]
           {
				new BasicStrategoString(sourceBasedir) , // sourceBasedir
				new BasicStrategoString(inputFilePath) , // inputfilePath
				new BasicStrategoString(outputFilename) // outputfilename
           };
		IStrategoTerm input = new BasicStrategoTuple(kids);
		IStrategoTerm term; 
		
		term = org.strjdbg.transformer.apply_debug_trans_0_0.instance.invoke(context, input);
		//System.out.println(term);
		String status = null; // will be SUCCES or FAIL
		String result = null; // should be the same as outputFilename
		if (term == null)
		{
			System.out.println("Adding debug information failed!");
			return null;
		}
		else if (term.getTermType() == IStrategoTerm.STRING)
		{
			IStrategoString sterm = (IStrategoString) term;
			outputFilename = sterm.stringValue();
		}
		else if (term.getTermType() == IStrategoTerm.TUPLE)
		{
			IStrategoTuple tterm = (IStrategoTuple) term;
			int subtermCount = tterm.getSubtermCount();
			if (subtermCount != 2)
			{
				// wrong number of arguments
			}
			else
			{
				// first argument is SUCCES or FAIL
				status = ((IStrategoString) tterm.get(0)).stringValue();
				// second argument is the outputfilename
				result = ((IStrategoString) tterm.get(1)).stringValue();
			}
		}
		//TODO: outputFilename should be the same as result
		
		
		if ("SUCCES".equals(status))
		{
			System.out.println("Adding debug information finished");	
		}
		else
		{
			System.out.println("Adding debug information failed!");
			throw new Exception("Adding debug information failed!");
		}
		return result;
	}
	
	protected static void generateLookupTable(String strategoDebugFileName)
	{
		//the package org.strjdbg.transformer transform a stratego program to a stratego program with debug information
		Context context = org.strjdbg.transformer.Main.init();
		
		IStrategoTerm input = new BasicStrategoString(strategoDebugFileName);
		
		org.strjdbg.transformer.create_table_0_0.instance.invoke(context, input);
	}
	
	/**
	 * Compile the given stratego file to java.
	 * 
	 * @param inputStrategoFilename
	 * @param libraryName
	 * @param compiledStrategoFilename
	 */
	protected static void compileStratego(String inputStrategoFilename, String libraryName, String compiledStrategoFilename)
	{
		System.out.println("Generated file at " + inputStrategoFilename);
		System.out.println("Compile str to java...");
		// compile the stratego file at $outputFilename
		String[] strj_args = new String[] {
			"-i", 	inputStrategoFilename
			, "-o", compiledStrategoFilename // output will be java, so folders should match the library name
			, "-I", strategodebuglib_rtree_dir // location of rtree files
			, "-p", libraryName // will be the package name
			//, "--silent"
			, "--clean" // remove previous java
			, "-la", "org.strategoxt.libstrategodebuglib" // used as java import
		};
		try {
			org.strategoxt.strj.Main.mainNoExit(strj_args);
		}
		catch(Exception e)
		{
			System.out.println("Exception: " + e.getMessage());
			
		}
		
		System.out.println("Strj compiler finished");		
	}
	
	/**
	 * Compiles the mainSourceFileName (path relative to sourceBasedir) and places the generated class files in the binBasedir.
	 * @param sourceBasedir
	 * @param mainSourceFileName
	 * @param binBasedir
	 * @return
	 */
	@SuppressWarnings("unchecked")
	protected String compileJava(String sourceBasedir, String mainSourceFileName, String binBasedir)
	{
		System.out.println("Compiling " + mainSourceFileName);
		System.out.println("Please wait...");
		// import org.strategoxt.stratego_lib.*;
		// import org.strategoxt.libstrategodebuglib.*;
		// import org.strategoxt.lang.*;
		String classPath = strategoxtjar + ":" + libstrategodebuglib + ":" + strjdebugruntime + ":" + sourceBasedir;
		
		// http://www.javaworld.com/javatips/jw-javatip131.html
		String filename = sourceBasedir + "/" + mainSourceFileName;
		String[] args = new String[] {
		        "-d", binBasedir,
		         filename,
		         "-cp", classPath,
		         "-source", "1.5"
		    };
		
		PrintWriter outWriter = new PrintWriter(System.out);
		PrintWriter errWriter = new PrintWriter(System.err);
		boolean systemExitWhenFinished = false;
		Map customDefaultOptions = new HashMap();
		CompilationProgress compilationProgress = new CompilationProgress() {
			
			@Override
			public void worked(int workIncrement, int remainingWork) {
				// TODO Auto-generated method stub
				//System.out.println("WORKED: " + workIncrement + " - " + remainingWork);
			}
			
			@Override
			public void setTaskName(String name) {
				// TODO Auto-generated method stub
				//System.out.println("SETTASKNAME: " + name);
			}
			
			@Override
			public boolean isCanceled() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public void done() {
				// TODO Auto-generated method stub
				//System.out.println("DONE");
			}
			
			@Override
			public void begin(int remainingWork) {
				// TODO Auto-generated method stub
				//System.out.println("BEGIN: " + remainingWork);
			}
		};
		org.eclipse.jdt.internal.compiler.batch.Main main = new Main(outWriter, errWriter, systemExitWhenFinished, customDefaultOptions, compilationProgress);
		boolean result = main.compile(args);
		System.out.println("Compile result: " + result);
		//org.eclipse.jdt.internal.compiler.batch.Main.main(args);
		
		/*
		org.eclipse.jdt.compiler.CompilationProgress progress = null; // instantiate your subclass
		org.eclipse.jdt.internal.compiler.batch.BatchCompiler.compile(
		"-classpath rt.jar A.java",
		new PrintWriter(System.out),
		new PrintWriter(System.err),
		progress);
		
		org.eclipse.jdt.internal.compiler.batch.Main.
		*/
		/*
		int status = com.sun.tools.javac.Main.compile(args);
		if (status == 0)
		{
			System.out.println("Compile ok");
		}
		else
		{
			System.out.println("Compile error");
		}*/
		System.out.println("Java compiler finished");
	    return binBasedir;
	}
	
	/**
	 * Takes the filename from the path and returns a suitable project name.
	 * 
	 * '.' and '-' are both replaced by '_' as they are not valid characters in a java identifier.
	 * @param f
	 * @return
	 */
	public static String createProjectName(File f)
	{
		String name = f.getName();
		// replace '.' with '_'
		name = name.replace('.', '_');
		// replace '-' with '_'
		name = name.replace('-', '_');
		return name;
	}

}
