package application;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		/*
		 * Commenting out the below in order to do the coding challenge
		 * 
		 * Scanner scanner = new Scanner(System.in);
		 * 
		 * //In this case, the boolean is a flag //A flag is usually a binary value used
		 * to control //the program
		 * 
		 * 
		 * boolean gotCodeword = false;
		 * 
		 * for (;;) { System.out.print(" > "); String input = scanner.nextLine();
		 * 
		 * if (input.equals("quit")) { break; } else if (input.equals("volcano")) {
		 * gotCodeword = true; } }
		 * 
		 * scanner.close();
		 * 
		 * if (gotCodeword) { System.out.println("Codeword entered."); } else {
		 * System.out.println("No codeword detected."); }
		 * 
		 */

		/*
		 * Coding challenge Create a program that asks for the user's password If they
		 * type the correct password, print 'Access granted' and end the program If they
		 * type the wrong password, print 'Incorrect password' and ask for the password
		 * again. If they type the wrong password three times, print 'Access denied' and
		 * end the program.
		 */

		/*
		 * final String PASSWORD = "secure";
		 * 
		 * Scanner scanner = new Scanner(System.in); String userInput = null; int
		 * counter = 0; System.out.print("Enter your password: ");
		 * 
		 * do { userInput = scanner.nextLine();
		 * 
		 * if(!userInput.equals(PASSWORD)) { System.out.println("Incorrect password");
		 * counter++; }
		 * 
		 * else if (userInput.equals(PASSWORD)){ System.out.println("Access granted");
		 * break; }
		 * 
		 * } while(counter < 3); scanner.close();
		 * 
		 * if (counter == 3) { System.out.println("Access denied"); }
		 */
		
		//Alternate solution to coding challenge
		
		final String PASSWORD = "secure";
		Scanner scanner = new Scanner(System.in);
		boolean accessDenied = true;
		String userInput = null;
		System.out.println("Enter your password: ");
		
		for(int i = 0; i < 3; i++) {
			userInput = scanner.nextLine();
			
			if (userInput.equals(PASSWORD)) {
				System.out.println("Access granted");
				accessDenied = false;
				break;
			} else {
				System.out.println("Incorrect password");
			}
		}
		scanner.close();
		
		if(accessDenied) {
			System.out.println("Access denied");
		}
	}
}
