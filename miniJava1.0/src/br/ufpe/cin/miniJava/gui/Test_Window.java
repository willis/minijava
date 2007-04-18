package br.ufpe.cin.miniJava.gui;

import junit.framework.TestCase;

class Test_Window extends TestCase {

	@SuppressWarnings("unused")
	private Window window;
	
	protected void setUp() throws Exception {
		super.setUp();
		this.window = new Window (); 
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		this.window = null;
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.Window.Window()'
	 */
	public void testWindow() {
		Window temp = new Window();
		assertFalse("A janela está visivel ao ser construída!",
				temp.isVisible());
		
		int minWidth = 200;
		int minHeight = 200;
		
		assertEquals("A janela não está inicializando com sua largura mínima:\n",
				minWidth,temp.getWidth());
		
		assertEquals("A janela não está inicializando com sua altura mínima:\n",
				minHeight,temp.getHeight());
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.Window.Window(String)'
	 */
	public void testWindowString() {
		fail();
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.Window.getContentPane()'
	 */
	public void testGetContentPane() {
		fail();
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.Window.setContentPane(Container)'
	 */
	public void testSetContentPane() {
		fail();
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.Window.getOwner()'
	 */
	public void testGetOwner() {
		fail();
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.Window.isFocused()'
	 */
	public void testIsFocused() {
		fail();
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.Window.toBack()'
	 */
	public void testToBack() {
		fail();
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.Window.toFront()'
	 */
	public void testToFront() {
		fail();
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.Window.add(Component, int, int)'
	 */
	public void testAddComponentIntInt() {
		fail();
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.Window.exitOnClose(boolean)'
	 */
	public void testExitOnClose() {
		fail();
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.Window.setTitle(String)'
	 */
	public void testSetTitle() {
		fail();
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.Window.getTitle()'
	 */
	public void testGetTitle() {
		fail();
	}

}
