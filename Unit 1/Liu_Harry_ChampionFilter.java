package ICS4U1;

/**
 * Name: Harry Liu
 * Date: Feb 13
 * Description: This program reads from a file and outputs the name and hp of the champion with the highest hp
 * 				and the name and armor of the champion with the lowest armor
 */

import java.io.*;

public class Liu_Harry_ChampionFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//initialize variables
		String maxHpChamp = "", minArmorChamp = "", curChamp = "";
		double maxHp = -1.0, minArmor = (double)0x3f3f3f3f, curValue = 0.0;
		
		try {
			BufferedReader br = new BufferedReader (new FileReader ("champions.json"));		//read from file
			BufferedWriter out = new BufferedWriter (new FileWriter ("MaxChampStats.txt"));	//write in file
			
			String curLine = br.readLine();		//read first line, used to start while loop
			
			while (curLine != null) {		//only continue when not null, stops at the end of file
				
				//only replace unnecessary characters (spaces, quotations, commas) if curLine is known not to be null
				curLine = curLine.replaceAll("\\s", "").replaceAll("\"", "").replaceAll(",", "");
				
				String[] words = curLine.split(":");	//split by :
														//If curLine is useful (for name, hp, or armor), then words should have 2 elements
				

				if (words[0].equals("name")) {		//if name
					curChamp = words[1];				//store cur champion name in temporary variable
				}
				else if (words[0].equals("hp")) {		//if hp
					curValue = Double.parseDouble(words[1]);	//store cur hp value in temporary variable
					
					//if cur value greater than max hp at this point, change champion name to current champion name, change maxHp to current hp
					if (curValue > maxHp) {
						maxHp = curValue;
						maxHpChamp = curChamp;
					}
				}
				else if (words[0].equals("armor")) {	//if armor
					curValue = Double.parseDouble(words[1]);	//store current hp value in temporary variable
					
					//if cur value less than min armor at this point, change champion name to current champion name, change minArmor to current armor
					if (curValue < minArmor) {
						minArmor = curValue;
						minArmorChamp = curChamp;
					}
				}
				
				curLine = br.readLine();	//read next line
			}
			
			br.close();
			
			//write to file
			out.write("The champion with the highest hp is " + maxHpChamp + " with " + maxHp + " hp");
			out.newLine();
			out.write("The champion with the lowest armor is " + minArmorChamp + " with " + minArmor + " armor");
			
			out.close();
			
		}
		catch (IOException e) {	//catch IOException
			System.out.println("Cannot read file");
		}
		
		
	}

}
