package model;

import java.awt.Image;

public interface IAbstractDecor {

	/* (non-Javadoc)
	 * @see model.Mapeable#getPosX()
	 */
	int getPosX();

	/* (non-Javadoc)
	 * @see model.Mapeable#setPosX(int)
	 */
	void setPosX(int posX);

	/* (non-Javadoc)
	 * @see model.Mapeable#getPosY()
	 */
	int getPosY();

	/* (non-Javadoc)
	 * @see model.Mapeable#setPosY(int)
	 */
	void setPosY(int posY);

	/* (non-Javadoc)
	 * @see model.Mapeable#getImage()
	 */
	Image getImage();

	/* (non-Javadoc)
	 * @see model.Mapeable#setImage(java.awt.Image)
	 */
	void setImage(Image image);

	boolean isBreakable();

	boolean isBlocker();

	int[][] getMapTable();

	void setMapTable(int[][] mapTable);

}