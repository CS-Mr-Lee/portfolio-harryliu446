package ICS4U1;

public class Phone {

	/* Attributes */
	private String brand;
	private String colour;
	private double price;
	private double size;
	private double weight;
	private int storage;
	private int battery;
	private boolean hasFaceID;
	private boolean isLocked;
	
	/* Constructor */
	public Phone (String brand, String colour, double price, double size, double weight, int storage, int battery, boolean hasFaceID, boolean isLocked) {
		this.brand = brand;
		this.colour = colour;
		this.price = price;
		this.size = size;
		this.weight = weight;
		this.storage = storage;
		this.battery = battery;
		this.hasFaceID = hasFaceID;
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
	
	public boolean getIsLocked() {
		return isLocked;
	}
	
	public boolean getHasFaceID() {
		return hasFaceID;
	}
	
	
	/* Other methods */
	public void unlock() {
		isLocked = false;
	}
	
	public void lock() {
		isLocked = true;
	}
	
	public void charge (int time) {	//time in min
		battery = Math.min(100, battery + time*1);
	}
	
	public void call (int time) {
		if (isLocked) {
			System.out.println("Unlock phone first");
			return;
		}
		
		if (battery == 0) {
			System.out.println("Charge phone first");
			return;
		}
		
		battery = Math.max(0, battery - time*2);
	}
	
	public String hasEnoughBattery () {
		return battery >= 60 ? "Yes" : "No";
	}
	
	
	

}
