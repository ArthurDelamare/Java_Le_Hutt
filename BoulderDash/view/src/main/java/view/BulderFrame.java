package view;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import controller.IMovementController;


public class BulderFrame extends JFrame implements KeyListener, IBulderFrame{
	
	private BulderPanel bulderPanel;
	private IMovementController movementController;
	
	public BulderFrame(){
			
		this.bulderPanel = new BulderPanel();
		
		this.setTitle("BulderDash");
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
		this.setContentPane(bulderPanel);
		
		this.addKeyListener(this);
		this.setVisible(true);
		Image icon = Toolkit.getDefaultToolkit().getImage("iconjeu.png");
	    this.setIconImage(icon);
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

	// Gestionnaire des touches
		
	/* (non-Javadoc)
	 * @see view.IBulderFrame#keyPressed(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode())
		{
			case KeyEvent.VK_UP :
				heros.movement_up();
			break;
			case KeyEvent.VK_DOWN:
				heros.movement_down();
			break;
			case KeyEvent.VK_RIGHT:
				heros.movement_right();
			break;
			case KeyEvent.VK_LEFT:
				heros.movement_left();
			break;
		}
	}

	/* (non-Javadoc)
	 * @see view.IBulderFrame#keyReleased(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyReleased(KeyEvent e) {
		switch(e.getKeyCode())
        {
            case    KeyEvent.VK_RIGHT:
            case    KeyEvent.VK_LEFT:
            case    KeyEvent.VK_UP:
            case    KeyEvent.VK_DOWN:
                heros.stop_movement();
            break;
        }
	}

	/* (non-Javadoc)
	 * @see view.IBulderFrame#keyTyped(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyTyped(KeyEvent e) {
		
	}
	
	/* (non-Javadoc)
	 * @see view.IBulderFrame#setMovementController(controller.MovementController)
	 */
	@Override
	public void setMovementController(IMovementController movementController){
		this.movementController = movementController;
	}
	
}