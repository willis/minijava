package br.ufpe.cin.miniJava.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/**
 * A classe <code>JavaFile</code> possibilita a leitura/escrita de arquivos no formato de Java,
 * através de bytes. É usada basicamente para escrever e ler objetos inteiros em arquivos. Observe
 * que os arquivos gerados por <code>JavaFile</code> não são compreensíveis por nós, uma vez
 * que são escritos apenas bytes.
 * 
 * @author Bruno Barros (blbs)
 * @author Luiz Carlos d'Oleron (lcadb)
 * @version 1.3
 * @since 1.3
 */
public class JavaFile {

	private FileInputStream input;
	private FileOutputStream output;
	/**
	 * Cria um <code>JavaFile</code>, tendo como arquivo de entrada o arquivo indicado por uma String
	 * <code>entrada</code>, e como arquivo de saída o arquivo indicado por uma String <code>saida</code>. 
	 * 
	 * @param entrada Caminho completo do arquivo de entrada, de onde será feito leitura de dados.
	 * @param saida Caminho completo do arquivo de saída, onde será feito escrita de dados.
	 * @throws FileNotFoundException caso algum dos arquivos (entrada ou saída) não exista.
	 */
	public JavaFile(String entrada, String saida) throws FileNotFoundException {
		this.input = new FileInputStream(entrada);
		this.output = new FileOutputStream(saida);
	}
	/**
	 * Método que "libera" os bytes que estiverem no buffer (espaço de armazenamento
	 * de dados criado temporariamente pelo sistema operacional) de <code>JavaFile</code>,
	 * forçando-os a serem escritos no arquivo de saída.
	 * 
	 * @throws IOException caso aconteça algum erro de IO.
	 */
	public void flush() throws IOException {
		output.flush();
	}
	/**
	 * Fecha os arquivos de entrada e saída e libera todos os recursos criados pelo
	 * sistema operional associados a eles.
	 * 
	 * @throws IOException caso aconteça algum erro de IO.
	 */
	public void close() throws IOException {
		IOException exception = null;
		try {
			output.close();
		} catch (IOException ex) {
			exception = ex;
		}
		try {
			input.close();
		} catch (IOException ex) {
			exception = ex;
		}
		if(exception!=null){
			throw exception;
		}
	}
	
	/**
	 * Escreve um objeto no arquivo de saída.
	 * 
	 * @param object Objeto a ser escrito no arquivo de saída.
	 * @throws IOException caso aconteça algum erro de IO.
	 */
	public void writeObject(Object object) throws IOException {
		ObjectOutputStream  x = new ObjectOutputStream(output);
		x.writeObject(object);
	}
	/**
	 * Lê um objeto do arquivo de entrada.
	 * 
	 * @return o objeto que foi lido do arquivo de entrada, ou <code>null</code> se
	 * nada foi lido do arquivo de entrada ou ocorreu algum erro.
	 */
	public Object readObject() {
		ObjectInputStream x;
		Object y = null;
		try { 
			x = new ObjectInputStream(input);
			y = x.readObject();
		} catch (IOException e) {			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {			
			e.printStackTrace();
		}
		return y;
	}
	
}
