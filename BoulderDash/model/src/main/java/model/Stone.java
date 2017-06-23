package model;

import java.awt.Image;

/**
 * <h1> Stone is the class who give the position, the state blocker and breakable of Stone</h1>.
 * @author Lesourd Gabriel (leader), Delamare Arthur, Morlet Antoine, Billis Enzo
 * @version 1.0
 */ 

public class Stone extends AbstractDecor implements IStone{
	
	/**
	 * <h2> A Method that defines  </h2>
	 */
	@Override
	public void movementFall(){
		
	}
	
	/**
	 * <h2> A Method that defines  </h2>
	 */
	public Stone(int posX, int posY, Image image){
		
		this.setPosX(posX);
		this.setPosY(posY);
		this.setImage(image);
		this.blocker = true;
		this.breakable = true;
		
	}
	
	

}
