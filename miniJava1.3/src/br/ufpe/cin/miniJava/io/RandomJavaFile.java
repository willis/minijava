package br.ufpe.cin.miniJava.io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
/**
 * A classe <code>RandomJavaFile</code> permite que se escreva e leia ao mesmo tempo
 * de um único arquivo, também permite com que se "mova" um ponteiro pelo arquivo
 * indicando em que posição encontra-se a leitura/escrita atual. Este arquivo
 * comporta-se como um grande array de bytes armazenado no sistema de arquivos, e a
 * esta classe provê métodos para manipular este arquivo de várias formas.
 *  
 * @author Bruno Barros (blbs)
 * @author Luiz Carlos d'Oleron (lcadb)
 * @version 1.3
 * @since 1.3
 */
public class RandomJavaFile{
	
	private RandomAccessFile raf;
	/**
	 * Cria um novo <code>RandomJavaFile</code>, que representará um arquivo existente,
	 * que terá seu caminho indicado pela String <code>endereco</code>, e seu tipo de 
	 * acesso através da String <code>tipoAcesso</code>, podendo ser leitura ou leitura/gravação. 
	 * 
	 * @param endereco Caminho completo do arquivo existente no sistema de arquivos, de onde será feito leitura e/ou escrita de dados.
	 * @param tipoAcesso String que indicará o tipo de acesso ao arquivo, podendo ser:
	 * <ul> <li><b>r</b> - somente leitura</li><li><b>rw</b> - leitura e escrita</li>
	 * </ul>
	 * @throws FileNotFoundException caso o arquivo não for encontrado no sistema de arquivos.
	 * @throws IllegalArgumentException caso o tipo de acesso não for uma String válida (ou <b>r</b> ou <b>rw</b>);
	 */
	public RandomJavaFile(String endereco, String tipoAcesso) throws FileNotFoundException, IllegalArgumentException {
		this.raf = new RandomAccessFile(endereco, tipoAcesso);
	}
	/**
	 * Fecha os arquivo e libera todos os recursos criados pelo
	 * sistema operional associados a ele.
	 * 
	 * @throws IOException caso aconteça algum erro de IO.
	 */
	public void close() throws IOException {
		raf.close();
	}

	/**
	 * Retorna o tamanho em bytes do arquivo representado por esta classe.
	 * 
	 * @return um <code>long</code> com o tamanho em bytes deste arquivo.
	 * @throws IOException caso aconteça algum erro de IO.
	 */
	public long length() throws IOException {
		return raf.length();
	}
	/**
	 * Lê deste arquivo a quantidade de bytes que couberem no array de bytes passado
	 * como parâmetro, e armazena neste array. 
	 * 
	 * @param byteArray o array de bytes que receberá os bytes lidos do arquivo.
	 * @return a quantidade de bytes que foram lidos do arquivo (nem sempre será do tamanho do array,
	 * por exemplo, quando já se estiver próximo do fim do arquivo).
	 * @throws IOException caso aconteça algum erro de IO.
	 */
	public int read(byte[] byteArray) throws IOException {
		return raf.read(byteArray);
	}

	/**
	 * Lê um boolean deste arquivo.
	 * 
	 * @return o boolean lido do arquivo.
	 * @throws IOException caso aconteça algum erro de IO.
	 */
	public boolean readBoolean() throws IOException {
		return raf.readBoolean();
	}

	/**
	 * Lê um byte deste arquivo.
	 * 
	 * @return o byte lido do arquivo.
	 * @throws IOException caso aconteça algum erro de IO.
	 */
	public byte readByte() throws IOException {
		return raf.readByte();
	}
	/**
	 * Lê um char deste arquivo.
	 * 
	 * @return o char lido do arquivo.
	 * @throws IOException caso aconteça algum erro de IO.
	 */
	public char readChar() throws IOException {
		return raf.readChar();
	}
	
	/**
	 * Lê um double deste arquivo.
	 * 
	 * @return o double lido do arquivo.
	 * @throws IOException caso aconteça algum erro de IO.
	 */
	public double readDouble() throws IOException {
		return raf.readDouble();
	}

	/**
	 * Lê um int deste arquivo.
	 * 
	 * @return o int lido do arquivo.
	 * @throws IOException caso aconteça algum erro de IO.
	 */
	public int readInt() throws IOException {
		return raf.readInt();
	}

	/**
	 * Lê toda uma linha do arquivo, iniciando-se da posição atual (onde o ponteiro
	 * do arquivo está apontando agora), e vai até encontrar um caractere que indique
	 * quebra de linha.
	 * 
	 * @return uma <code>String</code> com a linha lida do arquivo.
	 * @throws IOException caso aconteça algum erro de IO.
	 */
	public String readLine() throws IOException {
		return raf.readLine();
	}

	/**
	 * Lê uma String do arquivo.
	 * Observe que primeiro é lido um int que indicará o tamanho da String,
	 * depois são lidos a quantidade de bytes correspondentes ao tamanho da String.
	 * 
	 * @return a String lida do arquivo.
	 * @throws IOException caso aconteça algum erro de IO.
	 */
	public String readString() throws IOException {		
		byte[] string = new byte[raf.readInt()];
		raf.read(string);
		return new String(string);
	}

	/**
	 * Altera a posição do ponteiro do arquivo, ou seja, comparando o arquivo
	 * com um array gigante de bytes, altera a variável que percorre este grande array.
	 * 
	 * @param posicao a nova posição desejada para o ponteiro do arquivo.
	 * @throws IOException caso posicao seja menor que zero, ou aconteça algum erro de IO.
	 */
	public void seek(long posicao) throws IOException {
		raf.seek(posicao);
	}
	/**
	 * Pula a quantidade de bytes indicada, ou seja, soma o valor passado por parâmetro
	 * ao ponteiro do arquivo.
	 * 
	 * @param distancia a quantidade que será somada ao ponteiro atual do arquivo.
	 * @throws IOException caso aconteça algum erro de IO.
	 */
	public int skipBytes(int distancia) throws IOException {
		return raf.skipBytes(distancia);
	}
	/**
	 * Escreve um boolean no arquivo.
	 * 
	 * @param dado boolean a ser escrito no arquivo.
	 * @throws IOException caso aconteça algum erro de IO.
	 */	
	public void writeBoolean(boolean dado) throws IOException {
		raf.writeBoolean(dado);
	}
	/**
	 * Escreve uma <code>String</code> no arquivo.
	 * Para tal, primeiro é escrito um <code>int</code> com o tamanho da String,
	 * logo em seguida são escritos os bytes desta String.
	 * 
	 * @param dados String a ser escrita no arquivo.
	 * @throws IOException caso aconteça algum erro de IO.
	 */
	public void writeString(String dados) throws IOException {
		raf.writeInt(dados.length());
		raf.writeBytes(dados);
	}
	/**
	 * Escreve um char no arquivo.
	 * 
	 * @param dado char a ser escrito no arquivo.
	 * @throws IOException caso aconteça algum erro de IO.
	 */
	public void writeChar(int dado) throws IOException {
		raf.writeChar(dado);
	}
	/**
	 * Escreve um double no arquivo.
	 * 
	 * @param dado double a ser escrito no arquivo.
	 * @throws IOException caso aconteça algum erro de IO.
	 */
	public void writeDouble(double dado) throws IOException {
		raf.writeDouble(dado);
	}
	/**
	 * Escreve um int no arquivo.
	 * 
	 * @param dado int a ser escrito no arquivo.
	 * @throws IOException caso aconteça algum erro de IO.
	 */
	public void writeInt(int dado) throws IOException {
		raf.writeInt(dado);
	}

}
