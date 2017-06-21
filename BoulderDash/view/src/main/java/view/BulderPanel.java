package view;

import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

public class BulderPanel extends JPanel implements Observer, IBulderPanel{
	
	private IGraphicsBuilder graphicsBuilder;
	
	public BulderPanel(IGraphicsBuilder graphicsBuilder){
		this.graphicsBuilder = graphicsBuilder;
		System.out.println("Panel created.");
	}
	
	/* (non-Javadoc)
	 * @see view.IBulderPanel#update(java.util.Observable, java.lang.Object)
	 */
	@Override
	public void update(Observable arg0, Object arg1) {
		System.out.println("Update done.");
		repaint();
		
	}

	/* (non-Javadoc)
	 * @see view.IBulderPanel#paintComponent(java.awt.Graphics)
	 */
	@Override
	public void paintComponent(Graphics graphics){
		this.graphicsBuilder.applyDrawTographics(graphics);
	}
}