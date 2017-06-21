package view;

import java.awt.Graphics;

import model.IMap;

public class GraphicsBuilder {
	
	private IMap map;
	
	public void applyDrawTographics(Graphics g){
		g.fillRect(50, 50, 100, 100);
	}

}
