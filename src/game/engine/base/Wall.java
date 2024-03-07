package game.engine.base;

public class Wall { //possible error in implements
	
	private final int baseHealth;
	private int currentHealth; //possible error
	private int ResourcesValue;
	
	
	public Wall(int baseHealth) {
		this.baseHealth = baseHealth;
		this.currentHealth = baseHealth;
		ResourcesValue = -1;
	}
	public int getCurrentHealth() {
		return currentHealth;
	}
	public void setCurrentHealth(int currentHealth) {
		this.currentHealth = currentHealth;
	}
	public int getBaseHealth() {
		return baseHealth;
	}
	public int getResourcesValue() {
		return ResourcesValue;
	}
	public void setResourcesValue(int resourcesValue) {
		ResourcesValue = resourcesValue;
	}
	
}
