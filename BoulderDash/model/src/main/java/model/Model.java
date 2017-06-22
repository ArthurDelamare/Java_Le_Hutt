package model;

import java.sql.SQLException;

import model.dao.ExampleDAO;

public class Model implements IModelT {
	
	private IHero hero;
	private IMap map;
	private SpriteSheet spriteSheet;
	
	public Model(){
		
		this.spriteSheet = new SpriteSheet();
		
		try {
			this.map = new Map(callMapContent(1), spriteSheet);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		this.hero = new Hero((Map)map);
		this.hero.setImage(this.spriteSheet.spriteSheet(6));
		this.map.setHero(hero);
		this.map.getHero().setImage(this.spriteSheet.spriteSheet(6));
		this.map.CallMapTab(this.map.getStringBDD());
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
	
	public String callMapContent(final int id) throws SQLException {
        return ExampleDAO.callMapContent(id);
    }
	
}
