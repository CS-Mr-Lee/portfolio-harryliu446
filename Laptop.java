package ICS4U1;

public class Laptop {

	/* Attributes */
	private String brand;
	private String colour;
	private double price;
	private double size;
	private double weight;
	private int storage;
	private int battery;
	private int keyboardSize;
	private boolean isLocked;
	
	/* Constructor */
	public Laptop (String brand, String colour, double price, double size, double weight, int storage, int battery, int keyboardSize, boolean isLocked) {
		this.brand = brand;
		this.colour = colour;
		this.price = price;
		this.size = size;
		this.weight = weight;
		this.storage = storage;
		this.battery = battery;
		this.keyboardSize = keyboardSize;
		this.isLocked = isLocked;
	}
	
	/* Accessors and Mutators */
	public String getBrand() {
		return brand;
	}
	
	public String getColour() {
		return colour;
	}
	
	public double getPrice() {
		return price;
	}
	
	public double getSize() {
		return size;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public int getStorage() {
		return storage;
	}
	
	public int getBattery() {
		return battery;
	}
	
	public int getKeyboardSize() {
		return keyboardSize;
	}
	
	public boolean getIsLocked() {
		return isLocked;
	}
	
	public void setKeyboardSize(int newKeyboardSize) {
		keyboardSize = newKeyboardSize;
	}
	
	/* Other methods */
	public void unlock() {
		isLocked = false;
	}
	
	public void lock() {
		isLocked = true;
	}
	
	public void charge(int time) {	//time in min
		battery = Math.min(100, battery + time*1);
	}
	
	public void game(int time) {
		if (isLocked) {
			System.out.println("Unlock laptop first");
			return;
		}
		
		if (battery == 0) {
			System.out.println("Charge laptop first");
			return;
		}
		
		if (keyboardSize <= 50) {
			System.out.println("Get a larger keyboard first");
			return;
		}
		
		battery = Math.max(0, battery - time*2);
	}
	
	public String hasEnoughBattery() {
		return battery >= 75 ? "Yes" : "No";
	}
	

}
