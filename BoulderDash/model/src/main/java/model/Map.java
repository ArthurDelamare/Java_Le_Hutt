package model;

import java.util.ArrayList;

public class Map implements IMap {

	private int map[][];
	public static int widthTable = 24;
	public static int heightTable = 24;
	private ArrayList<Mapeable> mapObjects;
	
	public Map(){
		
		this.map = new int[widthTable][heightTable];
		this.mapObjects = new ArrayList<Mapeable>();
		
	}
	
	/* (non-Javadoc)
	 * @see model.IMap#getCellTable(int, int)
	 */
	@Override
	public int getCellTable(int posX, int posY){
		return map[posX][posY];
	}
	
	/* (non-Javadoc)
	 * @see model.IMap#setCellTable(int, int, int)
	 */
	@Override
	public void setCellTable(int typeMapeable, int posX, int posY){
		this.map[posX][posY] = typeMapeable;
	}
	
	/* (non-Javadoc)
	 * @see model.IMap#getMapObjects()
	 */
	@Override
	public ArrayList<Mapeable> getMapObjects(){
		return mapObjects;
	}
}
