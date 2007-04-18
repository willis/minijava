package br.ufpe.cin.miniJava.gui;

import junit.framework.TestCase;

class Test_Container extends TestCase {

	private Container container;

	protected void setUp() throws Exception {
		super.setUp();
		this.container = new Panel();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		this.container = null;
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.Container.Container(Component)'
	 */
	public void testContainer() {
		Panel temp = new Panel();
		assertEquals("Dois containers são iguais apenas se possuirem a mesma referência\n",
				this.container,this.container);
		assertNotSame("Dois containers são diferentes apenas se não possuirem a mesma referência\n",
				this.container,temp);
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.Container.add(Component)'
	 */
	public void testAdd() {
		Component item = new Label("Teste");
		int count = this.container.getComponentCount();
		this.container.add(item);
		assertEquals("O elemento não foi inserido corretamente:\n",
				(count + 1),this.container.getComponentCount());
				
		count = this.container.getComponentCount();
		this.container.add(null);
		assertEquals("O elemento nulo foi inserido:\n",
				count,this.container.getComponentCount());
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.Container.getComponent(int)'
	 */
	public void testGetComponentInt() {
		Component item = new Button("Teste");
		int count = this.container.getComponentCount();
		this.container.add(item);
		assertEquals("O elemento não está sendo retornado corretamente:\n",
				item,this.container.getComponent(count));		
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.Container.getComponentCount()'
	 */
	public void testGetComponentCount() {
		Component item = new Button("Teste");
		int count = this.container.getComponentCount();
		assertEquals("Ainda não há elementos:\n",
				0,count);	
		this.container.add(item);
		count = this.container.getComponentCount();
		assertEquals("Não está sendo incrementado:\n",
				1,count);	
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.Container.remove(Component)'
	 */
	public void testRemove() {
		Component itens [] = {new Button("Teste"),new Label("Teste"),new Panel()};
		for (int i = 0; i < itens.length; i++) {
			this.container.add(itens[i]);	
		}
		int count = this.container.getComponentCount();
		this.container.remove(itens[0]);
		assertEquals("O elemento existente não está sendo retirados:\n",
				count,(this.container.getComponentCount() + 1));
		
		count = this.container.getComponentCount();
		this.container.remove(null);
		assertEquals("Está sendo removido elemento null",
				count,this.container.getComponentCount());
		
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.Container.removeAll()'
	 */
	public void testRemoveAll() {
		Component itens [] = {new Button("Teste"),new Label("Teste"),new Panel(),new CheckBox("Ok")};
		for (int i = 0; i < itens.length; i++) {
			this.container.add(itens[i]);	
		}
		this.container.removeAll();
		assertEquals("Ainda há elementos:\n",
				0,this.container.getComponentCount());
	}

}
