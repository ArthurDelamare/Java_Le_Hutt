package model;

import java.awt.Image;
/**  * <h1> Background is the class which puts the background image</h1>. * @author Lesourd Gabriel (leader), Delamare Arthur, Morlet Antoine, Billis Enzo * @version 1.0 */ 
public class Background extends AbstractDecor{
	/*	 * <h2> This Method fixes the position and the state blocker and breakable </h2>	 */
	public Background(int posX, int posY, Image image){
		
		this.setPosX(posX);
		this.setPosY(posY);
		this.setImage(image);
		this.blocker = false;
		this.breakable = false;
		
	}

}
