package model;

import java.awt.Image;
import java.util.Observable;

public class Hero extends Observable {
	
	private int direction;
	private int posX;
	private int posY;
	private int diamonds;
	private boolean aLive;
	private Image image;
	
	public Hero(){
		this.posX=1;
		this.posY= 1 ;
		this.direction=3;
		this.aLive= true;
		this.diamonds= 0;
	}
	public void walkOn(){
		
	}
	
	public void move(){
		
	}
	
	public void pushStone(){
		
	}

	public int getDirection() {
		return direction;
	}

	public void setDirection(int direction) {
		this.direction = direction;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getDiamonds() {
		return diamonds;
	}

	public void setDiamonds(int diamonds) {
		this.diamonds = diamonds;
	}

	public boolean isaLive() {
		return aLive;
	}

	public void setaLive(boolean aLive) {
		this.aLive = aLive;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}
	
	

}
