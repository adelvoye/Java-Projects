//Adele Delvoye
//5.4.2020
//Increments

import java.util.Scanner;

public class Increments {
   public static void main(String[] args) {
   
      Scanner scan = new Scanner(System.in); //create scanner
      System.out.print("Please enter the initial number: "); //prompt and read in starting number
      int num = scan.nextInt();
      System.out.print("Please enter the ending number: "); //prompt and read in ending number
      int end = scan.nextInt();
      System.out.print("Please enter the incrementor: ");//prompt and read incrementor
      int incr = scan.nextInt();
     
      
      for (int i = num; i <= end; i = i+incr ) {    //for loop to output increments from start number to end number
         System.out.println(i);
        
      } 
   
      scan.close();
   
   }
}