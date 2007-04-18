package br.ufpe.cin.miniJava.gui;

import junit.framework.TestCase;

class Test_TextField extends TestCase {

	@SuppressWarnings("unused")
	private TextField textField;

	protected void setUp() throws Exception {
		super.setUp();
		this.textField = new TextField();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		this.textField = null;
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.TextField.TextField()'
	 */
	public void testTextField() {
		TextField temp = new TextField ();
	
		int minWidth = 120;
		int minHeight = 20;
				
		assertEquals("O campo de texto não está inicializando com sua largura mínima:\n",
				minWidth,temp.getWidth());
		
		assertEquals("O campo de texto não está inicializando com sua altura mínima:\n",
				minHeight,temp.getHeight());
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.TextField.TextField(int)'
	 */
	public void testTextFieldInt() {
		fail();
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.TextField.TextField(String)'
	 */
	public void testTextFieldString() {
		fail();
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.TextField.TextField(String, int)'
	 */
	public void testTextFieldStringInt() {
		fail();
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.TextField.getColumns()'
	 */
	public void testGetColumns() {
		fail();
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.TextField.getHorizontalAlignment()'
	 */
	public void testGetHorizontalAlignment() {
		fail();
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.TextField.setColumns(int)'
	 */
	public void testSetColumns() {
		fail();
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.TextField.setHorizontalAlignment(int)'
	 */
	public void testSetHorizontalAlignment() {
		fail();
	}

}
