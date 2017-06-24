package controller;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.Observer;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import model.IModelT;
import view.IView;

public class Controller implements IController{
	
	private IView view;
	private IModelT model;
	private IMovementController movementController;
	
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
        gainControl.setValue(-20.0f);
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
	
	public Controller(IView view, IModelT model) throws SQLException{
		this.playSoundEffect("soundtrack.wav");
		this.view = view;
		this.model = model;
		this.model.getHero().addObserver((Observer)this.view.getBulderPanel());
		this.movementController = new MovementController(this.model.getHero());
		this.view.getGraphicsBuilder().setMap(this.model.getMap());
		this.view.run();
		this.view.getBulderFrame().setMovementController(movementController);
	}
	
}
