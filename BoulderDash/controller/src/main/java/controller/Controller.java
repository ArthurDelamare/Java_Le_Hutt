package controller;

import java.sql.SQLException;

import model.IModelT;
import view.IView;

public class Controller implements IController{
	
	private IView view;
	private IModelT model;
	private IMovementController movementController;
	
	public Controller(IView view, IModelT model) throws SQLException{
		this.view = view;
		this.model = model;
		this.movementController = new MovementController(this.model.getHero());
		this.view.getGraphicsBuilder().setMap(this.model.getMap());
		this.view.run();
		this.view.getBulderFrame().setMovementController(movementController);
	}
	
}
