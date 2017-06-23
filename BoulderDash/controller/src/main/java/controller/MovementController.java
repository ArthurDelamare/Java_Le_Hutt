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
	
	private void endOfGame(){
		
		playSoundEffect("dying.wav");
		
		JOptionPane.showMessageDialog(null, "You died...", "Dead",
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
				playSoundEffect("diamond.wav");
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
		int randomDig = ThreadLocalRandom.current().nextInt(1,4);
		String randomDigString = String.valueOf(randomDig);
		String digSound = "dig".concat(randomDigString);
		String digSound2 = digSound.concat(".wav");
		
	
		
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
