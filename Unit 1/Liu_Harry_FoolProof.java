package ICS4U1;

/**
 * Name: Harry Liu
 * Date: Feb 13
 * Description: This program continuously asks the user for inputs of numerator and denominator and outputs the answer
 * 				until the user wants to quit. It deals with all types of exceptions.  
 */

import java.util.*;

public class Liu_Harry_FoolProof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//initialize variables
		Scanner sc = new Scanner (System.in);
		Double answer, numerator, denominator;
		String inputN = "", inputD = "";
		
		//always true, runs until user inputs a string that starts with q or Q
		while (true) {
			try {	//try catch to catch NumberFormatExceptions
				
				//input for numerator
				System.out.println("Enter the numerator: ");
				inputN = sc.nextLine();
				
				if (inputN.charAt(0) == 'Q' || inputN.charAt(0) == 'q') {	//break if user wants to quit
					break;
				}
				numerator = Double.parseDouble(inputN);		//parse to double
				
				
				//input for denominator
				System.out.println("Enter the denominator: ");
				inputD = sc.nextLine();
				
				if (inputD.charAt(0) == 'Q' || inputD.charAt(0) == 'q') {	//break if user wants to quit
					break;
				}
				denominator = Double.parseDouble(inputD);	//parse to double
				
				//if denominator == 0, do not calculate for answer, output error, start from beginning
				if (denominator == 0) {
					System.out.println("You cannot divide " + numerator + " by 0, please try again\n");
					continue;
				}
				
				//calculate and output answer, round to 2 decimal places 
				answer = numerator/denominator;
				System.out.printf("%.2f / %.2f = %.2f%n%n", numerator, denominator, answer);
				
			}
			catch (NumberFormatException e) {	//can't convert to double
				System.out.println("bad input, try again\n");	//error message
			}
		}
		
		sc.close();
		
	}

}