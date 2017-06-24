package view;import java.awt.Image;import java.awt.Toolkit;import java.awt.event.KeyEvent;import java.awt.event.KeyListener;import javax.swing.JFrame;import controller.IMovementController;/** * <h1> BulderFrame is the class that constructs a window and creates a function that retrieves the functions of the KeyListener.</h1> * @author Lesourd Gabriel (leader), Delamare Arthur, Morlet Antoine, Billis Enzo * @version 1.0 */ public class BulderFrame extends JFrame implements KeyListener, IBulderFrame{		private BulderPanel bulderPanel;		private IMovementController movementController;	/**	* Constructor for configuring the Frame.	* @param bulderPanel	* 	Panel to display the contents of the window	* @since 1.0	*/	public BulderFrame(BulderPanel bulderPanel){					this.bulderPanel = bulderPanel;				this.setTitle("BulderDash");		this.setResizable(false);		this.setSize(560, 583);		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		this.setLocationRelativeTo(null);		this.setContentPane(bulderPanel);				this.addKeyListener(this);				this.setVisible(true);				// Icon Frame		Image icon = Toolkit.getDefaultToolkit().getImage("iconjeu.png");		this.setIconImage(icon);	}	/**	 * <h2> A Method that returns Panel </h2>	 *@return bulderPanel	 *	returns the Panel	 */	@Override	public IBulderPanel getPanel() {		return bulderPanel;	}	/**	 * <h2> A Method that defines Panel </h2>	 */	@Override	public void setPanel(IBulderPanel panel) {		this.bulderPanel = (BulderPanel) panel;	}	/**	 * <h2> A Method that defines  </h2>	 */	@Override	public void keyPressed(KeyEvent e) {		this.movementController.askMoveHero(e.getKeyCode());	}	/**	 * <h2> A Method that defines  </h2>	 */	@Override	public void keyReleased(KeyEvent arg0) {			}	@Override	public void keyTyped(KeyEvent arg0) {			}	/**	 * <h2> A Method that defines  </h2>	 */	@Override	public void setMovementController(IMovementController movementController){				this.movementController = movementController;	}	}