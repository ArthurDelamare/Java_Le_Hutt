package model;

import java.awt.Image;

public class Background extends AbstractDecor{
	
	public Background(int posX, int posY, Image image){
		
		this.setPosX(posX);
		this.setPosY(posY);
		this.setImage(image);
		this.blocker = false;
		this.breakable = false;
		
	}

}
