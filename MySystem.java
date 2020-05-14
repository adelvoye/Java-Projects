//Adele Delvoye
//5.13.2020
//MySystem--Final Assessment Part 2

import java.util.Scanner;

public class MySystem {
   public static void main(String[] args) {
     
      System.out.println("Welcome to My System!\n");  //user greeting
                           
      int choice = mainMenu();  //calls method that displays options and returns users selection
      
       while (choice != 3) {    //calls the appropriate method based on user's choice, when method is complete, prompts user for next selection
            if (choice == 1) {
               addNumbers();
               choice = mainMenu();
            } else if (choice == 2) {
               subNumbers();
               choice = mainMenu();    
            } else {
               System.out.println("Invalid selection. Please try again.\n");
               choice = mainMenu();
            }
        }
    
        if (choice == 3) {                        //program ends if user selects 3
             System.out.print("Goodbye.");
        }
       
   }
     
         
   
   public static void addNumbers() {      //method that prompts user for two numbers then adds them together and displays sum
   
      Scanner scan = new Scanner(System.in);
      System.out.print("Please enter the first number: ");
      int num1 = scan.nextInt();
      System.out.print("Please enter the second number: ");
      int num2 = scan.nextInt();
      
      int sum = num1 + num2;
      System.out.println("The sum is " + sum + "\n");
      
   }
      
   public static void subNumbers() {                    //method prompts user for two numbers, subtracts, then displays difference
      Scanner scan = new Scanner(System.in);
      System.out.print("Please enter the first number: ");
      int numb1 = scan.nextInt();
      System.out.print("Please enter the second number: ");
      int numb2 = scan.nextInt();
      int diff = numb1-numb2;
      System.out.println("The difference is " + diff + "\n");
    
   
   }
   
   public static int mainMenu() {        //method displays menu selections and reads in user's choice
   
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter the number of the option you wish to run!" +
                          "\n\n1-Add 2 numbers\n2-Subtract 2 numbers\n3-Exit this Program");
                          
      int selection = scan.nextInt();
      return selection;
   
   }
          
           
         
   
 }