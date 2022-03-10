package ICS4U1;

public class LaptopNew extends Electronics {

	/* Attributes */
	private int keyboardSize;

	/* Constructor */
	public LaptopNew(String brand, String colour, double price, double size, double weight, int storage, int battery, int keyboardSize, 
					boolean isLocked, boolean isOn) {
		super(brand, colour, price, size, weight, storage, battery, isLocked, isOn);
		this.keyboardSize = keyboardSize;
	}

	/* Accessors and Mutators */
	public int getKeyboardSize() {
		return keyboardSize;
	}

	public void setKeyboardSize(int newKeyboardSize) {
		keyboardSize = newKeyboardSize;
	}

	/* Other methods */

	public void game(int time) {
		if (getIsLocked()) {
			System.out.println("Unlock laptop first");
			return;
		}

		if (getBattery() == 0) {
			System.out.println("Charge laptop first");
			return;
		}

		if (keyboardSize <= 50) {
			System.out.println("Get a larger keyboard first");
			return;
		}

		setBattery(getBattery() - time * 2);

		if (getBattery() == 0) {
			setIsOn(false); // shuts down when battery is at 0
		}
	}

	public void powerOn() {
		if (getIsOn()) {
			System.out.println("Laptop is already on and ready to use!");
			return;
		}

		if (getBattery() == 0) {
			System.out.println("Charge laptop first!");
		}

		setIsOn(true);
		System.out.println("Device has been turned on");
	}

	public void shutdown() {
		if (!getIsOn()) {
			System.out.println("Laptop is already off");
			return;
		}
		setIsOn(false);
		System.out.println("Device has been turned off");
	}

	public String hasEnoughBattery() {
		return getBattery() >= 75 ? "Yes" : "No";
	}

	public String toString() {
		return super.toString() + "\nKeyboard Size: " + keyboardSize;
	}

}
