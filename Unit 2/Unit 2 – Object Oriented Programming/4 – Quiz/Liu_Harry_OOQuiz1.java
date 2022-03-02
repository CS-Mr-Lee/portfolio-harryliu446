package Unit2ObjectOrientedProgramming4Quiz;

/**
 * Name: Harry Liu
 * Description: Test class for the Human, Vegetable, and Cookie class based on the instructions given
 * Date: Mar 1 2022
 */
public class Liu_Harry_OOQuiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//initialize variables
		Human human1 = new Human ("humanName1", 50, 100);
		Vegetable vegetable1 = new Vegetable ("vegName1", 100, 200);
		Cookie cookie1 = new Cookie ();
		Cookie cookie2 = new Cookie ("cookieName2", 50, 200);
		Cookie cookie3 = new Cookie ("cookieName3", 100, 1000, true);	//packaged cookie
		
		//human tries to eat packaged cookie
		System.out.println("human tries to eat packaged cookie");
		human1.eat(cookie3, 50); 	
		System.out.println();
		
		//human tries to eat too much of a vegetable
		System.out.println("human tries to eat too much of a vegetable");
		human1.eat(vegetable1, 200); 	
		System.out.println();
		
		//human eats cookie to gain energy and weight
		System.out.println(human1.toString());
		System.out.println("\nhuman eats 10g out of the 50g cookie that has 200 calories");
		human1.eat(cookie2, 10);		
		System.out.println("\nAFTER EATING COOKIE\n");
		System.out.println(human1.toString());
	}

}
