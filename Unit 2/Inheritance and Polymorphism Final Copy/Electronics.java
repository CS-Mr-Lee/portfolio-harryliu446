package ICS4U1;

/**
 * Name: Lucus Lu, Harry Liu
 * Date: Mar 11, 2022
 * Description: The super class for PhoneNew and LaptopNew
 */

public class Electronics {

	/* Attributes */
	/**
	 * The brand of the device
	 */
	private String brand;
	
	/**
	 * The colour of the device
	 */
	private String colour;
	
	/**
	 * The price of the device
	 */
	private double price;
	
	/**
	 * The size of the device
	 */
	private double size;
	
	/**
	 * The weight of the device
	 */
	private double weight;
	
	/**
	 * The storage of the device
	 */
	private int storage;
	
	/**
	 * The battery of the device
	 */
	private int battery;
	
	/**
	 * Whether the device is locked or not
	 */
	private boolean isLocked;
	
	/**
	 * Whether the device is on or not
	 */
	private boolean isOn;

	
	/* Constructor */
	/**
	 * Name: Electronics
	 * Description: Constructor for the Electronics class
	 * @param brand - String value for the brand of the electronic
	 * @param colour - String value for the colour of the electronic
	 * @param price - double value for the price of the electronic
	 * @param size - double value for the size of the electronic
	 * @param weight - double value for the weight of the electronic
	 * @param storage - int value for the storage of the electronic
	 * @param battery - int value for the battery value of the electronic in %
	 * @param isLocked - boolean value for whether the electronic is locked or not
	 * @param isOn - boolean value for whether the electronic is on or not
	 */
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
	/**
	 * Name: getBrand
	 * Description: gets the brand of the electronic
	 * @return - String value for the brand of the electronic
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * Name: getColour
	 * Description: gets the color of the electronic
	 * @return - String value for the colour of the electronic
	 */
	public String getColour() {
		return colour;
	}

	/**
	 * Name: getPrice
	 * Description: gets the price of the electronic
	 * @return - double value for the price of the electronic
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * Name: getSize
	 * Description: gets the size of the electronic
	 * @return - double value for the size of the electronic
	 */
	public double getSize() {
		return size;
	}

	/**
	 * Name: getWeight
	 * Description: gets the weight of the electronic
	 * @return - double value for the weight of the electronic
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * Name: getStorage
	 * Description: gets the storage of the electronic
	 * @return - int value for the storage of the electronic
	 */
	public int getStorage() {
		return storage;
	}

	/**
	 * Name: getBattery
	 * Description: gets the battery of the electronic
	 * @return - int value for the battery of the electronic
	 */
	public int getBattery() {
		return battery;
	}

	/**
	 * Name: getisLocked
	 * Description: gets whether the electronic is locked or not
	 * @return - boolean value for whether the electronic is locked or not
	 */
	public boolean getIsLocked() {
		return isLocked;
	}

	/**
	 * Name: getIsOn
	 * Description: gets whether the electronic is on or not
	 * @return - boolean value for whether the electronic is on or not
	 */
	public boolean getIsOn() {
		return isOn;
	}

    
	/**
	 * Name: setBattery
	 * Description: This mutator method is used to change the battery value while keeping the value between 0-100
	 * @param newBattery - an int value for the new battery value after using or charging
	 */
	public void setBattery(int newBattery) {
		battery = Math.max(0, Math.min(100, newBattery));	//keep the battery value within the range 0-100
		if (battery == 0) {
			setIsOn(false);		//turn device off if battery is at 0%
		}
	}
    
	/**
	 * Name: setIsOn
	 * Description: This mutator method is used to set the device on and off
	 * @param newIsOn - boolean value that represents the new status of the device
	 */
	public void setIsOn(boolean newIsOn) {
		isOn = newIsOn;
	}

	/* Other methods */
	/**
	 * Name: unlock
	 * Description: unlocks the device
	 */
	public void unlock() {
		isLocked = false;
	}

	/**
	 * Name: lock
	 * Description: locks the device
	 */
	public void lock() {
		isLocked = true;
	}

	/**
	 * Name: charge
	 * Description: charges the device at a rate of 1% per minute
	 * @param time - int value that represents the time the device gets charged in minutes
	 */
	public void charge(int time) { // time in min
		battery = Math.min(100, battery + time * 1);
	}

	/**
	 * Name: toString
	 * Description: outputs the common attributes of the device and their status
	 * @return - a string value for the common attributes of the device and their status
	 */
	public String toString() {
		return "\nBrand: " + brand + "\nColour: " + colour + "\nPrice: " + price + "\nSize: " + size + "\nWeight "
				+ weight + "\nStorage: " + storage + "\nBattery: " + battery + "%\nIs Locked: "
				+ (isLocked ? "Yes" : "No") + "\nis On: " + (isOn ? "Yes" : "No");
	}

}
