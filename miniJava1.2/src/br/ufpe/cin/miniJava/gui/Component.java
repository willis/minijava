package br.ufpe.cin.miniJava.gui;

import br.ufpe.cin.miniJava.gui.listener.Listener;

/**
 * Esta é a classe principal de miniJava. Representa todos os componentes
 * visuais utilizados nesta API.
 * 
 * @author Bruno Barros (blbs)
 * @author Luiz Carlos d'Oleron (lcadb)
 * @version 1.2
 * @since 1.0
 */
public class Component {

	private java.awt.Component component = null;
	@SuppressWarnings("unused")
	private Component parent = null;

	/**
	 * Fornece a cor de fundo do componente, onde 
	 * a cor e representada por um objeto do tipo Color
	 * 
	 * @return <CODE>Color</CODE> com as propriedades de cor do componente,
	 * onde <CODE>Color</CODE> possui três atributos do tipo <CODE>int</CODE>
	 * que indicam a cor.
	 */
	public Color getBackground() {
		java.awt.Color color = this.component.getBackground();
		int red = color.getRed();
		int green = color.getGreen();
		int blue = color.getBlue();
		Color retorno = new Color(red, green, blue);
		return retorno;
	}

	/**
	 * Fornece a fonte do componente,ou seja, fornece
	 * as propriedades relativas ao "tamanho" das letras
	 * e ao padrão de escrita (<i>TimesNewRoman</i>, por exemplo)
	 * onde todas estas características estão armazenadas 
	 * num objeto do tipo Font.
	 * @return <CODE>Font</CODE> com as propriedades de fonte do componente ,
	 * ou seja tamanho e tipo de escrita padrão.
	 */
	public Font getFont() {
		java.awt.Font font = this.component.getFont();
		Font retorno = new Font(font.getName(), font.getSize());
		return retorno;
	}

	/**
	 * Fornece a cor de frente do componente, ou seja,
	 * fornece o cor dos caracteres que são parte 
	 * do componente.
	 * 
	* @return <CODE>Color</CODE> com as propriedades de cor do componente,
	 * onde <CODE>Color</CODE> possui três atributos do tipo <CODE>int</CODE>
	 * que indicam a cor.
	 */
	public Color getForeground() {
		java.awt.Color color = this.component.getForeground();
		int red = color.getRed();
		int green = color.getGreen();
		int blue = color.getBlue();
		Color retorno = new Color(red, green, blue);
		return retorno;
	}

	/**
	 * Fornece a altura do componente, onde altura diz respeito
	 * ao segmento(Y(final)- Y(inicial)) num eixo cartesiano  (x, y), lembrando
	 * que o ponto (0,0) se encontra no canto superior esquerdo.
	 * 
	 * @return altura do componente, esta altura é a mencionada 
	 * acima e é representada por um<CODE>int</CODE>
	 */
	public int getHeight() {
		return this.component.getHeight();
	}

	/**
	 * Fornece a largura do componente, onde largura diz respeito
	 * ao segmento(X(final)- X(inicial)) num eixo cartesiano  (x, y), lembrando
	 * que o ponto (0,0) se encontra no canto superior esquerdo.
	 * 
	 * @return largura do componente, esta largura é a mencionada 
	 * acima e é representada por um<CODE>int</CODE>
	 */
	public int getWidth() {
		return this.component.getWidth();
	}

	/**
	 * Fornece a posicao X do componente em relação ao lado esquerdo do componente.
	 * 
	 * @return posição X do componente, representada por um <CODE>int</CODE>
	 */
	public int getX() {
		return this.component.getX();
	}

	/**
	 * Fornece a posição Y do componente em relação ao lado superior do componente.
	 * 
	 * @return posição Y do componente.
	 */
	public int getY() {
		return this.component.getY();
	}

	/**
	 * Fornece a propriedade <i>enabled</i>, esta propriedade é a que indica
	 * se o componente está ou não ativo, por exemplo se a propriedade
	 *  <i>enabled</i> de um botão estiver como  <i>false</i> o usuário
	 *  não conseguirá interagir com o mesmo. 
	 * 
	 * @return <CODE>true</CODE> se o componente estiver ativo,
	 *  <i>false</i> caso contrário.
	 */
	public boolean isEnabled() {
		return this.component.isEnabled();
	}

	/**
	 * Fornece a propriedade <i>visible</i>, esta propriedade 
	 * indica se o componente está ou não visível pelo
	 * usuário.
	 * 
	 * @return <CODE>true</CODE> se o componente estiver visível,
	 *  <i>false</i> caso contrário.
	 */
	public boolean isVisible() {
		return this.component.isVisible();
	}

	/**
	 * Repinta este componente na tela, necessário caso algum sub-componente
	 * tenha sido adicionado à ele.
	 */
	public void repaint() {
		this.component.repaint();
	}

	/**
	 * Altera a cor de fundo do componente onde 
	 * a cor é representada por um objeto do tipo Color.
	 * 
	 * @param c <CODE>Color</CODE> com as propriedades de cor do componente,
	 * onde <CODE>Color</CODE> possui três atributos do tipo <CODE>int</CODE>
	 * que indicam a cor.
	 */
	public void setBackground(Color c) {
		if (c != null)
			this.component.setBackground(c.getColor());
	}

	/**
	 * Altera a posição do Componente, dadas suas novas coordenadas (X,Y).
	 * 
	 * @param x
	 *            Posição X do component.
	 * @param y
	 *            Posição Y do component.
	 */
	public void setPosition(int x, int y) {
		int width = this.component.getWidth();
		int height = this.component.getHeight();
		this.component.setBounds(x, y, width, height);
	}

