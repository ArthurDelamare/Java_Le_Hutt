package view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import controller.IMovementController;


public class BulderFrame extends JFrame implements KeyListener, IBulderFrame{
	
	private BulderPanel bulderPanel;
	private IMovementController movementController;
	
	public BulderFrame(BulderPanel bulderPanel){
			
		this.bulderPanel = bulderPanel;
		
		this.setTitle("BulderDash");
		this.setSize(700, 700);
		this.setLocationRelativeTo(null);
		this.setContentPane(bulderPanel);
		
		this.addKeyListener(this);
		
		this.setVisible(true);
		
	}

	/* (non-Javadoc)
	 * @see view.IBulderFrame#getPanel()
	 */
	@Override
	public IBulderPanel getPanel() {
		return bulderPanel;
	}

	/* (non-Javadoc)
	 * @see view.IBulderFrame#setPanel(view.BulderPanel)
	 */
	@Override
	public void setPanel(IBulderPanel panel) {
		this.bulderPanel = (BulderPanel) panel;
	}

	/* (non-Javadoc)
	 * @see view.IBulderFrame#keyPressed(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println(e.getKeyCode());
	}

	/* (non-Javadoc)
	 * @see view.IBulderFrame#keyReleased(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see view.IBulderFrame#keyTyped(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	/* (non-Javadoc)
	 * @see view.IBulderFrame#setMovementController(controller.MovementController)
	 */
	@Override
	public void setMovementController(IMovementController movementController){
		this.movementController = movementController;
	}
	
}

