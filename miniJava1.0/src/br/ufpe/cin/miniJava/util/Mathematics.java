/**
 *
 */
package br.ufpe.cin.miniJava.util;

/**
 * A classe Mathematics contém Esta classe contém operações .
 * 
 * @author Bruno Barros (blbs)
 * @author Luiz Carlos d'Oleron (lcadb)
 * @version 1.1
 * @since 1.1
 */
public final class Mathematics {

	/**
	 * Implementação vazia do construtor de Mathematics, uma vez que
	 * não é necessário e nem permitido construir objetos desta classe.
	 */
	private Mathematics(){}
	/**
	 * O método <code>abs</code> retorna o valor absoluto do <code>double</code>
	 * passado como parâmetro.
	 * 
	 * @param  value  o <code>double</code> cujo valor absoluto será informado.
	 * @return <code>double</code> com o valor absoluto do argumento.
	 */
	public static double abs(double value){
		return java.lang.Math.abs(value);
	}
	/**
	 * O método <code>abs</code> retorna o valor absoluto do <code>int</code>
	 * passado como parâmetro.
	 * 
	 * @param  value  o <code>int</code> cujo valor absoluto será informado.
	 * @return <code>int</code> com o valor absoluto do argumento.
	 */
	public static int abs(int value){
		return java.lang.Math.abs(value);
	}

}