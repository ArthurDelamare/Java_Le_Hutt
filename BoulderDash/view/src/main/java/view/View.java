package view;

public class View implements IView {
	
	private BulderFrame bulderFrame;
	private BulderPanel bulderPanel;
	private GraphicsBuilder graphicsBuilder;
	
	public View(){
		
		this.graphicsBuilder = new GraphicsBuilder();
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
	
	
}
