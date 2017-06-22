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
		for(int i = 0; i<this.map.getMapObjects().size(); i++){
			g.drawImage(this.map.getMapObjects().get(i).getImage(), (this.map.getMapObjects().get(i).getPosX())*16, (this.map.getMapObjects().get(i).getPosY())*16, null);
		}
		//g.drawImage(this.map.getMapObjects().get(0).getImage(), this.map.getMapObjects().get(0).getPosX(), this.map.getMapObjects().get(0).getPosY(), null);
	}

	@Override
	public void setMap(IMap map) {
		this.map = map;
	}
	
	

}
