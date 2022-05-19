package ICS4U1;

/**
 * Name: Harry Liu
 * Date: May 12, 2022
 * Description: This class contains all the attributes of the teacher supervisor
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TeacherSupervisor {

	/**
	 * The name of the teacher
	 */
	private String name;

	/**
	 * The department that the teacher is in
	 */
	private String department;

	/**
	 * The email of the teacher
	 */
	private String email;

	/**
	 * The phone number of the teacher
	 */
	private String phoneNum;

	/**
	 * Name: TeacherSupervisor
	 * Description: Constructor for the TeacherSupervisor class
	 * @param name - String value for the name of the teacher
	 * @param department - String value for the department of the teacher
	 * @param email - String value for the email of the teacher
	 * @param phoneNum - String value for the phone number of the teacher
	 */
	public TeacherSupervisor(String name, String department, String email, String phoneNum) {
		this.name = name;
		this.department = department;
		this.email = email;
		this.phoneNum = phoneNum;
	}

	/**
	 * Name: TeacherSupervisor
	 * Description: Basic constructor for the TeacherSueprvisor class
	 */
	public TeacherSupervisor() {
		this.name = "unknown";
		this.department = "";
		this.email = "";
		this.phoneNum = "";
	}

	/* Accessors and Mutators */
	/**
	 * Name: getName
	 * Description: gets the name of the teacher
	 * @return - String value for the name of the teacher
	 */
	public String getName() {
		return name;
	}

	/**
	 * Name: getDepartment
	 * Description: gets the department of the teacher
	 * @return - String value for the department of the teacher
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * Name: getEmail
	 * Description: gets the email of the teacher
	 * @return - String value for the email of the teacher
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Name: getPhoneNum
	 * Description: gets the phone number of the teacher
	 * @return - String value for the phone number of the teacher
	 */
	public String getPhoneNum() {
		return phoneNum;
	}

	/**
	 * Name: setDepartment
	 * Description: This mutator method is used to set the department of the teacher
	 * @param newIsOn - String value that represents the new department of the teacher
	 */
	public void setDepartment(String newDepartment) {
		department = newDepartment;
	}

	/**
	 * Name: setEmail
	 * Description: This mutator method is used to set the email of the teacher
	 * @param newIsOn - String value that represents the new email of the teacher
	 */
	public void setEmail(String newEmail) {
		email = newEmail;
	}

	/**
	 * Name: setPhoneNum
	 * Description: This mutator method is used to set the phone number of the teacher
	 * @param newIsOn - String value that represents the new phone number of the teacher
	 */
	public void setPhoneNum(String newPhoneNum) {
		phoneNum = newPhoneNum;
	}
	
	/**
	 * Name: toString
	 * Description: Outputs the  attributes of the teacher supervisor and their details
	 * @return - a string value for the  attributes of the teacher and their details
	 */
	public String toString() {
		return "Name: " + name + "\nDepartment: " + department + "\nEmail: " + email + "\nPhoneNum: " + phoneNum;
	}
	
	/**
	 * Name: writeMemberInfo
	 * Description: Writes the attributes of the teacher supervisor into a file
	 */
	public void writeMemberInfo() {
		String fileName = name + ".txt";
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(fileName, false));
			out.write(toString());
			out.close();
		} catch (IOException e) {
			System.out.println("There was an issue opening or closing your file. Sorry :/ " + e);
		}
	}

	/**
	 * Name: readMemberInfo
	 * Description: Reads from files and outputs them
	 */
	public void readMemberInfo() {
		String fileName = name + ".txt";
		try {
			String strCurrentLine;
			BufferedReader in = new BufferedReader(new FileReader(fileName));
			while ((strCurrentLine = in.readLine()) != null) {
				System.out.println(strCurrentLine);
			}
			in.close();
		} catch (IOException e) {
			System.out.println("There was an issue opening or reading your file. Sorry :/ " + e);
		}
	}

}
