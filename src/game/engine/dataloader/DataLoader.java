package game.engine.dataloader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import game.engine.titans.TitanRegistry;
import game.engine.weapons.WeaponRegistry;


public class DataLoader {
	private static final String TITANS_FILE_NAME = "titans.csv";
	private static final String WEAPONS_FILE_NAME = "weapons.csv"; 
	
	public static HashMap<Integer, TitanRegistry> readTitanRegistry() throws IOException{
		FileReader fr = new FileReader(TITANS_FILE_NAME);
		BufferedReader br = new BufferedReader(fr);	
		String line = "" ;
		
		HashMap<Integer, TitanRegistry> h = new HashMap<Integer , TitanRegistry >();
			while ((line = br.readLine()) != null) {
				String[] a = line.split(",");
				int code = Integer.parseInt(a[0]);
				int baseDamage = Integer.parseInt(a[2]);
				int baseHealth = Integer.parseInt(a[1]);
				int heightInMeters = Integer.parseInt(a[3]);
				int speed = Integer.parseInt(a[4]);
				int resourcesValue = Integer.parseInt(a[5]);
				int dangerLevel = Integer.parseInt(a[6]);
				TitanRegistry t = new TitanRegistry(code,baseHealth,baseDamage,heightInMeters
						,speed,resourcesValue,dangerLevel);
				h.put(code, t);
			}
			br.close();
			return h;
	}
	public static HashMap<Integer, WeaponRegistry> readWeaponRegistry() throws IOException{
		FileReader fr = new FileReader(WEAPONS_FILE_NAME);
		BufferedReader br = new BufferedReader(fr);	
		String line ;
		HashMap<Integer, WeaponRegistry> h = new HashMap<Integer , WeaponRegistry >();
		while ((line = br.readLine()) != null) {
			String[] a = line.split(",");
			int code = Integer.parseInt(a[0]);
			int price = Integer.parseInt(a[1]);
			int damage = Integer.parseInt(a[2]);
			String name = a[3];
			
			if (a.length == 4) {
				WeaponRegistry w = new WeaponRegistry(code,price,damage,name);
				h.put(code,w);
			}
			if(a.length == 6) {
				int minRange = Integer.parseInt(a[4]);
				int maxRange = Integer.parseInt(a[5]);
				
				WeaponRegistry w = new WeaponRegistry(code,price,damage,name,minRange,maxRange);
				h.put(code,w);
			}
		}
		br.close();
		return h;
	}
}
