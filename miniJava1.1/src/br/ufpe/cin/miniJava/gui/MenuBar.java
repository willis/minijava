package br.ufpe.cin.miniJava.gui;

/**
 * Esta classe representa uma barra de menus, onde ser�o inseridos menus e itens de menu.
 * 
 * <p align=center> 
 * <img border="0" src="../../../../../resources/MenuBar.gif">
 * </p>
 * 
 * @author Bruno Barros (blbs)
 * @author Luiz Carlos d'Oleron (lcadb)
 * @version 1.0
 * @since 1.0
 */
public class MenuBar extends Component {
	
	private javax.swing.JMenuBar menuBar;
	private final int MIN_WIDTH = 200;
	private final int MIN_HEIGHT = 30;

	/**
     * Cria uma barra de menu vazia.
	 *
	 */
	public MenuBar() {
		super(new javax.swing.JMenuBar());
		this.menuBar = (javax.swing.JMenuBar) this.getComponent();
		this.menuBar.setSize(MIN_WIDTH,MIN_HEIGHT);
	} 
	
//	/**
//	 * Insere um <code>AbstractMenu</code> ao fim desta barra de menu.
//	 * 
//	 * @param c <code>AbstractMenu</code> a ser inserido
//	 */
//	public void add(AbstractMenu c) {
//		this.menuBar.add(c.getComponent());
//	} 
	/**
	 * Insere um <code>AbstractMenu</code> ao fim desta barra de menu.
	 * 
	 * @param c <code>AbstractMenu</code> a ser inserido
	 */
	public void include(AbstractMenu c) {
		this.menuBar.add(c.getComponent());
	} 
	/**
	 * Fornece a posi��o que o <code>AbstractMenu</code> ocupa na barra de menu.
	 * 
	 * @param c <code>AbstractMenu</code> a ser localizado.
	 * @return posi��o do <code>AbstractMenu</code> na barra de menu.
	 */
	public int getComponentIndex(AbstractMenu c) {
		return this.menuBar.getComponentIndex(c.getComponent());
	} 
	/**
	 * Fornece o <code>Menu</code> localizado na posi��o fornecida..
	 * 
	 * @param index posi��o a ser verificada.
	 * @return <code>Menu</code> localizado nesta posi��o, ou <code>null</code> se
	 * n�o existir um menu na posi��o indicada (por exemplo, se tiver
	 * um <code>MenuItem</code> nesta posi��o).
	 */
	public AbstractMenu getMenu(int index) {
		return (AbstractMenu) new Component(this.menuBar.getMenu(index));
	} 
	/**
	 * Fornece o n�mero de itens contidos nesta barra de menu.
	 * 
	 * @return quantidade
	 */
	public int getMenuCount() {
		return this.menuBar.getMenuCount();
	} 
	/**
	 * Indica se algum sub-menu ou sub-item da barra de menus est� selecionado.
	 * 
	 * @return <code>true</code> se algum sub-item ou sub-menu da barra estiver selecionado.
	 */
	public boolean isSelected() {
		return this.menuBar.isSelected();
	} 
	/**
	 * Seleciona um <code>AbstractMenu</code> contido na barra de menu. 
	 * 
	 * @param sel <code>AbstractMenu</code> a ser selecionado
	 */
	public void setSelected(AbstractMenu sel) {
		this.menuBar.setSelected(sel.getComponent());
	} 

}
