package game.engine.weapons.factory;
import java.io.IOException;
import java.util.*;
import game.engine.dataloader.*;
import game.engine.weapons.*;
public class WeaponFactory {
	private HashMap<Integer, WeaponRegistry> weaponShop;
	public WeaponFactory() throws IOException{
		weaponShop=DataLoader.readWeaponRegistry();
	}
	public HashMap<Integer, WeaponRegistry> getWeaponShop() {
		return weaponShop;
	}
	
}
