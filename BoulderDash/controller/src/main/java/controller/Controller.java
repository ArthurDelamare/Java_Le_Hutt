package controller;

import model.IModel;
import view.IView;

public class Controller implements IController{
	
	private IView view;
	private IModel model;
	
	public Controller(IView view, IModel model){
		this.view = view;
		this.model = model;
		this.view.run();
	}
	
}
