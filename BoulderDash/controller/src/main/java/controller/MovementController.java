package controller;

import model.IHero;

public class MovementController implements IMovementController {
	
	private IHero hero;
	
	public MovementController(IHero hero){
		this.hero = hero;
	}
	
	
	@Override
	public void askMoveHero(int keyCode){
		System.out.println("Mouvement détecté.");
		
		if(keyCode == 90) this.hero.setDirection(1);
		else if(keyCode == 68) this.hero.setDirection(2);
		else if(keyCode == 83) this.hero.setDirection(3);
		else if(keyCode == 81) this.hero.setDirection(4);
		
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
