/* Adele Delvoye
4.22.2020 */

// this program will not work correctly until the methods are complete!

// you should also modify this so that the menu options are exactly the same as the specs (on the pdf docoument)

import java.util.Scanner;
import java.util.Random;

public class PasswordProgram {
	public static void main(String[] args) {
		// Create an instance of Scanner
		Scanner scan = new Scanner(System.in);
		// Call the method 'displayMenu()' to show the menu to the user
		displayMenu();
		// Read in input from user and assign to 'choice'
		int choice = scan.nextInt();
      // IF-ELSE statements

   	if (choice == 1) {

			showPasswordSpecifications();

		} else if (choice == 2) {

		    	System.out.println("\nYour password is: " + generateRandomPassword());

	   } else if (choice == 3) {

		    	System.out.println("\nEnter a password to test: ");
			   scan.nextLine();
			   String pswd = scan.nextLine();
            boolean v = verifyPasswordSpecifications(pswd);
            

			   if (v == true) {

			   	System.out.println("\nYour password is valid.");

			   } else {

				   System.out.println("\nYour password is invalid");

			}

		} else {

			System.out.println("Sorry! That was an invalid option.");

		}

        // Be good to your scanners! Close them..
        //
		scan.close();

	}

	//Below  are your methods that you must code!

	static void displayMenu() {
      
      System.out.print("Here is your menu of options:" + 
                        "\n1. See the password rules" +
                        "\n2. Generate a random password" +
                        "\n3. Test the validity of a password" +
                        "\n\nPlease make your selection: ");
      
         

	}

	static String generateRandomPassword() {
      
      Random rand = new Random();
      int digits = 0;
      String rand_lower = "abcdefghijklmnopqrstuvwxyz";
      String rand_upper = rand_lower.toUpperCase();
      String rand_int = "1234567890";
      String rand_char = "!#$%&'()*+,-./)";
      String password = "";
      
      while (password.length() < 2) {
         password = password + rand_lower.charAt(rand.nextInt(rand_lower.length()));
      
      }
      while (password.length() < 4) {
         password = password + rand_upper.charAt(rand.nextInt(rand_upper.length()));
      }
      while (password.length() < 6) {
         password = password + rand_int.charAt(rand.nextInt(rand_int.length()));
      }
      while (password.length() < 8) {
         password = password + rand_char.charAt(rand.nextInt(rand_char.length()));
      }
         
      

      return password;  // return the generated password

	}

	static void showPasswordSpecifications() {
	
      System.out.println("\nThe rules for your password are:\n" +
                        "\n1. It must be 8 characters long" +
                       "\n2. The first two characters are lowercase letters" +
                        "\n3. The second two characters are uppercase letters" +
                        "\n4. The third two characters are numbers (0 - 9)" +
                        "\n5. The fourth two characters are any valid character (valid characters are any of these 15 " +
                        "characters: ! " + "#$%&'()*+,-./)");




	}

	static boolean verifyPasswordSpecifications(String input) {
		// PRE-CONDITIONS: The main program will pass in a String (the password to be verified)
		// POST-CONDITIONS: "true" will be returned if the parameter "input" is
		// a valid password, as per the specifications. "false" will be returned otherwise
		//
		// please remove the next line when done, it is used for debugging
      
      String pswd = input;
      boolean v = false;
     
      char one = pswd.charAt(0);
      char two = pswd.charAt(1);
      char three = pswd.charAt(2);
      char four = pswd.charAt(3);
      char five = pswd.charAt(4);
      char six = pswd.charAt(5);
      int seven = (int)(pswd.charAt(6));
      int eight = (int)(pswd.charAt(7));
      

      if (pswd.length() != 8) {
         v = false; 
      } else if ((!Character.isLowerCase(one)) || (!Character.isLowerCase(two))) {
          v = false;
         
      } else if ((!Character.isUpperCase(three)) || (!Character.isUpperCase(four))) {
          v = false;
        
      } else if ((!Character.isDigit(five)) || (!Character.isDigit(six))) {
          v = false;
         
      } else if ((seven < 33) || (seven > 47)) {
          v = false;
         
      } else if ((eight < 33) || (eight > 47)) {
          v = false;
         
      } else {
          v = true;
          
      }
      
      return v;

	}

}