package org.strategoxt.debug.core.util;

import org.eclipse.jdt.core.compiler.CompilationProgress;
import org.strategoxt.imp.debug.stratego.transformer.strategies.TimeMonitor;

public class DebugCompileProgress {

	private JavaCompileProgress javaCompileProgress = null;
	
	/**
	 * Time in milliseconds it took to add debug information to the Stratego program.
	 */
	private long generateStrategoDuration = -1;
	/**
	 * Time in milliseconds it took to generate the lookup table.
	 */
	private long generateLookupTableDuration = -1;
	/**
	 * Time in milliseconds it took to compile Stratego to Java.
	 */
	private long compileStrategoDuration = -1;
	/**
	 * Time in milliseconds it took to compile Java.
	 */
	private long compileJavaDuration = -1;
	
	public DebugCompileProgress() {
		// TODO Auto-generated constructor stub
		this.javaCompileProgress = new JavaCompileProgress();
	}
	
	
	public void printStats()
	{
		String pattern = "%1$-25s %2$#8s\n";
		if (getGenerateStrategoDuration() != -1)
		{
			System.out.format(pattern, "GENERATE STRATEGO:", getGenerateStrategoDuration());
		}
		if (getGenerateLookupTableDuration() != -1)
		{
			System.out.format(pattern, "GENERATE TABLE:", getGenerateLookupTableDuration());
		}
		if (getCompileStrategoDuration() != -1)
		{
			System.out.format(pattern, "COMPILE STRATEGO:", getCompileStrategoDuration());
		}
		if (getCompileJavaDuration() != -1)
		{
			System.out.format(pattern, "COMPILE JAVA:", getCompileJavaDuration());
		}
		TimeMonitor.getTimeMonitor().print();
	}
	
	public long getGenerateStrategoDuration() {
		return generateStrategoDuration;
	}
	
	protected void setGenerateStrategoDuration(long duration) {
		this.generateStrategoDuration = duration;
	}
	
	public long getGenerateLookupTableDuration() {
		return generateLookupTableDuration;
	}
	
	protected void setGenerateLookupTableDuration(long duration) {
		this.generateLookupTableDuration = duration;
	}
	
	
	protected void setCompileStrategoDuration(long duration)
	{
		this.compileStrategoDuration = duration;
	}
	
	public long getCompileStrategoDuration() {
		return compileStrategoDuration;
	}
	
	public long getCompileJavaDuration() {
		return compileJavaDuration;
	}
	
	protected JavaCompileProgress getJavaCompileProgress()
	{
		return this.javaCompileProgress;
	}
	
	class JavaCompileProgress extends CompilationProgress
	{
		private long startTime = -1;
		private long finishTime = -1;
		
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
			this.finishTime = System.currentTimeMillis();
			long duration = this.getDuration();
			DebugCompileProgress.this.compileJavaDuration = duration; 
			// TODO Auto-generated method stub
			//System.out.println("DONE");
		}
		
		@Override
		public void begin(int remainingWork) {
			this.startTime = System.currentTimeMillis();
			// TODO Auto-generated method stub
			//System.out.println("BEGIN: " + remainingWork);
		}
		
		public long getDuration()
		{
			return this.finishTime - this.startTime;
		}

	}
}
