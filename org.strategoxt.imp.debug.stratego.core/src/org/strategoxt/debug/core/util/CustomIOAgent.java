package org.strategoxt.debug.core.util;

import java.io.StringWriter;
import java.io.Writer;

import org.spoofax.interpreter.library.IOAgent;

public class CustomIOAgent extends IOAgent {

	private Writer stdoutStringWriter = new StringWriter();
	
	private Writer stderrStringWriter = new StringWriter();
	
	@Override
	public Writer getWriter(int fd) {
		// TODO Auto-generated method stub
        if (fd == CONST_STDOUT) {
            return stdoutStringWriter;
        } else if (fd == CONST_STDERR) {
            return stderrStringWriter;
        } else {
        	return super.getWriter(fd);
        }
	}
	
	public String getStdout()
	{
		return this.stdoutStringWriter.toString();
	}
	
	public String getStderr()
	{
		return this.stderrStringWriter.toString();
	}
}
