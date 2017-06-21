package view;

import java.awt.Graphics;

import model.IMap;

public interface IGraphicsBuilder {

	void applyDrawTographics(Graphics g);

	void setMap(IMap map);

}