package view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import controller.MovementController;


public class BulderFrame extends JFrame implements KeyListener{
	
	private BulderPanel bulderPanel;
	private MovementController movementController;
	
	public BulderFrame(){
			
		this.bulderPanel = new BulderPanel();
		
		this.setTitle("BulderDash");
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
		this.setContentPane(bulderPanel);
		
		this.addKeyListener(this);
		
		this.setVisible(true);
		
	}

	public BulderPanel getPanel() {
		return bulderPanel;
	}

	public void setPanel(BulderPanel panel) {
		this.bulderPanel = panel;
	}

	// Gestionnaire des touches
		
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

	@Override
	public void keyTyped(KeyEvent e) {
		
	}
	
	public void setMovementController(MovementController movementController){
		this.movementController = movementController;
	}
	
}