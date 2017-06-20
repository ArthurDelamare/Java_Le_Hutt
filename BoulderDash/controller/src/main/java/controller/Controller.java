package controller;

import model.IModelT;
import view.IView;

public class Controller implements IController{
	
	private IView view;
	private IModelT model;
	
	public Controller(IView view, IModelT model){
		this.view = view;
		this.model = model;
		this.view.run();
	}
	
}
