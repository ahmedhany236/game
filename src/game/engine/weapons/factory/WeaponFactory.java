package game.engine.weapons.factory;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import game.engine.dataloader.*;
import game.engine.weapons.*;

public class WeaponFactory {
	private final HashMap<Integer, WeaponRegistry> weaponShop;
	
	public WeaponFactory() throws IOException{ //possible error in constructor
		this.weaponShop=DataLoader.readWeaponRegistry();
	}
	public HashMap<Integer, WeaponRegistry> getWeaponShop() {
		return weaponShop;
	}
	private HashMap<Integer, WeaponRegistry> readWeaponDataFromCSV (String filename) throws IOException{
		HashMap<Integer, WeaponRegistry> weaponData = new HashMap<>();
		FileReader fr = new FileReader(filename);
		try (BufferedReader br = new BufferedReader (fr)){
			String line;
			String[] a = line.split(",");
			int code = Integer.parseInt(a[0]);
			int price = Integer.parseInt(a[1]);
			String name = a[1];
			int baseDamage = Integer.parseInt(a[2]);
			weaponData.put(code,new WeaponRegistry(name , baseDamage));
			}
		
		return weaponData;
	}
}

