package ICS4U1;

/**
* Name: Harry Liu
* Date: Feb 8
* Description: This program asks the user for the name and price of two types of groceries. Then outputs them in the specified format.
*/	


import java.util.Scanner;

public class Liu_Harry_GroceryItem {

	public static void main(String[] args) {
		// TODO Auto-generaØted method stub

		//initialize variables
		Scanner sc = new Scanner (System.in);
		
		String item1, item2;
		double cost1, cost2;
		
		//prompts user input
		System.out.println("Name of grocery #1:");
		item1 = sc.nextLine();
		System.out.println("Cost of grocery #1:");
		cost1 = sc.nextDouble();
		sc.nextLine();
		System.out.println("Name of grocery #2:");
		item2 = sc.nextLine();
		System.out.println("Cost of grocery #2:");
		cost2 = sc.nextDouble();
		
		//output and formatting
		System.out.println("-----------------------------------");
		System.out.printf("%-25s %s%4.2f%n", item1, cost1 >= 10 ? "$" : " $", cost1);  //if price less than 10, insert 1 additional space in front of $
		System.out.printf("%-25s %s%4.2f%n", item2, cost2 >= 10 ? "$" : " $", cost2);
		System.out.println("-----------------------------------");
		
		sc.close();
	}

}
