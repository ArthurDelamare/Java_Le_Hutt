package view;

import java.awt.Color;import java.awt.Graphics;

import model.IMap;
/** * <h1> GraphicsBuilder is the class who paint  </h1>. * @author Lesourd Gabriel (leader), Delamare Arthur, Morlet Antoine, Billis Enzo * @version 1.0 */
public class GraphicsBuilder implements IGraphicsBuilder {
	
	private IMap map;
	/**	 * <h2> A Method that defines  </h2>	 */
	public GraphicsBuilder(IMap map){
		this.map = map;
	}
	/**	 * <h2> A Method that defines what we paint like the map and the hero </h2>	 */
	@Override	
	public void applyDrawTographics(Graphics g){		g.setColor(Color.WHITE);		g.fillRect(0, 0, 600, 600);				int tempPosX = 0;		int tempPosY = 0;		
		for(int i = 0; i<this.map.getMapObjects().size(); i++){
			g.drawImage(this.map.getMapObjects().get(i).getImage(), (this.map.getMapObjects().get(i).getPosX())*32 - this.map.getMapObjects().get(0).getPosX()*32, (this.map.getMapObjects().get(i).getPosY())*32 - this.map.getMapObjects().get(0).getPosY()*32, 32, 32, null);						if (this.map.getMapObjects().get(i).getImage() == this.map.getHero().getImage()){				tempPosX = this.map.getMapObjects().get(i).getPosX();				tempPosY = this.map.getMapObjects().get(i).getPosY();			}
		}		
		
	}
	/**	 * <h2> A Method that defines  </h2>	 */
	@Override
	public void setMap(IMap map) {
		this.map = map;
	}
	
	

}
