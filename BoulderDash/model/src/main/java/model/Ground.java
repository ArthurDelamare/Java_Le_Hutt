package model;

import java.awt.Image;

public class Ground extends AbstractDecor implements IGround{
	
	Ground(int posX, int posY, Image image, int mapTable[][]){
		
		this.setPosX(posX);
		this.setPosY(posY);
		this.setImage(image);
		this.blocker = false;
		this.breakable = true;
		this.mapTable = mapTable;
		
	}
	
	@Override
	public void breaking(){
		
	}
	
}
