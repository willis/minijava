package br.ufpe.cin.miniJava.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;

import br.ufpe.cin.miniJava.gui.listener.ClickListener;
import br.ufpe.cin.miniJava.gui.listener.Listener;

/**
 * Esta classe abstrata implementa funcionalidades que alguns tipos de botões
 * poderão ter, como ação a ser tomada quando clicado, alterar tamanho, posição,
 * texto, etc.
 * 
 * @author Bruno Barros (blbs)
 * @author Luiz Carlos d'Oleron (lcadb)
 * @version 1.1
 * @since 1.0
 */
abstract class AbstractButton extends Component {

	private javax.swing.AbstractButton absButton;
	
    /**
     * Cria um botão, um botão é um objeto ao qual se pode
     * associar uma ação
     * 
     * @param component <CODE>Component</CODE> que indicará qual será o
     * tipo do botão.
     */
	AbstractButton(Component component){		
		super(component.getComponent());
		this.absButton = (javax.swing.AbstractButton) this.getComponent();
	}
    /**
     * Adiciona um <CODE>ClickListener</CODE> ao botão,informando
     * que o botão terá uma ação associada a ele
     * 
     * @param clickListener <CODE>clickListener</CODE> que conterá
     * a ação que o botão deverá executar ao ser clicado
     */	
	//o método está default para NÃO APARECER NA API!!!!
	//pelo menos na versão atual não!!
	void addClickListener(ClickListener clickListener) {
		class TempActionListener implements ActionListener{
			private ClickListener actionListener;
			TempActionListener(ClickListener actionListener){
				this.actionListener = actionListener;
			}
			public void actionPerformed(ActionEvent actionEvent) {
				this.actionListener.clickEvent(AbstractButton.this);
				this.actionListener.clickEvent();
			}
		}
		TempActionListener actionListener = new TempActionListener(clickListener);
		this.absButton.addActionListener(actionListener);
	}
    /**
     * Método chamado quando se deseja obter o mesmo efeito de clicar no objeto.
     */		
	public void doClick() {
		this.absButton.doClick();
	}
	/**
     * Fornece a posição do alinhamento horizontal,
     * analogamente a um eixo cartesiano (cuja origem é o canto
     * superior esquerdo), fornece posição do alinhamento horizontal X.
     * 
     * @return <CODE>Position</CODE> com o alinhamento horizontal.
     */
	public MiniJavaConstants.Position getHorizontalAlignment() {
		int pos = this.absButton.getHorizontalAlignment();
		MiniJavaConstants.Position retorno = null;
		switch (pos) {
			case (SwingConstants.RIGHT) :
				retorno = MiniJavaConstants.RIGHT;
				break;
			
			case (SwingConstants.LEFT) :
				retorno = MiniJavaConstants.LEFT;
				break;
			
			case (SwingConstants.CENTER) :
				retorno = MiniJavaConstants.CENTER;
				break;
			
			case (SwingConstants.LEADING) :
				retorno = MiniJavaConstants.LEADING;
				break;
			
			case (SwingConstants.TRAILING) :
				retorno = MiniJavaConstants.TRAILING;
		}
		return retorno;
	}
	/**
     * Fornece a posição do alinhamento horizontal do texto,
     * analogamente a um eixo cartesiano (cuja origem é o canto
     * superior esquerdo), fornece a posição do alinhamento horizontal X
     * do texto.
     * 
     * @return <CODE>Position</CODE> com o alinhamento horizontal do texto.
     */
	public MiniJavaConstants.Position getHorizontalTextPosition() {
		MiniJavaConstants.Position retorno = null;
		int pos = this.absButton.getHorizontalTextPosition();
		switch (pos) {
			case (SwingConstants.RIGHT) :
				retorno = MiniJavaConstants.RIGHT;
				break;
			
			case (SwingConstants.LEFT) :
				retorno = MiniJavaConstants.LEFT;
				break;
			
			case (SwingConstants.CENTER) :
				retorno = MiniJavaConstants.CENTER;
				break;
			
			case (SwingConstants.LEADING) :
				retorno = MiniJavaConstants.LEADING;
				break;
			
			case (SwingConstants.TRAILING) :
				retorno = MiniJavaConstants.TRAILING;
		}
		return retorno;
	}
	/**
     * Fornece o texto do botão, 
     * retornando um objeto do tipo <code>String</code> com o texto deste botão. 
     * 
     * @return <CODE>String</CODE> com o texto do botão.
     */		
	public String getText() {
		return this.absButton.getText();
	}
	/**
     * Fornece a posição do alinhamento vertical,
     * analogamente a um eixo cartesiano (cuja origem é o canto
     * superior esquerdo), fornece posição do alinhamento vertical Y.
     * 
     * @return <CODE>Position</CODE> com o alinhamento vertical.
     */
	public MiniJavaConstants.Position getVerticalAlignment(){
		int pos = this.absButton.getVerticalAlignment();
		MiniJavaConstants.Position retorno = null;
		switch (pos) {
			case (SwingConstants.CENTER) :
				retorno = MiniJavaConstants.CENTER;
				break;
			
			case (SwingConstants.TOP) :
				retorno = MiniJavaConstants.TOP;
				break;
			
			case (SwingConstants.BOTTOM) :
				retorno = MiniJavaConstants.BOTTOM;
		}
		return retorno;
	} 
	/**
     * Fornece a posição do alinhamento vertical do texto,
     * analogamente a um eixo cartesiano (cuja origem é o canto
     * superior esquerdo), fornece a posição do alinhamento vertical Y
     * do texto.
     * 
     * @return <CODE>Position</CODE> com o alinhamento vertical do texto.
     */
	public MiniJavaConstants.Position getVerticalTextPosition() {
		int pos = this.absButton.getVerticalTextPosition();
		MiniJavaConstants.Position retorno = null;
		switch (pos) {
			case (SwingConstants.CENTER) :
				retorno = MiniJavaConstants.CENTER;
				break;
			
			case (SwingConstants.TOP) :
				retorno = MiniJavaConstants.TOP;
				break;
			
			case (SwingConstants.BOTTOM) :
				retorno = MiniJavaConstants.BOTTOM;
		}
		return retorno;
	} 
	/**
     * Fornece o valor da propriedade <i>selected</i>, cuja funcionalidade é
     * definir se o botão deverá estar ou não selecionado.
     * 
     * @return <CODE>true</CODE> se o botão estiver selecionado,
     * <CODE>false</CODE> caso contrário.
     */	
	public boolean isSelected() {
		return this.absButton.isSelected();
	} 
	/**
     * Altera a propriedade <i>enabled</i>, que define
     * se o botão vai estar ativo ou não (passível de clique);
     * se este não estiver ativo, não poderá executar nenhuma ação.
     * 
     * @param b <CODE>boolean</CODE> que indicará se o botão estará ativo ou não.
     */	
	public void setEnabled(boolean b) {
		this.absButton.setEnabled(b);
	}
	/**
     * Altera a posição do alinhamento horizontal,
     * analogamente a um eixo cartesiano (cuja origem é o canto
     * superior esquerdo), fornece posição do alinhamento horizontal X.
     * 
     * @param alignment <CODE>Position</CODE> com o alinhamento horizontal.
     */
	public void setHorizontalAlignment(MiniJavaConstants.Position alignment) {
		if (alignment != null)
		this.absButton.setHorizontalAlignment(alignment.value());
	}
	/**
     * Altera a posição do alinhamento horizontal do texto,
     * analogamente a um eixo cartesiano (cuja origem é o canto
     * superior esquerdo), fornece a posição do alinhamento horizontal X
     * do texto.
     * 
     * @param textPosition <CODE>Position</CODE> com a posição horizontal do texto.
     */
	public void setHorizontalTextPosition(MiniJavaConstants.Position textPosition) {
		if (textPosition != null)
		this.absButton.setHorizontalTextPosition(textPosition.value());
	} 
	/**
     * Modifica  a propriedade <i>selected</i>, que 
     * define se o botão deverá estar ou não selecionado.
     * 
     * @param b <CODE>boolean</CODE> que indicará 
     * se o botão estará selecionado ou não.
     */		
	public void setSelected(boolean b) {
		this.absButton.setSelected(b);
	} 
	/**
     * Altera o texto do botão, logo é preciso indicar o novo
     * texto, passando-o como parâmetro
     * 
     * @param text <CODE>String</CODE> com o texto do botão.
     */	
	public void setText(String text) {
		this.absButton.setText(text);
	} 
	/**
     * Altera a posição do alinhamento vertical,
     * analogamente a um eixo cartesiano (cuja origem é o canto
     * superior esquerdo), fornece posição do alinhamento vertical Y.
     * 
     * @param alignment <CODE>Position</CODE> com a posição do alinhamento vertical.
     */	
	public void setVerticalAlignment(MiniJavaConstants.Position alignment) {
		if (alignment != null)
		this.absButton.setVerticalTextPosition(alignment.value());
	} 
	/**
     * Altera a posição do alinhamento horizontal do texto,
     * analogamente a um eixo cartesiano (cuja origem é o canto
     * superior esquerdo), fornece a posição do alinhamento vertical X
     * do texto.
     * 
     * @param textPosition <CODE>Position</CODE> com a posição vertical do texto.
     */
	public void setVerticalTextPosition(MiniJavaConstants.Position textPosition) {
		if (textPosition != null)
		this.absButton.setVerticalTextPosition(textPosition.value());
	} 
	
	/**
	 * Adiciona o listener específico para este tipo de objeto.
	 * 
	 *  @param listener <code>Listener</code> a ser adicionado.
	 * 
	 */
	//METODO DEFAULT PARA NAO APARECER NO JAVADOC
	void addListener(Listener listener) {
		if(listener instanceof ClickListener){
			this.addClickListener((ClickListener)listener);
		}
	}

}
