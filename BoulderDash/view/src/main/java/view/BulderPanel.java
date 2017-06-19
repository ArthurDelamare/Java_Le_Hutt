package view;

import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

public class BulderPanel extends JPanel implements Observer{
	
	private int x = 0;
	
	public BulderPanel(){
		System.out.println("Panel created.");
	}
	
	@Override
	public void update(Observable arg0, Object arg1) {
		System.out.println("Update done.");
		repaint();
		
	}

	public void paintComponent(Graphics graphics){
		
		graphics.drawRect(x, 10, 10, 10);
		x = x+10;
		
	}
}