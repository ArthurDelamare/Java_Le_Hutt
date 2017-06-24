package model;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.imageio.ImageIO;

/**
 * <h1> SpriteSheet is the class </h1>.
 * @author Lesourd Gabriel (leader), Delamare Arthur, Morlet Antoine, Billis Enzo
 * @version 1.0
 */ 

public class SpriteSheet implements ISpriteSheet {
	
	private BufferedImage wall, ground, stone, diamond, background, mob, hero;
	
	/**
	 * <h2> A Method that defines  </h2>
	 */
	public SpriteSheet(){
		
		BufferedImage imageDecors = null;
		BufferedImage imageHero = null;
		int theme = 5;
	
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
		switch (theme){
		case 1 :
			this.wall = imageDecors.getSubimage(0,0,16,16);
			this.ground = imageDecors.getSubimage(16,0,16,16);
			this.stone = imageDecors.getSubimage(48,0,16,16);
			this.diamond = imageDecors.getSubimage(64,0,16,16);
			this.background = imageDecors.getSubimage(32,0,16,16);
			this.mob = imageDecors.getSubimage(144,0,16,16);
			break;
		case 2 :
			this.wall = imageDecors.getSubimage(0,64,16,16);
			this.ground = imageDecors.getSubimage(16,64,16,16);
			this.stone = imageDecors.getSubimage(48,64,16,16);
			this.diamond = imageDecors.getSubimage(64,64,16,16);
			this.background = imageDecors.getSubimage(32,64,16,16);
			this.mob = imageDecors.getSubimage(144,64,16,16);
			break;
		case 3 :
			this.wall = imageDecors.getSubimage(0,128,16,16);
			this.ground = imageDecors.getSubimage(16,128,16,16);
			this.stone = imageDecors.getSubimage(48,128,16,16);
			this.diamond = imageDecors.getSubimage(64,128,16,16);
			this.background = imageDecors.getSubimage(32,128,16,16);
			this.mob = imageDecors.getSubimage(144,128,16,16);
			break;
		case 4 :
			this.wall = imageDecors.getSubimage(0,192,16,16);
			this.ground = imageDecors.getSubimage(16,192,16,16);
			this.stone = imageDecors.getSubimage(48,192,16,16);
			this.diamond = imageDecors.getSubimage(64,192,16,16);
			this.background = imageDecors.getSubimage(32,192,16,16);
			this.mob = imageDecors.getSubimage(144,192,16,16);
			break;
		case 5 :
			this.wall = imageDecors.getSubimage(0,256,16,16);
			this.ground = imageDecors.getSubimage(16,256,16,16);
			this.stone = imageDecors.getSubimage(48,256,16,16);
			this.diamond = imageDecors.getSubimage(64,256,16,16);
			this.background = imageDecors.getSubimage(32,256,16,16);
			this.mob = imageDecors.getSubimage(144,256,16,16);
			break;
		
		case 6 :
			this.wall = imageDecors.getSubimage(0,320,16,16);
			this.ground = imageDecors.getSubimage(16,320,16,16);
			this.stone = imageDecors.getSubimage(48,320,16,16);
			this.diamond = imageDecors.getSubimage(64,320,16,16);
			this.background = imageDecors.getSubimage(32,320,16,16);
			this.mob = imageDecors.getSubimage(144,320,16,16);
			break;
		}
		
		try {
			try {
				imageHero = ImageIO.read(new File(getClass().getResource("/textures/player.png").toURI()));
			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		this.hero = imageHero.getSubimage(0,0,16,16);
		
	}
	
	/**
	 * <h2> A Method that defines  </h2>
	 */
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