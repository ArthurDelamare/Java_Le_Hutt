package model;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.imageio.ImageIO;

public class SpriteSheet implements ISpriteSheet {
	
	@Override
	public BufferedImage spriteSheet(int typeOfDecors){
		
		BufferedImage imageDecors = null;
		BufferedImage imageHero = null;
		BufferedImage finalImage = null;
	
		try {
			try {
				imageDecors = ImageIO.read(new File(getClass().getResource("/textures/decors.png").toURI()));
			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		try {
			try {
				imageHero = ImageIO.read(new File(getClass().getResource("/textures/personnage.png").toURI()));
			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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