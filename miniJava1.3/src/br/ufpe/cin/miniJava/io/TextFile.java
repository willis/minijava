package br.ufpe.cin.miniJava.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * A classe <code>TextFile</code> possibilita a leitura/escrita de arquivos no formato de texto simples.
 * Através dela podemos escrever e ler texto (<code>Strings</code>) dos arquivos. Ao contrário
 * de {@link JavaFile}, os arquivos gerados por <code>TextFile</code> são fáceis de serem lidos,
 * uma vez que eles estão no formato de texto.
 *  
 * @author Bruno Barros (blbs)
 * @author Luiz Carlos d'Oleron (lcadb)
 * @version 1.3
 * @since 1.3
 */
public class TextFile {

	private DataInputStream input;
	private DataOutputStream output;

	
	/**
	 * Cria um <code>TextFile</code>, tendo como arquivo de entrada o arquivo indicado por uma String
	 * <code>entrada</code>, e como arquivo de saída o arquivo indicado por uma String <code>saida</code>. 
	 * 
	 * @param entrada Caminho completo do arquivo de entrada, de onde será feito leitura de dados.
	 * @param saida Caminho completo do arquivo de saída, onde será feito escrita de dados.
	 * @throws FileNotFoundException caso algum dos arquivos (entrada ou saída) não exista.
	 */
	public TextFile(String entrada, String saida) throws FileNotFoundException {
		this.input = new DataInputStream(new FileInputStream(entrada));
		this.output = new DataOutputStream(new FileOutputStream(saida));
	}
	/**
	 * Lê uma String do arquivo de entrada.
	 * 
	 * @return a String lida do arquivo, ou <code>null</code> se não há nenhuma String a ser lida. 
	 * @throws IOException caso aconteça algum erro de IO.
	 */
	public String readString() throws IOException {
		
		int i;
		int value = input.available();
		byte temp [] = new byte[value];
		
		boolean parada = false;
		for (i = 0; !parada && i < value; i++) {
			byte c = input.readByte();
			if ((c <= 0x20) || (c == 0x7F)) {
				parada = true;
				if (c == 13) input.readByte();
			} else {
				temp[i] = c;	
			}
		}
		byte array [] = new byte[i - 1];
		System.arraycopy(temp,0,array,0,i - 1);
		String retorno = new String(array);
		return retorno;
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
	 * Método que "libera" os bytes que estiverem no buffer (espaço de armazenamento
	 * de dados criado temporariamente pelo sistema operacional) de <code>TextFile</code>,
	 * forçando-os a serem escritos no arquivo de saída.
	 * 
	 * @throws IOException caso aconteça algum erro de IO.
	 */
	public void flush() throws IOException {
		output.flush();
	}
	/**
	 * Escreve uma String no arquivo de saída.
	 * 
	 * @param string a String a ser escrita no arquivo de saída. 
	 * @throws IOException caso aconteça algum erro de IO.
	 */
	public void writeString(String string) throws IOException {
		output.writeBytes(string);
	}

}
