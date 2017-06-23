package model;

import java.util.ArrayList;

public interface IMap {

	int getCellTable(int posX, int posY);

	void setCellTable(int typeMapeable, int posX, int posY);

	ArrayList<Mapeable> getMapObjects();
	
	void fillMapObjects();
	
	void createObject(int TypeObject, int posX, int posY);
	
	void CallMapTab(String content);
	
	String getStringBDD();
	
	
	int getDistancePrinting();
	
	IHero getHero();
	
	void setHero(IHero hero);
	
	

}