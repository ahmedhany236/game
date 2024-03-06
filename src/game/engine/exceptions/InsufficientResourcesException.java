package game.engine.exceptions;

public class InsufficientResourcesException extends GameActionException{
	private static final String MSG = "Not enough resources, resources provided = ";
	private int resourcesProvided ; //r,w
	public InsufficientResourcesException(int resourcesProvided) {
		super(MSG);
		this.resourcesProvided = resourcesProvided;
	}
	public InsufficientResourcesException(String message, int resourcesProvided) {
		super();
		System.out.println(message);
		this.resourcesProvided = resourcesProvided;
	}
	public int getResourcesProvided() {
		return resourcesProvided;
	}
	public void setResourcesProvided(int resourcesProvided) {
		this.resourcesProvided = resourcesProvided;
	}
	
}
