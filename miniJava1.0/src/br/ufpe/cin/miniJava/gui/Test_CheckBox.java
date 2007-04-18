package br.ufpe.cin.miniJava.gui;

import junit.framework.TestCase;

class Test_CheckBox extends TestCase {

	private CheckBox checkBox;
	
	protected void setUp() throws Exception {
		super.setUp();
		this.checkBox = new CheckBox();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		this.checkBox = null;
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.CheckBox.CheckBox()'
	 */
	public void testCheckBox() {
		assertNotNull("Criou um checkBox null!!",
				this.checkBox);
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.CheckBox.CheckBox(String)'
	 */
	public void testCheckBoxString() {
		this.checkBox = new CheckBox(null);
		assertNotNull("Criou um checkBox com string nula!",
				this.checkBox.getText());
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.CheckBox.CheckBox(String, boolean)'
	 */
	public void testCheckBoxStringBoolean() {
		boolean teste = false;
		String teste2 = "Teste";
		this.checkBox = new CheckBox(teste2,teste);
		assertNotNull("Criou um checkBox null!!",
				this.checkBox);
		assertEquals("As strings são diferentes:\n",
				teste2,this.checkBox.getText());
		assertEquals("Os booleanos são diferentes:\n",
				teste,this.checkBox.isSelected());
	}

}
