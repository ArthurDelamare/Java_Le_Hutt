package main;

import java.sql.SQLException;

import controller.Controller;
import controller.ControllerFacade;
import controller.IController;
import model.IModel;
import model.Model;
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
        final IModel model = new Model();
        final IController controllerM = new Controller(view, model);
        
        try {
            controller.start();
        } catch (final SQLException exception) {
            exception.printStackTrace();
        }
    }

}
