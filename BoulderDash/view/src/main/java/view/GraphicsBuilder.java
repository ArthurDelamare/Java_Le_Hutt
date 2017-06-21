package view;

import java.awt.Graphics;

import model.IMap;

public class GraphicsBuilder implements IGraphicsBuilder {
	
	private IMap map;
	
	public GraphicsBuilder(IMap map){
		this.map = map;
	}
	
	@Override
	public void applyDrawTographics(Graphics g){
		System.out.println("I BELIEVE IN IT: " + this.map.getMapObjects());
		g.drawImage(this.map.getMapObjects().get(1).getImage(), 100, 0, null);
	}

	@Override
	public void setMap(IMap map) {
		this.map = map;
	}
	
	

}
