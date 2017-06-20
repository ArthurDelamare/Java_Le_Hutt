package model;

public class Model {
	
	private Hero hero;
	private Map map;
	
	public Model(){
		
		this.hero = new Hero();
		this.map = new Map();
		
	}

	public Hero getHero() {
		return hero;
	}

	public Map getMap() {
		return map;
	}
	
	
	
}
