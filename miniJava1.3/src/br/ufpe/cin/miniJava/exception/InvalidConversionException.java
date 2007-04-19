package br.ufpe.cin.miniJava.exception;
/**
 * Esta classe representa uma exceção gerada quando não se tem sucesso a
 * fazer uma conversão de tipos em miniJava, por exemplo, quando tenta-se
 * converter de <code>String</code> para <code>int</code> ou <code>double</code>.
 * 
 * @author Bruno Barros (blbs)
 * @author Luiz Carlos d'Oleron (lcadb)
 * @version 1.2
 * @since 1.1
 */
public class InvalidConversionException extends Exception {

	private static final long serialVersionUID = 1L;
	/**
	 * Cria uma nova exceção do tipo <code>InvalidConversionException</code>
	 * sem mensagem de detalhamento de sua causa.
	 */
	public InvalidConversionException() {
		super();
	}
	/**
	 * Cria uma nova exceção do tipo <code>InvalidConversionException</code>
	 * com uma mensagem de detalhamento de sua causa, que deverá ser passada
	 * por parâmetro como uma <code>String</code>.
	 * 
	 * @param message <code>String</code> com uma mensagem indicando o motivo
	 * que gerou esta exceção.
	 */
	public InvalidConversionException(String message) {
		super(message);
	}

}
