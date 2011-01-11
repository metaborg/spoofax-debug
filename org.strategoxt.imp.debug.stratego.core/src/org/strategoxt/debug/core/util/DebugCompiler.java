package org.strategoxt.debug.core.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.jdt.core.compiler.CompilationProgress;
import org.spoofax.interpreter.terms.IStrategoList;
import org.spoofax.interpreter.terms.IStrategoString;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.StrategoExit;
import org.strategoxt.lang.terms.TermFactory;


public class DebugCompiler {
	

	//public static final String WORKING_DIR = "/home/rlindeman/workspace/strj-dbg-app/working";
	private String workingDir = null;
	
	public DebugCompiler(String workingDir)
	{
		this.workingDir = workingDir;
	}
	
	public String getWorkingDir()
	{
		return this.workingDir;
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
	 * @throws DebugCompileException 
	 */
	public String runCompile(DebugSessionSettings debugSessionSettings) throws IOException, DebugCompileException
	{
		// TODO: Use debugsettings
		String strategoSourceBasedir = debugSessionSettings.getStrategoSourceBasedir();
		String strategoFilePath = debugSessionSettings.getStrategoFilePath();
		String projectName = debugSessionSettings.getProjectName();
		// throw exception if completeInputPath does not exist
		File absFilePath = new File(strategoSourceBasedir, strategoFilePath);
		//File f = new File(strategoFilePath);
		if (!absFilePath.exists())
		{
			throw new FileNotFoundException("Input file '" + absFilePath.getAbsolutePath() + "' does not exists!");
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
		String inputStrategoFilename = strategoSourceBasedir +"/" + strategoFilePath;
		boolean succes = compileStratego(debugSessionSettings, inputStrategoFilename, libraryName, compiledStrategoFilename); // stratego to java
		if (!succes)
		{
			// TODO: what to do when compile fails... Throw an Exception?
			throw new DebugCompileException("Failed to compile stratego program to java.");
		}
		
		String sourceBasedir = projectJavaDir;
		String mainSourceFilename = packageFolder + "/" + className + ".java";
		String binBase = compileJava(debugSessionSettings, sourceBasedir, mainSourceFilename, projectClassDir); // java to class
		
		return binBase;	
	}

	/**
	 * Compile a stratego program with debug information to java classes.
	 * 
	 * @param strategoFilePath strategoFilePath should point to the stratego file
	 * @param projectName projectName is the name of the project, used to create temp folders
	 * @return returns the basedir of the binary files
	 * @throws FileNotFoundException 
	 * @throws DebugCompileException 
	 */
	public String debugCompile(DebugSessionSettings debugSessionSettings) throws FileNotFoundException, DebugCompileException
	{
		// TODO: use debug settings
		String strategoSourceBasedir = debugSessionSettings.getStrategoSourceBasedir();
		String strategoFilePath = debugSessionSettings.getStrategoFilePath();
		String projectName = debugSessionSettings.getProjectName();
		
		File absFilePath = new File(strategoSourceBasedir, strategoFilePath);
		if (!absFilePath.exists())
		{
			throw new FileNotFoundException("Input file '" + absFilePath.getAbsolutePath() + "' does not exists!");
		}
		
		cleanDirectories(projectName); // create directory structure in the working dir
		// projectName should be unique, let the caller of this method decide what the name of the project is.


		Collection<String> libraryPaths = new ArrayList<String>();
		libraryPaths.add("."); // the "-I" arguments
		
		String projectDir = this.workingDir + "/" + projectName;
		String projectStrategoDir = projectDir + "/stratego";
		String projectJavaDir = projectDir + "/java";
		String projectClassDir = projectDir + "/class";

		String strOutputBasedir = projectStrategoDir;
		// strategoSourceBasedir + strategoFilePath is the input stratego file (without debug information)
		// strOutputBasedir + strategoFilePath will be the output stratego file (with debug information)
		List<String> generatedFiles = generateStratego(strategoSourceBasedir, strategoFilePath, strOutputBasedir, libraryPaths); // str to str (with debug info) 
		// TODO check if files are actually created!
		if (generatedFiles == null || generatedFiles.isEmpty())
		{
			throw new DebugCompileException("Failed to compile stratego program with debug information.");
		}
		
		// create lookup table
		String tableFilename = projectStrategoDir + "/" + projectName + ".table"; // location of the table
		// the table contains all debug lookup information for all files in the project
		generateLookupTable(tableFilename, generatedFiles);
		
		String libraryName = projectName; // will be the packageName
		String className = projectName;
		String packageFolder = projectName;
		String compiledStrategoFilename = projectJavaDir + "/" + packageFolder + "/" + className + ".java"; // packageName + className
		String inputStrategoFilename = strOutputBasedir + "/" + strategoFilePath; // the output of str to str is used as input
		boolean succes = compileStratego(debugSessionSettings, inputStrategoFilename, libraryName, compiledStrategoFilename); // stratego to java
		if (!succes)
		{
			// TODO: what to do when compile fails... Throw an Exception?
			throw new DebugCompileException("Failed to compile stratego program to java.");
		}
		String sourceBasedir = projectJavaDir;
		String mainSourceFilename = packageFolder + "/" + className + ".java";
		String binBase = compileJava(debugSessionSettings, sourceBasedir, mainSourceFilename, projectClassDir); // java to class
		
		return binBase;
	}
	
	/**
	 * Add stratego debug information to the given strategofile at sourceBasedir/inputFilename
	 * The output will be saved in the strOutputBasedir.
	 * The inputFilePath should be relative to the sourceBasedir. 
	 * libraryPaths contains all "-I" paths
	 * 
	 * The inputFilePath will be saved in the debug information instead
	 * of the complete absolute path so it points to a relative file containing the original stratego source.
	 * The debugger needs to figure out what the actual absolute path is.
	 * 
	 * Method returns a list of all generated files.
	 * 
	 * @param sourceBasedir
	 * @param inputFilePath
	 * @param outputFilename
	 * @return
	 * @throws DebugCompileException 
	 */
	protected List<String> generateStratego(String sourceBasedir, String inputFilePath, String strOutputBasedir, Collection<String> libraryPaths) throws DebugCompileException
	{
		// assume f is a valid file
		File absInput = new File(sourceBasedir, inputFilePath);
		System.out.println("Adding debug information to " + absInput.getAbsolutePath());
		System.out.println("Please wait...");
		
		System.out.println(sourceBasedir);
		System.out.println(inputFilePath);
		//System.out.println(outputFilename);
		
		//the package org.strjdbg.transformer transform a stratego program to a stratego program with debug information
		Context context = org.strategoxt.imp.debug.stratego.transformer.trans.Main.init();
		// TODO: set CustomIOAgent to forward error messages
		//Context context = org.strjdbg.transformer.Main.init();
		// see trans-str.str#apply-debug-project
		// (base-path, output-base-path, stratego-file)
		TermFactory factory = new TermFactory();

		IStrategoString[] kids = new IStrategoString[]
           {
				factory.makeString(sourceBasedir) , // base-path
				factory.makeString(strOutputBasedir) , // output-base-path
				factory.makeString(inputFilePath) // stratego-file
           };
		IStrategoTerm input = factory.makeTuple(kids);
		
		// termArguments should be a list of Strings, each is a path for the "-I" parameter
		StrategoTermBuilder b = new StrategoTermBuilder();
		IStrategoList termArguments = b.convertToIStrategoList(libraryPaths);
		
		IStrategoTerm term; 
		term = org.strategoxt.imp.debug.stratego.transformer.trans.apply_debug_project_0_1.instance.invoke(context, input, termArguments);

		
		boolean hasFailed = false;
		List<String> generatedFiles = new ArrayList<String>();
		if (term == null)
		{
			System.out.println("Adding debug information failed!");
			return null;
		}
		else if (term.getTermType() == IStrategoTerm.LIST)
		{
			IStrategoList listTerm = (IStrategoList) term;
			IStrategoTerm[] subterms = listTerm.getAllSubterms();
			for(IStrategoTerm subterm : subterms)
			{
				if (subterm.getTermType() == IStrategoTerm.TUPLE)
				{
					// should be a tuple: (status, filename)
					IStrategoTerm[] tupleTerms = subterm.getAllSubterms();
					if (tupleTerms.length != 2)
					{
						// tuple should have two items
					}
					else
					{
						IStrategoString ss = (IStrategoString) tupleTerms[0];
						String status = ss.stringValue();
						IStrategoString sf = (IStrategoString) tupleTerms[1];
						String filename = sf.stringValue();
						System.out.println(status + " " + filename);
						if (!"SUCCES".equals(status))
						{
							hasFailed = true;
							System.out.println(status + " : Failed at " + filename);
						}
						else
						{
							generatedFiles.add(filename);
						}
					}
				}
				
			}
		}
		else
		{
			// incorrect return type
		}


		if (hasFailed)
		{
			System.out.println("Adding debug information failed!");
			throw new DebugCompileException("Adding debug information failed!");
		}
		return generatedFiles;
	}
	
	protected static void generateLookupTable(String tableFilenameString, List<String> strategoDebugFileNames)
	{
		//the package org.strjdbg.transformer transform a stratego program to a stratego program with debug information
		Context context = org.strategoxt.imp.debug.stratego.transformer.trans.Main.init();
		// TODO: Use CustomIOAgent to forward output
		StrategoTermBuilder builder = new StrategoTermBuilder();
		IStrategoList inputfilenames = builder.convertToIStrategoList(strategoDebugFileNames);
		//IStrategoTerm input = new BasicStrategoString(strategoDebugFileName);
		
		// table-filename is the location of the output table
		// current term should be a list of inputfilenames each pointing to a stratego file
		// output is the location of the table
		// STRATEGO: create-table(|table-filename): inputfilenames* -> table-filename
		IStrategoTerm current = inputfilenames;
		TermFactory factory = new TermFactory();
		IStrategoTerm tableFilename = factory.makeString(tableFilenameString); 
		
		IStrategoTerm output = org.strategoxt.imp.debug.stratego.transformer.trans.create_table_0_1.instance.invoke(context, current, tableFilename);
		if (output == null || !output.toString().equals(tableFilenameString))
		{
			// output should match tableFilenameString
		}
	}
	
	/**
	 * Compile the given stratego file to java.
	 * 
	 * @param inputStrategoFilename
	 * @param libraryName
	 * @param compiledStrategoFilename
	 * @throws DebugCompileException 
	 */
	protected boolean compileStratego(DebugSessionSettings debugSessionSettings, String inputStrategoFilename, String libraryName, String compiledStrategoFilename) throws DebugCompileException
	{
		System.out.println("Generated file at " + inputStrategoFilename);
		System.out.println("Compile str to java...");
		// compile the stratego file at $outputFilename
		String strategodebuglib_rtree_dir = debugSessionSettings.getStrategoDebugLibraryDirectory();
		String javaImportName = "org.strategoxt.imp.debug.stratego.runtime.trans"; // was: "org.strategoxt.libstrategodebuglib"
		String[] strj_args = new String[] {
			"-i", 	inputStrategoFilename
			, "-o", compiledStrategoFilename // output will be java, so folders should match the library name
			, "-I", strategodebuglib_rtree_dir // location of rtree files
			, "-p", libraryName // will be the package name
			//, "--silent"
			, "--clean" // remove previous java
			, "-la", javaImportName // used as java import
		};
		boolean succes = false;
		Context c = org.strategoxt.strj.Main.init();
		CustomIOAgent ioAgent = new CustomIOAgent();
		c.setIOAgent(ioAgent);
		try {
			// TODO: can we forward the error log messages?
			org.strategoxt.strj.Main.mainNoExit(c, strj_args);
		}
		catch(StrategoExit e)
		{
			if (e.getValue() == StrategoExit.SUCCESS)
			{
				succes = true;
			}
			else
			{
				System.out.println("Exception: " + e.getMessage());
				String message = "Failed to compile stratego program to java. \n" + ioAgent.getStderr().trim();
				DebugCompileException de = new DebugCompileException(message, e);
				de.setStdErrContents(ioAgent.getStderr());
				throw de;
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception: " + e.getMessage());
			String message = "Failed to compile stratego program to java. \n" + ioAgent.getStderr().trim();
			DebugCompileException de = new DebugCompileException(message, e);
			de.setStdErrContents(ioAgent.getStderr());
			throw de;
			
		}
		
		/*
		System.out.println("Strj compiler finished.");
		String s = ioAgent.getStderr();
		System.out.println("ERR:");
		System.out.println(s);
		
		String s2 = ioAgent.getStdout();
		System.out.println("OUT:");
		System.out.println(s2);
		*/
		return succes;
	}
	
	/**
	 * Compiles the mainSourceFileName (path relative to sourceBasedir) and places the generated class files in the binBasedir.
	 * @param sourceBasedir
	 * @param mainSourceFileName
	 * @param binBasedir
	 * @return
	 */
	protected String compileJava(DebugSessionSettings debugSessionSettings, String sourceBasedir, String mainSourceFileName, String binBasedir)
	{
		System.out.println("Compiling " + mainSourceFileName);
		System.out.println("Please wait...");
		// import org.strategoxt.stratego_lib.*;
		// import org.strategoxt.libstrategodebuglib.*;
		// import org.strategoxt.lang.*;
		String strategoxtjar = debugSessionSettings.getStrategoxtJar();
		String libstrategodebuglib = debugSessionSettings.getStrategoDebugRuntimeJar();
		String strjdebugruntime = debugSessionSettings.getStrategoDebugRuntimeJavaJar();
		
		String classPath = strategoxtjar + ":" + libstrategodebuglib + ":" + strjdebugruntime + ":" + sourceBasedir;
		System.out.println(classPath);
		// http://www.javaworld.com/javatips/jw-javatip131.html
		String filename = sourceBasedir + "/" + mainSourceFileName;
		String[] args = new String[] {
		        "-d", binBasedir,
		         filename,
		         "-cp", classPath,
		         "-source", "1.5"
		    };
		FileOutputStream outStream = null;
		FileOutputStream errorStream = null;
		try {
			File outFile = new File("out.log");
			File errorFile = new File("error.log");
			outStream = new FileOutputStream(outFile, false);
			errorStream = new FileOutputStream(errorFile, false);
			
			System.out.println("Logfile: " + outFile.getAbsolutePath());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PrintWriter outWriter = null;
		PrintWriter errWriter = null;
		
		if (outStream != null)
		{
			outWriter = new PrintWriter(outStream);
		} else
		{
			outWriter = new PrintWriter(System.out);
		}
		if (errorStream != null)
		{
			errWriter = new PrintWriter(errorStream);
		}
		else
		{
			errWriter = new PrintWriter(System.err);
		}
		
		//boolean systemExitWhenFinished = false;
		//Map customDefaultOptions = new HashMap();
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
		//org.eclipse.jdt.internal.compiler.batch.Main main = new Main(outWriter, errWriter, systemExitWhenFinished, customDefaultOptions, compilationProgress);
		//boolean result = main.compile(args);
		boolean result = org.eclipse.jdt.core.compiler.batch.BatchCompiler.compile(args, outWriter, errWriter, compilationProgress);
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
