package br.ufpe.cin.miniJava.gui;

import br.ufpe.cin.miniJava.gui.listener.ClickListener;
import br.ufpe.cin.miniJava.gui.listener.Listener;

/**
 * Esta classe representa um menu com sub-itens.
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
public class Menu extends AbstractMenu implements ClickListener {
	
	private javax.swing.JMenu menu;
	private final String DEFAULT_TEXT = "Menu";
	
    /**
     * Cria um menu vazio (sem sub-itens).
     */
	public Menu() {
		super(new Component(new javax.swing.JMenu()));
		this.menu = (javax.swing.JMenu) this.getComponent();
		this.setText(DEFAULT_TEXT);
	} 
    /**
     * Cria um menu com um texto.
     * 
     * @param text texto a ser inicializado no menu.
     */
	public Menu(String text) {
		this();
		this.setText(text);
	}
//    /**
//     * Adiciona um <code>AbstractMenu</code> no fim deste menu.
//     * 
//     * @param menuItem <code>AbstractMenu</code> que será adicionado.
//     */
//	public void add(AbstractMenu menuItem) {
//		this.menu.add(menuItem.getComponent());
//		if (menuItem instanceof MenuItem) {
//			MenuItem task = (MenuItem) menuItem;
//			task.setParent(this.getParent());
//		}
//	} 
	/**
     * Insere um componente à janela, nas coordenadas desejadas.
     * 
     * A diferença entre este método e o add, é o fato de que ao usar
     * include, o Component <code>comp</code> adiciona a janela
     * como novo ouvinte. <b>Lembre que você deverá incluir o MenuBar na Window,
     * ANTES de incluir este objeto na MenuBar.
     * 
     * @param comp <CODE>Component</CODE> que será adicionado e que
     * receberá um novo ouvinte.
     * 
     */
	public void include(AbstractMenu comp) {
		if (comp != null) {
			this.menu.add(comp.getComponent());
		}
		//isso eh ruim pq cria dependencia da superclasse 
		//em relação as subclasses
		//comp.addListener(this);
		
		//criamos uma terceira entidade com a responsabilidade
		//de conhecer as dependencias
		Component listener =  this.getParent();
		while(!(listener instanceof Window)){
			listener =  listener.getParent();
		}
		ListenerManager.addListenerTo((Listener)listener,comp);
	}
	
    /**
     * Cria um novo <code>AbstractMenu</code> com o texto especificado e
     * adiciona-o ao fim deste menu. 
     * 
     * @param s texto do novo <code>AbstractMenu</code> que será adicionado ao menu.
     */	
	public void add(String s) {
		this.menu.add(s);
	} 
    /**
     * Fornece o <code>AbstractMenu</code> localizado na posição especificada. 
     * 
     * @param pos posição do menu em que o <code>AbstractMenu</code> se encontra.
     * @return <code>AbstractMenu</code> na posição especificada.
     */	
	public AbstractMenu getItem(int pos) {
		java.awt.Component retorno = this.menu.getItem(pos);
		return (AbstractMenu) new Component(retorno);
	} 
    /**
     * Fornece o número de itens contidos neste menu. 
     * 
     * @return quantidade de itens neste menu.
     */	
	public int getItemCount() {
		return this.menu.getItemCount();
	} 
    /**
     * Fornece um array com os objetos inseridos neste menu (incluindo separadores). 
     * 
     * @return array de <code>AbstractMenu</code> (sub-itens ou sub-menus deste menu).
     */	
	public AbstractMenu[] getMenuComponents() {
		java.awt.Component retorno [] = this.menu.getMenuComponents();
		AbstractMenu[] retorno2 = new AbstractMenu[retorno.length];
		for (int i = 0; i < retorno2.length; i++) {
			retorno2[i] = (AbstractMenu) new Component(retorno[i]);
		}
		return retorno2;
	} 
    /**
     * Insere um AbstractMenu na posição indicada. 
     * 
     * @param mi <code>AbstractMenu</code> a ser inserido.
     * @param pos posição onde o <code>AbstractMenu</code> será inserido.
     */	
	public void insert(AbstractMenu mi, int pos) {
		this.menu.insert((javax.swing.JMenuItem) mi.getComponent(),pos);
	} 
    /**
     * Cria um novo <code>AbstractMenu</code> com o texto especificado e
     * adiciona-o na posição indicada. 
     * 
     * @param s texto do novo <code>AbstractMenu</code> que será adicionado ao menu.
     * @param pos posição onde o <code>AbstractMenu</code> será inserido.
     */	
	public void insert(String s, int pos) {
		this.menu.insert(s,pos);
	} 
    /**
     * Insere um separador de menu na posição indicada. 
     * 
     * @param index posição onde o separador será inserido.
     */	
	public void insertSeparator(int index) {
		this.menu.insertSeparator(index);
	} 
	/**
	 * Verifica se este menu contém um determinado <code>AbstractMenu</code>. 
	 * 
	 * @param c <code>AbstractMenu</code> a ser verificado.
	 * @return <code>true</code> se o <code>AbstractMenu</code> estiver contido neste menu.
	 */
	public boolean contains(AbstractMenu c) {
		return this.menu.isMenuComponent(c.getComponent());
	} 
	/**
	 * Verifica se o menu está inserido diretamente em uma <code>MenuBar</code>.
	 * 
	 * @return <code>true</code> se o menu estiver inserido diretamente numa <code>MenuBar</code>.
	 */
	public boolean isTopLevelMenu() {
		return this.menu.isTopLevelMenu();
	} 
	/**
	 * Remove o <code>AbstractMenu</code> especificado deste menu.
	 * 
	 * @param c <code>AbstractMenu</code> a ser removido.
	 */
	public void remove(AbstractMenu c) {
		this.menu.remove(c.getComponent());
	} 
	/**
	 * Remove o <code>AbstractMenu</code> que estiver na posição especificada.
	 * 
	 * @param pos posição de onde se quer remover um <code>AbstractMenu</code>.
	 */
	public void remove(int pos) {
		this.menu.remove(pos);
	} 
	/**
	 * Remove todos os sub-itens e sub-menus deste menu.
	 */
	public void removeAll() {
		this.menu.removeAll();
	}
	
	public void clickEvent(Component component) {
		// TODO Auto-generated method stub
		
	}
	public void clickEvent() {
		// TODO Auto-generated method stub
		
	} 
}