	/**
	 * Altera a propriedade <i>enabled</i> do componente.
	 * 
	 * @param b
	 *            <CODE>boolean</CODE> que indicará se o componente deverá
	 *            estar ativo ou não.
	 */
	public void setEnabled(boolean b) {
		this.component.setEnabled(b);
	}

	/**
	 * Altera a fonte do componente.
	 * 
	 * @param f
	 *            <CODE>Font</CODE> com as propriedades de fonte do
	 *            componente.
	 */
	public void setFont(Font f) {
		if (f != null)
			this.component.setFont(f.getFont());
	}

	/**
	 * Altera a cor de frente do componente.
	 * 
	 * @param c
	 *            <CODE>Color</CODE> com as propriedades de cor do componente.
	 */
	public void setForeground(Color c) {
		if (c != null)
			this.component.setForeground(c.getColor());
	}

	/**
	 * Altera a altura do componente.
	 * 
	 * @param height
	 *            altura do componente.
	 */
	public void setHeight(int height) {
		int width = this.component.getWidth();
		this.component.setSize(width, height);
	}

	/**
	 * Altera as dimensões do componente, baseado em sua
	 * nova altura e largura
	 * 
	 * @param width
	 *            largura do componente em pixels.
	 * @param height
	 *            altura do componente em pixels.
	 */
	public void setSize(int width, int height) {
		this.component.setSize(width, height);
	}

	/**
	 * Altera a propriedade <i>visible</i>, esta propriedade 
	 * indica se o componente está ou não visível pelo
	 * usuário.
	 * 
	 * @param b <code>boolean</code> que indicará se o componente
	 * estará visivel (<code>true</code>) ou não (<code>false</code>).
	 */
	public void setVisible(boolean b) {
		this.component.setVisible(b);
	}

	/**
	 * Altera a largura do componente.
	 * 
	 * @param width
	 *            largura do componente.
	 */
	public void setWidth(int width) {
		int height = this.component.getHeight();
		this.component.setSize(width, height);
	}

	/**
	 * Cria um novo componente. O método é default porque nem todas as classes
	 * devem acessar o atributo component desta classe, que é
	 * java.awt.Component.
	 * 
	 * @param component
	 *            <CODE>java.awt.Component</CODE> para fins de implementação.
	 */
	// METODO DEFAULT PARA NAO APARECER NO JAVADOC
	Component(java.awt.Component component) {
		this.component = component;
	}

	/**
	 * Verifica se dois componentes são iguais, dois componetes
	 * são iguais quando possuem as mesmas características.
	 * 
	 * @param obj
	 *            Component que será comparado com o componente
	 *            sobre o qual o método é aplicado.
	 * @return <CODE>true</CODE> se os componentes forem iguais
	 * <CODE>false</CODE> caso contrário
	 */
	public boolean equals(Object obj) {
		if (obj instanceof Component) {
			return this.component.equals(((Component) obj).component);
		}
		return super.equals(obj);
	}

	public String toString() {
		String retorno = "Component : " + this.component.getClass().getCanonicalName() + "\n";
		if (parent != null) {
			retorno = ("Parent : " + this.parent.getClass().getCanonicalName() + "\n");
		}
		return retorno;
	}

	/**
	 * Fornece o objeto <CODE>java.awt.Component</CODE> representado por este
	 * Component. É a base da implementação de herança em miniJava.
	 * 
	 * O método é default porque apenas as classes de br.ufpe.cin.miniJava.gui
	 * devem acessar o atributo component desta classe, que é
	 * java.awt.Component.
	 * 
	 * @return <CODE>java.awt.Component</CODE> para fins de implementação.
	 */
	// METODO DEFAULT PARA NAO APARECER NO JAVADOC
	java.awt.Component getComponent() {
		return this.component;
	}

	/**
	 * Altera o objeto <CODE>java.awt.Component</CODE> representado por este
	 * Component. É a base da implementação de herança em miniJava.
	 * 
	 * O método é default porque apenas as classes de br.ufpe.cin.miniJava.gui
	 * devem acessar o atributo component desta classe, que é
	 * java.awt.Component.
	 * 
	 * @param c
	 *            <CODE>java.awt.Component</CODE> para fins de implementação.
	 */
	// METODO DEFAULT PARA NAO APARECER NO JAVADOC
	void setComponent(java.awt.Component c) {
		this.component = c;
	}

	/**
	 * Implementação vazia do <code>addListener</code> que as classes que
	 * necessitarem de ouvintes deverão sobrescrever.
	 * 
	 * @param listener
	 *            <code>Listener</code> a ser adicionado.
	 * 
	 */
	// METODO DEFAULT PARA NAO APARECER NO JAVADOC
	void addListener(Listener listener) {

	}

	/**
	 * Retorna uma referência para o objeto janela que contém este componente.
	 * Caso este componente já seja uma janela, ou caso este componente não
	 * esteja inserido em nenhuma janela, ele retornará <code>null</code>.
	 * 
	 * @return <code>Window</code> onde o component está inserido.
	 */
	// METODO DEFAULT PARA NAO APARECER NO JAVADOC
	Component getParent() {
		return this.parent;
	}
	// METODO DEFAULT PARA NAO APARECER NO JAVADOC
	void setParent(Component w) {
		this.parent = w;
	}

}
