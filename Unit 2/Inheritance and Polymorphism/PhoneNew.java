package ICS4U1;

public class PhoneNew extends Electronics {

	/* Attributes */
	private boolean hasFaceID;

	/* Constructor */
	public PhoneNew(String brand, String colour, double price, double size, double weight, int storage, int battery, boolean hasFaceID, 
					boolean isLocked, boolean isOn) {
		super(brand, colour, price, size, weight, storage, battery, isLocked, isOn);
		this.hasFaceID = hasFaceID;
	}

	/* Accessors and Mutators */
	public boolean getHasFaceID() {
		return hasFaceID;
	}

	/* Other methods */

	public void call(int time) {
		if (getIsLocked()) {
			System.out.println("Unlock phone first");
			return;
		}

		int battery = getBattery();

		if (battery == 0) {
			System.out.println("Charge phone first");
			return;
		}

		// get current battery after calling
		setBattery(getBattery() - time * 2);

		if (getBattery() == 0) {
			setIsOn(false); // shuts down when battery is at 0
		}
	}

	public void powerOn() {
		if (getIsOn()) {
			System.out.println("Phone is already on and ready to use!");
			return;
		}

		if (getBattery() == 0) {
			System.out.println("Charge phone first!");
		}

		setIsOn(true);
		System.out.println("Device has been turned on");
	}

	public void shutdown() {
		if (!getIsOn()) {
			System.out.println("Phone is already off");
			return;
		}
		setIsOn(false);
		System.out.println("Device has been turned off");
	}

	public String hasEnoughBattery() {
		return getBattery() >= 60 ? "Yes" : "No";
	}

	public String toString() {
		return super.toString() + "\nHas Face ID: " + (hasFaceID ? "Yes" : "No");
	}

}
