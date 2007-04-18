package br.ufpe.cin.miniJava.gui;

/**
 * Esta classe abstrata implementa funcionalidades para menus.
 * 
 * @author Bruno Barros (blbs)
 * @author Luiz Carlos d'Oleron (lcadb)
 * @version 1.0
 * @since 1.0
 */
abstract class AbstractMenu extends AbstractButton {
    /**
     * Cria um menu abstrato
     * 
     * @param component <CODE>Component</CODE> que indicará qual será o
     * tipo do menu abstrato.
     */
	AbstractMenu (Component comp) {
		super(comp);		
	}
	
}
