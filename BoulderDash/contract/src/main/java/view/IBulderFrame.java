package view;

import java.awt.event.KeyEvent;

import controller.IMovementController;

public interface IBulderFrame {

	IBulderPanel getPanel();

	void setPanel(IBulderPanel panel);

	void keyPressed(KeyEvent e);

	void keyReleased(KeyEvent arg0);

	void keyTyped(KeyEvent arg0);

	void setMovementController(IMovementController movementController);

}