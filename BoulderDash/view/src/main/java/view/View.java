package view;

public class View implements IView {
	
	private BulderFrame bulderFrame;
	private GraphicsBuilder graphicsBuilder;
	
	public View(){
		
		this.graphicsBuilder = new GraphicsBuilder();
		
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
		this.bulderFrame = new BulderFrame();
	}

	@Override
	public void close() {
		this.bulderFrame.dispose();
		
	}
	
	
}
