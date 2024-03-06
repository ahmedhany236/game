package game.engine.weapons;

public class WeaponRegistry {
	private final int code;
	private int price;
	private int damage;
	private String name;
	private int minRange;
	private int maxRange;
	public WeaponRegistry(int code, int price) {
		this.code = code;
		this.price = price;
	}
	public WeaponRegistry(int code, int price, int damage, String name){
		this.code = code;
		this.price = price;
		this.damage = damage;
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMinRange() {
		return minRange;
	}
	public void setMinRange(int minRange) {
		this.minRange = minRange;
	}
	public int getMaxRange() {
		return maxRange;
	}
	public void setMaxRange(int maxRange) {
		this.maxRange = maxRange;
	}
	public int getCode() {
		return code;
	}
	public WeaponRegistry(int code, int price, int damage, String name, int minRange, int maxRange){
		this.code = code;
		this.price = price;
		this.damage = damage;
		this.name = name;
		this.minRange = minRange;
		this.maxRange = maxRange;
	}
	
}
