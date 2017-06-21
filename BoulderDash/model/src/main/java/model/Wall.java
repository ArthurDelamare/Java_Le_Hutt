package model;

import java.awt.Image;

public class Wall extends AbstractDecor implements IWall{
	
	public Wall(int posX, int posY, Image image){
		
		this.setPosX(posX);
		this.setPosY(posY);
		this.setImage(image);
		this.blocker = true;
		this.breakable = false;
		
	}

}
