package model;

import java.awt.Image;

public class Ground extends AbstractDecor{
	
	Ground(int posX, int posY, Image image){
		
		this.setPosX(posX);
		this.setPosY(posY);
		this.setImage(image);
		this.blocker = false;
		this.breakable = true;
		
	}
	
	public void breaking(){
		
	}
	
}
