package model;

import java.util.ArrayList;

public class Map implements IMap {
	private int map[][];
	public static int widthTable = 40;
	public static int heightTable = 38;
	private ArrayList<Mapeable> mapObjects;	private String stringBDD;	private SpriteSheet	spriteSheet;	private Hero hero;	private int distancePrinting;
	public Map(String stringBDD, SpriteSheet spriteSheet){
		this.map = new int[widthTable][heightTable];
		this.mapObjects = new ArrayList<Mapeable>();		this.stringBDD = stringBDD;		this.spriteSheet = spriteSheet;		System.out.println(stringBDD);
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
	public void setHero(IHero hero){			}
	public void CallMapTab(String content){		
		for (int y=0; y<38; y++){
			for (int x=0; x<40; x++){
				this.map[x][y]= Integer.parseInt(content.substring(y*40+x, y*40+x+1));				System.out.print(this.map[x][y]);
			}			System.out.println("");
		}
	}
	
	public void createObject(int TypeObject, int posX, int posY){
		switch(TypeObject){
		case 0: this.mapObjects.add(new Wall(posX, posY, this.spriteSheet.spriteSheet(0)));
		break;
		case 1: this.mapObjects.add(new Ground(posX, posY, this.spriteSheet.spriteSheet(1), this.map));
		break;
		case 2: this.mapObjects.add(new Stone(posX, posY, this.spriteSheet.spriteSheet(2)));
		break;
		case 3: this.mapObjects.add(new Diamond(posX, posY, this.spriteSheet.spriteSheet(3)));
		break;
		case 4: this.mapObjects.add(new Background(posX, posY, this.spriteSheet.spriteSheet(4)));
		break;
		case 5: this.mapObjects.add(new Mob(posX, posY, this.spriteSheet.spriteSheet(5)));
		break;		default: this.mapObjects.add(new Ground(posX, posY, this.spriteSheet.spriteSheet(1), this.map));
		}
	}
	
	public void fillMapObjects(){				Hero hero = new Hero(null);				int posHeroX;		int posHeroY;				this.distancePrinting = 10;				posHeroX = hero.getPosX();		posHeroY = hero.getPosY();				/*A REACTIVER QUAND ON RECUPERA DES POSITIONS CORRECTES*/				System.out.println("Position X du hero : " + posHeroX);		System.out.println("Position Y du hero : " + posHeroY);		
		for (int i = posHeroX-this.distancePrinting; i<posHeroX+this.distancePrinting; i++){
			for (int j = posHeroY- this.distancePrinting; j<posHeroY+ this.distancePrinting; j++){
				createObject(getCellTable(i,j),i,j);
			}
		}
		System.out.println(mapObjects);
	}	public String getStringBDD() {		return stringBDD;	}	public int getDistancePrinting() {		return distancePrinting;	}		
}
