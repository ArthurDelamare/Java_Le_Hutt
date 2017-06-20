package model;

import java.util.ArrayList;

public interface IMap {

	int getCellTable(int posX, int posY);

	void setCellTable(int typeMapeable, int posX, int posY);

	ArrayList<Mapeable> getMapObjects();

}