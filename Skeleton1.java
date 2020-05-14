//Final Assessment question 1
//Dec 2019
//Follow the directions specified in the comments
// Adele Delvoye

public class Skeleton1 {
	public static void main(String[] args) {
		String input = "Happy Holidays!";       // this is the input string
      System.out.println("The input string is " + input);
        // call the method reverseTheString, it requires the input parameter, and will return the reversed, uppercase string
        String reverse = reverseTheString(input);
       
       

        // write the output statement below that displays the reversed, uppercase input string
        
        String reverseUpper = reverse.toUpperCase();
        System.out.print("The backwards string is" + reverseUpper);
        

        // write the method reverseTheString below
  }      
     public static String reverseTheString(String str){
     // String str = input;
      String reversed = " ";
      for (int i = str.length()-1; i >=0; i--) {
            reversed += str.charAt(i);
      }
      
      return reversed;
     
     
     }
         
     
     

     


	

}