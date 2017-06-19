package model;

import java.awt.Image;

public abstract class AbstractDecor {
	
	protected int PosX;
	protected int PosY;
	protected Image image;
	protected boolean breakable;
	protected boolean blocker;
	
	public int getPosX() {
		return PosX;
	}
	public void setPosX(int posX) {
		PosX = posX;
	}
	
	public int getPosY() {
		return PosY;
	}
	public void setPosY(int posY) {
		PosY = posY;
	}
	
	public Image getImage() {
		return image;
	}
	public void setImage(Image image) {
		this.image = image;
	}
	
	public boolean isBreakable() {
		return breakable;
	}
	
	public boolean isBlocker() {
		return blocker;
	}
	
}
