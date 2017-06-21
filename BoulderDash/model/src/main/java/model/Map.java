package model;

import java.util.ArrayList;

public class Map {

	private int map[][];
	public static int widthTable = 24;
	public static int heightTable = 24;
	private ArrayList<Mapeable> mapObjects;
	
	public Map(){
		
		this.map = new int[widthTable][heightTable];
		this.mapObjects = new ArrayList<Mapeable>();
		
	}
	
	public int getCellTable(int posX, int posY){
		return map[posX][posY];
	}
	
	public void setCellTable(int typeMapeable, int posX, int posY){
		this.map[posX][posY] = typeMapeable;
	}
	
	public ArrayList<Mapeable> getMapObjects(){
		return mapObjects;
	}
	
	public void CallMapTab(String content){
		content.split("(?!^)");
		for (int y=0; y<38; y++){
			for (int x=0; x<40; x++){
				map[x][y]= Integer.parseInt(content.substring(x-1, x));
			}
		}
	}
}
