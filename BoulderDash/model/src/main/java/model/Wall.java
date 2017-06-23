package model;

import java.awt.Image;

/**
 * <h1> Wall is the class who give the position, the state blocker and breakable of Wall </h1>.
 * @author Lesourd Gabriel (leader), Delamare Arthur, Morlet Antoine, Billis Enzo
 * @version 1.0
 */ 

public class Wall extends AbstractDecor implements IWall{
	
	/**
	 * <h2> A Constructor that defines  </h2>
	 */
	public Wall(int posX, int posY, Image image){
		
		this.setPosX(posX);
		this.setPosY(posY);
		this.setImage(image);
		this.blocker = true;
		this.breakable = false;
		
	}

}
