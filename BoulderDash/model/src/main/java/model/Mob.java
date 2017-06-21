package model;

import java.awt.Image;

public class Mob extends AbstractDecor implements IMove {

	@Override
	public void move(){
		
	}
	
	@Override
	public void death(){
		
	}
	
	@Override
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
