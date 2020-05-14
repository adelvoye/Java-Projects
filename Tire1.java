//Adele Delvoye
//4.16.2020
//Assessment #2 Part III
//Tire1-comparing inputs to determine output

import java.util.*;

public class Tire1
{
   public static void main(String[] args)
   {
   
      Scanner scan = new Scanner(System.in);
      //prompt user for right front pressure and read in answer
      
      System.out.print("Please input right front pressure: ");
      double right_front = scan.nextDouble();
      
      //promt user for left front pressure and read in answer
      
      System.out.print("Please input left front pressure: ");
      double left_front = scan.nextDouble();
      
      //prompt user for right rear pressure and read in answer
      
      System.out.print("Please input right rear pressure: ");
      double right_rear = scan.nextDouble();
      
      //prompt user for left rear pressure and read in answer
      
      System.out.print("Please input left rear pressure: ");
      double left_rear = scan.nextDouble();
      
      //compare pressure measurements and output appropriate response
      
      if ((right_front==left_front)&&(right_rear==left_rear)) {
         System.out.print("Inflation is OK.");
      } else {
         System.out.print("Inflation is NOT OK.");
        }
   
   }
}