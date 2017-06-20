package view;

public class View implements IView {
	
	private BulderFrame bulderFrame;
	
	public View(){
		
		
		
	}

	/* (non-Javadoc)
	 * @see view.IView#getBulderFrame()
	 */

	public BulderFrame getBulderFrame() {
		return bulderFrame;
	}

	/* (non-Javadoc)
	 * @see view.IView#setBulderFrame(view.BulderFrame)
	 */
	
	public void setBulderFrame(BulderFrame bulderFrame) {
		this.bulderFrame = bulderFrame;
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
