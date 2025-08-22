
public class LotteryProgram { // start class LotteryProgram

   public static void main(String[] args) { // start main
   
      MatchFunction mtch = new MatchFunction();
      Logging message = new Logging();
      
      int firstDraw = (int) ( Math.random() * 10);
      int secondDraw = (int) ( Math.random() * 10);
      int thirdDraw = (int) ( Math.random() * 10);
      int[] draws = { firstDraw , secondDraw , thirdDraw };
      int[] guesses;
      
      message.programIntroduction(); // message to introduce program paramaters
      
      guesses = message.userInputs(); // prompt for user inputs. returns array
      
      message.userComputerInputs(draws, guesses); // message to reveal user vs computer numbers
      
      int finalResult = mtch.matchForLottery(draws, guesses);
      /*
         For the purpose of this application, a 'duplicate' is any value that is represented in an array more than once. * Each array can only have one 'duplicate'
         A single duplicate will add '3' to the 'finalResult'. A three-of-a-kind will add an additional '5' to the 'finalResult'.
         The values of 'finalResult' are made up of the following:
            1 Match = 1 point | example: { 1, 2, 3 } and { 3, 4, 5 }, '3' from first array matches once with '3' from second array
            1 duplicate = 3 points | example: { 9, 9, 3 } and { 8, 7, 9 }, second '9' in first array is a 'duplicate'
            1 three-of-a-kind = 5 points | example: { 5, 5, 5 } and { 3, 2, 1 }, first array is a 'three-of-a-kind'
            1 duplicate match = 1  |  example: { 1, 2, 5 } and { 2, 3, 2 }, '2' in first array will match with both '2's from second array. Second match is a 'duplicate match'
      */
      switch(finalResult) { // start switch-case
         case -1: // No matches - determined in Matchfunction Class
            message.results(-1);
            break;
         case 0: // Perfect match - determined in Matchfunction Class
            message.results(0);
            break;
         case 1: // One match | example: { 3, 1, 2 } and { 1, 4, 5 } 
         case 4: // One match, one duplicate | example: { 1, 1, 2} and {2, 3, 4}
         case 5: // One match, one duplicate, one duplicate match | example: { 1, 1, 2} and {4, 3, 1}
         case 7: // One match, two duplicates | example: { 1, 1, 2} and {2, 3, 3}
         case 8: // One match, two duplicates, one duplicate match | example: { 1, 1, 2} and {3, 3, 1}
         case 11: // One match, one three-of-a-kind, one duplicate, two duplicate matches | example: { 1, 1, 1} and {1, 2, 3}
         case 14: // One match, one three-of-a-kind, two duplicates, two duplicate matches | example: { 1, 1, 1} and {1, 2, 2}
            message.results(1);
            break;
         case 2: // Two matches | example: { 3, 1, 2 } and { 1, 2, 5 }
         case 6: // Two matches, one duplicate, one duplicate match | example: { 1, 1, 2} and {3, 2, 1}
         case 10: // Two matches, two duplicates, two duplicate matches | example: { 1, 1, 2} and {2, 2, 1}
         case 17: // Two matches, one three-of-a-kind, two duplicates, four duplicate matches | example: { 1, 1, 1} and {1, 1, 2}
            message.results(2);
            break;
         case 3: // Three matches - determined in Matchfunction Class
            message.results(3);
            break;
      } // end switch-case
      
   } // end main
   
} // end class LotteryProgram