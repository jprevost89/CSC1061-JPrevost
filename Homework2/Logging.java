// class to log program messages
public class Logging{ // start class Logging
   
   // start programIntroduction
   public void programIntroduction() {   
         
      System.out.println("This program will calculate the sizes and distances for a scale model of the solar system based on the user provided size of the sun in inches."
         + "\nFor example, enter 8 for a solar system based on an 8 inch sun.\n");
      
   } // end programIntroduction
   
   // start sunSizeInput
   public void sunSizeInput() {   
         
      System.out.print("Enter the size of the sun (in inches): ");
      
   } // end sunSizeInput
   
   // end dimensionsOutput
   public void dimensionsOutput(double userInput) {   
         
      System.out.println("\n\nSCALE MODEL DIMENSIONS - sun: " + userInput + " inches\n");
      
   } // end dimensionsOutput
   
   // end exceptionMessage
   public void exceptionMessage() {   
         
      System.out.println("Input must be an number with a value greater than zero, less than 20000, and contain no special characters. Printing default values.\n");
      
   } // end exceptionMessage
   
   // end labelOutput
   public void labelOutput() {   
         
      System.out.println("                     diameter:       distance:\n"
         + "                     (inches)        (inches)        (feet)          (yards)         (miles)");
      
   } // end labelOutput
   
   // end endMessage
   public void endMessage() {   
         
      System.out.print("\n\nPress Enter to exit program . . . ");
      
   } // end endMessage
   
} // end class Logging