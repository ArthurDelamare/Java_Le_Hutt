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

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println(e.getKeyCode());
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public void setMovementController(MovementController movementController){
		this.movementController = movementController;
	}
	
}

