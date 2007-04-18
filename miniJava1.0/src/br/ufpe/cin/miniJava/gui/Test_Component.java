package br.ufpe.cin.miniJava.gui;

import junit.framework.TestCase;

class Test_Component extends TestCase {

	private Component component;

	protected void setUp() throws Exception {
		super.setUp();
		this.component = new Button();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		this.component = null;
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.Component.getBackground()'
	 */
	public void testGetBackground() {
		Color teste = new Color("#ABCDEF");
		this.component.setBackground(teste);
		Color resp = this.component.getBackground();
		assertEquals("As cores são diferentes:\n"
				,teste,resp);
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.Component.getFont()'
	 */
	public void testGetFont() {
		Font teste = new Font("Times New Roman",18);
		this.component.setFont(teste);
		Font resp = this.component.getFont();
		assertEquals("As fontes são diferentes:\n"
				,teste,resp);
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.Component.getForeground()'
	 */
	public void testGetForeground() {
		Color teste = new Color("#ABCDEF");
		this.component.setForeground(teste);
		Color resp = this.component.getForeground();
		assertEquals("As cores são diferentes:\n"
				,teste,resp);
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.Component.getHeight()'
	 */
	public void testGetHeight() {
		int teste = 15;
		this.component.setHeight(teste);
		int resp = this.component.getHeight();
		assertEquals("As alturas são diferentes:\n"
				,teste,resp);
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.Component.getWidth()'
	 */
	public void testGetWidth() {
		int teste = 30;
		this.component.setWidth(teste);
		int resp = this.component.getWidth();
		assertEquals("As larguras são diferentes:\n"
				,teste,resp);
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.Component.getX()'
	 */
	public void testGetX() {
		int teste = 20;
		this.component.setPosition(teste,25);
		int resp = this.component.getX();
		assertEquals("As coordenadas X são diferentes:\n"
				,teste,resp);
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.Component.getY()'
	 */
	public void testGetY() {
		int teste = 40;
		this.component.setPosition(10,teste);
		int resp = this.component.getY();
		assertEquals("As coordenadas Y são diferentes:\n"
				,teste,resp);
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.Component.isEnabled()'
	 */
	public void testIsEnabled() {
		boolean teste = false;
		this.component.setEnabled(teste);
		assertEquals("Os booleanos enabled são diferentes:\n",
				teste,this.component.isEnabled());
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.Component.isShowing()'
	 */
	public void testIsShowing() {
		boolean teste = true;
		this.component.setVisible(teste);
		assertEquals("Os booleanos showing são diferentes:\n",
				teste,this.component.isVisible());
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.Component.repaint()'
	 */
	public void testRepaint() {
		fail("Como testar o método repaint??");
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.Component.setBackground(Color)'
	 */
	public void testSetBackground() {
		Color novaCor = new Color(15,15,15);
		this.component.setBackground(novaCor);
		assertEquals("As cores de fundo não são iguais:\n",
				novaCor,this.component.getBackground());
		this.component.setBackground(null);
		assertNotNull("Foi inserido argumento nulo!",
				this.component.getBackground());
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.Component.setPosition(int, int)'
	 */
	public void testSetPosition() {
		int bounds [] = {15,30};
		this.component.setPosition(bounds[0],bounds[1]);
		assertEquals("Os bounds são iguais apenas se as posições forem iguais;\nX não é: ",
				bounds[0],this.component.getX());
		assertEquals("Os bounds são iguais apenas se as posições forem iguais;\nY não é: ",
				bounds[1],this.component.getY());
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.Component.setEnabled(boolean)'
	 */
	public void testSetEnabled() {
		boolean teste = true;
		this.component.setEnabled(teste);
		assertEquals("Os booleanos enabled são diferentes:\n",
				teste,this.component.isEnabled());
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.Component.setFont(Font)'
	 */
	public void testSetFont() {
		Font novaFonte = new Font("Arial",12);
		this.component.setFont(novaFonte);
		assertEquals("As fontes são diferentes:\n",
				novaFonte,this.component.getFont());
		this.component.setFont(null);
		assertNotNull("Foi inserido argumento nulo!",
				this.component.getFont());
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.Component.setForeground(Color)'
	 */
	public void testSetForeground() {
		Color novaCor = new Color(32,17,20);
		this.component.setForeground(novaCor);
		assertEquals("As cores não são iguais:\n",
				novaCor,this.component.getForeground());
		this.component.setForeground(null);
		assertNotNull("Foi inserido argumento nulo!",
				this.component.getForeground());
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.Component.setHeight(int)'
	 */
	public void testSetHeight() {
		int teste = 18;
		this.component.setHeight(teste);
		assertEquals("As alturas são diferentes:\n",
				teste,this.component.getHeight());
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.Component.setSize(int, int)'
	 */
	public void testSetSize() {
		int size [] = {32,22};
		this.component.setSize(size[0],size[1]);
		assertEquals("Os tamanhos são iguais apenas se os dois atributos forem iguais;\nWidth não é: ",
				size[0],this.component.getWidth());
		assertEquals("Os bounds são iguais apenas se os quatro atributos forem iguais;\nHeight não é: ",
				size[1],this.component.getHeight());
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.Component.setVisible(boolean)'
	 */
	public void testSetVisible() {
		boolean teste = false;
		this.component.setVisible(teste);
		assertEquals("Os booleanos visible são diferentes:\n",
				teste,this.component.isVisible());
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.Component.setWidth(int)'
	 */
	public void testSetWidth() {
		int teste = 27;
		this.component.setWidth(teste);
		assertEquals("As larguras são diferentes:\n",
				teste,this.component.getWidth());
	}

}
