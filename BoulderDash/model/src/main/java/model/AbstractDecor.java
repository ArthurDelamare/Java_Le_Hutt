package model;



 
import java.awt.Image;

public abstract class AbstractDecor implements Mapeable {
	
	protected int PosX;
	protected int PosY;
	protected Image image;
	protected boolean breakable;
	protected boolean blocker;
	protected int mapTable[][];
	
	/* (non-Javadoc)
	 * @see model.Mapeable#getPosX()
	 */
	@Override
	public int getPosX() {
		return PosX;
	}
	/* (non-Javadoc)
	 * @see model.Mapeable#setPosX(int)
	 */
	@Override
	public void setPosX(int posX) {
		PosX = posX;
	}
	
	/* (non-Javadoc)
	 * @see model.Mapeable#getPosY()
	 */
	@Override
	public int getPosY() {
		return PosY;
	}
	/* (non-Javadoc)
	 * @see model.Mapeable#setPosY(int)
	 */
	@Override
	public void setPosY(int posY) {
		PosY = posY;
	}
	
	/* (non-Javadoc)
	 * @see model.Mapeable#getImage()
	 */
	@Override
	public Image getImage() {
		return image;
	}
	/* (non-Javadoc)
	 * @see model.Mapeable#setImage(java.awt.Image)
	 */
	@Override
	public void setImage(Image image) {
		this.image = image;
	}
	
	public boolean isBreakable() {
		return breakable;
	}
	
	public boolean isBlocker() {
		return blocker;
	}
	public int[][] getMapTable() {
		return mapTable;
	}
	public void setMapTable(int[][] mapTable) {
		this.mapTable = mapTable;
	}
	
	
	
}
