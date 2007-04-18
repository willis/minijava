package br.ufpe.cin.miniJava.gui;

import junit.framework.TestCase;

class Test_ComboBox extends TestCase {

	private ComboBox comboBox;
	
	protected void setUp() throws Exception {
		super.setUp();
		this.comboBox = new ComboBox();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		this.comboBox = null;
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.ComboBox.setEnabled(boolean)'
	 */
	public void testSetEnabled() {
		boolean teste = true;
		this.comboBox.setEnabled(teste);
		boolean resp = this.comboBox.isEnabled();
		assertEquals(teste,resp);
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.ComboBox.ComboBox()'
	 */
	public void testComboBox() {
		ComboBox temp = new ComboBox();
		assertNotNull(temp);
		assertEquals(temp,temp);
		assertNotSame(this.comboBox,temp);
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.ComboBox.ComboBox(Object[])'
	 */
	public void testComboBoxObjectArray() {
		Object teste [] = {15,new String("teste"),null};
		ComboBox temp = new ComboBox(teste);
		assertNotNull(temp);
		Object resp [] = new Object [teste.length];
		for (int i = 0; i < teste.length; i++) {
			resp[i] = temp.getItemAt(i);
			assertEquals(teste[i],resp[i]);
		}
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.ComboBox.addClickListener(ClickListener)'
	 */
	public void testAddClickListener() {
		fail("Como testar um ouvinte!?");
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.ComboBox.addItem(Object)'
	 */
	public void testAddItem() {
		Object item = new String("Teste");
		int count = this.comboBox.getItemCount();
		this.comboBox.addItem(item);
		assertEquals((count + 1),this.comboBox.getItemCount());
		assertEquals(item,this.comboBox.getItemAt(count));
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.ComboBox.getItemAt(int)'
	 */
	public void testGetItemAt() {
		Object item [] = {150, 25.15, false, "Teste"};
		for (int i = 0; i < item.length; i++) {
			this.comboBox.addItem(item[i]);	
		}
		
		int index = 2;
		Object resp = this.comboBox.getItemAt(index);
		assertEquals(item[index],resp);
		
		resp = this.comboBox.getItemAt(-1);
		assertNull(resp);
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.ComboBox.getItemCount()'
	 */
	public void testGetItemCount() {
		int elements = this.comboBox.getItemCount();
		assertEquals(elements,0);
		
		Object item [] = {25.15, true, "Teste"};
		for (int i = 0; i < item.length; i++) {
			this.comboBox.addItem(item[i]);
		}
		
		elements = this.comboBox.getItemCount();
		assertEquals(elements,item.length);
		
		this.comboBox.addItem(null);
		
		elements = this.comboBox.getItemCount();
		assertTrue("Não pode incrementar quando inserir null!",
				(elements == item.length));
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.ComboBox.getMaximumRowCount()'
	 */
	public void testGetMaximumRowCount() {
		int teste = 15;
		this.comboBox.setMaximumRowCount(teste);
		int resp = this.comboBox.getMaximumRowCount();
		assertEquals(teste,resp);
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.ComboBox.getSelectedIndex()'
	 */
	public void testGetSelectedIndex() {
		Object item [] = {25.15, true, "Teste"};
		for (int i = 0; i < item.length; i++) {
			this.comboBox.addItem(item[i]);
		}
		
		int index = 2;
		this.comboBox.setSelectedIndex(index);
		int resp = this.comboBox.getSelectedIndex();
		assertEquals(index,resp);
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.ComboBox.getSelectedItem()'
	 */
	public void testGetSelectedItem() {
		Object item [] = {25.15, true, "Teste", 10, new int [] {2,9}};
		for (int i = 0; i < item.length; i++) {
			this.comboBox.addItem(item[i]);
		}
		int index = 4;
		this.comboBox.setSelectedIndex(index);
		Object resp = this.comboBox.getSelectedItem();
		assertEquals(item[index],resp);
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.ComboBox.getSelectedObjects()'
	 */
	public void testGetSelectedObjects() {
		Object item [] = {25.15, true, "Teste", 10, new int [] {2,9}};
		for (int i = 0; i < item.length; i++) {
			this.comboBox.addItem(item[i]);
			this.comboBox.setSelectedItem(i);
		}
		Object resp [] = this.comboBox.getSelectedObjects();
		for (int i = 0; i < resp.length; i++) {
			assertEquals(item[i],resp[i]);	
		}
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.ComboBox.insertItemAt(Object, int)'
	 */
	public void testInsertItemAt() {
		Object item [] = {25.15, true, "Teste", 10, new int [] {2,9}, null};
		for (int i = 0; i < item.length; i++) {
			this.comboBox.addItem(item[i]);
		}
		Object temp = "OK";
		int index = 3;
		this.comboBox.insertItemAt(temp,index);
		assertNotSame(temp,item[index]);
		assertNotSame(item[index],this.comboBox.getItemAt(index));
		assertEquals(temp,this.comboBox.getItemAt(index));
		
	}
	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.ComboBox.isEditable()'
	 */
	public void testIsEditable() {
		boolean teste = false;
		this.comboBox.setEditable(teste);
		assertEquals(teste,this.comboBox.isEditable());
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.ComboBox.removeAllItems()'
	 */
	public void testRemoveAllItems() {
		Object item [] = {25.15, true, "Teste", 10, new int [] {2,9}};
		for (int i = 0; i < item.length; i++) {
			this.comboBox.addItem(item[i]);
		}
		assertTrue(this.comboBox.getItemCount() != 0);
		this.comboBox.removeAllItems();
		assertTrue(this.comboBox.getItemCount() == 0);
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.ComboBox.removeItem(Object)'
	 */
	public void testRemoveItem() {
		Object item [] = {25.15, true, "Teste", 10, new int [] {2,9}};
		for (int i = 0; i < item.length; i++) {
			this.comboBox.addItem(item[i]);
		}
		int index = 2;
		this.comboBox.removeItem(item[index]);
		Object resp = this.comboBox.getItemAt(index);
		assertNotSame("O elemento não foi removido!",item[index],resp);
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.ComboBox.removeItemAt(int)'
	 */
	public void testRemoveItemAt() {
		Object item [] = {25.15, true, "Teste", 10, new int [] {2,9}};
		for (int i = 0; i < item.length; i++) {
			this.comboBox.addItem(item[i]);
		}
		int index = 3;
		this.comboBox.removeItemAt(index);
		Object resp = this.comboBox.getItemAt(index);
		assertNotSame("O elemento não foi removido!",
				item[index],resp);
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.ComboBox.setEditable(boolean)'
	 */
	public void testSetEditable() {
		boolean teste = true;
		this.comboBox.setEditable(teste);
		assertEquals(teste,this.comboBox.isEditable());
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.ComboBox.setMaximumRowCount(int)'
	 */
	public void testSetMaximumRowCount() {
		int teste = 15;
		this.comboBox.setMaximumRowCount(teste);
		assertEquals(teste,this.comboBox.getMaximumRowCount());
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.ComboBox.setSelectedIndex(int)'
	 */
	public void testSetSelectedIndex() {
		Object item [] = {25.15, true, "Teste"};
		for (int i = 0; i < item.length; i++) {
			this.comboBox.addItem(item[i]);
		}
		int index = 2;
		this.comboBox.setSelectedIndex(index);
		assertEquals(index,this.comboBox.getSelectedIndex());
	}

	/*
	 * Test method for 'br.ufpe.cin.miniJava.gui.ComboBox.setSelectedItem(Object)'
	 */
	public void testSetSelectedItem() {
		Object item [] = {25.15, true, "Teste", 10, new int [] {2,9}};
		for (int i = 0; i < item.length; i++) {
			this.comboBox.addItem(item[i]);
		}
		int index = 4;
		this.comboBox.setSelectedIndex(index);
		assertEquals(item[index],this.comboBox.getSelectedItem());
	}

}
