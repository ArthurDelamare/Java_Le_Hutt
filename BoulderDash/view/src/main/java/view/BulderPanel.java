package view;

import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

/**
 * <h1> BulderPanel is the class which allows to display images </h1>.
 * @author Lesourd Gabriel (leader), Delamare Arthur, Morlet Antoine, Billis Enzo
 * @version 1.0
 */ 

public class BulderPanel extends JPanel implements Observer, IBulderPanel{
	
	private IGraphicsBuilder graphicsBuilder;
	/**
	 * <h2> A Method which stock the method to paint  </h2>
	 */
	public BulderPanel(IGraphicsBuilder graphicsBuilder){
		this.graphicsBuilder = graphicsBuilder;
	}
	/**
	 * <h2> A Method that refresh the Panel  </h2>
	 */
	@Override
	public void update(Observable arg0, Object arg1) {
		repaint();
		
	}

	/**
	 * <h2> A Method that paints Map  </h2>
	 */
	@Override
	public void paintComponent(Graphics graphics){
		this.graphicsBuilder.applyDrawTographics(graphics);
	}
}