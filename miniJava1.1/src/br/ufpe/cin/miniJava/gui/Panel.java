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
 * @version 1.0
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
	
}
