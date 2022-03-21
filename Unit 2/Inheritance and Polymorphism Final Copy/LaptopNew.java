package ICS4U1;

/**
 * Name: Lucus Lu, Harry Liu
 * Date: Mar 11, 2022
 * Description: The new class for Laptop, subclass of Electronics
 */

public class LaptopNew extends Electronics {

	/* Attributes */
	/**
	 * The keyboard size of the laptop
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
	public LaptopNew(String brand, String colour, double price, double size, double weight, int storage, int battery, int keyboardSize, boolean isLocked, boolean isOn) {
		super(brand, colour, price, size, weight, storage, battery, isLocked, isOn);	//uses the constructor from the superclass
		this.keyboardSize = keyboardSize;		//set the unique attribute of laptop
	}

	/* Accessors and Mutators */
	/**
	 * Name: getKeyboardSize
	 * Description: gets the keyboard size of the laptop
	 * @return keyboardSize - an int value representing the size of the keyboard in %
	 */
	public int getKeyboardSize() {
		return keyboardSize;
	}

	/**
	 * Name: setKeyboardSize
	 * Description: sets the keyboard size to a new assigned value
	 * @param newKeyboardSize - an int value representing the new keyboard size in % the user want to change into
	 */
	public void setKeyboardSize(int newKeyboardSize) {
		keyboardSize = newKeyboardSize;
	}

	/* Other methods */
	/**
	 * Name: game
	 * Description: games, uses up battery when gaming at a rate of 2% per minute
	 * @param time - an int value representing the time of the call in minutes
	 */
	public void game(int time) {
		//if laptop is locked, does not work
		if (getIsLocked()) {
			System.out.println("SYSTEM MESSAGE: Unlock laptop first");
			return;
		}

		//if laptop is off, does not work
		if (getIsOn()) {
			System.out.println("SYSTEM MESSAGE: Turn the laptop on first");
			return;
		}

		//if the keyboard size smaller than 50%, does not work
		if (keyboardSize <= 50) {
			System.out.println("SYSTEM MESSAGE: Get a larger keyboard first");
			return;
		}

		//set new battery value after playing, lose 2% per minute
		setBattery(getBattery() - time * 2);	//laptop will shutdown if battery goes to 0 (in setBattery() method)
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
	 * Description: outputs the attributes of the laptop and their status
	 * @return - a string value for the common attributes of the device and their status from the superclass and Laptop's unique attribute at the end
	 */
	public String toString() {
		return super.toString() + "\nKeyboard Size: " + keyboardSize + "%";
	}

}
