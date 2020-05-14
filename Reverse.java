//Adele Delvoye
//5.7.2020
//Reversing Arrays

import java.util.Scanner;



public class Reverse {
   public static void main(String[] args) {
      
      int[] numbers = new int[10];              //declare two arrays: one for user input and one for reversed elements
      int[] reverse_nums = new int[10];
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter the numbers: ");   //read in user input and load values into array
      for (int i  = 0; i < 10; i++) {
         numbers[i] = scan.nextInt();
                   
      }
      
      for (int  a= 9, b=0; b < 10; a--, b++) {     //reversing elements from numbers array and load into reversed array 
         reverse_nums[a] = numbers[b];
         
      } 
      
      System.out.print("Numbers in reverse order: ");  
                                                         //displaying reversed integers
      for (int x = 0; x<10; x++) {
          System.out.print(reverse_nums[x] + " ");
      } 
            
      
      
   }
}