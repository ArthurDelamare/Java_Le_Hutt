package controller;

import javax.swing.JOptionPane;

import model.IHero;

public class MovementController implements IMovementController {
	
	private IHero hero;
	
	public MovementController(IHero hero){
		this.hero = hero;
	}
	
	private Boolean pushStone(int sens){
		Boolean exceptionRefresh = false;
		switch (sens){
		case 1 :
				exceptionRefresh = true;
			break;
		case 2 :
			if (this.hero.getMap().getCellTable((this.hero.getPosX()+1), (this.hero.getPosY()+1)) == 4) {
				this.fallObject(sens);
			}	
			if (this.hero.getMap().getCellTable((this.hero.getPosX()+2), (this.hero.getPosY())) == 4) {
				this.hero.getMap().setCellTable(2,(this.hero.getPosX()+2), (this.hero.getPosY()));
				this.hero.getMap().setCellTable(4,(this.hero.getPosX()+1), (this.hero.getPosY()));
			}
			if (this.hero.getMap().getCellTable((this.hero.getPosX()+2), (this.hero.getPosY())) != 4) {
				exceptionRefresh = true;
			}	
			
			break;
		case 3 :
				exceptionRefresh = true;	
			break;
		case 4 :
			if (this.hero.getMap().getCellTable((this.hero.getPosX()-1), (this.hero.getPosY()+1)) == 4) {
				this.fallObject(sens);
			}
			if (this.hero.getMap().getCellTable((this.hero.getPosX()-2), (this.hero.getPosY())) == 4) {
				this.hero.getMap().setCellTable(2,(this.hero.getPosX()-2), (this.hero.getPosY()));
				this.hero.getMap().setCellTable(4,(this.hero.getPosX()-1), (this.hero.getPosY()));
				}
			if (this.hero.getMap().getCellTable((this.hero.getPosX()-2), (this.hero.getPosY())) != 4) {
				exceptionRefresh = true;
			}	
				
			break;
		}
		return exceptionRefresh;
	}
	
	private void endOfGame(){
		JOptionPane.showMessageDialog(null, "You died...", "Error",
        JOptionPane.ERROR_MESSAGE);
		System.exit(1);
	}
	
	private void fallObject(int sens){
		Boolean voidUnder = true;
		int i = 0;
		while (voidUnder = true ){
			i++;
			switch (sens){
			case 2 :
					this.hero.getMap().setCellTable(2,(this.hero.getPosX()+1), (this.hero.getPosY()+i));
					this.hero.getMap().setCellTable(4,(this.hero.getPosX()+1), (this.hero.getPosY()+i-1));
					if (this.hero.getMap().getCellTable((this.hero.getPosX()+1), (this.hero.getPosY()+i+1)) == 4){
						voidUnder = false;
					}
				break;
			case 4 :
				
					this.hero.getMap().setCellTable(2,(this.hero.getPosX()-1), (this.hero.getPosY()+i));
					this.hero.getMap().setCellTable(4,(this.hero.getPosX()-1), (this.hero.getPosY()+i-1));
					if (this.hero.getMap().getCellTable((this.hero.getPosX()-1), (this.hero.getPosY()+i+2)) == 4){
						voidUnder = true;
					}
				break;
			}
			
		}
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
		default :
		}
		
		
		return exist;
	}
	
	private void callMovement(int sens){
		Boolean ExceptionRefresh = false;
			if (this.searchAroundHero(sens, 3)==true) {
				this.hero.setDiamonds(this.hero.getDiamonds()+1);
				if (this.hero.getDiamonds()==5){
					JOptionPane.showMessageDialog(null, "Well played ! You win !", "Win",
					JOptionPane.PLAIN_MESSAGE);
					System.exit(1);
				}
			}
			if (this.searchAroundHero(sens, 5)==true) {
				this.endOfGame();
			}
			if (this.searchAroundHero(sens, 2)==true) {
				ExceptionRefresh = this.pushStone(sens);				
			}
		
		if (ExceptionRefresh == true) {}
		else {
			this.hero.setDirection(sens);
			this.hero.move();
			this.hero.getMap().getMapObjects().clear();
			
			
		}
		this.hero.getMap().fillMapObjects();
		this.hero.updatePanel();
		
		
	}
	
	
	@Override
	public void askMoveHero(int keyCode){
		
		
		
		if(keyCode == 90 && (this.hero.getMap().getCellTable(this.hero.getPosX(), (this.hero.getPosY())-1) != 0)) {
			this.callMovement(1);
		}
		else if(keyCode == 68 && (this.hero.getMap().getCellTable((this.hero.getPosX())+1, (this.hero.getPosY())) != 0)) {
			this.callMovement(2);
		}
		else if(keyCode == 83 && (this.hero.getMap().getCellTable(this.hero.getPosX(), (this.hero.getPosY())+1) != 0)) {
			this.callMovement(3);
		}
		else if(keyCode == 81 && (this.hero.getMap().getCellTable((this.hero.getPosX())-1, (this.hero.getPosY())) != 0)) {
			this.callMovement(4);
		}
		
		
	}
}
