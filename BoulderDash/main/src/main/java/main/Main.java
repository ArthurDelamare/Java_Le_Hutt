package main;

import java.io.IOException;import java.net.URL;import java.sql.SQLException;import javax.sound.sampled.AudioInputStream;import javax.sound.sampled.AudioSystem;import javax.sound.sampled.Clip;import javax.sound.sampled.LineUnavailableException;import javax.sound.sampled.UnsupportedAudioFileException;import controller.Controller;
import controller.ControllerFacade;
import model.IModelT;
import controller.IController;
import model.Model;
import model.dao.*;
import model.ModelFacade;
import view.IView;
import view.View;
import view.ViewFacade;

/** * <h1> Description class : </h1>. * @author Lesourd Gabriel (leader), Delamare Arthur, Morlet Antoine, Billis Enzo * @version 1.0 */
public abstract class Main {

    /**
     * The main method.
     *
     * @param args
     *            the arguments
     */
    public static void main(final String[] args) {    	    	    	final IModelT model = new Model();
        final IView view = new View();
        try {        				final IController controller = new Controller(view, model);		} catch (SQLException e) {			// TODO Auto-generated catch block			e.printStackTrace();		}
    }
}
