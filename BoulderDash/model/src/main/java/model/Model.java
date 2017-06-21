package model;

public class Model implements IModelT {
	
	private IHero hero;
	private IMap map;
	
	public Model(){
		
		this.hero = new Hero((Map)map);
		this.map = new Map();
		this.map.fillMapObjects();
		
	}

	/* (non-Javadoc)
	 * @see model.IModel#getHero()
	 */
	
	public IHero getHero() {
		return hero;
	}

	/* (non-Javadoc)
	 * @see model.IModel#getMap()
	 */
	
	public IMap getMap() {
		return map;
	}
	
	
	
}
