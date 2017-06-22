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
		this.hero.getMap().getMapObjects().clear();
		this.hero.getMap().fillMapObjects();
		System.out.println(this.hero.getMap().getMapObjects());
		this.hero.updatePanel();
		
		for(int y = 0; y<38; y++){
			for(int x = 0; x<40; x++){
				System.out.print(this.hero.getMap().getCellTable(x, y));
			}
			System.out.println("");
		}
	}
}
