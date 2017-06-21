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
		this.setCellTable(0, 0, 0);
		this.setCellTable(1, 0, 1);
		this.setCellTable(2, 0, 2);
		
	}
	
	@Override
	public int getCellTable(int posX, int posY){
		return map[posX][posY];
	}
	
	@Override
	public void setCellTable(int typeMapeable, int posX, int posY){
		this.map[posX][posY] = typeMapeable;
	}
	
	@Override
	public ArrayList<Mapeable> getMapObjects(){
		return mapObjects;
	}
	
	public void createObject(int TypeObject, int posX, int posY){
		switch(TypeObject){
		case 0: this.mapObjects.add(new Wall(posX, posY, null));
		break;
		case 1: this.mapObjects.add(new Ground(posX, posY, null, this.map));
		break;
		case 2: this.mapObjects.add(new Stone(posX, posY, null));
		break;
		case 3: this.mapObjects.add(new Diamond(posX, posY, null));
		break;
		case 4: this.mapObjects.add(new Background(posX, posY, null));
		break;
		case 5: this.mapObjects.add(new Mob(posX, posY, null));
		break;
		}
	}
	
	public void fillMapObjects(){
		for (int i = 0; i<Map.widthTable; i++){
			for (int j = 0; j<Map.heightTable; j++){
				createObject(getCellTable(i,j),i,j);
			}
		}
		System.out.println(mapObjects);
	}
}
