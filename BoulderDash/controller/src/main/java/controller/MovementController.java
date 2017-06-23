package controller;

import model.IHero;

public class MovementController implements IMovementController {
	
	private IHero hero;
	
	public MovementController(IHero hero){
		this.hero = hero;
	}
	
	private void callMovement(int sens){
			if (this.hero.getMap().getCellTable((this.hero.getPosX()-1), (this.hero.getPosY())) == 3 && sens == 4){
			
			this.hero.setDiamonds(this.hero.getDiamonds()+1);
			System.out.println("nombre de diamands : " + this.hero.getDiamonds());
		}
			if (this.hero.getMap().getCellTable((this.hero.getPosX()), (this.hero.getPosY()+1)) == 3 && sens == 3){
				
				this.hero.setDiamonds(this.hero.getDiamonds()+1);
				System.out.println("nombre de diamands : " + this.hero.getDiamonds());
			}
			if (this.hero.getMap().getCellTable((this.hero.getPosX()+1), (this.hero.getPosY())) == 3 && sens == 2){
				
				this.hero.setDiamonds(this.hero.getDiamonds()+1);
				System.out.println("nombre de diamands : " + this.hero.getDiamonds());
			}
			if (this.hero.getMap().getCellTable((this.hero.getPosX()), (this.hero.getPosY()-1)) == 3 && sens == 1){
				
				this.hero.setDiamonds(this.hero.getDiamonds()+1);
				System.out.println("nombre de diamands : " + this.hero.getDiamonds());
			}
			
		this.hero.setDirection(sens);
		this.hero.move();
		this.hero.getMap().getMapObjects().clear();
		this.hero.getMap().fillMapObjects();
		this.hero.updatePanel();
		
	}
	
	
	@Override
	public void askMoveHero(int keyCode){
		
		
		
		if(keyCode == 90 && (this.hero.getMap().getCellTable(this.hero.getPosX(), (this.hero.getPosY())-1) != 0) && (this.hero.getMap().getCellTable(this.hero.getPosX(), (this.hero.getPosY())-1) != 5)) {
			this.callMovement(1);
		}
		else if(keyCode == 68 && (this.hero.getMap().getCellTable((this.hero.getPosX())+1, (this.hero.getPosY())) != 0) && (this.hero.getMap().getCellTable((this.hero.getPosX())+1, (this.hero.getPosY())) != 5) ) {
			this.callMovement(2);
		}
		else if(keyCode == 83 && (this.hero.getMap().getCellTable(this.hero.getPosX(), (this.hero.getPosY())+1) != 0) && (this.hero.getMap().getCellTable(this.hero.getPosX(), (this.hero.getPosY())+1) != 5)) {
			this.callMovement(3);
		}
		else if(keyCode == 81 && (this.hero.getMap().getCellTable((this.hero.getPosX())-1, (this.hero.getPosY())) != 0) && (this.hero.getMap().getCellTable((this.hero.getPosX())-1, (this.hero.getPosY())) != 5)) {
			this.callMovement(4);
		}
		
		
	}
}
