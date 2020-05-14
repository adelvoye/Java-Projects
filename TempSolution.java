//Adele Delvoye
//5.4.2020
//Modified Temp Program- while loop with sentinel


/*
	This program will read in temperature entered by user, determine whether water is a solid liquid or gas at the temperature entered.
	11/2018
   Follow directions in the comments, and get this to run correctly!
*/

import java.util.Scanner;

public class TempSolution
{
	public static void printTemp (double temperature)   // this is the method I will call, it can appear here, or after the main method it is
	                                                 // void, because it does not return anything, it needs an input parameter, replace the xxxxxxx here
	{
   
      
		if (temperature <= 32.0)
		{
			System.out.print("solid at ");
		}

		else if (temperature >= 212.0)
		{
			System.out.print("gas at ");
		}

		else
			System.out.print("liquid at ");

	}
	public static void printMess ()              //this is a void, non returning method, no input parameter needed
	{
	     System.out.print("\nWater is ");
	 }

	public static void main(String [] args)   // here is the main method, it is the special, most important method, it calls all other methods
	{
		//Create a scanner
		Scanner input = new Scanner(System.in);
		//Prompt user to enter temperature
		System.out.print("Please enter the temperature (Enter 999 to stop): ");
		int tt = input.nextInt();
		double temperature = tt;
      
      
      while (tt != 999) {
      
         
		   printMess ();                              // call the method that displays the beginning of the message (replace the xxxxxxxxx)

		   printTemp(tt);                // call the method which needs 1 parameter, temperature
		                                             // fill in the ---------- and xxxxxxxxxxxx here
		   System.out.println(tt+ " degrees.");
         
         System.out.print("\nPlease enter the temperature (Enter 999 to stop): ");
         
         tt = input.nextInt();
      }
      
      System.out.println("\nEnd of execution! Thanks for running my program!");
      
      
      



    }
}