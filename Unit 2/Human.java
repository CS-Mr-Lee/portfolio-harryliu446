package Unit2ObjectOrientedProgramming4Quiz;

/**
 * Name: Harry Liu
 * Description: Class for Human
 * Date: Mar 1, 2022
 */


public class Human {

	// attributes
	/** The name of the human */
	private String name;
	/** the weight of the human in kg*/
	private double weight;
	/** the energy level of the human */
	private int energyLevel;

	//constructor
	/**
	 * Name: Human
	 * Description: Default constructor for Human
	 */
	public Human () {
		name = "";
		weight = -1;
		energyLevel = -1;
	}
	
	/**
	 * Name: Human
	 * Description: Constructor for Human
	 * @param name - String value for the name of the human
	 * @param weight - double value for the weight of the human
	 * @param energyLevel - double value for the energy level of the human
	 */
	public Human (String name, double weight, int energyLevel) {
		this.name = name;
		this.weight = weight;	
		this.energyLevel = energyLevel;
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
	public int getEnergyLevel() {
		return energyLevel;
	}
	
	//other methods
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
		energyLevel = (int)Math.max(0, energyLevel - 3*km);	//3% energy drop per km
		weight = Math.max(0, weight - 0.001*km);		//0.001kg weight drop per km
	}

	/**
	 * Name: eat
	 * Description: human eats vegetable, if successful, gains energy level and weight accordingly
	 * @param veg - Vegetable value for the vegetable to be eaten
	 * @param grams - double value for the amount of vegetable eaten
	 */
	public void eat (Vegetable veg, double grams) {
		int caloriesGained = veg.eaten(grams);	//calls eaten function from Vegetable class
		
		if (caloriesGained == -1) {		//if mass eaten is greater than the original mass, eating not successful
			System.out.println("I don’t have that much food");
			return;
		}
		
		//if successful, gains weight and energy accordingly
		weight += grams;
		energyLevel += Math.round(caloriesGained/15.0);
	}
	
	/**
	 * Name: eat
	 * Description: human eats cookie, if successful, gains energy level and weight accordingly
	 * @param food - Cookie value for the cookie to be eaten
	 * @param grams - double value for the amount of cookie eaten
	 */
	public void eat (Cookie food, double grams) {
		int caloriesGained = food.eaten(grams);	//calls eaten function from Vegetable class
		
		if (caloriesGained == -1) {		//if mass eaten is greater than the original mass, eating not successful
			System.out.println("I don’t have that much food");
			return;
		}
		
		if (caloriesGained == -2) {		//if cookie is still packaged, eating not successful
			System.out.println("I can’t eat the bag");
			return;
		}
		
		//if successful, gains weight and energy accordingly
		weight += (grams/1000);
		energyLevel += Math.round(caloriesGained/15.0);
	}
	
	/**
	 * Name: toString
	 * Description: returns all the attributes of the human in a string
	 * @return - one string value that contains all the attributes and their current values
	 */
	public String toString() {
		return "Name: " + name + "\nWeight: " + weight + "\nEnergy Level: " + energyLevel;
	}
}

