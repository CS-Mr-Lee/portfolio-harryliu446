package Unit2ObjectOrientedProgramming4Quiz;

/**
 * Name: Harry Liu
 * Description: This is a class for Cookie
 * Date: Mar 1, 2022
 */

public class Cookie {

	//attributes
	/** name of the cookie */
	private String name;
	/** weight of the cookie in grams*/
	private double weight;
	/** calories of the cookie */
	private int calories;
	/** whether the cookie is packaged or not */
	private boolean isPackaged;
	
	//constructors
	/**
	 * Name: Cookie
	 * Description: default constructor for Cookie
	 */
	public Cookie () {
		name = "";
		weight = -1;
		calories = -1;
		isPackaged = false;
	}
	
	/**
	 * Name: Cookie;
	 * Description: constructor for unpackaged Cookie
	 * @param name - String value for the name of the cookie
	 * @param weight - double value for the weight of the cookie
	 * @param calories - int value for the calories of the cookie
	 */
	public Cookie (String name, double weight, int calories) {
		this.name = name;
		this.weight = weight;
		this.calories = calories;
		this.isPackaged = false;
	}
	
	/**
	 * Name: Cookie;
	 * Description: constructor for Cookie
	 * @param name - String value for the name of the cookie
	 * @param weight - double value for the weight of the cookie
	 * @param calories - int value for the calories of the cookie
	 * @param isPackaged - boolean value for whether or not the cookie is packaged
	 */
	public Cookie (String name, double weight, int calories, boolean isPackaged) {
		this.name = name;
		this.weight = weight;
		this.calories = calories;
		this.isPackaged = isPackaged;
	}
	
	//accessors
	/**
	 * Name: getName
	 * Description: gets the name of the cookie
	 * @return - String value for the name of the cookie
	 */
	public String getName () {
		return name;
	}

	/**
	 * Name: getWeight
	 * Description: gets the weight of the cookie
	 * @return - double value for the current weight of the cookie
	 */
	public double getWeight () {
		return weight;
	}
	
	/**
	 * Name: getCalories
	 * Description: gets the calories that the cookie contains
	 * @return - double value for the calories of the cookie
	 */
	public double getCalories () {
		return calories;
	}
	
	/**
	 * Name: getIsPackaged
	 * Description: gets the information of whether or not the cookie is packaged
	 * @return - boolean value for whether the cookie is packaged or not
	 */
	public boolean getIsPackaged () {
		return isPackaged;
	}
	
	
	//other methods
	/**
	 * Name: open
	 * Description: opens the cookie's package (boolean will be set to false, whether it has a package or not to begin with)
	 */
	public void open () {
		isPackaged = false;
	}
	
	/**
	 * Name: eaten
	 * Description: cookie is eaten, weight and calories are lost 
	 * @param weight - double value to tell the program how much of the cookie is eaten
	 * @return int value to indicate the amount of calories eaten, -1 if weight eaten is greater than original weight, -2 if cookie is still packaged
	 */
	public int eaten (double weight) {
		if (this.weight < weight) {	//return -1 if weight eaten is greater than original weight 
			return -1;
		}
		
		if (isPackaged) {	//return -2 if cookie is still packaged
			return -2;
		}
		
		//calculate percentage eaten and how much calorie is eaten
		double precentDifference = weight/this.weight;
		int caloriesEaten = (int)(precentDifference * this.calories);
		
		//set new values for weight and calories
		this.weight -= weight;
		this.calories -= caloriesEaten;
		
		return caloriesEaten;	//return
	}
	
	/**
	 * Name: toString
	 * Description: returns all the attributes of the Cookie in a string
	 * @return - one string value that contains all the attributes and their current values
	 */
	public String toString() {
		return "Name: " + name + "\nWeight: " + weight + "\nCalories: " + calories + "/nPackaged or not: " + (isPackaged ? "Yes" : "No");
	}
}
