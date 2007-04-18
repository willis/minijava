package br.ufpe.cin.miniJava.gui;


import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import br.ufpe.cin.miniJava.gui.listener.ClickListener;
import br.ufpe.cin.miniJava.gui.listener.ItemStateListener;
import br.ufpe.cin.miniJava.gui.listener.Listener;
/**
 * Esta classe implementa um checkbox (um tipo de botão que pode ser
 * marcado ou não).
 * 
 * <p align=center> 
 * <img border="0" src="../../../../../resources/CheckBox.gif">
 * </p>
 * 
 * @author Bruno Barros (blbs)
 * @author Luiz Carlos d'Oleron (lcadb)
 * @version 1.0
 * @since 1.0
 */
public class CheckBox extends AbstractButton {

	private javax.swing.JCheckBox checkBox; 
	private final int MIN_WIDTH = 100;
	private final int MIN_HEIGHT = 30;
	private final String DEFAULT_TEXT = "checkBox";
	/**
     * Cria um checkbox desmarcado, sem texto
     *
     */
	public CheckBox(){		
		super(new Component(new javax.swing.JCheckBox()));
		this.checkBox = (javax.swing.JCheckBox) this.getComponent();
		this.checkBox.setSize(MIN_WIDTH,MIN_HEIGHT);
		this.checkBox.setText(DEFAULT_TEXT);
	}
    /**
     * Cria um checkbox com um texto
     *
     * @param text <CODE>String</CODE> com o texto do CheckBox 
     */
	public CheckBox(String text){		
		this();
		this.setText(text);
	}
	/**
     * Cria um checkbox com um texto e especifica se está marcado ou não
     *
     * @param text <CODE>String</CODE> com o texto do CheckBox
     * @param selected <CODE>boolean</CODE> que indicará se o CheckBox
     * estará selecionado ou não.   
     */
	public CheckBox(String text, boolean selected) {
		this(text);
		this.setSelected(selected);
	}
    /**
     * Adiciona um <CODE>ItemStateListener</CODE> ao CheckBox.
     * 
     * @param itemStateListener <CODE>ItemStateListener</CODE> que conterá
     * a ação que o checkBox deverá executar ao trocar de status.
     */	
	public void addItemStateListener(ItemStateListener itemStateListener){
		class TempItemStateListener implements ItemListener{
			private ItemStateListener itemStateListener;
			TempItemStateListener(ItemStateListener itemStateListener){
				this.itemStateListener = itemStateListener;
			}
			
			public void itemStateChanged(ItemEvent e) {
				this.itemStateListener.stateEvent(CheckBox.this);
				this.itemStateListener.stateEvent();
			}
			
		}
		TempItemStateListener tempItemStateListener = new TempItemStateListener(itemStateListener);
		this.checkBox.addItemListener(tempItemStateListener);
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
