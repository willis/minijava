package br.ufpe.cin.miniJava.gui;


import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * Esta classe representa uma área de texto, um componente que permite
 * inserção de texto em múltiplas linhas.
 * 
 * <p align=center> 
 * <img border="0" src="../../../../../resources/TextArea.gif">
 * </p>
 * 
 * @author Bruno Barros (blbs)
 * @author Luiz Carlos d'Oleron (lcadb)
 * @version 1.0
 * @since 1.0
 */
public class TextArea extends AbstractText {

	private javax.swing.JTextArea textArea;
	private javax.swing.JScrollPane scrollPane;
	private final int MIN_WIDTH = 150;
	private final int MIN_HEIGHT = 150;
	private final String DEFAULT_TEXT = "textArea";
	
	/**
	 * Cria um novo <code>TextArea</code> sem texto, com o número de linhas
	 * e de colunas iguais a 0.
	 */
	public TextArea() {
		super(new Component(new JScrollPane(new JTextArea())));
		this.scrollPane = (JScrollPane) this.getComponent(); 
		this.textArea =  (JTextArea) this.scrollPane.getViewport().getView();
		this.scrollPane.setSize(MIN_WIDTH,MIN_HEIGHT);
		this.textArea.setText(DEFAULT_TEXT);
		this.textArea.setLineWrap(true);
	}
	
	/**
	 * Cria um novo <code>TextArea</code> sem texto, com o número de linhas
	 * e de colunas de acordo com o especificado.
	 * 
	 * @param rows número de linhas.
	 * @param columns número de colunas.
	 */
	public TextArea(int rows, int columns) {
		this();
		this.textArea.setRows(rows);
		this.textArea.setColumns(columns);
	}
	/**
	 * Cria um novo <code>TextArea</code> com um texto, sem especificar número
	 * de linhas e colunas, no entanto.
	 * 
	 * @param text texto a ser colocado inicialmente no <code>TextArea</code>.
	 */
	public TextArea(String text) {
		this();
		this.setText(text);
	}
	/**
	 * Cria um novo <code>TextArea</code> com um texto, e com o número de linhas
	 * e de colunas de acordo com o especificado;
	 * 
	 * @param text texto a ser colocado inicialmente no <code>TextArea</code>.
	 * @param rows número de linhas.
	 * @param columns número de colunas.
	 */
	public TextArea(String text, int rows, int columns) {
		this(rows,columns);
		this.setText(text);
	}
	/**
	 * Concatena texto ao fim deste <code>TextArea</code>.
	 * 
	 * @param str texto a ser concatenado.
	 */
	public void append(String str) {
		this.textArea.append(str);
	} 
	/**
	 * Fornece o número de colunas do <code>TextArea</code>.
	 * 
	 * @return número de colunas.
	 */
	public int getColumns() {
		return this.textArea.getColumns();
	} 
	/**
	 * Fornece o número de linhas preenchidas do <code>TextArea</code>.
	 * 
	 * @return número de linhas preenchidas do <code>TextArea</code>.
	 */
	public int getLineCount() {
		return this.textArea.getLineCount();
	} 
	/**
	 * Indica se o <code>TextArea</code> trata quebras-de-linhas, caso o
	 * texto seja muito grande.
	 * 
	 * @return <code>true</code> se o <code>TextArea</code> usa quebras-de-linha.
	 */
	public boolean getLineWrap() {
		return this.textArea.getLineWrap();
	} 
	/**
	 * Fornece o número de linhas do <code>TextArea</code>.
	 * 
	 * @return número de linhas.
	 */
	public int getRows() {
		return this.textArea.getRows();
	} 
	/**
	 * Insere um texto na posição especificada.
	 * 
	 * @param str texto a ser inserido.
	 * @param pos posição onde o texto deverá ser inserido.
	 */
	public void insert(String str, int pos) {
		this.textArea.insert(str,pos);
	} 
	/**
	 * Altera a cor de fundo do componente.
	 * 
	 * @param c <CODE>Color</CODE> com as propriedades de cor do componente.
	 */
	public void setBackground(Color c) {
		if (c != null) this.textArea.setBackground(c.getColor());
	} 
	/**
	 * Altera o número de colunas do <code>TextArea</code>.
	 * 
	 * @param columns novo número de colunas.
	 */
	public void setColumns(int columns) {
		this.textArea.setColumns(columns);
	} 
	/**
	 * Altera a cor de frente do componente.
	 * 
	 * @param c <CODE>Color</CODE> com as propriedades de cor do componente.
	 */
	public void setForeground(Color c) {
		if (c != null) this.textArea.setForeground(c.getColor());
	} 
	/**
	 * Altera a propriedade <code>lineWrap</code>.
	 * 
	 * @param b <code>boolean</code> que indicará se o <code>TextArea</code>
	 * deverá utilizar quebras-de-linha ou não.
	 */
	public void setLineWrap(boolean b) {
		this.textArea.setLineWrap(b);
	} 
	/**
	 * Altera o número de linhas do <code>TextArea</code>.
	 * 
	 * @param rows novo número de linhas.
	 */
	public void setRows(int rows) {
		this.textArea.setRows(rows);
	} 
	

}
