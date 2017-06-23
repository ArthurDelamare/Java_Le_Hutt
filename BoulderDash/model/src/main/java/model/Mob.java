package model;

import java.awt.Image;


/**
 * <h1> Mob is the class who give the position, the state blocker and breakable of Mob. In addition it has a displacement function
</h1>.
 * @author Lesourd Gabriel (leader), Delamare Arthur, Morlet Antoine, Billis Enzo
 * @version 1.0
 */ 

public class Mob extends AbstractDecor implements IMove, IMob {

	/**
	 * <h2> A Method that defines  </h2>
	 */
	@Override
	public void move(){
		
	}

	/**
	 * <h2> A Method that defines  </h2>
	 */
	@Override
	public void death(){
		
	}
	
	/**
	 * <h2> A Method that defines  </h2>
	 */
	@Override
	public void kill(){
		
	}
	
	/**
	 * <h2> A Constructor that defines  </h2>
	 */
	public Mob(int posX, int posY, Image image){
		this.setPosX(posX);
		this.setPosY(posY);
		this.setImage(image);
		this.blocker = true;
		this.breakable = true;
		
	}
	
	
}
