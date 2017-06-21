package model;

import java.awt.Image;

public class Diamond extends DecorWithExplosion implements IDiamond {
	
	/* (non-Javadoc)
	 * @see model.IDiamond#addPoint()
	 */
	@Override
	public void addPoint(){
		
		
		
	}
	
	public Diamond(int posX, int posY, Image image){
		
		
		this.setPosX(posX);
		this.setPosY(posY);
		this.setImage(image);
		this.blocker = false;
		this.breakable = true;
		
		}

}
