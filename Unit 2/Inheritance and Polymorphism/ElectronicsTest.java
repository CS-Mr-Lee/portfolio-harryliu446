package ICS4U1;

public class ElectronicsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Electronics[] myElectronics = new Electronics[2];
		myElectronics[0] = new PhoneNew("iPhone", "blue", 2000, 6.06, 189, 512, 100, true, true, true);
		myElectronics[1] = new LaptopNew("Macbook", "white", 4000, 16, 2177.07, 512, 100, 16, true,true);
		
		System.out.println(myElectronics[0].toString());
		
		System.out.println(myElectronics[1].toString());
	}

}
