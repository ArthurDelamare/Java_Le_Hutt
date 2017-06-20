package model;

import java.awt.Image;

public class Mob extends AbstractDecor {

	public void move(){
		
	}
	
	public void death(){
		
	}
	
	public void kill(){
		
	}
	
	public Mob(int posX, int posY, Image image){
		this.setPosX(posX);
		this.setPosY(posY);
		this.setImage(image);
		this.blocker = true;
		this.breakable = true;
		
	}
	
	
}
