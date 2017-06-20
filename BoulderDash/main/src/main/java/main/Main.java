package main;

import java.sql.SQLException;

import controller.Controller;
import controller.ControllerFacade;
import model.IModelT;
import controller.IController;
import model.Model;
import model.dao.*;
import model.ModelFacade;
import view.IView;
import view.View;
import view.ViewFacade;

/**
 * <h1>The Class Main.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public abstract class Main {

    /**
     * The main method.
     *
     * @param args
     *            the arguments
     */
	
    public static void main(final String[] args) {
        final ControllerFacade controller = new ControllerFacade(new ViewFacade(), new ModelFacade());

        final IView view = new View();
        final IModelT model = new Model();
        final IController controllerM = new Controller(view, model);
        
        try {
            controller.start(5);
        } catch (final SQLException exception) {
            exception.printStackTrace();
        }
    }

}
