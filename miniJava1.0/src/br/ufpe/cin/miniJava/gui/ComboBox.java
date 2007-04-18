package br.ufpe.cin.miniJava.gui;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import br.ufpe.cin.miniJava.gui.listener.ClickListener;
import br.ufpe.cin.miniJava.gui.listener.ItemStateListener;
import br.ufpe.cin.miniJava.gui.listener.Listener;

/**
 * Esta classe implementa um comboBox (uma lista com vários itens, onde apenas
 * um pode ser selecionado por vez).
 * 
 * <p align=center> 
 * <img border="0" src="../../../../../resources/ComboBox.gif">
 * </p>
 * 
 * @author Bruno Barros (blbs)
 * @author Luiz Carlos d'Oleron (lcadb)
 * @version 1.0
 * @since 1.0
 */
public class ComboBox extends Component {

	private javax.swing.JComboBox comboBox;
	private final int MIN_WIDTH = 150;
	private final int MIN_HEIGHT = 30;
    /**
     * Cria um ComboBox vazio.
     */
	public ComboBox(){		
		super(new javax.swing.JComboBox());
		this.comboBox = (javax.swing.JComboBox) this.getComponent();
		this.comboBox.setSize(MIN_WIDTH,MIN_HEIGHT);
	}
    /**
     * Cria um ComboBox com vários itens.
     * 
     * @param items array com os objetos a serem inseridos. 
     */
	public ComboBox(Object[] items){
		super(new javax.swing.JComboBox(items));
		this.comboBox = (javax.swing.JComboBox) this.getComponent();
		this.comboBox.setSize(MIN_WIDTH,MIN_HEIGHT);
	}
    /**
     * Adiciona um <CODE>ClickListener</CODE> ao ComboBox.
     * 
     * @param clickListener <CODE>clickListener</CODE> que conterá
     * a ação que o comboBox deverá executar ao ser clicado
     */	
	public void addClickListener(ClickListener clickListener) {
		class TempActionListener implements ActionListener{
			private ClickListener actionListener;
			TempActionListener(ClickListener actionListenter){
				this.actionListener = actionListenter;
			}
			public void actionPerformed(ActionEvent actionEvent) {
				this.actionListener.clickEvent(ComboBox.this);
				this.actionListener.clickEvent();
			}
		}
		TempActionListener actionListener = new TempActionListener(clickListener);
		this.comboBox.addActionListener(actionListener);
	}
    /**
     * Adiciona um <CODE>ItemStateListener</CODE> ao ComboBox.
     * 
     * @param itemStateListener <CODE>ItemStateListener</CODE> que conterá
     * a ação que o comboBox deverá executar ao trocar de status.
     */	
	public void addItemStateListener(ItemStateListener itemStateListener){
		class TempItemStateListener implements ItemListener{
			private ItemStateListener itemStateListener;
			TempItemStateListener(ItemStateListener itemStateListener){
				this.itemStateListener = itemStateListener;
			}
			
			public void itemStateChanged(ItemEvent e) {
				this.itemStateListener.stateEvent(ComboBox.this);
				this.itemStateListener.stateEvent();
			}
			
		}
		TempItemStateListener tempItemStateListener = new TempItemStateListener(itemStateListener);
		this.comboBox.addItemListener(tempItemStateListener);
	}
    /**
     * Insere um objeto no comboBox.
     * 
     * @param anObject o objeto que será inserido no comboBox
     */	
	public void addItem(Object anObject) {
		this.comboBox.addItem(anObject);
	} 
    /**
     * Fornece o objeto que está na posição <i>index</i> do ComboBox.
     * 
     * @param index posição do comboBox a ser procurada.
     * @return objeto que está na posição <i>index</i>.
     */		
	public Object getItemAt(int index) {
		return this.comboBox.getItemAt(index);
	} 
    /**
     * Fornece o número de itens no ComboBox.
     * 
     * @return número de itens no ComboBox.
     */		
	public int getItemCount() {
		return this.comboBox.getItemCount();
	} 
	/**
     * Fornece o número máximo de linhas.
     * 
     * @return número máximo de linhas do ComboBox.
     */
	public int getMaximumRowCount() {
		return this.comboBox.getMaximumRowCount();
	} 
	/**
     * Fornece a posição do item que está selecionado.
     * 
     * @return posição do item selecionado no ComboBox.
     */
	public int getSelectedIndex() {
		return this.comboBox.getSelectedIndex();
	} 
	/**
     * Fornece o item que está selecionado.
     * 
     * @return item selecionado no ComboBox.
     */
	public Object getSelectedItem() {
		return this.comboBox.getSelectedItem();
	} 
	/**
     * Fornece os itens que estão selecionados.
     * 
     * @return array de itens selecionados.
     */
	public Object[] getSelectedObjects() {
		return this.comboBox.getSelectedObjects();
	} 
	/**
     * Insere um item na posição <i>index</i>.
     * 
     * @param anObject objeto a ser inserido.
     * @param index posicao na qual o objeto será inserido.
     */
	public void insertItemAt(Object anObject, int index) {
		this.comboBox.insertItemAt(anObject, index);
	} 
	/**
     * Fornece a propriedade <i>editable</i>.
     * 
     * @return <CODE>true</CODE> se o comboBox for editável.
     */
	public boolean isEditable() {
		return this.comboBox.isEditable();
	} 
	/**
     * Remove todos os itens do ComboBox.
     */
	public void removeAllItems() {
		this.comboBox.removeAllItems();
	} 
	/**
     * Remove um item do ComboBox.
     * 
     * @param anObject objeto a ser removido do ComboBox.
     */	
	public void removeItem(Object anObject) {
		this.comboBox.removeItem(anObject);
	} 
	/**
     * Remove o item que está na posição <i>anIndex</i>.
     * 
     * @param anIndex posição na qual objeto será removido.
     */	
	public void removeItemAt(int anIndex) {
		this.comboBox.removeItemAt(anIndex);
	} 
	/**
     * Altera a propriedade <i>editable</i>.
     * 
     * @param aFlag <CODE>boolean</CODE> que indicará se o comboBox
     * poderá ser editado ou não.
     */
	public void setEditable(boolean aFlag) {
		this.comboBox.setEditable(aFlag);
	} 
	/**
     * Altera a propriedade <i>enabled</i>.
     * 
     * @param b <CODE>boolean</CODE> que indicará se o comboBox
     * está ativo ou não.
     */	
	public void setEnabled(boolean b) {
		this.comboBox.setEnabled(b);
	} 
	/**
     * Altera o número máximo de linhas.
     * 
     * @param count número máximo de linhas do ComboBox.
     */
	public void setMaximumRowCount(int count) {
		this.comboBox.setMaximumRowCount(count);
	} 
	/**
     * Altera a posição selecionada.
     * 
     * @param anIndex posição a ser selecionada.
     */
	public void setSelectedIndex(int anIndex) {
		this.comboBox.setSelectedIndex(anIndex);
	} 
	/**
     * Altera o item selecionado.
     * 
     * @param anObject item a ser selecionado.
     */
	public void setSelectedItem(Object anObject) {
		this.comboBox.setSelectedItem(anObject);
	} 
	/**
	 * Adiciona o listener específico para este tipo de objeto.
	 * 
	 *  @param listener <code>Listener</code> a ser adicionado.
	 * 
	 */
	public void addListener(Listener listener) {
		if(listener instanceof ItemStateListener) {
			this.addItemStateListener((ItemStateListener) listener);
		}
		if (listener instanceof ClickListener) {
			this.addClickListener((ClickListener) listener);
		}
	}

}
