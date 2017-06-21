package model;

import java.awt.Image;

public class Stone extends AbstractDecor implements IStone{
	
	
	@Override
	public void movementFall(){
		
	}
	
	public Stone(int posX, int posY, Image image){
		
		this.setPosX(posX);
		this.setPosY(posY);
		this.setImage(image);
		this.blocker = true;
		this.breakable = true;
		
	}
	
	

}
