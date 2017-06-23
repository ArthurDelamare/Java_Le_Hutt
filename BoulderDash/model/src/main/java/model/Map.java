package model;

import java.util.ArrayList;
/** * <h1> Map is the class which manages the painting and the decorations </h1>.</h1>. * @author Lesourd Gabriel (leader), Delamare Arthur, Morlet Antoine, Billis Enzo * @version 1.0 */ 
public class Map implements IMap {
	private int map[][];
	public static int widthTable = 40;
	public static int heightTable = 38;
	private ArrayList<Mapeable> mapObjects;	private String stringBDD;	private SpriteSheet	spriteSheet;	private Hero hero;	private int distancePrinting;	/**	 * <h2> A Constructor that defines  </h2>	 */
	public Map(String stringBDD, SpriteSheet spriteSheet){
		this.map = new int[widthTable][heightTable];
		this.mapObjects = new ArrayList<Mapeable>();		this.stringBDD = stringBDD;		this.spriteSheet = spriteSheet;
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
	public void CallMapTab(String content){		
		for (int y=0; y<38; y++){
			for (int x=0; x<40; x++){
				this.map[x][y]= Integer.parseInt(content.substring(y*40+x, y*40+x+1));
			}			
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
		case 5: this.mapObjects.add(new Mob(posX, posY, this.spriteSheet.spriteSheet(5)));				break;				case 6: this.mapObjects.add((Hero)this.getHero());
		break;		default: this.mapObjects.add(new Mob(posX, posY, this.spriteSheet.spriteSheet(5)));
		}
	}
	
	public void fillMapObjects(){				Hero hero = new Hero(null);				int posHeroX;		int posHeroY;				this.distancePrinting = 8;				posHeroX = this.hero.getPosX();		posHeroY = this.hero.getPosY();		
		for (int i = posHeroX-this.distancePrinting-1; i<posHeroX+this.distancePrinting; i++){
			for (int j = posHeroY- this.distancePrinting; j<posHeroY+ this.distancePrinting+1; j++){
				createObject(getCellTable(i,j),i,j);
			}
		}
	}	public String getStringBDD() {		return stringBDD;	}	public int getDistancePrinting() {		return distancePrinting;	}	public IHero getHero() {		return hero;	}	public void setHero(IHero hero) {		this.hero = (Hero)hero;	}		
}
