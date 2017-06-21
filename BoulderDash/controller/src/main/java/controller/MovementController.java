package controller;

public class MovementController implements IMovementController {
	
	public MovementController(){
		
	}
	
	/* (non-Javadoc)
	 * @see controller.IMovementController#askMoveHero()
	 */
	@Override
	public void askMoveHero(){
		System.out.println("test");
	}
}
