package model;

public class Model implements IModelT {
	
	private IHero hero;
	private Map map;
	
	public Model(){
		
		this.hero = new Hero();
		this.map = new Map();
		
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
	
	public Map getMap() {
		return map;
	}
	
	
	
}
