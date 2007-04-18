package br.ufpe.cin.miniJava.gui;

/**
 * Esta classe representa as fontes utilizadas nos componentes de MiniJava.
 * 
 * <p align=center> 
 * <img border="0" src="../../../../../resources/Font.gif">
 * </p>
 * 
 * @author Bruno Barros (blbs)
 * @author Luiz Carlos d'Oleron (lcadb)
 * @version 1.0
 * @since 1.0
 */
public class Font {

	private java.awt.Font font;
	
	/**
	 * Cria uma fonte com o nome especificado no tamanho padrão.
	 * 
	 * @param name <CODE>String</CODE> com o nome da fonte
	 */
	public Font(String name) {		
		this.font = new java.awt.Font(name,java.awt.Font.BOLD,12);
	}
	/**
	 * Cria uma fonte com o nome especificado no tamanho especificado.
	 * 
	 * @param name <CODE>String</CODE> com o nome da fonte
	 * @param size tamanho da fonte
	 */
	public Font(String name, int size) {		
		this.font = new java.awt.Font(name,java.awt.Font.BOLD,size);
	}
	/**
	 * Verifica se duas fontes são iguais.
	 * 
	 * @param param Fonte que será comparada com esta.
	 * @return <CODE>true</CODE> se as fontes forem iguais.
	 */
	public boolean equals(Object param) {
		boolean retorno = false;
		if (param instanceof Font) {
			retorno = this.toString().equals(param.toString());
		}
		return retorno;
	}
	/**
	 * Fornece uma representação em <CODE>String</CODE> para esta fonte.
	 *  
	 * @return <CODE>String</CODE> com a representação desta fonte.
	 */
	public String toString() {
		String name = this.font.getName();
		int size = this.font.getSize();
		return ("Font " + name + ", " + size);
	}
	/**
	 * Retorna o objeto <CODE>java.awt.Font</CODE> interno desta fonte
	 * (não é público, apenas para fins de implementação).
	 *  
	 * @return objeto <CODE>java.awt.Font</CODE> que esta fonte representa.
	 */
	java.awt.Font getFont() {
		return this.font;		
	}

}
