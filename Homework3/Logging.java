import java.util.Scanner;

// class to log console messages
public class Logging {
   Scanner scnr = new Scanner(System.in);

   // start programIntroduction
   public void programIntroduction() {   
         
      System.out.println("Guess the 3 numbers I have chosen - between 0 and 9.\n"
                        +"Guess 1 right                       $10\n"
                        +"Guess 2 right                      $100\n"
                        +"Guess 3 right (any order)        $1,000\n"
                        +"Guess 3 right (exact order)  $1,000,000\n");
      
   } // end programIntroduction
   
   // start userComputerInputs
   public void userComputerInputs(int[] draws, int[] guesses) {   
         
      System.out.println("Computer picks: " + draws[0] + " " + draws[1] + " " + draws[2] + " You guessed: " + guesses[0] + " " + guesses[1] + " " + guesses[2] + "\n");
      
   } // end userComputerInputs
   
   // start inputFilter
   public int inputFilter( String sequence ) {
      int guess;
      while (true) {
         System.out.print("Enter the " + sequence + " number: ");
   
         try {
            guess = scnr.nextInt();
            if( guess < 10 && guess >= 0) {
               break;
            }
            System.out.println("Invalid input.\nInput a number between 0-9");
         } catch (Exception e) {
            System.out.println("Invalid input.\nInput a number between 0-9");
            scnr.nextLine();
         }
      }
      return guess;
   } // end inputFilter
   
   // start userInputs
   public int[] userInputs() {
   
      int firstGuess = this.inputFilter("1st");
      int secondGuess = this.inputFilter("2nd");
      int thirdGuess = this.inputFilter("3rd");
      
      int[] guesses = { firstGuess, secondGuess, thirdGuess };
      
      return guesses;
   } // end userInputs
   
   // end results
   public void results(int result) {   
      
      switch(result) { // start switch-case
         case -1:
            System.out.println("No luck this time. Try again");
            break;
         case 0:
            System.out.println("Perfect match, you win $1,000,000");
            break;
         case 1:
            System.out.println("1 Match, you win $10");
            break;
         case 2:
            System.out.println("2 Matches, you win $100");
            break;
         case 3:
            System.out.println("Any 3 Matches, you win $1,000");
            break;
      }// end switch-case
      
   } // end results
   
} // end class Logging