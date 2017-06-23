package model;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.imageio.ImageIO;

public class SpriteSheet implements ISpriteSheet {
	
	private BufferedImage wall, ground, stone, diamond, background, mob, hero;
	
	public SpriteSheet(){
		
		BufferedImage imageDecors = null;
		BufferedImage imageHero = null;
	
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
		
		this.wall = imageDecors.getSubimage(0,0,16,16);
		this.ground = imageDecors.getSubimage(16,0,16,16);
		this.stone = imageDecors.getSubimage(48,0,16,16);
		this.diamond = imageDecors.getSubimage(64,0,16,16);
		this.background = imageDecors.getSubimage(32,0,16,16);
		this.mob = imageDecors.getSubimage(144,0,16,16);
		
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
		
		this.hero = imageHero.getSubimage(0,0,16,16);
		
	}
	
	
	@Override
	public BufferedImage spriteSheet(int typeOfDecors){
		
		BufferedImage finalImage = null;
		
		switch(typeOfDecors){
		case 0:
			finalImage = this.wall;
			break;
		case 1:
			finalImage = this.ground;
			break;
		case 2:
			finalImage =  this.stone;
			break;
		case 3:
			finalImage = this.diamond;
			break;
		case 4:
			finalImage =  this.background;
			break;
		case 5:
			finalImage =  this.mob;
			break;
		case 6:
			finalImage = this.hero;
			break;
		}
		
		return finalImage;
		
	}
	
}