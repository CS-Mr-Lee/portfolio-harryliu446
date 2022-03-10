package ICS4U1;

public class Electronics {

	/* Attributes */
	private String brand;
	private String colour;
	private double price;
	private double size;
	private double weight;
	private int storage;
	private int battery;
	private boolean isLocked;
	private boolean isOn;

	/* Constructor */
	public Electronics(String brand, String colour, double price, double size, double weight, int storage, int battery, boolean isLocked, boolean isOn) {
		this.brand = brand;
		this.colour = colour;
		this.price = price;
		this.size = size;
		this.weight = weight;
		this.storage = storage;
		this.battery = battery;
		this.isLocked = isLocked;
		this.isOn = isOn;
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

	public boolean getIsOn() {
		return isOn;
	}

	public void setIslocked(boolean status) {
		if (status) {
			isLocked = true;
		} else {
			isLocked = false;
		}
	}

	public void setBattery(int newBattery) {
		battery = Math.max(0, newBattery);
	}

	public void setIsOn(boolean newIsOn) {
		isOn = newIsOn;
	}

	/* Other methods */
	public void unlock() {
		setIslocked(false);
	}

	public void lock() {
		setIslocked(true);
	}

	public void charge(int time) { // time in min
		battery = Math.min(100, battery + time * 1);
	}

	public String toString() {
		return "Brand: " + brand + "\nColour: " + colour + "\nPrice: " + price + "\nSize: " + size + "\nWeight "
				+ weight + "\nStorage: " + storage + "\nBattery: " + battery + "\nIs Locked: "
				+ (isLocked ? "Yes" : "No") + "\nis On: " + (isOn ? "Yes" : "No");
	}

}
