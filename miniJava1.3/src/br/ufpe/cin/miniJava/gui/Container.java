package br.ufpe.cin.miniJava.gui;

import br.ufpe.cin.miniJava.gui.listener.ClickListener;
import br.ufpe.cin.miniJava.gui.listener.ItemStateListener;


/**
 * Esta é a classe abstrata que representa tipos de objetos
 * que podem ter outros componentes inseridos dentro de si.
 * 
 * @author Bruno Barros (blbs)
 * @author Luiz Carlos d'Oleron (lcadb)
 * @version 1.2
 * @since 1.0
 */
abstract class Container extends Component implements ClickListener, ItemStateListener {
	
	private java.awt.Container container;
    /**
     * Cria um container, que é uma especie de "moldura" onde
     * serão colocados outros objetos.
     * @param component <CODE>Component</CODE> que indicará qual será o
     * tipo do Container.
     */
	Container(Component component){
		super(component.getComponent());
		this.container = (java.awt.Container) this.getComponent();
	}
    /**
     * Insere um componente neste objeto.
     * 
     * @param comp <CODE>Component</CODE> que será adicionado.
     */
	//METODO DEFAULT QUE NAO DEVERÁ APARECER NESTA VERSAO
	void add(Component comp) {
		if (comp != null) {
			this.container.add(comp.getComponent());
			comp.setParent(this);
			this.repaint();
		}
	}
	/**
     * Insere um componente neste objeto, nas coordenadas desejadas.
     * 
     * @param comp <CODE>Component</CODE> que será adicionado.
     * @param x posição X do component.
     * @param y posição Y do component.
     */
	//METODO DEFAULT QUE NAO DEVERÁ APARECER NESTA VERSAO
	void add(Component comp, int x, int y) {
		if (comp != null) {
			comp.setPosition(x,y);
			this.add(comp);
		}
	}
	/**
     * Fornece o component que está na posição <i>n</i>, 
     * onde n diz respeito a posição do array onde o 
     * este objeto guarda seus componentes, ou seja,
     * se foram adicionados n elementos a este objeto, 
     * a chamada deste método passando n-1 como parâmetro retorna o 
     * último elemento adicionado, ao passo que com 0 o elemento retornado
     * será o primeiro inserido, de forma que uma chamada passando n
     * como parâmetro retorna null.
     * 
     * @param n posição de onde quer se obter um componente. 
     * @return componente localizado na posição <i>n</i>.
     */
	public Component getComponent(int n) {
		java.awt.Component component;
		if (this instanceof Window) {
			/*
			 * Não assuste-se! Esta é a forma que Swing guarda objetos numa janela! :( 
			 */
			component = ((java.awt.Container) ((java.awt.Container) ((java.awt.Container) this.container.getComponent(0)).getComponent(1)).getComponent(0)).getComponent(n);
		} else {
			component = this.container.getComponent(n);
		}
		return new Component (component);
	}
	/**
     * Fornece o número de componentes neste objeto.
     * 
     * @return número de componentes neste objeto.
     */
	public int getComponentCount() {
		int resp = this.container.getComponentCount();
		if (this instanceof Window) {
			/*
			 * Não assuste-se! Esta é a forma que Swing guarda objetos numa janela! :( 
			 */
			resp = ((java.awt.Container) ((java.awt.Container) ((java.awt.Container) this.container.getComponent(0)).getComponent(1)).getComponent(0)).getComponentCount();
		}
		return resp;
	}
	/**
     * Remove um component deste objeto, para isso é preciso especificar qual componente 
     * se quer remover.
     * 
     * @param comp <CODE>Component</CODE> a ser removido.
     */
	public void remove(Component comp) {
		if (comp != null) {
			this.container.remove(comp.getComponent());
			this.repaint();
		}
	}
	/**
     * Remove todos os componentes deste objeto.
     */
	public void removeAll() {
		this.container.removeAll();
		this.repaint();
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
		this.container = (java.awt.Container) c;
	}
	/**
	 * Implementação vazia da interface <code>ClickListener</code>.
	 * 
	 */
	public void clickEvent(Component component) { }
	/**
	 * Implementação vazia da interface <code>ClickListener</code>.
	 * 
	 */
	public void clickEvent() { }
	/**
	 * Implementação vazia da interface <code>ItemStateListener</code>.
	 * 
	 */
	public void stateEvent(Component component) { } 
	/**
	 * Implementação vazia da interface <code>ItemStateListener</code>.
	 * 
	 */
	public void stateEvent() { }
	/**
	 * Método include, que adiciona o componente no container
	 * @param comp
	 */
	void include(Component comp) {
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
}
