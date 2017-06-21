package model;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class SpriteSheet {
	
	public BufferedImage spriteSheet(int typeOfDecors){
		
		BufferedImage imageDecors = null;
		BufferedImage imageHero = null;
		BufferedImage finalImage = null;
	
		try {
			imageDecors = ImageIO.read(new File("../textures/decors.png"));
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		try {
			imageHero = ImageIO.read(new File("../textures/personnage.png"));
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		
		switch(typeOfDecors){
		case 0:
			finalImage = imageDecors.getSubimage(0,0,16,16);
		case 1:
			finalImage = imageDecors.getSubimage(16,0,16,16);
		case 2:
			finalImage = imageDecors.getSubimage(48,0,16,16);
		case 3:
			finalImage = imageDecors.getSubimage(64,0,16,16);
		case 4:
			finalImage = imageDecors.getSubimage(32,0,16,16);
		case 5:
			finalImage = imageDecors.getSubimage(176,0,16,16);
		case 6:
			finalImage = imageHero.getSubimage(0,0,16,16);
		}
		return finalImage;
		
	}
	
}