package br.ufpe.cin.miniJava.gui;
import javax.swing.SwingConstants;

/**
 * Esta classe representa um label, ou seja, uma área de texto não-editável.
 * 
 * <p align=center> 
 * <img border="0" src="../../../../../resources/Label.gif">
 * </p>
 * 
 * @author Bruno Barros (blbs)
 * @author Luiz Carlos d'Oleron (lcadb)
 * @version 1.0
 * @since 1.0
 */
public class Label extends Component{

	private javax.swing.JLabel label;
	private final int MIN_WIDTH = 120;
	private final int MIN_HEIGHT = 20;
	private final String DEFAULT_TEXT = "Label";
	
	
    /**
     * Cria um label com o texto padrão "<i>Label</i>", este é 
     * o texto que será visível pelo usuário.
     */
	public Label(){		
		super(new javax.swing.JLabel());
		this.label = (javax.swing.JLabel) this.getComponent();
		this.label.setSize(MIN_WIDTH,MIN_HEIGHT);
		this.setText(DEFAULT_TEXT);
	}
    /**
     * Cria um label com um texto.
     * 
     * @param text texto a ser inicializado no label, este é 
     * o texto que será visível pelo usuário.
     */
	public Label(String text){		
		this();
		this.label.setText(text);
	}
    /**
     * Cria um label com um texto, e com alinhamento horizontal,
     * onde alinhameno diz respeito à posicão do deste componente
     * (Centro, Esquerda, Direita), por exemplo.
     * 
     * @param text texto a ser inicializado no label, este é 
     * o texto que será visível pelo usuário. 
     * @param horizontalAlignment alinhamento do texto, podendo ser uma das
     * seguintes constantes definidas em MiniJavaConstants:<p>
     * <ul>
     * <li>LEFT</li><li>CENTER</li><li>RIGHT</li>
     * <li>LEADING</li><li>TRAILING</li>
     * </ul>
     */	
	public Label(String text, MiniJavaConstants.Position horizontalAlignment){		
		this(text);
		this.label.setHorizontalAlignment(horizontalAlignment.value());
	}
	/**
     * Fornece a posição do alinhamento horizontal, onde alinhamento diz respeito
     *  a posicão do deste componente
     * (Centro, Esquerda, Direita) por exemplo.
     * 
     * @return <CODE>Position</CODE> com o alinhamento horizontal, podendo ser uma das
     * seguintes constantes definidas em MiniJavaConstants:<p>
     * <ul>
     * <li>LEFT</li><li>CENTER</li><li>RIGHT</li>
     * <li>LEADING</li><li>TRAILING</li>
     * </ul>
     */
	public MiniJavaConstants.Position getHorizontalAlignment() {
		int pos = this.label.getHorizontalAlignment();
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
     * Fornece a posição horizontal do texto.
     * 
     * @return <CODE>Position</CODE> com o alinhamento horizontal do texto,
     * podendo ser uma das seguintes constantes definidas em MiniJavaConstants:<p>
     * <ul>
     * <li>LEFT</li><li>CENTER</li><li>RIGHT</li>
     * <li>LEADING</li><li>TRAILING</li>
     * </ul>
     */
	public MiniJavaConstants.Position getHorizontalTextPosition() {
		MiniJavaConstants.Position retorno = null;
		int pos = this.label.getHorizontalTextPosition();
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
     * Fornece o texto do label, logo fornece 
     * o texto contido visualizado pelo usuário.
     * 
     * @return <CODE>String</CODE> com o texto do label.
     */	
	public String getText() {
		return this.label.getText();
	}
	
	/**
     * Fornece a posição do alinhamento vertical.
     * 
     * @return <CODE>Position</CODE> com o alinhamento vertical,
     * podendo ser uma das
     * seguintes constantes definidas em MiniJavaConstants:<p>
     * <ul>
     * <li>TOP</li><li>CENTER</li><li>BOTTOM</li>
     * </ul>
     */
	public MiniJavaConstants.Position getVerticalAlignment(){
		int pos = this.label.getVerticalAlignment();
		MiniJavaConstants.Position retorno = null;
		switch (pos) {
			case (SwingConstants.CENTER) :
				retorno = MiniJavaConstants.CENTER;
				break;
			
			case (SwingConstants.TOP) :
				retorno = MiniJavaConstants.TOP;
				break;
			
			case (SwingConstants.BOTTOM) :
				retorno = MiniJavaConstants.BOTTOM;
		}
		return retorno;
	} 
	/**
     * Fornece a posição vertical do texto.
     * 
     * @return <CODE>Position</CODE> com o alinhamento vertical do texto,
     * podendo ser uma das
     * seguintes constantes definidas em MiniJavaConstants:<p>
     * <ul>
     * <li>TOP</li><li>CENTER</li><li>BOTTOM</li>
     * </ul>
     */
	public MiniJavaConstants.Position getVerticalTextPosition() {
		int pos = this.label.getVerticalTextPosition();
		MiniJavaConstants.Position retorno = null;
		switch (pos) {
			case (SwingConstants.CENTER) :
				retorno = MiniJavaConstants.CENTER;
				break;
			
			case (SwingConstants.TOP) :
				retorno = MiniJavaConstants.TOP;
				break;
			
			case (SwingConstants.BOTTOM) :
				retorno = MiniJavaConstants.BOTTOM;
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
		this.label.setHorizontalAlignment(alignment.value());
	}
	/**
     * Altera a posição horizontal do texto.
     * 
     * @param textPosition <CODE>Position</CODE> com a posição horizontal do texto,
     * podendo ser uma das seguintes constantes definidas em MiniJavaConstants:<p>
     * <ul>
     * <li>LEFT</li><li>CENTER</li><li>RIGHT</li>
     * <li>LEADING</li><li>TRAILING</li>
     * </ul>     
     */
	public void setHorizontalTextPosition(MiniJavaConstants.Position textPosition) {
		if (textPosition != null)
		this.label.setHorizontalTextPosition(textPosition.value());
	} 
	/**
     * Altera o texto do label.
     * 
     * @param text <CODE>String</CODE> com o texto do label.
     */	
	public void setText(String text) {
		this.label.setText(text);
	}  
	/**
     * Altera a posição do alinhamento vertical.
     * 
     * @param alignment <CODE>Position</CODE> com a posição do alinhamento vertical,
     * podendo ser uma das
     * seguintes constantes definidas em MiniJavaConstants:<p>
     * <ul>
     * <li>TOP</li><li>CENTER</li><li>BOTTOM</li>
     * </ul>	
     */
	public void setVerticalAlignment(MiniJavaConstants.Position alignment) {
		if (alignment != null)
		this.label.setVerticalTextPosition(alignment.value());
	} 
	/**
     * Altera a posição vertical do texto.
     * 
     * @param textPosition <CODE>Position</CODE> com a posição vertical do texto,
     * podendo ser uma das
     * seguintes constantes definidas em MiniJavaConstants:<p>
     * <ul>
     * <li>TOP</li><li>CENTER</li><li>BOTTOM</li>
     * </ul>	
     */
	public void setVerticalTextPosition(MiniJavaConstants.Position textPosition) {
		if (textPosition != null)
		this.label.setVerticalTextPosition(textPosition.value());
	} 

}
