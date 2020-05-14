//Adele Delvoye
//5.7.2020
//Lottery Extra Credit: Loops, Arrays, If-else, Oh my!

import java.util.Scanner;

public class Lottery {

   public static int[] UserChoices() {         //method that creates array from user input
      
         Scanner scan = new Scanner(System.in);
         System.out.print("Please pick six numbers (1-60): "); 
         int[] num_choices = new int[6];                //declare array
         
         for (int i = 0; i < 6; i++) {               //read in user input and store in array
            num_choices[i] = scan.nextInt(); 
         } 
         return num_choices;
   }
           
   public static void main(String[] args) {
   
         System.out.println("Feeling lucky? \nLet's play the lottery!!\n");   //pumping up the audience
         
         final int jackpot = 10000;                      //constant variable for prize
         int[] winning_nums = new int[6];
         
         for (int i = 0; i < 6; i++) {                                   
            winning_nums[i] = 1 + (int)(Math.random() * ((60-1) +1));       //generating random integers 1-60 for winning numbers
         }
      
         int[] num_choices = new int[6];
         num_choices = UserChoices();                                //UserChoice method to get user choices array               
         
         for (int i =0; i<6; i++) {   
           while ((num_choices[i] < 1) || (num_choices[i] > 60)){    //verifying that user input is in correct range
                  System.out.println("Bad entries. Try again. ");                 
                  num_choices = UserChoices();                       //if user input is not in range, continue until it is in range
                  break;
            }    
         }          
         
         int matches = 0;
                                                                     //checking to see if the user choices match any winning numbers                                                                  
         for (int x = 0; x < 6; x++) {                               //I am sure there is a better way to do this but I settled for a tedious if-else statment
              if (num_choices[x]== winning_nums[0]) {
                  matches++;                 
              } else if (num_choices[x]==winning_nums[1]) {
                  matches++;
              } else if (num_choices[x]==winning_nums[2]) {
                  matches++;
              } else if (num_choices[x]==winning_nums[3]) {
                  matches++;
              } else if (num_choices[x]== winning_nums[4]) {
                  matches++;
              } else if (num_choices[x]== winning_nums[5]) {
                  matches++;
              }
                         
         } 
                      
         System.out.println("The user entered: " + num_choices[0] + " " + num_choices[1] + " " + num_choices[2] +    //displaying user choices and winning numbers
                              " " + num_choices[3] + " " + num_choices[4] + " " + num_choices[5]);
         System.out.println("The winning numbers are: " + winning_nums[0] + " " + winning_nums[1] + " " + winning_nums[2] +
                              " " + winning_nums[3] + " " + winning_nums[4] + " " + winning_nums[5]);
         
          if (matches < 2) {
               System.out.print("Sorry, you didn't win.");      //determing prize based on number of matches and displayng results
          } else if (matches == 2) {
               System.out.print("You won $10.00!");
          } else if (matches==3) {
               System.out.print("You won $" + (jackpot*.25) + "!");
          } else if (matches==4) {
               System.out.print("You won $" + (jackpot*.33) + "!");
          } else if (matches==5) {
               System.out.print("You won $" + (jackpot*.5) + "!");
          } else {
               System.out.print("You won $" + jackpot + "!");
          }
           
   }
}

           
            
           
                 
          
          
 
        
            
       
         
   

      
      
      
      
   
