package model;

import java.awt.Image;
import java.util.Observable;

public class Hero extends Observable implements IHero {
	
	private Map map;
	private int direction;
	private int posX;
	private int posY;
	private int diamonds;
	private boolean aLive;
	private Image image;
	
	public Hero(Map map){
		this.posX = 25;
		this.posY = 25;
		this.direction = 3;
		this.aLive = true;
		this.diamonds = 0;
		this.map = map;
	}
	/* (non-Javadoc)
	 * @see model.IHero#walkOn()
	 */
	@Override
	public void walkOn(){
		
	}
	
	/* (non-Javadoc)
	 * @see model.IHero#move()
	 */
	@Override
	public void move(){
		
		
		
		switch(direction){
		
		case 1: this.direction = 4;
		this.map.setCellTable(6, posX-1, posY);
		this.map.setCellTable(0, posX, posY);
		this.setPosX(posX-1);
		break;
		
		case 2: this.direction = 2;
		this.map.setCellTable(6, posX + 1, posY);
		this.map.setCellTable(0, posX, posY);
		this.setPosX(posX + 1);
		break;
		
		case 3: this.direction = 1;
		this.map.setCellTable(6, posX, posY - 1);
		this.map.setCellTable(0, posX, posY);
		this.setPosY(posY - 1);
		break;
		
		case 4: this.direction = 3;
		this.map.setCellTable(6, posX, posY + 1);
		this.map.setCellTable(0, posX, posY);
		this.setPosY(posY + 1);
		break;
		
		}
		
	}
	
	/* (non-Javadoc)
	 * @see model.IHero#pushStone()
	 */
	@Override
	public void pushStone(){
		
		
	}

	/* (non-Javadoc)
	 * @see model.IHero#getDirection()
	 */
	@Override
	public int getDirection() {
		return direction;
	}

	/* (non-Javadoc)
	 * @see model.IHero#setDirection(int)
	 */
	@Override
	public void setDirection(int direction) {
		this.direction = direction;
	}

	/* (non-Javadoc)
	 * @see model.IHero#getPosX()
	 */
	@Override
	public int getPosX() {
		return posX;
	}

	/* (non-Javadoc)
	 * @see model.IHero#setPosX(int)
	 */
	@Override
	public void setPosX(int posX) {
		this.posX = posX;
	}

	/* (non-Javadoc)
	 * @see model.IHero#getPosY()
	 */
	@Override
	public int getPosY() {
		return posY;
	}

	/* (non-Javadoc)
	 * @see model.IHero#setPosY(int)
	 */
	@Override
	public void setPosY(int posY) {
		this.posY = posY;
	}

	/* (non-Javadoc)
	 * @see model.IHero#getDiamonds()
	 */
	@Override
	public int getDiamonds() {
		return diamonds;
	}

	/* (non-Javadoc)
	 * @see model.IHero#setDiamonds(int)
	 */
	@Override
	public void setDiamonds(int diamonds) {
		this.diamonds = diamonds;
	}

	/* (non-Javadoc)
	 * @see model.IHero#isaLive()
	 */
	@Override
	public boolean isaLive() {
		return aLive;
	}

	/* (non-Javadoc)
	 * @see model.IHero#setaLive(boolean)
	 */
	@Override
	public void setaLive(boolean aLive) {
		this.aLive = aLive;
	}

	/* (non-Javadoc)
	 * @see model.IHero#getImage()
	 */
	@Override
	public Image getImage() {
		return image;
	}

	/* (non-Javadoc)
	 * @see model.IHero#setImage(java.awt.Image)
	 */
	@Override
	public void setImage(Image image) {
		this.image = image;
	}
	

}
