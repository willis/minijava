package br.ufpe.cin.miniJava.gui;

import junit.framework.TestCase;

class Test_Label extends TestCase {

	@SuppressWarnings("unused")
	private Label label;

	protected void setUp() throws Exception {
		super.setUp();
		this.label = new Label();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		this.label = null;
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.Label.Label()'
	 */
	public void testLabel() {
		Label temp = new Label();
		int minWidth = 120;
		int minHeight = 20;
				
		assertEquals("O label não está inicializando com sua largura mínima:\n",
				minWidth,temp.getWidth());
		
		assertEquals("O label não está inicializando com sua altura mínima:\n",
				minHeight,temp.getHeight());
		
		assertEquals("O texto padrão do label não está inicializando corretamente:\n",
				"Label",temp.getHeight());
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.Label.Label(String)'
	 */
	public void testLabelString() {
		fail();
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.Label.Label(String, int)'
	 */
	public void testLabelStringInt() {
		fail();
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.Label.getHorizontalAlignment()'
	 */
	public void testGetHorizontalAlignment() {
		fail();
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.Label.getHorizontalTextPosition()'
	 */
	public void testGetHorizontalTextPosition() {
		fail();
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.Label.getText()'
	 */
	public void testGetText() {
		fail();
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.Label.getVerticalAlignment()'
	 */
	public void testGetVerticalAlignment() {
		fail();
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.Label.getVerticalTextPosition()'
	 */
	public void testGetVerticalTextPosition() {
		fail();
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.Label.setHorizontalAlignment(int)'
	 */
	public void testSetHorizontalAlignment() {
		fail();
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.Label.setHorizontalTextPosition(int)'
	 */
	public void testSetHorizontalTextPosition() {
		fail();
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.Label.setText(String)'
	 */
	public void testSetText() {
		fail();
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.Label.setVerticalAlignment(int)'
	 */
	public void testSetVerticalAlignment() {
		fail();
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.Label.setVerticalTextPosition(int)'
	 */
	public void testSetVerticalTextPosition() {
		fail();
	}

}
