package view;

import java.awt.Color;import java.awt.Font;import java.awt.Graphics;import javax.swing.JLabel;import model.IMap;

public class GraphicsBuilder implements IGraphicsBuilder {
	
	private IMap map;
	
	public GraphicsBuilder(IMap map){
		this.map = map;
	}
	Font myFont = new Font ("Courier New", 1, 25);
	@Override
	public void applyDrawTographics(Graphics g){		//g.setColor(Color.WHITE);		//g.fillRect(0, 0, 600, 600);						
		for(int i = 0; i<this.map.getMapObjects().size(); i++){
			g.drawImage(this.map.getMapObjects().get(i).getImage(), (this.map.getMapObjects().get(i).getPosX())*32 - this.map.getMapObjects().get(0).getPosX()*32, (this.map.getMapObjects().get(i).getPosY())*32 - this.map.getMapObjects().get(0).getPosY()*32, 32, 32, null);						if (this.map.getMapObjects().get(i).getImage() == this.map.getHero().getImage()){				int tempPosX = this.map.getMapObjects().get(i).getPosX();				int tempPosY = this.map.getMapObjects().get(i).getPosY();			}
		}							g.setFont (myFont);						g.setColor(Color.BLACK);			g.fillRect(20, 10, 200, 40);						g.setColor(Color.WHITE);			g.drawString("Score : "+this.map.getHero().getDiamonds()+"/5",30,36);					
		
	}

	@Override
	public void setMap(IMap map) {
		this.map = map;
	}
	
	

}
