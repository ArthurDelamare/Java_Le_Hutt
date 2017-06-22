package view;

import java.awt.Color;import java.awt.Graphics;

import model.IMap;

public class GraphicsBuilder implements IGraphicsBuilder {
	
	private IMap map;
	
	public GraphicsBuilder(IMap map){
		this.map = map;
	}
	
	@Override
	public void applyDrawTographics(Graphics g){		g.setColor(Color.WHITE);		g.fillRect(0, 0, 600, 600);				int tempPosX = 0;		int tempPosY = 0;		
		for(int i = 0; i<this.map.getMapObjects().size(); i++){
			g.drawImage(this.map.getMapObjects().get(i).getImage(), (this.map.getMapObjects().get(i).getPosX())*32 - this.map.getMapObjects().get(0).getPosX()*32, (this.map.getMapObjects().get(i).getPosY())*32 - this.map.getMapObjects().get(0).getPosY()*32, 32, 32, null);						if (this.map.getMapObjects().get(i).getImage() == this.map.getHero().getImage()){				tempPosX = this.map.getMapObjects().get(i).getPosX();				tempPosY = this.map.getMapObjects().get(i).getPosY();				System.out.println(tempPosX + " " + tempPosY);			}
		}		
		//g.drawImage(this.map.getHero().getImage(), (tempPosX-1)*32 - this.map.getMapObjects().get(0).getPosX()*32, (tempPosY-1)*32 - this.map.getMapObjects().get(0).getPosY()*32, 32, 32, null);
	}

	@Override
	public void setMap(IMap map) {
		this.map = map;
	}
	
	

}
