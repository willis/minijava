package br.ufpe.cin.miniJava.gui;

/**
 * Esta classe representa as cores utilizadas nos componentes de MiniJava.
 * 
 * <p align=center> 
 * <img border="0" src="../../../../../resources/Color.gif">
 * </p>
 * 
 * @author Bruno Barros (blbs)
 * @author Luiz Carlos d'Oleron (lcadb)
 * @version 1.0
 * @since 1.0
 */
public class Color {

	private java.awt.Color color;
	/**
	 * Cria uma cor sem parâmetros (cor preta por padrão).
	 * Cada índice determina o quanto de cada cor primária
	 * (vermelho, verde, azul) entrará na composição da cor final
	 * ou seja (0, 0, 0) indicará 0 quantidade de vermelho, 0
	 * verde, 0 azul ou seja a cor preta é criada.
	 */
	public Color() {
		this.color = new java.awt.Color(0, 0, 0);
	}
	/**
	 * Cria uma cor baseada numa string.
	 * 
	 * @param color <CODE>String</CODE> no formato <i>#RRGGBB</i>, em componentes
	 * de vermelho, verde e azul, respectivamente.
	 */
	public Color(String color) {
		this();
		if ((color.charAt(0) == '#') && (color.length() == 7)) {
			String x = color.substring(1,3);
			int red = Integer.parseInt(x,16);
			x = color.substring(3,5);
			int green = Integer.parseInt(x,16);
			x = color.substring(5,7);
			int blue = Integer.parseInt(x,16);
			red = red % 256;
			green = green % 256;
			blue = blue % 256;
			this.color = new java.awt.Color(red, green, blue);
		}
	}
	/**
	 * Cria uma cor baseada em três inteiros, os inteiros
	 * indicarão a quantidade em que cada cor primária (vermelho, verde, azul)
	 * entrará na composição da cor final.
	 * 
	 * @param red valor do componente <i>vermelho</i> da cor, entre 0 e 255.
	 * @param green valor do componente <i>verde</i> da cor, entre 0 e 255.
	 * @param blue valor do componente <i>azul</i> da cor, entre 0 e 255.
	 */
	public Color(int red, int green, int blue) {
		red = (red < 255) ? red : 255;
		green = (green < 255) ? green : 255;
		blue = (blue < 255) ? blue : 255;
		red = (red > 0) ? red : 0;
		green = (green > 0) ? green : 0;
		blue = (blue > 0) ? blue : 0;
		this.color = new java.awt.Color(red, green, blue);
	}
	/**
	 * Verifica se duas cores são iguais.
	 * 
	 * @param param Cor que será comparada com esta.
	 * @return <CODE>true</CODE> se as cores forem iguais, <code>false</code>
	 * caso contrário.
	 */
	public boolean equals(Object param) {
		boolean retorno = false;
		if (param instanceof Color) {
			retorno = this.toString().equals(param.toString());
		}
		return retorno;
	}
	/**
	 * Fornece uma representação em <CODE>String</CODE> para esta cor,
	 * cada cor pode ser representada por uma String, assim este método
	 * fornecerá a String correspondente a cor sobre o qual é aplicado.
	 *  
	 * @return <CODE>String</CODE> com a representação desta cor.
	 */
	public String toString() {
		int cores[] = { this.color.getRed(), this.color.getGreen(),
				this.color.getBlue() };
		String resp[] = new String[cores.length];

		for (int i = 0; i < cores.length; i++) {
			String HexN = "";
			int q = Math.abs(cores[i]);
			int r;
			while (true) {
				r = q % 16;
				HexN = "0123456789ABCDEF".charAt(r) + HexN;
				q = (q - r) / 16;
				if (q == 0)
					break;
			}
			if (HexN.length() == 1)
				HexN = "0" + HexN;
			resp[i] = HexN;
		}
		return ("Color #" + resp[0] + resp[1] + resp[2]);
	}
	/**
	 * Retorna o objeto <CODE>java.awt.Color</CODE> interno desta cor
	 * (não é público, apenas para fins de implementação).
	 *  
	 * @return objeto <CODE>java.awt.Color</CODE> que esta cor representa.
	 */
	//nao é publico, nao deve aparecer!
	java.awt.Color getColor() {
		return this.color;
	}
	
}
