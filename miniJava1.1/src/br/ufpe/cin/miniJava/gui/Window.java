package br.ufpe.cin.miniJava.gui;

import java.util.HashSet;
import java.util.Set;

import javax.swing.JFrame;

import br.ufpe.cin.miniJava.gui.listener.ClickListener;
import br.ufpe.cin.miniJava.gui.listener.ItemStateListener;

/**
 * Esta classe representa uma janela, como estas janelas que todos os
 * programas apresentam.
 * 
 * <p align=center> 
 * <img border="0" src="../../../../../resources/Window.gif">
 * </p>
 * 
 * 
 * @author Bruno Barros (blbs)
 * @author Luiz Carlos d'Oleron (lcadb)
 * @version 1.1
 * @since 1.0
 */
public class Window extends Container implements ClickListener, ItemStateListener {
	
	private javax.swing.JFrame window;
	private final int MIN_WIDTH = 200;
	private final int MIN_HEIGHT = 200;
	private static Set<Window> todasWindows = new HashSet<Window>();
	
	static Set<Window> getTodasWindows(){
		return todasWindows;
	}
	
	/**
	 * Cria uma nova janela vazia.
	 *
	 */
	public Window(){		
		super(new Component(new javax.swing.JFrame()));
		this.window = (javax.swing.JFrame) this.getComponent();
		this.window.setLayout(null);
		this.window.setContentPane(this.window.getContentPane());
		this.setSize(MIN_WIDTH,MIN_HEIGHT);
		this.exitOnClose(true);
		Window.todasWindows.add(this);
	}
	/**
	 * Cria uma nova janela com um texto de título,este 
	 * aparecerá na barra de cima da <i>Window</i>,como
	 * ocorre numa janela qualquer do sistema operacional.
	 * 
	 * @param title título da janela.
	 */
	public Window (String title) {
		this();
		this.window.setTitle(title);
	}
	/**
	 * Fornece o painel de conteúdo da janela, ou seja 
	 * fornece o painel em que os outros componetes
	 * da janela são inseridos.
	 * 
	 * @return <code>Panel</code> de conteúdo da janela, é nele 
	 * que os outros componentes são inseridos.
	 */
	public Panel getContentPane() {
		Panel retorno = new Panel();
		retorno.setComponent(this.window.getContentPane());
		return retorno;
	} 
	/**
	* Altera  o painel de conteúdo da janela, ou seja 
	 * altera  o painel em que os outros componetes
	 * da janela são inseridos.
	 * 
	 * 
	 * @param contentPane novo <code>Panel</code> que substituirá o
	 * <code>contentPane</code> atual.
	 */
	public void setContentPane(Panel contentPane) {
		this.window.setContentPane((java.awt.Container) contentPane.getComponent());
	}
	/**
	 * Fornece a janela-pai desta janela.
	 * 
	 * @return <code>Window</code> pai desta janela, ou <code>null</code>
	 * se ela não for filha de nenhuma outra janela.
	 */
	//método default pq nao deve aparecer na API
	Window getOwner() {
		return (Window) new Component(this.window.getOwner());
	}
	/**
	 * Indica se o foco está sob a janela ou não,
	 * o foco indica a janela que está sendo usada no momento,
	 * ou se está superposta por outras.Numa aplicação pode-se
	 * abrir várias janelas , mas só uma estará sendo usada a cada momento 
	 * enquanto as outras estarão subpostas a setá,logo indicará 
	 * a superposição ou não da janela.
	 * 
	 * @return <code>true</code> se a janela estiver focalizada,
	 * <code>false</code> caso contrário, ou seja ela
	 * é a janela não usado no momento.
	 */
	public boolean isFocused() {
		return this.window.isFocused();
	} 
	/**
	 * Envia esta janela para trás de todas as outras.
	 *
	 */
	public void toBack() {
		this.window.toBack();
	} 
	/**
	 * Envia esta janela para a frente de todas as outras. 
	 *
	 */
	public void toFront() {
		this.window.toFront();
	}
	/**
	 * Indicará o que deverá acontecer ao fechar a janela,
	 * ou seja , fechando a janela seu programa poderá seguir
	 * dois caminho descritos a seguir: fechar a janela e
	 * encerrar o programa ou fechar apenas os recursos que 
	 * estavam sendo utilizados pela janela.
	 * 
	 * @param b <code>true</code> se o programa deverá encerrar
	 * ao fechar a janela, ou <code>false</code> se apenas os
	 * recursos utilizados pela janela devam ser liberados.
	 */
	public void exitOnClose(boolean b){
		int arg = javax.swing.JFrame.DISPOSE_ON_CLOSE;
		if (b) {
			arg = javax.swing.JFrame.EXIT_ON_CLOSE;
		}
		this.window.setDefaultCloseOperation(arg);
	}
	/**
	 * Altera o título da janela, logo deve-se indicar neste método
	 * o novo título que substituirá o anterior.
	 * 
	 * @param text novo título da janela.
	 */
	public void setTitle(String text){
		this.window.setTitle(text);
	}
	/**
	 * Fornece o título da janela, ou seja a <code>String</code>
	 * que é mostrada na barra superior da Janela. 
	 * 
	 * @return o título <code>String</code> da janela.
	 */
	public String getTitle(){
		return this.window.getTitle();
	}
	/**
	 *Fornece a cor de frente da janela, esta é representada 
	 *por um objeto do tipo <code>Color</code> que contem três atributos
	 *inteiros que codificam a cor em questão.
	 * 
	 * @return <code>Color</code> contendo a cor de frente da janela.
	 * 
	 */
	public Color getForeground() {
		java.awt.Color color = this.window.getContentPane().getForeground();
		int red = color.getRed();
		int green = color.getGreen();
		int blue = color.getBlue();
		Color retorno = new Color(red,green,blue);
		return retorno;
	}
	/**
	*Fornece a cor de fundo da janela, esta é representada 
	 *por um objeto do tipo <code>Color</code> que contêm três atributos
	 *inteiros que codificama  cor em questão.
	 * @return <code>Color</code> contendo a cor de fundo da janela.
	 * 
	 */
	public Color getBackground() {
		java.awt.Color color = this.window.getContentPane().getBackground();
		int red = color.getRed();
		int green = color.getGreen();
		int blue = color.getBlue();
		Color retorno = new Color(red,green,blue);
		return retorno;
	} 
	/**
	 * Altera cor de fundo da janela.
	 * 
	 * @param c <code>Color</code> com a nova cor de fundo.
	 * 
	 */
	public void setBackground(Color c) {
		if (c != null) this.window.getContentPane().setBackground(c.getColor());
	} 
	/**
	 * Altera cor de frente da janela.
	 * 
	 * @param c <code>Color</code> com a nova cor de frente.
	 * 
	 */
	public void setForeground(Color c) {
		if (c != null) this.window.getContentPane().setForeground(c.getColor());
	}
	
