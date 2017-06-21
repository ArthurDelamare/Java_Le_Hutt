package model;

import java.awt.Image;

public interface Mapeable {

	int getPosX();

	void setPosX(int posX);

	int getPosY();

	void setPosY(int posY);

	Image getImage();

	void setImage(Image image);
	
	int[][] getMapTable();

	void setMapTable(int[][] mapTable);

}