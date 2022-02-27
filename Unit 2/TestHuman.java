package ICS4U1;

public class TestHuman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create two human objects
		//name, gender, weight, energyLevel, height
		Human Bob1 = new Human("Bob1", "M", 12, 22, 32);
		Human Bob2 = new Human("Bob2", "F", 42, 52, 62);
		
		//test 1 for mutator and accessor
		System.out.println("TEST FOR MUTATOR AND ACCESSOR");
		System.out.println("Bob1 energy level: " + Bob1.getEnergyLevel());
		System.out.println("Set Bob1 energy to 1");
		Bob1.setEnergyLevel(1);
		System.out.println("Bob1 energy level: " + Bob1.getEnergyLevel());
		
		System.out.println("======================================");
		
		//test 2 for mutator and accessor
		System.out.println("TEST FOR MUTATOR AND ACCESSOR");
		System.out.println("Bob1 height: " + Bob1.getHeight());
		System.out.println("Set Bob1 height to 50");
		Bob1.setHeight(50);
		System.out.println("Bob1 height: " + Bob1.getHeight());
		
		System.out.println("======================================");
		
		//test for run method
		System.out.println("TEST FOR run METHOD");
		System.out.println("Bob2 weight: " + Bob2.getWeight());
		System.out.println("Bob2 energy level: " + Bob2.getEnergyLevel());
		System.out.println("Bob2 runs 2 km");
		Bob2.run(2);
		System.out.println("Bob2 weight: " + Bob2.getWeight());
		System.out.println("Bob2 energy level: " + Bob2.getEnergyLevel());
		
		System.out.println("======================================");
		
		//test for sleep method
		System.out.println("TEST FOR sleep METHOD");
		System.out.println("Bob2 energy level: " + Bob2.getEnergyLevel());
		System.out.println("Bob2 sleeps for 3 hours");
		Bob2.sleep(3);
		System.out.println("Bob2 energy level: " + Bob2.getEnergyLevel());
		
		System.out.println("======================================");
		
		//test for toString method
		System.out.println("TEST FOR toString METHOD");
		System.out.println("Bob1 name: " + Bob1.getName());
		System.out.println("Bob1 gender: " + Bob1.getGender());
		System.out.println("Bob1 weight: " + Bob1.getWeight());
		System.out.println("Bob1 energy level: " + Bob1.getEnergyLevel());
		System.out.println("Bob1 height: " + Bob1.getHeight());
		System.out.println();
		System.out.println(Bob1.toString());
	}

}
