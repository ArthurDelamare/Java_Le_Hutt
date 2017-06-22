package model;

import java.awt.Image;
import java.util.Observer;

public interface IHero{

	void walkOn();

	void move();

	void pushStone();

	int getDirection();

	void setDirection(int direction);

	int getPosX();

	void setPosX(int posX);

	int getPosY();

	void setPosY(int posY);

	int getDiamonds();

	void setDiamonds(int diamonds);

	boolean isaLive();

	void setaLive(boolean aLive);

	Image getImage();

	void setImage(Image image);
	
	void addObserver(Observer o);

}