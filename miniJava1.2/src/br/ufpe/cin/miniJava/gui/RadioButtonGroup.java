package br.ufpe.cin.miniJava.gui;


import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

import br.ufpe.cin.miniJava.gui.listener.ItemStateListener;
import br.ufpe.cin.miniJava.gui.listener.Listener;

/**
 * Esta classe representa um grupo de radio buttons, que são componentes
 * que podem ser marcados ou não, (apenas um por vez em cada grupo) e mostram
 * seu status atual ao usuário.
 * 
 * <p align=center> 
 * <img border="0" src="../../../../../resources/RadioButtonGroup.gif">
 * </p>
 * 
 * @author Bruno Barros (blbs)
 * @author Luiz Carlos d'Oleron (lcadb)
 * @version 1.2
 * @since 1.0
 */
public class RadioButtonGroup extends Component {
	
	private javax.swing.ButtonGroup group;
	private javax.swing.JPanel radioPanel;
	private java.util.List <JRadioButton> radioButtons;
	private final int MIN_WIDTH = 150;
	private final int MIN_HEIGHT = 150;
	/**
	 * Cria um novo grupo de radio buttons vazio, ou seja,
	 * ele não possui ainda nenhuma caixa de seleção associada,
	 * onde uma caixa de seleção é um item que possui apenas
	 * dois estados , selecionado ou não.
	 */
	public RadioButtonGroup(){		
		super(new javax.swing.JPanel(new GridLayout(0, 1)));
		this.radioPanel = (javax.swing.JPanel) this.getComponent();
		this.radioButtons = new ArrayList<JRadioButton>();
		this.group = new ButtonGroup();
		this.radioPanel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
		this.radioPanel.setSize(MIN_WIDTH,MIN_HEIGHT);
	}
    /**
     * Adiciona um <CODE>ItemStateListener</CODE> ao grupo de radio buttons,
     * isso faz com que este grupo tenha uma ação associada a mudança
     * de seleção do mesmo.
     * 
     * @param itemStateListener <CODE>ItemStateListener</CODE> que conterá
     * a ação que o grupo de radio buttons deverá executar
     * ao ter seu status alterado, onde alterar um estado diz respeito
     * a marcado/desmarcado ou o inverso (desmarcado/marcado).
     */	
	//DEFAULT, NAO DEVE APARECER NA API
	void addItemStateListener(ItemStateListener itemStateListener){
		class TempItemStateListener implements ItemListener{
			private ItemStateListener itemStateListener;
			TempItemStateListener(ItemStateListener itemStateListener){
				this.itemStateListener = itemStateListener;
			}
			
			public void itemStateChanged(ItemEvent e) {
				this.itemStateListener.stateEvent(RadioButtonGroup.this);
				this.itemStateListener.stateEvent();
			}
			
		}
		TempItemStateListener tempItemStateListener = new TempItemStateListener(itemStateListener);
		for(JRadioButton button : radioButtons){
			button.addItemListener(tempItemStateListener);
		}
	}
	/**
	 * Cria um novo radio button com um texto, e insere-o
	 * ao fim deste grupo de radio buttons, se não existir 
	 * nenhum radio button este será o primeiro da lista,
	 * caso contrário o último.
	 * 
	 * @param string texto do novo radio button a ser inserido ,logo
	 * o método a partir da <CODE>String </CODE> passada como parâmetro
	 * é criado um radio button que será inserido no <CODE>RadioButtonGroup </CODE> 
	 */
	public void addItem(String string) {
		JRadioButton button = new JRadioButton(string);
		
		if (this.radioButtons.isEmpty())
			button.setSelected(true);
		
		this.group.add(button);
		this.radioButtons.add(button);
		this.radioPanel.add(button);
		this.setBackground(this.getBackground());
		this.setForeground(this.getForeground());
	}
	/**
	 * Remove o radio button que estiver na posição indicada,
	 * note que o primeiro elemento de n 
	 * elementos inseridos no <CODE>RadioButtonGroup </CODE> é o de 
	 * indice 0 e o último tem índice n-1.
	 * 
	 * @param index posição do radio button a ser removido
	 */
	public void removeItemAt(int index) {
		JRadioButton removed = this.radioButtons.remove(index);
		this.group.remove(removed);
		this.radioPanel.remove(removed);
	}
	/**
	 * Fornece o texto do radio button localizado na posição indicada, logo
	 * este método busca pelo <CODE>RadioButton</CODE> da posição indicada,
	 * e dele "pega" a <CODE>String </CODE> que é seu atributo. 
	 * 
	 * @param index posição do radio button a ser localizado.
	 * @return texto do radio button que estiver na posição indicada.
	 */
	public String getItemAt(int index) {
		JRadioButton temp = this.radioButtons.get(index);
		return temp.getText();
	}
	/**
	 * Cria um novo radio button com um texto, e insere-o na posição
	 * indicada, substituindo algum que já exista, logo este
	 * método irá sbscrever caso exista, o radio button da posição
	 * indicada.
	 * 
	 * @param index posição onde será inserido o novo radio button.
	 * @param string texto do novo radio button.
	 */
	public void setItemAt(int index, String string) {
		this.radioButtons.set(index, new JRadioButton(string));
	}
	/**
	 * Fornece a posição do radio button selecionado, logo
	 * este método busca pelo primeiro radio button selecionada 
	 * retornando o índice onde este se encontra no radio button group. 
	 * 
	 * @return posição do radio button que estiver selecionado.
	 */
	public int getSelectedIndex() {
		int retorno = -1;
		java.util.Iterator i = this.radioButtons.iterator();
		int count = 0;
		while (i.hasNext()) {
			JRadioButton temp = (JRadioButton) i.next();
			if (temp.isSelected()) {
				retorno = count;
				break;
			}
			count++;
		}
		return retorno;
	}
	/**
	 * Seleciona o radio button localizado na posição desejada,
	 * logo ele altera o estado (caso não esteja selecionado) deste, 
	 * caso ele já esteja selecionado, nada é feito pelo método.
	 *  
	 * @param index posição a ser selecionada.
	 */
	public void setSelectedIndex(int index) {
		int antigo = this.getSelectedIndex();
		this.radioButtons.get(index).setSelected(true);
		this.radioButtons.get(antigo).setSelected(false);
	}
	/**
	 * Fornece o texto do radio button que estiver selecionado,logo
	 * este método busca pelo primeiro radio button selecionada 
	 * retornando o  atributo <CODE>String </CODE>do radio button group.
	 * 
	 * @return texto do radio button selecionado.
	 */
	public String getSelectedItem() {
		String retorno = null;
		int pos = getSelectedIndex();
		if(pos>=0 && pos <this.radioButtons.size()){
			retorno = this.radioButtons.get(pos).getText();
		}
		return retorno;
	}
	/**
	 * Altera a cor de fundo deste grupo de radio buttons.
	 * 
	 * Sobrescreve o método <code>setBackground</code> de <code>Component</code>
	 * devido a fins de implementação.
	 * 
	 * @param c nova cor de fundo do <code>RadioButtonGroup</code>.
	 */
	public void setBackground(Color c) {
		if (c != null) {
			super.setBackground(c);
			for (int i = 0; i < this.radioButtons.size(); i++) {
				this.radioButtons.get(i).setBackground(c.getColor());
			}
		}
	} 
	/**
	 * Altera a cor de fundo deste grupo de radio buttons.
	 * 
	 * Sobrescreve o método <code>setBackground</code> de <code>Component</code>
	 * devido a fins de implementação.
	 * 
	 * @param c nova cor de fundo do <code>RadioButtonGroup</code>.
	 */
	public void setForeground(Color c) {
		if (c != null) {
			super.setForeground(c);
			for (int i = 0; i < this.radioButtons.size(); i++) {
				this.radioButtons.get(i).setForeground(c.getColor());
			}
		}
	} 
	/**
	 * Adiciona o listener específico para este tipo de objeto,
	 * ou seja a ação que este item realizara ao ter seu estado
	 * alterado.
	 * 
	 *  @param listener <code>Listener</code> a ser adicionado.
	 * 
	 */
	public void addListener(Listener listener) {
		if(listener instanceof ItemStateListener) {
			this.addItemStateListener((ItemStateListener) listener);
		}
	}
	
}
