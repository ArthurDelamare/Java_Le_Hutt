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

	private BulderFrame keyManager;
	private boolean[] keys;
	public boolean up, down, left, right;
	
	keys = new boolean[256];
	
	public void tick(){
		up = keys[KeyEvent.VK_UP];
		down = keys[KeyEvent.VK_DOWN];
		left = keys[KeyEvent.VK_LEFT];
		right = keys[KeyEvent.VK_RIGHT];
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		keys[e.getKeyCode()] = true;
		System.out.println(e.getKeyCode());
	}

	@Override
	public void keyReleased(KeyEvent e) {
		keys[e.getKeyCode()] = false;
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}
	
	public void setMovementController(MovementController movementController){
		this.movementController = movementController;
	}
	
}