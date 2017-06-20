package model;

import java.awt.image.BufferedImage;

public class SpriteSheet {
public BufferedImage sheet;
	
	public SpriteSheet(BufferedImage sheet){
		this.sheet = sheet;
	}
	
	public BufferedImage crop(int x, int y, int width, int height){
		return sheet.getSubimage(x, y, width, height);
	}
	
private static final int width = 16, height = 16;
	
	public static BufferedImage testimage, player, terrevide, terrepleine, rocher, mur, diamant, mob;
	
	public static void init(){
		//testimage = AbstractDecor.loadImage("/textures/74336.png");
		//g.setColor(Color.red);
		//g.fillRect(O, O, 10, 10);
		SpriteSheet sheet = new SpriteSheet(AbstractDecor.loadImage("/textures/74336.png"));
		SpriteSheet sheet2 = new SpriteSheet(AbstractDecor.loadImage("/textures/74359.png"));
		
		player = sheet.crop(0, 0, width, height);
		terrevide = sheet2.crop(32, 0, width, height);
		terrepleine = sheet2.crop(16, 0, width, height);
		rocher = sheet2.crop(48, 0, width, height);
		mur = sheet2.crop(0, 0, width, height);
		diamant = sheet2.crop(64, 0, width, height);
		mob = sheet2.crop(144, 0, width, height);
}
}