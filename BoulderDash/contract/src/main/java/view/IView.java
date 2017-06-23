package view;

import model.IMap;

public interface IView {

	void run();
	void close();
	public IBulderFrame getBulderFrame();
	void setBulderFrame(IBulderFrame bulderFrame);
	void setMap(IMap map);
	IGraphicsBuilder getGraphicsBuilder();
	IBulderPanel getBulderPanel();
	
}