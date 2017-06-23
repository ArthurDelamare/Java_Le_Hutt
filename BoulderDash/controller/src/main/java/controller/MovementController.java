package controller;

import model.IHero;

public class MovementController implements IMovementController {
	
	private IHero hero;
	
	public MovementController(IHero hero){
		this.hero = hero;
	}
	
	
	@Override
	public void askMoveHero(int keyCode){
		
		if(keyCode == 90) this.hero.setDirection(1);
		else if(keyCode == 68) this.hero.setDirection(2);
		else if(keyCode == 83) this.hero.setDirection(3);
		else if(keyCode == 81) this.hero.setDirection(4);
		
		this.hero.move();
		this.hero.getMap().getMapObjects().clear();
		this.hero.getMap().fillMapObjects();
		this.hero.updatePanel();
		
	}
}
