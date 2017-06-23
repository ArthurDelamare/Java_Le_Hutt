package model;

import java.sql.SQLException;

import model.dao.ExampleDAO;

/**
 * <h1> Model is the class which manages the different classes of the Model as Map or Heros.</h1>.
 * @author Lesourd Gabriel (leader), Delamare Arthur, Morlet Antoine, Billis Enzo
 * @version 1.0
 */ 

public class Model implements IModelT {
	
	private IHero hero;
	private IMap map;
	private SpriteSheet spriteSheet;
	
	public Model(){
		
		this.spriteSheet = new SpriteSheet();
		
		try {
			this.map = new Map(callMapContent(5), spriteSheet);
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

	/**
	 * <h2> A Method that defines  </h2>
	 */
	public IHero getHero() {
		return hero;
	}
	

	/**
	 * <h2> A Method that defines  </h2>
	 */
	public IMap getMap() {
		return map;
	}
	
	/**
	 * <h2> A Method that defines  </h2>
	 */
	public String callMapContent(final int id) throws SQLException {
        return ExampleDAO.callMapContent(id);
    }
	
}
