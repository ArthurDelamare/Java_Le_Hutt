package view;

import model.IMap;

/**
 * <h1> View is the class  </h1>.
 * @author Lesourd Gabriel (leader), Delamare Arthur, Morlet Antoine, Billis Enzo
 * @version 1.0
 */

public class View implements IView {
	
	private BulderFrame bulderFrame;
	private BulderPanel bulderPanel;
	private IMap map;
	private IGraphicsBuilder graphicsBuilder;
	
	public View(){
		
		this.graphicsBuilder = new GraphicsBuilder(map);
		this.bulderPanel = new BulderPanel(this.graphicsBuilder);
	}

	/* (non-Javadoc)
	 * @see view.IView#getBulderFrame()
	 */

	public IBulderFrame getBulderFrame() {
		return bulderFrame;
	}

	/* (non-Javadoc)
	 * @see view.IView#setBulderFrame(view.BulderFrame)
	 */
	
	public void setBulderFrame(IBulderFrame bulderFrame) {
		this.bulderFrame = (BulderFrame) bulderFrame;
	}
	
	/* (non-Javadoc)
	 * @see view.IView#run()
	 */
	@Override
	public void run(){
		this.bulderFrame = new BulderFrame(bulderPanel);
	}

	@Override
	public void close() {
		this.bulderFrame.dispose();
		
	}

	public void setMap(IMap map) {
		this.map = map;
	}

	public IGraphicsBuilder getGraphicsBuilder() {
		return graphicsBuilder;
	}
	
	public IBulderPanel getBulderPanel(){
		return this.bulderPanel;
	}
	
}
