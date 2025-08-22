import java.util.Arrays;

public class MatchFunction { // start class MatchFunction

   // start matchForLottery
   public int matchForLottery(int[] draws, int[] guesses) {     
      
      int tracker = 0;
      int matches = 0; /* track matches separate from main flow to account for 
                          3-of-a-kind and duplicate values in guesses and draws */
     
      if ( Arrays.equals(draws, guesses)) { // Direct comparison for perfect win. Skips match iteration | example { 1, 2, 3 } and { 1, 2, 3 }
         return tracker;
      } 
      
      Arrays.sort(draws);
      Arrays.sort(guesses);
      
      if ( Arrays.equals(draws, guesses)) { // Direct comparison for any 3 matches. Skips match iteration | example { 3, 2, 1 } and { 1, 2, 3 }
         return tracker = 3;
      } 
      
      // if any duplicates exist in guesses, add three to matches
      if( guesses[0] == guesses[1] || guesses[0] == guesses[2] || guesses[1] == guesses[2] ) { 
         tracker += 3;
      }
      
      // if all values in guesses match, add five to matches
      if( guesses[0] == guesses[1] && guesses[1] == guesses[2] ) { 
         tracker += 5;
      }
      
      // if any duplicates exist in draws, add three to matches
      if( draws[0] == draws[1] || draws[0] == draws[2] || draws[1] == draws[2] ) { 
         tracker += 3;
      }
      
      // if all values in draws match, add five to matches
      if( draws[0] == draws[1] && draws[1] == draws[2] ) { 
         tracker += 5;
      }
      
      matches += this.matchTracker(draws, guesses[0]);
      tracker += this.matchTracker(draws, guesses[0]);
      
      matches += this.matchTracker(draws, guesses[1]);
      tracker += this.matchTracker(draws, guesses[1]);
      
      matches += this.matchTracker(draws, guesses[2]);
      tracker += this.matchTracker(draws, guesses[2]);
      
      tracker = ( matches == 0 ) ? -1 : tracker;  /* if statement to catch scenario when 'matches' is 0, but 'tracker' has a value >= 1  
                                                     example: { 2, 2, 1 } and { 4, 4, 4 } has no 'matches' but 'tracker' will equal 11 due to duplicates/three-of-a-kind */
      
      return tracker;
      
    } // end matchForLottery
    
    // start matchTracker
    public int matchTracker(int[] draws, int guesses) { // iterates matchTracking for each value in draw that is matched by guesses[x]
      int matchTracking = 0;
      if ( guesses == draws[0] ) {
         matchTracking += 1;
      }
      
      if ( guesses == draws[1] ) {
         matchTracking += 1;      
      }
      
      if ( guesses == draws[2] ) {
         matchTracking += 1; 
      }
      
      return matchTracking;
   } // end matchTracker
   
} // end class MatchFunction