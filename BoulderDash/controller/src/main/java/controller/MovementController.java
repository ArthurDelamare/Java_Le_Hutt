package controller;

import model.IHero;

public class MovementController implements IMovementController {
	
	private IHero hero;
	
	public MovementController(IHero hero){
		this.hero = hero;
	}
	
	private void callMovement(){
		this.hero.move();
		this.hero.getMap().getMapObjects().clear();
		this.hero.getMap().fillMapObjects();
		this.hero.updatePanel();
	}
	
	
	@Override
	public void askMoveHero(int keyCode){
		
		
		
		if(keyCode == 90 && (this.hero.getMap().getCellTable(this.hero.getPosX(), (this.hero.getPosY())-1) != 0) && (this.hero.getMap().getCellTable(this.hero.getPosX(), (this.hero.getPosY())-1) != 5)) {
			this.hero.setDirection(1);
			this.callMovement();
		}
		else if(keyCode == 68 && (this.hero.getMap().getCellTable((this.hero.getPosX())+1, (this.hero.getPosY())) != 0) && (this.hero.getMap().getCellTable((this.hero.getPosX())+1, (this.hero.getPosY())) != 5) ) {
			this.hero.setDirection(2);
			this.callMovement();
		}
		else if(keyCode == 83 && (this.hero.getMap().getCellTable(this.hero.getPosX(), (this.hero.getPosY())+1) != 0) && (this.hero.getMap().getCellTable(this.hero.getPosX(), (this.hero.getPosY())+1) != 5)) {
			this.hero.setDirection(3);
			this.callMovement();
		}
		else if(keyCode == 81 && (this.hero.getMap().getCellTable((this.hero.getPosX())-1, (this.hero.getPosY())) != 0) && (this.hero.getMap().getCellTable((this.hero.getPosX())-1, (this.hero.getPosY())) != 5)) {
			this.hero.setDirection(4);
			this.callMovement();
		}
		
		
	}
}
