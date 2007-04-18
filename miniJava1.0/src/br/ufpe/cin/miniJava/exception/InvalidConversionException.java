package br.ufpe.cin.miniJava.exception;

public class InvalidConversionException extends Exception {

	/**
	 * Atributo apenas com fins de implementação.
	 */
	private static final long serialVersionUID = 1L;

	public InvalidConversionException() {
		super();
	}

	public InvalidConversionException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidConversionException(String message) {
		super(message);
	}

	public InvalidConversionException(Throwable cause) {
		super(cause);
	}

}
