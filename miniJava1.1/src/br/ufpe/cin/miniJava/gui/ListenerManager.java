package br.ufpe.cin.miniJava.gui;
import br.ufpe.cin.miniJava.gui.listener.Listener;

/**
 * Esta classe permite que um component necessite conhecer apenas
 * os seus tipos de ouvintes.
 *
 * @author Bruno Barros (blbs)
 * @author Luiz Carlos d'Oleron (lcadb)
 * @version 1.0
 * @since 1.0
 */
/*
 * Toda a classe e seus métodos / construtores são default, pois ela não deve ser
 * visível, nem no JavaDoc, nem em outros pacotes, projetos, etc.
 */
final class ListenerManager {
	
	/**
	 * Construtor <code>private</code>, evitando que a classe
	 * seja instanciada. A fins de implementação.
	 */
	private ListenerManager(){}
	
	/**
	 * Método utilizado ao adicionar um ouvinte em <b><code>miniJava</code></b>.
	 * 
	 * @param listener <code>Listener</code> que será adicionado na lista de ouvintes de <code>component</code>.
	 * @param component <code>Component</code> que receberá um novo ouvinte. 
	 */
	static void addListenerTo(Listener listener, Component component) {
		component.addListener(listener);
	}

}
