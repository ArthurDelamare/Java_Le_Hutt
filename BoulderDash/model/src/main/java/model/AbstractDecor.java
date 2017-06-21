package model;



 
import java.awt.Image;

public abstract class AbstractDecor implements Mapeable, IAbstractDecor {
	
	protected int PosX;
	protected int PosY;
	protected Image image;
	protected boolean breakable;
	protected boolean blocker;
	protected int mapTable[][];
	
	/* (non-Javadoc)
	 * @see model.Mapeable#getPosX()
	 */
	/* (non-Javadoc)
	 * @see model.IAbstractDecor#getPosX()
	 */
	@Override
	public int getPosX() {
		return PosX;
	}
	/* (non-Javadoc)
	 * @see model.Mapeable#setPosX(int)
	 */
	/* (non-Javadoc)
	 * @see model.IAbstractDecor#setPosX(int)
	 */
	@Override
	public void setPosX(int posX) {
		PosX = posX;
	}
	
	/* (non-Javadoc)
	 * @see model.Mapeable#getPosY()
	 */
	/* (non-Javadoc)
	 * @see model.IAbstractDecor#getPosY()
	 */
	@Override
	public int getPosY() {
		return PosY;
	}
	/* (non-Javadoc)
	 * @see model.Mapeable#setPosY(int)
	 */
	/* (non-Javadoc)
	 * @see model.IAbstractDecor#setPosY(int)
	 */
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
	/* (non-Javadoc)
	 * @see model.Mapeable#setImage(java.awt.Image)
	 */
	/* (non-Javadoc)
	 * @see model.IAbstractDecor#setImage(java.awt.Image)
	 */
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
	
	/* (non-Javadoc)
	 * @see model.IAbstractDecor#isBlocker()
	 */
	@Override
	public boolean isBlocker() {
		return blocker;
	}
	/* (non-Javadoc)
	 * @see model.IAbstractDecor#getMapTable()
	 */
	@Override
	public int[][] getMapTable() {
		return mapTable;
	}
	/* (non-Javadoc)
	 * @see model.IAbstractDecor#setMapTable(int[][])
	 */
	@Override
	public void setMapTable(int[][] mapTable) {
		this.mapTable = mapTable;
	}
	
	
	
}
