package br.ufpe.cin.miniJava.gui;

import junit.framework.TestCase;

class Test_AbstractButton extends TestCase {

	private AbstractButton absButton;
	
	protected void setUp() throws Exception {
		super.setUp();
		this.absButton = new Button();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		this.absButton = null;
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.AbstractButton.setEnabled(boolean)'
	 */
	public void testSetEnabled() {
		boolean teste = false;
		this.absButton.setEnabled(teste);
		boolean resp = this.absButton.isEnabled();
		assertEquals("Os booleanos são diferentes:\n",
				teste,resp);
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.AbstractButton.addClickListener(ClickListener)'
	 */
	public void testAddClickListener() {
		fail("Como testar um ouvinte!?");
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.AbstractButton.doClick()'
	 */
	public void testDoClick() {
		fail("Como testar o método DoClick, se ele eh void!?");
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.AbstractButton.getHorizontalAlignment()'
	 */
	public void testGetHorizontalAlignment() {
//		int horAlign = this.absButton.getHorizontalAlignment();
//		int horAlignNew = new Button().getHorizontalAlignment();
//		assertEquals("Os alinhamentos horizontais são diferentes:\n",
//				horAlign,horAlignNew);
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.AbstractButton.getHorizontalTextPosition()'
	 */
	public void testGetHorizontalTextPosition() {
//		int horTextPos = this.absButton.getHorizontalTextPosition();
//		int horTextPosNew = new Button().getHorizontalTextPosition();
//		assertEquals("As posições horizontais de texto são diferentes:\n",
//				horTextPos,horTextPosNew);
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.AbstractButton.getText()'
	 */
	public void testGetText() {
		String comparar = "";
		String texto = this.absButton.getText();
		assertEquals("O texto padrão não é \"\"\n",
				texto,comparar);

		comparar = "Teste";
		texto = new Button(comparar).getText();
		assertEquals("O texto não está sendo atribuido corretamente:\n",
				texto,comparar);
		
		comparar = null;
		texto = new Button(comparar).getText();
		assertEquals("Button não aceita \"NULL\" como texto\n",
				texto,comparar);
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.AbstractButton.getVerticalAlignment()'
	 */
	public void testGetVerticalAlignment() {
//		int verAlign = this.absButton.getVerticalAlignment();
//		int verAlignNew = new Button().getVerticalAlignment();
//		assertEquals("Os alinhamentos verticais são diferentes:\n",
//				verAlign,verAlignNew);
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.AbstractButton.getVerticalTextPosition()'
	 */
	public void testGetVerticalTextPosition() {
//		int verTextPos = this.absButton.getVerticalTextPosition();
//		int verTextPosNew = new Button().getVerticalTextPosition();
//		assertEquals("As posições verticais de textos são diferentes:\n",
//				verTextPos,verTextPosNew);
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.AbstractButton.isSelected()'
	 */
	public void testIsSelected() {
		boolean teste = true;
		this.absButton.setSelected(teste);
		boolean resp = this.absButton.isSelected();
		assertEquals("Os booleanos são diferentes:\n",
				teste,resp);
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.AbstractButton.setHorizontalAlignment(int)'
	 */
	public void testSetHorizontalAlignment() {
//		int teste = MiniJavaConstants.HORIZONTAL;
//		this.absButton.setHorizontalAlignment(teste);
//		int resp = this.absButton.getHorizontalAlignment();
//		assertEquals("O alinhamento horizontal não está sendo alterado:\n",
//				teste,resp);
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.AbstractButton.setHorizontalTextPosition(int)'
	 */
	public void testSetHorizontalTextPosition() {
//		int teste = MiniJavaConstants.TRAILING;
//		this.absButton.setHorizontalTextPosition(teste);
//		int resp = this.absButton.getHorizontalTextPosition();
//		assertEquals("A posição horizontal do texto não foi alterada:\n",
//				teste,resp);
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.AbstractButton.setSelected(boolean)'
	 */
	public void testSetSelected() {
		boolean teste = true;
		this.absButton.setSelected(teste);
		boolean resp = this.absButton.isSelected();
		assertEquals("O booleano Selected não foi alterado:\n",
				teste,resp);
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.AbstractButton.setText(String)'
	 */
	public void testSetText() {
		String comparar = "";
		this.absButton.setText(comparar);
		String texto = this.absButton.getText();
		assertEquals("Button não permite strings vazias:\n",
				texto,comparar);

		comparar = "Teste";
		this.absButton.setText(comparar);
		texto = this.absButton.getText();
		assertEquals("O texto não foi alterado:\n",
				texto,comparar);
		
		comparar = null;
		this.absButton.setText(comparar);
		texto = this.absButton.getText();
		assertNotNull("Foi inserido argumento nulo!",
				texto);
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.AbstractButton.setVerticalAlignment(int)'
	 */
	public void testSetVerticalAlignment() {
//		this.absButton.setVerticalAlignment(MiniJavaConstants.Position.CENTER);
//		int resp = this.absButton.getVerticalAlignment();
//		assertEquals("O alinhamento vertical não foi alterado:\n",
//				teste,resp);
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.AbstractButton.setVerticalTextPosition(int)'
	 */
	public void testSetVerticalTextPosition() {
//		int teste = MiniJavaConstants.BOTTOM;
//		this.absButton.setVerticalTextPosition(teste);
//		int resp = this.absButton.getVerticalTextPosition();
//		assertEquals("A posição vertical do texto não foi alterada:\n",
//				teste,resp);
	}

}
