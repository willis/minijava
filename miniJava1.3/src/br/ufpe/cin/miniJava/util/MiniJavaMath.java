package br.ufpe.cin.miniJava.util;

/**
 * A classe <code>MiniJavaMath</code> contém métodos que auxiliarão o usuário
 * no cálculo de operações matemáticas, como valor absoluto, seno, cosseno,
 * potenciação, raiz quadrada, etc. Por se tratar de uma classe <code>final</code>,
 * não poderá ser instanciada, para chamar seus métodos, utilize
 * <i>MiniJavaMath.nome_do_metodo()</i> diretamente.
 * 
 * @author Bruno Barros (blbs)
 * @author Luiz Carlos d'Oleron (lcadb)
 * @version 1.2
 * @since 1.1
 */
public final class MiniJavaMath {

	/**
	 * Implementação vazia do construtor de MiniJavaMath, uma vez que
	 * não é necessário e nem permitido construir objetos desta classe.
	 */
	private MiniJavaMath(){}
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
	/**
	 * O método <code>sqrt</code> retorna um <code>double</code> com
	 * a raiz quadrada positiva de um valor passado como parâmetro
	 * (também um <code>double</code>). Caso o valor passado como parâmetro
	 * seja menor ou igual a zero, o método não retorna um <code>double </code> válido.
	 * 
	 * @param  value  um valor em <code>double</code>.
	 * @return um <code>double</code> com a raiz quadrada positiva do número
	 * passado como parâmetro.
	 */
	public static double sqrt(double value){
		return java.lang.Math.sqrt(value);
	}
	/**
	 * O método <code>pow</code> calcula a potência de um número (a base), 
	 * elevado a alguma potência (o expoente), e retorna este cálculo
	 * armazenado num <code>int</code>. O expoente deverá ser positivo,
	 * e caso ele não seja, o método não retornará um <code>int </code> válido. 
	 * 
	 * @param  base  um valor em <code>int</code>.
	 * @param  expoente  um valor em <code>int</code>. 
	 * @return um <code>int</code> com o valor de <i>base</i> elevado a <code>expoente</code>.
	 */
	public static int pow(int base, int expoente){
		return (int) java.lang.Math.pow(base, expoente);
	}	
	

}