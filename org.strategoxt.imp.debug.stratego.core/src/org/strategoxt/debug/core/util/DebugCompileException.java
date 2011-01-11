package org.strategoxt.debug.core.util;

public class DebugCompileException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8748784387087000852L;

	private String stdErrContents = null;
	
	public DebugCompileException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}
	
    public DebugCompileException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public DebugCompileException(Throwable cause) {
        super(cause);
    }
    
    public void setStdErrContents(String stdErrContents)
    {
    	this.stdErrContents = stdErrContents;
    }

    public String getStdErrContents() {
		return stdErrContents;
	}

}
