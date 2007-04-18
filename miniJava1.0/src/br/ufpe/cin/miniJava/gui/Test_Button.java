package br.ufpe.cin.miniJava.gui;

import junit.framework.TestCase;

class Test_Button extends TestCase {

	private Button botao;
	
	protected void setUp() throws Exception {
		super.setUp();
		this.botao = new Button();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		this.botao = null;
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.Button.Button()'
	 */
	public void testButton() {
		Button temp = new Button();
		int minWidth = 200;
		int minHeight = 200;
				
		assertEquals("O botão não está inicializando com sua largura mínima:\n",
				minWidth,temp.getWidth());
		
		assertEquals("O botão não está inicializando com sua altura mínima:\n",
				minHeight,temp.getHeight());
		
		assertEquals("O texto padrão do botão não está sendo inicializado:\n",
				"OK",temp.getText());
		

	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.Button.Button(String)'
	 */
	public void testButtonString() {
		Button temp = new Button("Testar string");
		botao.setText("Testar string");
		assertEquals("Dois botões são iguais apenas se possuirem a mesma referência\n",
				botao,botao);
		assertNotSame("Dois botões são iguais apenas se possuirem a mesma referência",
				temp);
		
	}

}
