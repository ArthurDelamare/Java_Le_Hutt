package view;

public class View {
	
	private BulderFrame bulderFrame;
	
	public View(){
		
		
		
	}

	public BulderFrame getBulderFrame() {
		return bulderFrame;
	}

	public void setBulderFrame(BulderFrame bulderFrame) {
		this.bulderFrame = bulderFrame;
	}
	
	public void run(){
		this.bulderFrame = new BulderFrame();
	}
	
	
}
