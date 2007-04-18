package br.ufpe.cin.miniJava.gui.listener;

import br.ufpe.cin.miniJava.gui.Component;


/**
 * Esta interface descreve o método que um ouvinte de mudança de estado deve ter.
 * 
 * Um ouvinte de mudança de estado é utilizado para informar o que deve ser feito
 * num componente na hora em que seu estado for alterado.
 * 
 * @author Bruno Barros (blbs)
 * @author Luiz Carlos d'Oleron (lcadb)
 * @version 1.0
 * @since 1.0
 */
public interface ItemStateListener extends Listener {
	/**
	 * Executa a verificação da mudança de estado.
	 * 
	 * @param component <code>Component</code> que irá usar a mudança de estado.
	 */
	public void stateEvent(Component component);
	/**
	 * Executa a verificação da mudança de estado.
	 * 
	 */
	public void stateEvent();
}
