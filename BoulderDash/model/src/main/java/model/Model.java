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
		
		this.map.CallMapTab(this.map.getStringBDD());
		this.map.fillMapObjects();
		
		
		this.hero = new Hero((Map)map);
		
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
