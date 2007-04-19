package br.ufpe.cin.miniJava.gui;


/**
 * Esta classe representa um painel, um componente que pode
 * conter outros componentes dentro dele.
 * 
 * <p align=center> 
 * <img border="0" src="../../../../../resources/Panel.gif">
 * </p>
 * 
 * @author Bruno Barros (blbs)
 * @author Luiz Carlos d'Oleron (lcadb)
 * @version 1.2
 * @since 1.0
 */
public class Panel extends Container {
			
	private javax.swing.JPanel panel;
	private final int MIN_WIDTH = 150;
	private final int MIN_HEIGHT = 50;
	/**
	 * Cria um novo painel vazio.
	 */
	public Panel(){		
		super(new Component(new javax.swing.JPanel()));
		this.panel = (javax.swing.JPanel) this.getComponent();
		this.panel.setLayout(null);
		this.panel.setSize(MIN_WIDTH,MIN_HEIGHT);
	}
	
    /**
     * Insere um componente neste painel.
     * 
     * @param comp <CODE>Component</CODE> que será adicionado.
     */
	public void add(Component comp) {
		if (comp != null) {
			this.panel.add(comp.getComponent());
			comp.setParent(this);
			this.repaint();
		}
	}
	/**
     * Insere um componente neste painel, nas coordenadas desejadas.
     * 
     * @param comp <CODE>Component</CODE> que será adicionado.
     * @param x posição X do component.
     * @param y posição Y do component.
     */
	public void add(Component comp, int x, int y) {
		if (comp != null) {
			comp.setPosition(x,y);
			this.add(comp);
		}
	}
}
