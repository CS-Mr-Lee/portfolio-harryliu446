package ICS4U1;

/**
 * Name: Lucus Lu, Harry Liu
 * Date: Mar 11, 2022
 * Description: The original class for Laptop
 */

public class Laptop {

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
	
	/**
	 * The keyboard size of the device
	 */
	private int keyboardSize;

	
	/* Constructor */
	/**
	 * Name: Laptop
	 * Description: Constructor for the Laptop class
	 * @param brand - String value for the brand of the laptop
	 * @param colour - String value for the colour of the laptop
	 * @param price - double value for the price of the laptop
	 * @param size - double value for the size of the laptop
	 * @param weight - double value for the weight of the laptop
	 * @param storage - int value for the storage of the laptop
	 * @param battery - int value for the battery value of the laptop in %
	 * @param keyboardSize - int value for the keyboard size of the laptop in %
	 * @param isLocked - boolean value for whether the laptop is locked or not
	 * @param isOn - boolean value for whether the laptop is on or not
	 */
	public Laptop (String brand, String colour, double price, double size, double weight, int storage, int battery, int keyboardSize, boolean isLocked, boolean isOn) {
		this.brand = brand;
		this.colour = colour;
		this.price = price;
		this.size = size;
		this.weight = weight;
		this.storage = storage;
		this.battery = battery;
		this.keyboardSize = keyboardSize;
		this.isLocked = isLocked;
		this.isOn = isOn;
	}
	
	/* Accessors and Mutators */
	/**
	 * Name: getBrand
	 * Description: gets the brand of the laptop
	 * @return - String value for the brand of the laptop
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * Name: getColour
	 * Description: gets the color of the laptop
	 * @return - String value for the colour of the laptop
	 */
	public String getColour() {
		return colour;
	}

	/**
	 * Name: getPrice
	 * Description: gets the price of the laptop
	 * @return - double value for the price of the laptop
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * Name: getSize
	 * Description: gets the size of the laptop
	 * @return - double value for the size of the laptop
	 */
	public double getSize() {
		return size;
	}

	/**
	 * Name: getWeight
	 * Description: gets the weight of the laptop
	 * @return - double value for the weight of the laptop
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * Name: getStorage
	 * Description: gets the storage of the laptop
	 * @return - int value for the storage of the laptop
	 */
	public int getStorage() {
		return storage;
	}

	/**
	 * Name: getBattery
	 * Description: gets the battery of the laptop
	 * @return - int value for the battery of the laptop
	 */
	public int getBattery() {
		return battery;
	}

	/**
	 * Name: getisLocked
	 * Description: gets whether the laptop is locked or not
	 * @return - boolean value for whether the laptop is locked or not
	 */
	public boolean getIsLocked() {
		return isLocked;
	}

	/**
	 * Name: getIsOn
	 * Description: gets whether the laptop is on or not
	 * @return - boolean value for whether the laptop is on or not
	 */
	public boolean getIsOn() {
		return isOn;
	}
	
	/**
	 * Name: getKeyboardSize
	 * Description: gets the keyboard size of the laptop
	 * @return - int value for the keyboard size of the laptop
	 */
	public int getKeyboardSize() {
		return keyboardSize;
	}
	
	/**
	 * Name: setKeyboardSize
	 * Description: sets the keyboard size of the laptop to a new size
	 * @param newKeyboardSize - int value for the new keyboard size of the laptop
	 */
	public void setKeyboardSize(int newKeyboardSize) {
		keyboardSize = newKeyboardSize;
	}
	
	/**
	 * Name: setIsOn
	 * Description: This mutator method is used to set the device on and off
	 * @param newIsOn - boolean value that represents the new status of the device
	 */
	public void setIsOn(boolean newIsOn) {
		isOn = newIsOn;
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
	 * Name: game
	 * Description: games, uses up battery when gaming at a rate of 2% per minute
	 * @param time - an int value representing the time of the call in minutes
	 */
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
	
	/**
	 * Name: powerOn
	 * Description: turns the device on
	 */
	public void powerOn() {
		//if laptop is already on
		if (getIsOn()) {
			System.out.println("SYSTEM MESSAGE: Laptop is already on and ready to use!");
			return;
		}

		//if there is no battery, does not work
		if (getBattery() == 0) {
			System.out.println("SYSTEM MESSAGE: Charge laptop first!");
			return;
		}

		//set laptop as on
		setIsOn(true);
		System.out.println("SYSTEM MESSAGE: Laptop has been turned on");
	}

	/**
	 * Name: shutdown
	 * Description: shuts the device down
	 */
	public void shutdown() {
		//if laptop is already off
		if (!getIsOn()) {
			System.out.println("SYSTEM MESSAGE: Laptop is already off");
			return;
		}
		
		//shut the laptop down
		setIsOn(false);
		System.out.println("SYSTEM MESSAGE: Laptop has been turned off");
	}
	
	/**
	 * Name: hasEnoughBattery
	 * Description: tells the user whether the laptop has enough battery or not
	 * @return - a String value indicating whether there is enough battery or not
	 */
	public String hasEnoughBattery() {
		//if >= 75, yes; if < 75, no
		return getBattery() >= 75 ? "SYSTEM MESSAGE: There is enough battery" : "SYSTEM MESSAGE: There is not enough battery";
	}

	/**
	 * Name: toString
	 * Description: outputs the  attributes of the device and their status
	 * @return - a string value for the  attributes of the device and their status
	 */
	public String toString() {
		return "\nBrand: " + brand + "\nColour: " + colour + "\nPrice: " + price + "\nSize: " + size + "\nWeight "
				+ weight + "\nStorage: " + storage + "\nBattery: " + battery + "%\nIs Locked: "
				+ (isLocked ? "Yes" : "No") + "\nis On: " + (isOn ? "Yes" : "No") + "\nKeyboard Size: " + keyboardSize + "%";
	}

}
