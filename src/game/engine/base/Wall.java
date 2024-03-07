package game.engine.base;

import game.engine.interfaces.Attackee;

public class Wall implements Attackee{ 
	
	private final int baseHealth;
	private int currentHealth; 
	private int ResourcesValue;
	
	
	public Wall(int baseHealth) {
		this.baseHealth = baseHealth;
		this.currentHealth = baseHealth;
		this.ResourcesValue = -1;
		
	}
	public int getCurrentHealth() {
		return currentHealth;
	}
	public void setCurrentHealth(int currentHealth) {
		if (currentHealth <0) {
			this.currentHealth = 0 ;
		}
		else {
			this.currentHealth = currentHealth;
		}
	}
	public int getBaseHealth() {
		return baseHealth;
	}
	public int getResourcesValue() {
		return ResourcesValue;
	}
	
	
}
