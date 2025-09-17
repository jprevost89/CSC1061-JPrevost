/**
 * Calc.java
 * @author Jon Prevost
 * @since September 17, 2025
 */
import java.util.Scanner;
  
/**
 * Driver class for the Calc project.
 * Creates instance of ArrayStack and Scanner and check user inputs
 */
class Calc { // start Calc class

   public static void main (String[] args) { // start
      ArrayStack stack = new ArrayStack();
      Scanner scn = new Scanner(System.in);
     
      while(true) { // start while loop
         String userInput = scn.next();
         
         /**
          *  when user inputs "!" the program ends
          */
         if (userInput.equals("!")) {
            break;
         }
         
         /**
          *  pop the top element off the stack and print only that element followed by a new line
          */
         else if (userInput.equals("^")) {
            System.out.println(stack.pop() + "\n");
         }
         
         /**
          *   print state of stack using its toString method followed by a new line
          */
         else if (userInput.equals("?")) {
            System.out.println(stack.toString());
         } 
         
         /**
          *  pop two integers off the stack, perform the requested operation
          *  and push the result back onto the stack
          */
         else if (isOperator(userInput)) {
            if (stack.size() >= 2) {
               int b = stack.pop();
               int a = stack.pop();
               int result = 0;
               switch(userInput) {
                  case "+":
                     result = a + b;
                     break;
                  case "-":
                     result = a - b;
                     break;
                  case "*":
                     result = a * b;
                     break;
                  case "/":
                     result = a / b;
                     break;
                  case "%":
                     result = a % b;
                     break;
               }
               stack.push(result);
            } else {
               System.err.println("Not enough stored integers in ArrayStack");
            }
         }
         
         else {
            try {
               int num = Integer.parseInt(userInput);
               stack.push(num);
            } catch (NumberFormatException e) {
               System.err.println("Error: Invalid input '" + userInput + "'");
            }
         }
      } // end while loop
      
      scn.close();
   } // end
   
  /**
   * Helper method to validate if input is an operator
   */
   public static boolean isOperator(String input) { // start method isOperator
      return input.equals("+") 
         || input.equals("-") 
         || input.equals("*") 
         || input.equals("/") 
         || input.equals("%");  
   } // end method isOperator

} // end class Calc