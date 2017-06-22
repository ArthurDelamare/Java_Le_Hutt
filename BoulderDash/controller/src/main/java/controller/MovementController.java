package controller;

import model.IHero;

public class MovementController implements IMovementController {
	
	private IHero hero;
	
	public MovementController(IHero hero){
		this.hero = hero;
	}
	
	
	@Override
	public void askMoveHero(){
		System.out.println("Mouvement détecté.");
		this.hero.move();
		
	}
}
