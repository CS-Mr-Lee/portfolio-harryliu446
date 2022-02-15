package ICS4U1;

/**
* Name: Harry Liu
* Date: Feb 8
* Description: This program asks the user for a line of characters to be encrypted. It returns the encrypted string following the requirements.
*/	

import java.util.Scanner;

public class Liu_Harry_Encryption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//initialize variable
		Scanner sc = new Scanner (System.in);
		
		String originalCode, encryptedCode = "";
		String[] words;
		
		//prompts user input
		System.out.println("Please enter a line of code to be encoded: ");
		originalCode = sc.nextLine();
		
		//split the string by " ", store each word in array.
		words = originalCode.split(" ");
		
		
		//loops through every word in the sentence
		for (String curWord : words) {
			String newWord = "" + curWord.charAt(curWord.length()-1);	//initialize newWord to store the changed version of current word
																		//puts the last char in the current word first
			
			//loops through the middle characters
			for (int i=1; i<curWord.length()-1; i++) {
				if (curWord.charAt(i) > 124) {
					newWord += (char)((curWord.charAt(i) + 2)%126 + 31);	//mod 126 + 31 to start from beginning again
				}
				else {
					newWord += (char)(curWord.charAt(i) + 2);	//adds 2 to the ascii values of the middle characters
				}	
			}
			
			newWord += curWord.charAt(0);		//puts the first character last
			newWord += " ";						//add a space at the end
			
			encryptedCode += newWord;		//add to the string
		}
		
		//outputs everything in the string except for the last character (the last space)
		System.out.println(encryptedCode.trim());	
		
		sc.close();
	}

}
