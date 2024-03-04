package game.engine.lanes;
import game.engine.base.*;
import game.engine.weapons.*;
import game.engine.titans.*;


import java.util.*;
public class Lane implements Comparable<Lane>{
	private final Wall laneWall;
	private int dangerLevel;
	private final PriorityQueue<Titan> titans;
	private final ArrayList<Weapon> weapons;
	public Lane(Wall laneWall) {
		this.laneWall = laneWall;
		this.dangerLevel = 0;
		this.titans = null;
		this.weapons = null;
	}
	
	public int getDangerLevel() {
		return dangerLevel;
	}

	public void setDangerLevel(int dangerLevel) {
		this.dangerLevel = dangerLevel;
	}

	public Wall getLaneWall() {
		return laneWall;
	}

	public PriorityQueue<Titan> getTitans() {
		return titans;
	}

	public ArrayList<Weapon> getWeapons() {
		return weapons;
	}

	public int compareTo(Lane o) {
		return this.dangerLevel - ((Lane)o).dangerLevel;
	}
}

