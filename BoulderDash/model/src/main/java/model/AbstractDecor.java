package model;



 
import java.awt.Image;

/**
 * <h1> AbstractDecor is the abstract class inherited by the decors </h1>.
 * @author Lesourd Gabriel (leader), Delamare Arthur, Morlet Antoine, Billis Enzo
 * @version 1.0
 */ 

public abstract class AbstractDecor implements Mapeable, IAbstractDecor {
	
	protected int PosX;
	protected int PosY;
	protected Image image;
	protected boolean breakable;
	protected boolean blocker;
	protected int mapTable[][];
	
	@Override
	public int getPosX() {
		return PosX;
	}
	
	@Override
	public void setPosX(int posX) {
		PosX = posX;
	}
	
	@Override
	public int getPosY() {
		return PosY;
	}

	@Override
	public void setPosY(int posY) {
		PosY = posY;
	}
	
	/* (non-Javadoc)
	 * @see model.Mapeable#getImage()
	 */
	/* (non-Javadoc)
	 * @see model.IAbstractDecor#getImage()
	 */
	@Override
	public Image getImage() {
		return image;
	}

	@Override
	public void setImage(Image image) {
		this.image = image;
	}
	
	/* (non-Javadoc)
	 * @see model.IAbstractDecor#isBreakable()
	 */
	@Override
	public boolean isBreakable() {
		return breakable;
	}
	
	/**
	 * <h2> A Method that defines if the boolean blocker is true or false  </h2>
	 */
	@Override
	public boolean isBlocker() {
		return blocker;
	}

	/**
	 * <h2> A Method that defines MapTable  </h2>
	 */
	@Override
	public int[][] getMapTable() {
		return mapTable;
	}

	/**
	 * <h2> A Method that sets MapTable  </h2>
	 */
	@Override
	public void setMapTable(int[][] mapTable) {
		this.mapTable = mapTable;
	}
	
	
	
}
