package br.ufpe.cin.miniJava.gui;

		
import javax.swing.SwingConstants;
/**
 * Esta interface contém as constantes necessárias para
 * posicionamento, direção e orientação dos componentes
 * 
 * @author Bruno Barros (blbs)
 * @author Luiz Carlos d'Oleron (lcadb)
 * @version 1.0
 * @since 1.0
 */
public interface MiniJavaConstants {
	
	//verticais
	/** Posição vertical e/ou horizontal - meio do componente*/
	public static final Position CENTER = Position.CENTER;
	/** Posição vertical - parte superior do componente*/
	public static final Position TOP = Position.TOP;
	/** Posição vertical - parte inferior do componente*/
	public static final Position BOTTOM = Position.BOTTOM;
	
	//horizontais
	/** Posição horizontal - alinhamento à esquerda*/
	public static final Position LEFT = Position.LEFT;
	/** Posição horizontal - alinhamento à direita*/
	public static final Position RIGHT = Position.RIGHT;
	/** Posição horizontal - alinhamento com a borda externa*/
	public static final Position LEADING = Position.LEADING;
	/** Posição horizontal - alinhamento com a borda interna*/
	public static final Position TRAILING = Position.TRAILING;
	
	/** Direção - N (acima) */
	public static final Direction NORTH = Direction.NORTH;
	/** Direção - NE (direita acima) */
	public static final Direction NORTH_EAST = Direction.NORTH_EAST;
	/** Direção - E (direita) */
	public static final Direction EAST = Direction.EAST;
	/** Direção - SE (direita abaixo) */
	public static final Direction SOUTH_EAST = Direction.SOUTH_EAST;
	/** Direção - S (abaixo) */
	public static final Direction SOUTH = Direction.SOUTH;
	/** Direção - SW (esquerda abaixo) */
	public static final Direction SOUTH_WEST = Direction.SOUTH_EAST;
	/** Direção - W (esquerda) */
	public static final Direction WEST = Direction.WEST;
	/** Direção - NW (esquerda acima) */
	public static final Direction NORTH_WEST = Direction.NORTH_WEST;

	/** Orientação - Indica posição horizontal */
	public static final Orientation HORIZONTAL = Orientation.HORIZONTAL;
	/** Orientação - Indica posição vertical */
	public static final Orientation VERTICAL = Orientation.VERTICAL;
	
	enum Position {

	    CENTER(SwingConstants.CENTER),
	    TOP(SwingConstants.TOP),
	    LEFT(SwingConstants.LEFT),
		RIGHT(SwingConstants.RIGHT),
	    BOTTOM(SwingConstants.BOTTOM),
	    LEADING(SwingConstants.LEADING),
		TRAILING(SwingConstants.TRAILING);

		private final int value;
	        
	    Position (int pos) {
	        this.value = pos;
	    }
	    
	    int value() { return this.value; }
	    
	}

	enum Direction {

		NORTH(SwingConstants.NORTH),
		NORTH_EAST(SwingConstants.NORTH_EAST),
		EAST(SwingConstants.EAST),
		SOUTH_EAST(SwingConstants.SOUTH_EAST),
		SOUTH(SwingConstants.SOUTH),
		SOUTH_WEST(SwingConstants.SOUTH_WEST),
		WEST(SwingConstants.WEST),
		NORTH_WEST(SwingConstants.NORTH_WEST);
		
		private final int value;
	        
	    Direction (int pos) {
	        this.value = pos;
	    }
	    
	    int value() { return this.value; }
	    
	}

	enum Orientation {

	    HORIZONTAL(SwingConstants.HORIZONTAL),
	    VERTICAL(SwingConstants.VERTICAL);

		private final int value;
	        
	    Orientation (int pos) {
	        this.value = pos;
	    }
	    
	    int value() { return this.value; }
	}
	
}




