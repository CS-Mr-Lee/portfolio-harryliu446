package Unit2ObjectOrientedProgramming4Quiz;

/**
 * Name: Harry Liu
 * Description: Test class for the Human, Vegetable, and Cookie class
 * Date: Mar 1 2022
 */
public class Liu_Harry_OOQuiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//initializing variables
		String HUMAN_NAME = "Bob";
		
		Human human1 = new Human (HUMAN_NAME, 50, 100);
		Vegetable vegetable1 = new Vegetable ("vegName1", 100, 200);
		Cookie cookie1 = new Cookie ();
		Cookie cookie2 = new Cookie ("CookieName2", 50, 200);
		Cookie cookie3 = new Cookie ("CookieName3", 100, 1000, true);	//packaged cookie
		
		//human tries to eat packaged cookie
		human1.eat(cookie3, 50); 	
		System.out.println();
		
		//human tries to eat too much of a vegetable
		human1.eat(vegetable1, 200); 	
		System.out.println();
		
		//human eats cookie to gain energy and weight
		System.out.println(human1.toString());
		human1.eat(cookie2, 10);		
		System.out.println("\nAFTER EATING COOKIE\n");
		System.out.println(human1.toString());
		
	}

}
