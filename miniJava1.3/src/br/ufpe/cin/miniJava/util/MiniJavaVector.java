package br.ufpe.cin.miniJava.util;

import java.util.Vector;

/**
 * A classe <code>MiniJavaVector</code> contém métodos que auxiliarão o usuário
 * na manipulação de conjunto de dados, como inserir, remover, etc. Observe que
 * ela funciona como um array "auto-dimensionável", podendo ter seus elementos acessados
 * através de um índice, mas não necessitando que sejam
 * implementadas rotinas de duplicação de tamanho, por exemplo.
 * 
 * Esta classe utiliza <a href="http://en.wikipedia.org/wiki/Generic_programming">Generics</a>,
 * ou seja, você poderá definir com qual tipo específico de objetos ela irá trabalhar. 
 * 
 * @author Bruno Barros (blbs)
 * @author Luiz Carlos d'Oleron (lcadb)
 * @version 1.2.1
 * @since 1.2
 */
public class MiniJavaVector<T> {
	
	private Vector<T> dentro;

	/**
	 * Cria um novo vetor vazio com a capacidade inicial
	 * desejada.
	 * 
	 * @param tam <code>int</code> contendo o tamanho do novo vetor.
	 * @see MiniJavaVector#MiniJavaVector()
	 */
	public MiniJavaVector(int tam) {
		this.dentro = new Vector<T>(tam);
	}

	/**
	 * Cria um novo vetor vazio com a capacidade inicial
	 * padrão (capacidade para 10 objetos).
	 * 
	 * Como esta é uma classe genérica, pode-se indicar
	 * com qual tipo de objeto uma instância desta
	 * classe deverá trabalhar, através da seguinte forma:
	 * <blockquote>
	 * <pre>
	 * MiniJavaVector&lt;tipo_do_objeto_desejado&gt; vetor = new MiniJavaVector &lt;tipo_do_objeto_desejado&gt;();
	 * </pre>
	 * </blockquote>
	 * Dessa forma, os métodos de MiniJavaVector receberão apenas
	 * objetos do tipo indicado. 
	 * <br>
	 * Caso não seja necessário indicar o tipo do objeto, entende-se
	 * que poderá ser qualquer objeto inserido neste vetor.
	 */
	public MiniJavaVector() {
		this(10);
	}
	
	
	
	/**
	 * Insere um objeto neste vetor, na posição indicada como parâmetro.
	 * Se já houver um objeto nesta posição, ele será sobrescrito.
	 * 
	 * @param indice um <code>int</code> com a posição que o novo objeto ocupará
	 * no vetor. Este valor deve estar entre 0 e tamanho do vetor menos um elemento,
	 * senão levantará uma exceção. 
	 * @param object o objeto que será adicionado na posição indicada.
	 */
	public void add(int indice, T object) {
		dentro.add(indice, object);
	}

	/**
	 * Insere um objeto neste vetor (colocando-o na próxima posição vaga).
	 * 
	 * @param object objeto a ser inserido no vetor.
	 */
	public void add(T object) {
		dentro.add(object);
	}

	/**
	 * Adiciona todos os objetos do vetor passado como parâmetro neste
	 * vetor (começando da próxima posição vaga deste vetor).
	 * 
	 * @param vector um outro vetor, que será copiado por completo (todos os
	 * objetos dele) dentro do vetor que chamar este método.
	 */
	public void addAll(MiniJavaVector<T> vector) {
		dentro.addAll(vector.dentro);
	}

	/**
	 * Adiciona todos os objetos do vetor passado como parâmetro neste 
	 * vetor, começando a partir do indice indicado. 
	 * 
	 * @param indice um <code>int</code> que indicará a partir de qual
	 * posição irá se iniciar a cópia do vetor.
	 * @param vector um outro vetor, que será copiado por completo (todos os
	 * objetos dele) dentro do vetor que chamar este método.
	 */
	public void addAll(int indice, MiniJavaVector<T> vector) {
		dentro.addAll(indice, vector.dentro);
	}

	/**
	 *  Apaga todos os objetos contidos neste vetor.
	 */
	public void clear() {
		dentro.clear();
	}

	/**
	 * Verifica se este vetor contém todos os elementos do vetor
	 * passado como parâmetro. Em outras palavras, verifica se
	 * o outro vetor é "sub-conjunto" do outro.
	 * 
	 * @param vector o vetor que será comparado com este vetor.
	 * @return <code>true</code> se o vetor passado como parâmetro é
	 * "sub-conjunto" deste vetor (incluindo o caso de serem iguais) e
	 * <code>false</code> caso contrário.
	 */
	public boolean containsAll(MiniJavaVector<T> vector) {
		return dentro.containsAll(vector.dentro);
	}

	/**
	 * Retorna o objeto localizado na posição indicada.
	 * A fins de comparação entre arrays:
	 * <blockquote>
     * <pre>
     * get(i) = array[i]</pre></blockquote>
	 *  
	 * @param indice posição na qual o objeto que se deseja acessar encontra-se.
	 * @return o objeto localizado na posição passada como parâmetro.
	 */
	public T get(int indice) {
		return dentro.get(indice);
	}

	/**
	 * Método que indica se o vetor está vazio (sem nenhum objeto inserido nele).
	 * @return <code>true</code> se ele não tiver elementos,
	 * <code>false</code> caso contrário.
	 */
	public boolean isEmpty() {
		return dentro.isEmpty();
	}

	/**
	 * Remove o objeto localizado na posição indicada, retornando-o após
	 * sua remoção. Esta remoção fará com que todos os elementos posteriores
	 * ao que foi removido tenham sua posição deslocada para uma posição a
	 * menos da anterior.
	 * 
	 * @param indice posição onde o objeto que será removido se encontra.
	 * @return o objeto que acabou de ser removido, caso ele tenha sido
	 * removido efetivamente, ou <code>null</code>, caso não tenha sido
	 * removido (provavelmente por não ter sido encontrado).
	 */
	public T remove(int indice) {
		return dentro.remove(indice);
	}

	/**
	 * Retorna o número de objetos contidos deste vetor.
	 * 
	 * @return um <code>int</code> com o número de objetos contidos neste vetor.
	 */
	public int size() {
		return dentro.size();
	}
	
	/**
	 * Método que indica se dois vetores são iguais.
	 * Dois vetores são iguais se e somente se eles possuirem os mesmos elementos,
	 * e na mesma ordem, além da mesma quantidade de elementos.
	 * @param obj um vetor que será comparado com este vetor.
	 * @return <code>true</code> se os vetores forem iguais, <code>false</code>
	 * caso contrário. 
	 */
	public boolean equals(Object obj) {
		if (obj instanceof MiniJavaVector) {
			return dentro.equals(((MiniJavaVector) obj).dentro);
		}
		return super.equals(obj);
	}

}
