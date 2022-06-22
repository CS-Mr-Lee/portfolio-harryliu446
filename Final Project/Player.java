package ICS4U1;

/**
 * Name: Lucas Lu Date: June 20 2022 Description: This class ask players for
 * their own account information and also declare a method to compare the users'
 * input password and correct password in their account. In addition, there is a
 * method will calculate the win rate if there exis win, lose , or ties
 * conditions
 */
public class Player {

	// user account attributes
	static String username;
	static String password;
	static int wins, losses, ties;
	static double winrate;

	/**
	 * initialize the attribute values
	 * 
	 * @param username String the username of user's account
	 * @param password String the password of user's account
	 */
	public Player(String username, String password) {
		this.username = username;
		this.password = password;
		this.wins = this.losses = this.ties = 0; // set all win, lose and ties condition as 0
		this.winrate = 0.0;
	}

	/**
	 * Compare the true password with user's input password
	 * 
	 * @param password String the password user input
	 * @return true/false boolean if it is same as correct password, return true. If
	 *         it is not, return false
	 */
	public boolean login(String password) {
		if (this.password.equals(password)) {
			return true;
		}
		return false;
	}

	/**
	 * calculate the win rate
	 * 
	 * @return winrate / 0 double if there is win,lose, and ties，return the win rate
	 *         through formula. if not return 0
	 */
	public double getWinrate() {
		if (wins + losses + ties != 0) {
			return winrate = (wins / (double) (wins + losses + ties)) * 100.0;
		}
		return 0;
	}

	/**
	 * return the information
	 * 
	 * @return String return all information in the class
	 */
	public String toString() {
		return "You have: \n" + wins + " wins\n" + losses + " losses\n" + ties + " ties\n" + getWinrate() + "% winrate";
	}

}
