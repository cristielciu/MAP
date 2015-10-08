package ro.ubbcluj.cs.invoice.utils;

public class InvalidFirmDelete extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;

	public InvalidFirmDelete(String msg) {
		message = msg;
	}
	
	public String getMessage() {
		return message;
	}
}
