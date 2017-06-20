package view;

import java.awt.Graphics;
import java.util.Observable;

public interface IBulderPanel {

	void update(Observable arg0, Object arg1);

	void paintComponent(Graphics graphics);

}