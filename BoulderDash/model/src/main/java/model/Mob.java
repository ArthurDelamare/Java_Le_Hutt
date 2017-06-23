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
		
		Stone stone = new Stone(PosX, PosY, image);
		Mob mob = new Mob(PosX, PosY, image);
		mob.PosX=11;
		mob.PosY = 13;
		stone.PosX =11;
		stone.PosY=13;
		if (stone.getPosX()== mob.getPosX() && stone.getPosY()== mob.getPosY()){
			System.out.println("cheval");
		}
		else{
			System.out.println("sfgd");
		}
		
		
		
	}
	
	/**
	 * <h2> A Method that defines  </h2>
	 */
	@Override
	public void kill(){
		
		Hero hero = new Hero(null);
		Mob mob = new Mob (11, 11, image);
		
		if (hero.getPosX()== mob.PosX && hero.getPosY()== mob.PosY){
			System.out.println("destroy");
		}
		else {
			System.out.println("yo");
		}
		
		
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
