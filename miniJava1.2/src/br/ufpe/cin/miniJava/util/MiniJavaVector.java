/**
 * 
 */
package br.ufpe.cin.miniJava.util;
/**
 * A classe <code>MiniJavaVector</code> contém métodos que auxiliarão o usuário
 * na manipulação de conjunto de dados, como inserir, remover, etc.
 * 
 * <p align=center> 
 * <img border="0" src="../../../../../resources/Panel.gif">
 * </p>
 * 
 * @author Bruno Barros (blbs)
 * @author Luiz Carlos d'Oleron (lcadb)
 * @version 1.2
 * @since 1.2
 */
public class MiniJavaVector<T> {
	
	private java.util.Vector<T> dentro;

	/**
	 * @param indice
	 * @param object
	 * @see java.util.Vector#add(int, java.lang.Object)
	 */
	public void add(int indice, T object) {
		dentro.add(indice, object);
	}

	/**
	 * @param object
	 * @return
	 * @see java.util.Vector#add(java.lang.Object)
	 */
	public boolean add(T object) {
		return dentro.add(object);
	}

	/**
	 * @param vector
	 * @return
	 * @see java.util.Vector#addAll(java.util.Collection)
	 */
	public boolean addAll(MiniJavaVector<T> vector) {
		return dentro.addAll(vector.dentro);
	}

	/**
	 * @param indice
	 * @param vector
	 * @return
	 * @see java.util.Vector#addAll(int, java.util.Collection)
	 */
	public boolean addAll(int indice, MiniJavaVector<T> vector) {
		return dentro.addAll(indice, vector.dentro);
	}

	/**
	 * 
	 * @see java.util.Vector#clear()
	 */
	public void clear() {
		dentro.clear();
	}

	/**
	 * @param vector
	 * @return
	 * @see java.util.Vector#containsAll(java.util.Collection)
	 */
	public boolean containsAll(MiniJavaVector<T> vector) {
		return dentro.containsAll(vector.dentro);
	}

	/**
	 * @param indice
	 * @return
	 * @see java.util.Vector#get(int)
	 */
	public T get(int indice) {
		return dentro.get(indice);
	}

	/**
	 * @return
	 * @see java.util.Vector#isEmpty()
	 */
	public boolean isEmpty() {
		return dentro.isEmpty();
	}

	/**
	 * @param indice
	 * @return
	 * @see java.util.Vector#remove(int)
	 */
	public T remove(int indice) {
		return dentro.remove(indice);
	}

	/**
	 * @return
	 * @see java.util.Vector#size()
	 */
	public int size() {
		return dentro.size();
	}

}
