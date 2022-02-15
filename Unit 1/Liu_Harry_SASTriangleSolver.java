package ICS4U1;

/**
* Name: Harry Liu
* Date: Feb 8
* Description: This program asks the user for the length of 2 sides and the angle of the angle between the 2 sides. 
* 			   It returns the smallest angle in the given triangle.
*/	

import java.util.Scanner;

public class Liu_Harry_SASTriangleSolver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//initialize variables
		Scanner sc = new Scanner (System.in);
		double side1, side2, angle3;
		
		//prompts user input
		System.out.println("Enter the length of 2 sides and the measurement of the angle in between: ");
		side1 = sc.nextDouble();
		side2 = sc.nextDouble();
		angle3 = sc.nextDouble();
		
		//calls the method and output (angle is rounded to 4 decimal places)
		System.out.printf("%.4f", smallestAngle (side1, side2, angle3));
		
		sc.close();
	}
	
	/**
	 * Name: smallestAngle
	 * Description: This method takes the measurement of 2 sides and one angle and calculates and returns the smallest angle in the triangle
	 * @param side1 - decimal value of the length of side 1
	 * @param side2 - decimal value of the length of side 2
	 * @param angle3 - decimal value of the angle of angle 3 (the angle between side 1 and side 3, opposite to side 3)
	 * @return double value - the decimal value of the smallest angle in the triangle measured in degrees
	 */
	public static double smallestAngle (double side1, double side2, double angle3) {
		//initialize extra variables
		double side3, angle1, angle2;
		
		//calculations
		side3 = Math.sqrt(side1*side1 + side2*side2 - 2*side1*side2*Math.cos(angle3));
		
		angle1 = Math.asin(Math.sin(angle3)/side3 * side1);
		angle2 = Math.asin(Math.sin(angle3)/side3 * side2);
		
		//convert to degrees
		angle1 = angle1*180/Math.PI;
		angle2 = angle2*180/Math.PI;
		angle3 = angle3*180/Math.PI;
		
		//return the minimum of the 3 angles
		return Math.min(angle1, Math.min(angle2, angle3));
	}

}
