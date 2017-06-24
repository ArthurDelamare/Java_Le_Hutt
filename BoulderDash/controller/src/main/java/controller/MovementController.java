package controller;

import java.net.URL;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

import javax.swing.*;

import javax.sound.sampled.*;

import java.io.*;

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
	
	private void explosion(int posX, int posY){
		this.hero.getMap().setCellTable(4,posX-1, posY-1);
		this.hero.getMap().setCellTable(4,posX, posY-1);
		this.hero.getMap().setCellTable(4,posX+1, posY-1);
		this.hero.getMap().setCellTable(4,posX-1, posY);
		this.hero.getMap().setCellTable(4,posX, posY);
		this.hero.getMap().setCellTable(4,posX+1, posY);
		this.hero.getMap().setCellTable(4,posX-1, posY+1);
		this.hero.getMap().setCellTable(4,posX, posY+1);
		this.hero.getMap().setCellTable(4,posX+1, posY+1);
		playSoundEffect("explosion.wav");
		System.out.println("MORT");
	}
	
	private void endOfGame(int typeOfDead){
		
		this.explosion(this.hero.getPosX() , this.hero.getPosY());
		playSoundEffect("dying.wav");
		switch (typeOfDead){
		case 1:
			JOptionPane.showMessageDialog(null, "You've been eat by a monster. Try again !", "Dead",
			JOptionPane.ERROR_MESSAGE);
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "You've been crush by a stone. Try again !", "Dead",
			JOptionPane.ERROR_MESSAGE);
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "You've been crush by a diamond. Try again !", "Dead",
			JOptionPane.ERROR_MESSAGE);
			break;
		}
		//System.exit(1);
	}
	
	private void fallObject(){
		for (int i=this.hero.getPosX()-7; i<this.hero.getPosX()+8; i++){
			for (int j=this.hero.getPosY()-7; j<this.hero.getPosY()+8; j++){
				if ((this.hero.getMap().getCellTable(i, j) == 3) && (this.hero.getMap().getCellTable(i, j+1) == 4)) {
					this.hero.getMap().setCellTable(4,i,j);
					this.hero.getMap().setCellTable(3,i,j+1);
					if (this.hero.getMap().getCellTable(i, j+2) == 6) {
						this.endOfGame(3);
					}
					if (this.hero.getMap().getCellTable(i, j+2) == 5) {
						this.explosion(i , j+2);
					}
				}
				if ((this.hero.getMap().getCellTable(i, j) == 2) && (this.hero.getMap().getCellTable(i, j+1) == 4)) {
					this.hero.getMap().setCellTable(4,i,j);
					this.hero.getMap().setCellTable(2,i,j+1);
					if (this.hero.getMap().getCellTable(i, j+2) == 6) {
						this.endOfGame(2);
					}
					if (this.hero.getMap().getCellTable(i, j+2) == 5) {
						this.explosion(i , j+2);
					}
				}
				
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
				playSoundEffect("diamond.wav");
				if (this.hero.getDiamonds()==5){
					JOptionPane.showMessageDialog(null, "Well played ! You win !", "Win", 
					JOptionPane.PLAIN_MESSAGE);
					System.exit(1);
				}
			}
			if (this.searchAroundHero(sens, 5)==true) {
				this.endOfGame(1);
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
		this.fallObject();
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
	
	private void playSoundEffect(String sourceSound){
		try {
		URL url = this.getClass().getClassLoader().getResource(sourceSound);
        AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
        // Get a sound clip resource.
        Clip clip = AudioSystem.getClip();
        // Open audio clip and load samples from the audio input stream.
        clip.open(audioIn);
        FloatControl gainControl = 
        	    (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
        gainControl.setValue(-10.0f);
        clip.start();
		}
        
        catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
         } catch (IOException e) {
            e.printStackTrace();
         } catch (LineUnavailableException e) {
            e.printStackTrace();
         }
	}
	
}
