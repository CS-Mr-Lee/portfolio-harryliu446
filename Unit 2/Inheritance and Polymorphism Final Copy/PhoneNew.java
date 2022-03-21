package ICS4U1;

/**
 * Name: Lucus Lu, Harry Liu
 * Date: Mar 11, 2022
 * Description: The new class for Phone, subclass of Electronics
 */

public class PhoneNew extends Electronics {

	/* Attributes */
	/**
	 * Whether the phone has face ID or not
	 */
	private boolean hasFaceID;

	
	/* Constructor */
	/**
	 * Name: Phone
	 * Description: Constructor for the Phone class
	 * @param brand - String value for the brand of the phone
	 * @param colour - String value for the colour of the phone
	 * @param price - double value for the price of the phone
	 * @param size - double value for the size of the phone
	 * @param weight - double value for the weight of the phone
	 * @param storage - int value for the storage of the phone
	 * @param battery - int value for the battery value of the phone in %
	 * @param hasFaceID - boolean value for whether the phone has face ID or not
	 * @param isLocked - boolean value for whether the phone is locked or not
	 * @param isOn - boolean value for whether the phone is on or not
	 */
	public PhoneNew(String brand, String colour, double price, double size, double weight, int storage, int battery, boolean hasFaceID, boolean isLocked, boolean isOn) {
		super(brand, colour, price, size, weight, storage, battery, isLocked, isOn);	//uses the constructor from the superclass
		this.hasFaceID = hasFaceID;		//set the unique attribute of phone
	}

	/* Accessors and Mutators */
	/**
	 * Name: getHasFaceID
	 * Description: gets whether the device has face ID or not
	 * @return hasFaceID - a boolean value representing whether the device has face ID or not
	 */
	public boolean getHasFaceID() {
		return hasFaceID;
	}

	/* Other methods */
	/**
	 * Name: call
	 * Description: calls, uses up battery when calling at a rate of 2% per minute
	 * @param time - an int value representing the time of the call in minutes
	 */
	public void call(int time) {
		//if phone is locked, does not work
		if (getIsLocked()) {
			System.out.println("SYSTEM MESSAGE: Unlock phone first");
			return;
		}

		//if phone has no battery, does not work
		if (getIsOn()) {
			System.out.println("SYSTEM MESSAGE: Turn the phone on first");
			return;
		}

		//set new battery value after the call, lose 2% per minute
		setBattery(getBattery() - time * 2);	//phone will shutdown if battery goes to 0 (in setBattery() method)
	}

	/**
	 * Name: powerOn
	 * Description: turns the device on
	 */
	public void powerOn() {
		//if phone is already on
		if (getIsOn()) {
			System.out.println("SYSTEM MESSAGE: Phone is already on and ready to use!");
			return;
		}

		//if there is no battery, does not work
		if (getBattery() == 0) {
			System.out.println("SYSTEM MESSAGE: Charge phone first!");
			return;
		}

		//set phone as on
		setIsOn(true);
		System.out.println("SYSTEM MESSAGE: Phone has been turned on");
	}

	/**
	 * Name: shutdown
	 * Description: shuts the device down
	 */
	public void shutdown() {
		//if phone is already off
		if (!getIsOn()) {
			System.out.println("SYSTEM MESSAGE: Phone is already off");
			return;
		}
		
		//shut the phone down
		setIsOn(false);
		System.out.println("SYSTEM MESSAGE: Phone has been turned off");
	}

	/**
	 * Name: hasEnoughBattery
	 * Description: tells the user whether the phone has enough battery or not
	 * @return - a String value indicating whether there is enough battery or not
	 */
	public String hasEnoughBattery() {
		//if >= 60, yes; if < 60, no
		return getBattery() >= 60 ? "SYSTEM MESSAGE: There is enough battery" : "SYSTEM MESSAGE: There is not enough battery";
	}

	/**
	 * Name: toString
	 * Description: outputs the attributes of the phone and their status
	 * @return - a string value for the common attributes of the device and their status from the superclass and Phone's unique attribute at the end
	 */
	public String toString() {
		return super.toString() + "\nHas Face ID: " + (hasFaceID ? "Yes" : "No");
	}

}
