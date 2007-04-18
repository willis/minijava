package br.ufpe.cin.miniJava.gui.listener;

import br.ufpe.cin.miniJava.gui.Component;


/**
 * Esta interface descreve o método que um ouvinte de clique deve ter.
 * 
 * Um ouvinte de clique é utilizado para informar o que deve ser feito
 * num componente na hora em que ele for clicado.
 * 
 * @author Bruno Barros (blbs)
 * @author Luiz Carlos d'Oleron (lcadb)
 * @version 1.0
 * @since 1.0
 */
public interface ClickListener extends Listener{
	/**
	 * Executa a verificação da ação de clique.
	 * 
	 * @param component <code>Component</code> que irá usar a ação de clique.
	 */
	public void clickEvent(Component component);
	/**
	 * Executa a verificação da ação de clique.
	 * 
	 */
	public void clickEvent();

}
