package ICS4U1;

class Human {

	// attributes
	/** The name of the human */
	private String name;
	/** the gender of the human */
	private String gender;
	/** the weight of the human */
	private double weight;
	/** the energy level of the human */
	private double energyLevel;
	/** the height of the human */
	private double height;

	//constructor
	/**
	 * Name: Human
	 * Description: Constructor for the human class
	 * @param name - String value for the name of the human
	 * @param gender - String value for the gender of the human
	 * @param weight - double value for the weight of the human
	 * @param energyLevel - double value for the energy level of the human
	 * @param height - double value for the height of the human
	 */
	public Human(String name, String gender, double weight, double energyLevel, double height) {
		this.name = name;
		this.gender = gender;
		this.weight = Math.max(0, weight);	//weight cannot be negative
		this.energyLevel = Math.max(0, Math.min(100, energyLevel));	//ensures that energy level is within the range of 0-100
		this.height = Math.max(0, height);	//height cannot be negative
	}

	
	//accessors
	/**
	 * Name: getName
	 * Description: gets the name of the human
	 * @return - String value for the name of the human
	 */
	public String getName() {
		return name;
	}

	/**
	 * Name: getGender
	 * Description: gets the gender of the human
	 * @return - returns a String value for the gender of the human
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * Name: getWeight
	 * Description: gets the weight of the human
	 * @return - returns a double value representing the weight of the human
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * Name: getEnergyLevel
	 * Description: gets the energy level of the human
	 * @return - returns a double value for the current energy level of the human
	 */
	public double getEnergyLevel() {
		return energyLevel;
	}

	/**
	 * Name: getHeight
	 * Description: gets the current height of the human
	 * @return - returns a double value indicating the current height of the human
	 */
	public double getHeight() {
		return height;
	}

	//mutators
	/**
	 * Name: setWeight
	 * Description: sets the weight of the human object to the new weight as specified in the input
	 * @param newWeight - double value for the new weight of the human
	 */
	public void setWeight(double newWeight) {
		weight = Math.max(0, newWeight);	//weight cannot be less than 0
	}

	public void setEnergyLevel (double newEnergyLevel) {
		energyLevel = Math.max(0, Math.min(100, newEnergyLevel));
	}
	
	/**
	 * Name: setHeight
	 * Description: sets the height of the human object to the new height as specified in the input
	 * @param newHeight - double value for the new height of the human
	 */
	public void setHeight(double newHeight) {
		height = Math.max(height, newHeight);	//height can only get taller
	}

	/**
	 * Name: sleep
	 * Description: human sleeps to gain energy based on hours slept
	 * @param hours - int value for the number of hours slept
	 */
	public void sleep(int hours) {
		energyLevel = Math.min(100, energyLevel + 10 * hours);	//cannot exceed 100% energy
	}

	/**
	 * Name: run
	 * Description: human runs and loses energy and weight at the same time
	 * @param km - double value for the distance ran in km
	 */
	public void run (double km) {
		energyLevel = Math.max(0, energyLevel - 0.5*km);	//0.5% energy drop per km
		weight = Math.max(0, weight - 0.001*km);		//0.001kg weight drop per km
	}

	/**
	 * Name: toString
	 * Description: returns all the attributes of the human in a string
	 * @return - one string value that contains all the attributes and their current values
	 */
	public String toString() {
		return "Name: " + name + "\nGender: " + gender + "\nWeight: " + weight + "\nEnergy Level: " + energyLevel + "\nHeight: " + height;
	}
}
