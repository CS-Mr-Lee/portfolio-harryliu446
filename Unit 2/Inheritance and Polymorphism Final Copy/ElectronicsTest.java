package ICS4U1;

/**
 * Name: Lucus Lu, Harry Liu 
 * Date: Mar 11, 2022 
 * Description: The testing class for Electronics, LaptopNew, and PhoneNew. Test their inheritance properties and class functionalities. 
 * 				Demonstrates polymorphism, instanceOf, and casting.
 */

public class ElectronicsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* initialize variables */
		Electronics[] myElectronics = new Electronics[2];
		// 						brand, colour, price, size, weight storage battery, hasFaceID, isLocked, isOn
		myElectronics[0] = new PhoneNew("iPhone", "blue", 2000, 6.06, 189, 512, 100, true, false, true);
		myElectronics[1] = new LaptopNew("Macbook", "white", 4000, 16, 2177.07, 512, 100, 70, false, true);
		// 						brand, colour, price, size, weight storage battery, keyboardSize, isLocked, isOn

		/* Demonstrates class functionalities */
		//outputs the current conditions of the two devices
		System.out.println(myElectronics[0]); // Phone
		System.out.println(myElectronics[1]); // Laptop
		System.out.println();

		//test accessor methods
		System.out.println("==================================================");
		System.out.println("Test getPrice method");
		System.out.println("Phone Price: " + myElectronics[0].getPrice());
		System.out.println("Laptop Price: " + myElectronics[1].getPrice());
		System.out.println("==================================================\n\n");

		//test mutator methods
		System.out.println("==================================================");
		System.out.println("Test setBattery method\n");
		System.out.println("Current battery of phone is: " + myElectronics[0].getBattery() + "%");

		//test if give a over 100 battery number, how setBattery works
		myElectronics[0].setBattery(200);
		System.out.println("attempts to set battery to 200%, the new bettery is: " + myElectronics[0].getBattery() + "%");

		//test setBattery with 50
		myElectronics[0].setBattery(50);
		System.out.println("attempts to set Battery to 50%, the new bettery is: " + myElectronics[0].getBattery() + "%");

		//test isOn method
		System.out.println("\nTest setIsOn method: ");
		System.out.println("Is the phone on? " + myElectronics[0].getIsOn());

		myElectronics[0].setIsOn(false);

		System.out.println("After setting the phone to off, is the phone on? " + myElectronics[0].getIsOn());
		System.out.println("==================================================\n\n");

		
		
		
		
		
		/* test special methods in PhoneNew class */
		
		
		//test powerOn method
		System.out.println("==================================================");
		System.out.println("Test powerOn method in PhoneNew class");

		//attempts to turn phone on when battery is at 0
		myElectronics[0].setBattery(0);
		System.out.println("\nThe current battery is: " + myElectronics[0].getBattery() + "%");
		System.out.println("Is phone on? " + myElectronics[0].getIsOn());
		System.out.println("\nUse powerOn method to start up phone, expected to not work because battery is at 0");
		((PhoneNew)myElectronics[0]).powerOn();

		//turn phone on after setting battery to 50
		myElectronics[0].setBattery(50);
		System.out.println("\nThe current battery is: " + myElectronics[0].getBattery() + "%");
		((PhoneNew)myElectronics[0]).powerOn();
		System.out.println("Is phone on? " + myElectronics[0].getIsOn());
		
		System.out.println("==================================================\n\n");		
		
		
		//test shutdown method
		System.out.println("==================================================");
		System.out.println("Test shutdown method in PhoneNew class\n");

		System.out.println("Is phone on? " + myElectronics[0].getIsOn());
		((PhoneNew)myElectronics[0]).shutdown();
		System.out.println("Is phone on? " + myElectronics[0].getIsOn());

		System.out.println("==================================================\n\n");
		
		
		//test call, lock, and unlock method and demonstrate casting
		System.out.println("==================================================");
		System.out.println("Test Call, Lock, and unlock methods in PhoneNew file: (lock and unlock methods are inherited from super class)\n");
		
		//use lock method to lock phone first
		System.out.println("Current lock status is: " + myElectronics[0].getIsLocked());
		myElectronics[0].lock();
		System.out.println("Current lock status after using lock method is: " + myElectronics[0].getIsLocked());
	
		//test call method when the phone is locked, expected to not work and there should be no change to battery
		myElectronics[0].setBattery(100);
		System.out.println("\nThe current battery is: " + myElectronics[0].getBattery() + "%");
		System.out.println("Use call method to call for 10 mins, expected to not work because phone is locked");
		((PhoneNew) myElectronics[0]).call(10); 	//demonstrates casting and uses call method
		System.out.println("The current battery is: " + myElectronics[0].getBattery() + "%");
		
		//unlock the phone
		myElectronics[0].unlock();
		System.out.println("\nAfter using unlock method, the lock status is: " + myElectronics[0].getIsLocked());
		
		//test call method again, expect to see change in battery
		System.out.println("\nThe current battery is: " + myElectronics[0].getBattery() + "%");
		System.out.println("Test call method again after unlocking, call for 10 mins, expected to lose 20% battery");
		((PhoneNew) myElectronics[0]).call(10); 	//demonstrates casting and uses call method
		System.out.println("The current battery is: " + myElectronics[0].getBattery() + "%");
		
		//test call method again when phone is off
		((PhoneNew)myElectronics[0]).shutdown();
		System.out.println("\nTest call method again after shutting down, expected to not work");
		System.out.println("Is the phone on? " + myElectronics[0].getIsOn()); 
		((PhoneNew)myElectronics[0]).call(10);
		
		((PhoneNew)myElectronics[0]).powerOn();
		System.out.println("==================================================\n\n");

		
		//test hasEnoughBattery method
		System.out.println("==================================================");
		System.out.println("Test hasEnoughBattery method in PhoneNew file");

		//if the battery is over 60%, expected to see a positive response, if the battery is below 60%, expected to see a negative response
		myElectronics[0].setBattery(30);
		System.out.println("\nThe current battery is: " + myElectronics[0].getBattery() + "%");
		System.out.println(((PhoneNew) myElectronics[0]).hasEnoughBattery());

		myElectronics[0].setBattery(70);
		System.out.println("\nThe current battery is: " + myElectronics[0].getBattery() + "%");
		System.out.println(((PhoneNew) myElectronics[0]).hasEnoughBattery());

		System.out.println("==================================================\n\n");

		
		
		

		/* test special methods in LaptopNew class */
		
		
		//test setKeyboardSize and getKeyboardSize methods
		System.out.println("==================================================");
		System.out.println("Test setKeyboardSize and getKeyboardSize method in LaptopNew class");
		
		System.out.println("The current keyboard size is: " + ((LaptopNew)myElectronics[1]).getKeyboardSize() + "%");
		System.out.println("\nAfter setting keyboard size to 40%: ");
		((LaptopNew)myElectronics[1]).setKeyboardSize(40);
		System.out.println("The current keyboard size is: " + ((LaptopNew)myElectronics[1]).getKeyboardSize() + "%");
		
		System.out.println("==================================================\n\n");


		//test game method
		System.out.println("==================================================");
		System.out.println("Test game method in LaptopNew class\n");

		//test game method when keyboard size is smaller than 50%
		System.out.println("\nThe current keyboard size is: " + ((LaptopNew)myElectronics[1]).getKeyboardSize() + "%");
		System.out.println("Run the game method, expected to not work since keyboard size is smaller than 50%");
		((LaptopNew)myElectronics[1]).game(20);

		((LaptopNew)myElectronics[1]).setKeyboardSize(70); 		//set keyboard size to 70% for later testings
		
		//test game method when laptop is locked
		myElectronics[1].lock();
		System.out.println("\nIs the phone locked? " + myElectronics[1].getIsLocked());
		System.out.println("Run the game method, expected to not work because laptop is locked");
		((LaptopNew)myElectronics[1]).game(20);
		
		myElectronics[1].unlock(); 		//unlock laptop for later testings

		//test game method when laptop is off
		((LaptopNew)myElectronics[1]).shutdown();
		System.out.println("\nIs laptop on? " + myElectronics[1].getIsOn());
		System.out.println("Run the game method, expected to not work because laptop is off");
		((LaptopNew)myElectronics[1]).game(20);
		
		((LaptopNew)myElectronics[1]).powerOn(); 	//turn laptop on for later testings

		//set the Laptop as full battery first and test game method when all conditions are met
		myElectronics[1].setBattery(100);
		System.out.println("\nThe current battery is: " + myElectronics[1].getBattery());
		System.out.println("\nIs laptop on? " + myElectronics[1].getIsOn());
		System.out.println("Is the phone locked? " + myElectronics[1].getIsLocked());
		System.out.println("The current keyboard size is: " + ((LaptopNew)myElectronics[1]).getKeyboardSize() + "%");
		System.out.println("Test the game method when all conditions are met, game for 20 mins, expected to lose 40% battery");
		((LaptopNew)myElectronics[1]).game(20);
		System.out.println("\nThe current battery is: " + myElectronics[1].getBattery());

		//use up all the remaining battery
		System.out.println("\nGame for 30 mins, expected to use up all the remaining battery, laptop should shut down");
		((LaptopNew)myElectronics[1]).game(30); // expected lose 60% battery
		System.out.println("Is the laptop on? " + myElectronics[1].getIsOn());
		
		System.out.println("==================================================\n\n");

		
		// test powerOn method
		System.out.println("==================================================");
		System.out.println("Test powerOn, charge, and shutdown methods in LaptopNew class");
		
		//test powerOn method when battery is at 0%
		System.out.println("\nThe current battery is: " + myElectronics[1].getBattery() + "%");
		System.out.println("Test powerOn method, expected to not work because battery is at 0%\n");
		((LaptopNew)myElectronics[1]).powerOn();
		System.out.println("Is the laptop on? " + myElectronics[1].getIsOn());

		//test charge method
		System.out.println("\nTest charge method in Electronics class, charge for 50 mins, expected to charge battery to 50%");
		myElectronics[1].charge(50);
		System.out.println("The current battery is: " + myElectronics[1].getBattery() + "%");

		//test powerOn method when battery is greater than 0%
		System.out.println("\nTest powerOn method in LaptopNew class again, expected to work");
		((LaptopNew)myElectronics[1]).powerOn();
		System.out.println("Is the laptop on? " + myElectronics[1].getIsOn());

		//test shutdown method
		System.out.println("\nUse shutdown method");
		((LaptopNew)myElectronics[1]).shutdown();
		System.out.println("Is the laptop on? " + myElectronics[1].getIsOn());

		//test shutdown method when laptop is already off
		System.out.println("\nUse shutdown method again when laptop already off");
		System.out.println("Is the laptop On? " + myElectronics[1].getIsOn());
		System.out.println("Use shutdown method: ");
		((LaptopNew)myElectronics[1]).shutdown();
		System.out.println("Is the laptop On? " + myElectronics[1].getIsOn());
		
		System.out.println("==================================================\n\n");

		
		//test hasEnoughBattery method
		System.out.println("==================================================");
		System.out.println("Test hasEnoughBattery method");
		
		System.out.println("\nThe current battery is: " + myElectronics[1].getBattery() + "%");
		System.out.println(((LaptopNew)myElectronics[1]).hasEnoughBattery());

		System.out.println("\nSet battery to 80% and test hasEnoughBattery again");
		myElectronics[1].setBattery(80);
		System.out.println("The current battery is: " + myElectronics[1].getBattery() + "%");
		System.out.println(((LaptopNew) myElectronics[1]).hasEnoughBattery());

		System.out.println("==================================================\n\n");

		
		//demonstrates instanceof
		System.out.println("==================================================");
		for (int i = 0; i < 2; i++) {
			if (myElectronics[i] instanceof PhoneNew) {
				System.out.println("Phone " + (((PhoneNew)myElectronics[i]).getHasFaceID() ? "has face ID" : "does not have face ID"));
			} else {
				System.out.println("Laptop keyboard size: " + ((LaptopNew)myElectronics[i]).getKeyboardSize() + "%");
			}
		}
		System.out.println("==================================================");

	}

}
