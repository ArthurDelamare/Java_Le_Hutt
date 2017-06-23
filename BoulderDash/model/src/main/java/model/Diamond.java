package model;

import java.awt.Image;

/**
 * <h1> Diamond is the class who give the position, the state blocker and breakable of Diamonds</h1>.
 * @author Lesourd Gabriel (leader), Delamare Arthur, Morlet Antoine, Billis Enzo
 * @version 1.0
 */ 

public class Diamond extends DecorWithExplosion implements IDiamond {
	
	/* (non-Javadoc)
	 * @see model.IDiamond#addPoint()
	 */
	@Override
	public void addPoint(){
		
		
		
	}
	/**
	 * <h2> This Constructor gives the position et the state blocker and breakable of Diamonds</h2>.
	 * @param posX
	 * 	the position X of Diamond
	 * @param posY
	 * 	the position Y of Diamond
	 * @param image
	 * the image of Diamond
	 */
	public Diamond(int posX, int posY, Image image){
		
		
		this.setPosX(posX);
		this.setPosY(posY);
		this.setImage(image);
		this.blocker = false;
		this.breakable = true;
		
		}

}
