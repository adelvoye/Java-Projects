//Adele Delvoye
//4.16.2020
//Assessment #2 Part III
//Tire2- comparing pressure inputs and outputing results

import java.util.*;

public class Tire2 
{
   public static void main(String[] args) 
   { 
   
      Scanner scan = new Scanner(System.in);
      //prompt user for right front pressure and read in
      
      System.out.print("Please input right front pressure: ");
      double right_front = scan.nextDouble();
      
      //prompt user for left front pressure and read in
      
      System.out.print("Please input left front pressure: ");
      double left_front = scan.nextDouble();
      
      //prompt user for right rear pressure and read in
      
      System.out.print("Please input right rear pressure: ");
      double right_rear = scan.nextDouble();
      
      //prompt user for left rear pressure and read in
      
      System.out.print("Please input left rear pressure: ");
      double left_rear = scan.nextDouble();
   
      //calcuate difference in front and rear pressure and store in variables
      
      double front_tires = Math.abs(right_front - left_front);
      double rear_tires = Math.abs(right_rear - left_rear);
   
      //compare difference in front/rear pressure and determine output
   
      if ((front_tires <= 3)&&(rear_tires <= 3)) {
         System.out.print("Inflation is OK.");
      } else {
         System.out.print("Inflation is NOT OK.");
      
      }
          
      
   }
}