	/**
	 * Implementação vazia da interface <code>ClickListener</code>.
	 * 
	 */
	public void clickEvent(Component component) {
		
	}
	/**
	 * Implementação vazia da interface <code>ClickListener</code>.
	 * 
	 */
	public void clickEvent() {
		
	}
	/**
	 * Implementação vazia da interface <code>ItemStateListener</code>.
	 * 
	 */
	public void stateEvent(Component component) {
		
	} 
	/**
	 * Implementação vazia da interface <code>ItemStateListener</code>.
	 * 
	 */
	public void stateEvent() {
		
	}
	/**
     * Insere um componente à janela, nas coordenadas desejadas.
     * 
     * A diferença entre este método e o add, é o fato de que ao usar
     * include, o Component <code>comp</code> adiciona a janela
     * como novo ouvinte. 
     * 
     * @param comp <CODE>Component</CODE> que será adicionado e que
     * receberá um novo ouvinte.
     */
	public void include(Component comp) {
		if (comp != null) {
			this.add(comp);
		}
		
		//isso eh ruim pq cria dependencia da superclasse 
		//em relação as subclasses
		//comp.addListener(this);
		
		//criamos uma terceira entidade com a responsabilidade
		//de conhecer as dependencias
		ListenerManager.addListenerTo(this,comp);
	}
	
	/**
     * Insere um componente à janela, nas coordenadas desejadas.
     * 
     * @param comp <CODE>Component</CODE> que será adicionado e que
     * receberá um novo ouvinte.
     * @param x posição X do component.
     * @param y posição Y do component.
     */
	public void include(Component comp, int x, int y) {
		comp.setPosition(x,y);
		this.include(comp);
	}
	/**
	 * Altera o objeto <CODE>java.awt.Component</CODE> representado por
	 * este Component. É a base da implementação de herança em miniJava.
	 * 
	 * O método é default porque apenas as classes de
	 * br.ufpe.cin.miniJava.gui devem acessar o atributo component
	 * desta classe, que é java.awt.Component.
	 * 
	 * @param c <CODE>java.awt.Component</CODE> para fins de implementação.
	 */
	//METODO DEFAULT PARA NAO APARECER NO JAVADOC	
	void setComponent(java.awt.Component c){
		super.setComponent(c);
		this.window = (JFrame) c;
	}
	
}
