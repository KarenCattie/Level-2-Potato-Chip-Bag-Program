/* Student Name: Yalin Su
 * Lab Professor: Gustavo Adami
 * Due Date: July 29, 2022
 * Modified: July 29, 2022
 * Description: this is a class is built that contains worker method 
 * for user input, and used for support the run time of Assignment02
 * 
 */
import java.util.Scanner;

/*
 * class user contains worker methods of user input and message output
 */
public class User {
	
	private Scanner keyboard = new Scanner(System.in);

	/*
	 * worker method of user input for integer variable
	 */
	public int inputInteger() {
		int value = keyboard.nextInt();
		keyboard.nextLine();
		return value;
	}
	
	/*
	 * worker method of message output for integer user input
	 */
	public int inputInteger(String message) {
		System.out.println(message);
		int value = inputInteger();
		return value;
	}
	
	/*
	 * worker method of user input for double variable
	 */
	public double inputDouble() {
		double value = keyboard.nextDouble();
		keyboard.nextLine();
		return value;	
	}
	
	/*
	 * worker method of message output for double user input
	 */
	public double inputDouble(String message) {
		System.out.println(message);
		double value = inputDouble();
		return value;
	}
}