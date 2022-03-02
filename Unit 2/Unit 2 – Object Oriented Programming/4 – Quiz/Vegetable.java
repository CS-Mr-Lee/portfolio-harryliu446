package Unit2ObjectOrientedProgramming4Quiz;

/**
 * Name: Harry Liu
 * Description: This is a class for Vegetable, contains the required attributes, constructors, and methods
 * Date: Mar 1, 2022
 */

public class Vegetable {

	//attributes
	/** name of the vegetable */
	private String name;
	/** weight of the vegetable in grams */
	private double weight;
	/** calories of the vegetable */
	private int calories;
	
	//constructors
	/**
	 * Name: Vegetable
	 * Description: Constructor for Vegetable, set name to empty, weight and calories to -1
	 */
	public Vegetable () {
		name = "";
		weight = -1;
		calories = -1;
	}
	
	/**
	 * Name: Vegetable
	 * Description: Constructor for Vegetable
	 * @param name - name of vegetable
	 * @param weight - weight of vegetable
	 * @param calories - calories of vegetable
	 */
	public Vegetable (String name, double weight, int calories) {
		this.name = name;
		this.weight = weight;
		this.calories = calories;
	}
	
	
	//accessor
	/**
	 * Name: getName
	 * Description: gets the name of the vegetable
	 * @return - String value for the name of the vegetable
	 */
	public String getName () {
		return name;
	}

	/**
	 * Name: getWeight
	 * Description: gets the weight of the vegetable
	 * @return - double value for the current weight of the vegetable
	 */
	public double getWeight () {
		return weight;
	}
	
	/**
	 * Name: getCalories
	 * Description: gets the calories that the vegetable contains
	 * @return - double value for the calories of the vegetable
	 */
	public int getCalories () {
		return calories;
	}
	
	
	//other methods
	/**
	 * Name: eaten
	 * Description: Vegetable is eaten, weight and calories of the vegetable decrease 
	 * @param weight - double value to tell the program how much of the vegetable is eaten
	 * @return int value to indicate the amount of calories eaten, -1 if weight eaten is greater than original weight
	 */
	public int eaten (double weight) {
		if (this.weight < weight) {		//return -1 if weight eaten is greater than original weight
			return -1;
		}
		
		//calculate percentage eaten and how much calories is eaten
		double precentDifference = weight/this.weight;
		int caloriesEaten = (int)Math.round(precentDifference * this.calories);
		
		//set new values for weight and calories
		this.weight -= weight;
		this.calories -= caloriesEaten;
		
		return caloriesEaten;	//return the amount of calories eaten
	}
	
	/**
	 * Name: toString
	 * Description: returns all the attributes of the Vegetable in a string
	 * @return - one string value that contains all the attributes and their current values
	 */
	public String toString() {
		return "Name: " + name + "\nWeight: " + weight + "\nCalories: " + calories;
	}
	

	
}

