package br.ufpe.cin.miniJava.gui;


/**
 * Esta é a classe abstrata que representa tipos de objetos
 * que podem ter outros componentes inseridos dentro de si.
 * 
 * @author Bruno Barros (blbs)
 * @author Luiz Carlos d'Oleron (lcadb)
 * @version 1.2
 * @since 1.0
 */
abstract class Container extends Component {
	
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
     * Insere um componente no container, nas coordenadas desejadas.
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
     * objeto do tipo o <i>Conteiner</i> guarda seus 
     * objetos, ou seja se foram adicionados n elementos ao Container 
     * a chamada deste método passando n-1 como parâmentro retorna o 
     * último elemento adicionado ao passo que com 0 o elemento retornado
     * será o primeiro inserido ao passo que uma chamada passando n
     * como parâmetro retorna null.
     * 
     * @param n posição de onde quer se obter um componente do <i>Container</i>. 
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
     * Fornece o número de componentes no container.
     * 
     * @return número de componentes no container.
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
     * Remove um component do container, para isso é preciso especificar qual componente 
     * se quer remover.
     * 
     * @param comp <CODE>Component</CODE> a ser removido do container.
     */
	public void remove(Component comp) {
		if (comp != null) {
			this.container.remove(comp.getComponent());
			this.repaint();
		}
	}
	/**
     * Remove todos os componentes do Container.
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
	
}
