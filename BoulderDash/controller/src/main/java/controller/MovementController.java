package controller;

import javax.swing.JOptionPane;

import model.IHero;

public class MovementController implements IMovementController {
	
	private IHero hero;
	
	public MovementController(IHero hero){
		this.hero = hero;
	}
	
	private void endOfGame(){
		JOptionPane.showMessageDialog(null, "You met a monster, you died...", "Error",
        JOptionPane.ERROR_MESSAGE);
		System.exit(1);
	}
	
	private Boolean searchAroundHero(int sens, int typeObject){
		Boolean exist = false;
		switch (sens){
		case 1 :
			if (this.hero.getMap().getCellTable((this.hero.getPosX()), (this.hero.getPosY()-1)) == typeObject) exist=true;
			break;
		case 2 :
			if (this.hero.getMap().getCellTable((this.hero.getPosX()+1), (this.hero.getPosY())) == typeObject) exist=true;
			break;
		case 3 :
			if (this.hero.getMap().getCellTable((this.hero.getPosX()), (this.hero.getPosY()+1)) == typeObject) exist=true;
			break;
		case 4 :
			if (this.hero.getMap().getCellTable((this.hero.getPosX()-1), (this.hero.getPosY())) == typeObject) exist=true;
			break;
		}
		
		
		return exist;
	}
	
	private void callMovement(int sens){
			if (this.searchAroundHero(sens, 3)==true) {
				this.hero.setDiamonds(this.hero.getDiamonds()+1);
				System.out.println("Dimands : "+ this.hero.getDiamonds());
			}
			if (this.searchAroundHero(sens, 5)==true) {
				this.endOfGame();
			}
			
		this.hero.setDirection(sens);
		this.hero.move();
		this.hero.getMap().getMapObjects().clear();
		this.hero.getMap().fillMapObjects();
		this.hero.updatePanel();
		
	}
	
	
	@Override
	public void askMoveHero(int keyCode){
		
		
		
		if(keyCode == 90 && (this.hero.getMap().getCellTable(this.hero.getPosX(), (this.hero.getPosY())-1) != 0)/* && (this.hero.getMap().getCellTable(this.hero.getPosX(), (this.hero.getPosY())-1) != 5)*/) {
			this.callMovement(1);
		}
		else if(keyCode == 68 && (this.hero.getMap().getCellTable((this.hero.getPosX())+1, (this.hero.getPosY())) != 0) /*&& (this.hero.getMap().getCellTable((this.hero.getPosX())+1, (this.hero.getPosY())) != 5)*/) {
			this.callMovement(2);
		}
		else if(keyCode == 83 && (this.hero.getMap().getCellTable(this.hero.getPosX(), (this.hero.getPosY())+1) != 0) /*&& (this.hero.getMap().getCellTable(this.hero.getPosX(), (this.hero.getPosY())+1) != 5)*/) {
			this.callMovement(3);
		}
		else if(keyCode == 81 && (this.hero.getMap().getCellTable((this.hero.getPosX())-1, (this.hero.getPosY())) != 0) /*&& (this.hero.getMap().getCellTable((this.hero.getPosX())-1, (this.hero.getPosY())) != 5)*/) {
			this.callMovement(4);
		}
		
		
	}
}
