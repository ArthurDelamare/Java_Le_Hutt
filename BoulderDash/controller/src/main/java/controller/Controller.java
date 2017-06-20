package controller;

import view.IView;

public class Controller implements IController{
	
	private IView view;
	
	public Controller(IView view){
		this.view = view;
		this.view.run();
	}
	
}
