package br.ufpe.cin.miniJava.gui;
import javax.swing.SwingConstants;

/**
 * Esta classe representa um campo de texto, um componente de uma linha apenas
 * onde pode-se inserir texto.
 * 
 * <p align=center> 
 * <img border="0" src="../../../../../resources/TextField.gif">
 * </p>
 * 
 * @author Bruno Barros (blbs)
 * @author Luiz Carlos d'Oleron (lcadb)
 * @version 1.2
 * @since 1.0
 */
public class TextField extends AbstractText {

	private javax.swing.JPasswordField textField;
	private final int MIN_WIDTH = 120;
	private final int MIN_HEIGHT = 20;
	
	/**
	 * Cria um campo de texto vazio, com tamanho padrão de 120 x 20 pixels.
	 * 
	 * Observe que, a fins de comparação, um caractere de uma fonte no tamanho
	 * 12, ocupa aproximadamente 12 pixels de largura e de altura. 
	 *
	 */
	public TextField() {
		super(new Component(new javax.swing.JPasswordField()));
		this.textField = (javax.swing.JPasswordField) this.getComponent();
		this.textField.setEchoChar((char) 0);
		this.textField.setSize(MIN_WIDTH,MIN_HEIGHT);
	}
	/**
	 * Cria um novo campo de texto com um texto já inserido.
	 * 
	 * @param text texto inicial do <code>TextField</code>.
	 */
	public TextField(String text) {
		this();
		this.textField.setText(text);
	}
	/**
	 * Cria um novo campo de texto com um texto já inserido,
	 * e com um número de colunas definido.
	 * 
	 * @param text - texto inicial do TextField.
	 * @param columns - número de colunas. 
	 * @deprecated Como em miniJava não é tratado o uso de layouts,
	 * então este construtor possui a mesma função de <code>TextField(String)</code>.
	 */
	public TextField(String text, int columns) {
		this(text);
		this.getComponent().enable();
	} 
	
	/**
     * Fornece a posição do alinhamento horizontal.
     * 
     * @return <CODE>Position</CODE> com o alinhamento horizontal, podendo ser uma das
     * seguintes constantes definidas em MiniJavaConstants:<p>
     * <ul>
     * <li>LEFT</li><li>CENTER</li><li>RIGHT</li>
     * <li>LEADING</li><li>TRAILING</li>
     * </ul>
     */
	public MiniJavaConstants.Position getHorizontalAlignment() {
		int pos = this.textField.getHorizontalAlignment();
		MiniJavaConstants.Position retorno = null;
		switch (pos) {
			case (SwingConstants.RIGHT) :
				retorno = MiniJavaConstants.RIGHT;
				break;
			
			case (SwingConstants.LEFT) :
				retorno = MiniJavaConstants.LEFT;
				break;
			
			case (SwingConstants.CENTER) :
				retorno = MiniJavaConstants.CENTER;
				break;
			
			case (SwingConstants.LEADING) :
				retorno = MiniJavaConstants.LEADING;
				break;
			
			case (SwingConstants.TRAILING) :
				retorno = MiniJavaConstants.TRAILING;
		}
		return retorno;
	} 
	/**
     * Altera a posição do alinhamento horizontal.
     * 
     * @param alignment <CODE>Position</CODE> com o alinhamento horizontal,
     * podendo ser uma das seguintes constantes definidas em MiniJavaConstants:<p>
     * <ul>
     * <li>LEFT</li><li>CENTER</li><li>RIGHT</li>
     * <li>LEADING</li><li>TRAILING</li>
     * </ul>     
     */
	public void setHorizontalAlignment(MiniJavaConstants.Position alignment) {
		if (alignment != null)
		this.textField.setHorizontalAlignment(alignment.value());
	}
	
	//aparecer quando for necessário!
	/*
	public void setPasswordTextField(boolean t) {
		this.textField.setEchoChar(t ? ('*') : (char) 0);
	}
		 
	public boolean isPasswordTextField() {
		return false;
	}*/

}
