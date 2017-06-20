package controller;

import java.sql.SQLException;
import java.util.List;

import model.Example;
import model.IModelProvisoire;
import view.IViewProvisoire;

/**
 * <h1>The Class ControllerFacade provides a facade of the Controller component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class ControllerFacade implements IController {

    /** The view. */
    private final IViewProvisoire  view;

    /** The model. */
    private final IModelProvisoire model;

    /**
     * Instantiates a new controller facade.
     *
     * @param view
     *            the view
     * @param model
     *            the model
     */
    public ControllerFacade(final IViewProvisoire view, final IModelProvisoire model) {
        super();
        this.view = view;
        this.model = model;
    }

    /**
     * Start.
     *
     * @throws SQLException
     *             the SQL exception
     */
    public void start(final int id_map) throws SQLException {
        this.getView().displayMessage(this.getModel().callMapContent(id_map).toString());

        final List<Example> examples = this.getModel().getAllExamples();
        final StringBuilder message = new StringBuilder();
        // a.append(" bar);
        for (final Example example : examples) {
            message.append(example);
            message.append('\n');
        }
        this.getView().displayMessage(message.toString());
    }

    /**
     * Gets the view.
     *
     * @return the view
     */
    public IViewProvisoire getView() {
        return this.view;
    }

    /**
     * Gets the model.
     *
     * @return the model
     */
    public IModelProvisoire getModel() {
        return this.model;
    }
}
