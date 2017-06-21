package model;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageLoader {
	
	public BufferedImage imageLoader(String path) {
	BufferedImage img = null;
	
	try {
		img = ImageIO.read(new File(path));
		/*"C:/Users/enzo7/Desktop/Sprite/res/textures"*/
	}
	catch (IOException e){
		e.printStackTrace();
	}
	return img;
	}
}
