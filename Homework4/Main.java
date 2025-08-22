/*
Jon Prevost
Feb 10, 2025
*/

class Main { // start class Main
   public static void main(String[] args) { // start main
      
      
      InterestCalculator calc = new InterestCalculator();
      Logging mssg = new Logging();

      int run = 1;
      
      while( run == 1 ) { // execute if 'run' value is 1
      
         calc.interestCalculator(); // core method
         run = mssg.rerunQuestion(); // prompt for rerun
         
      }
      
      mssg.endRun();
      
   } // end main
} // end class Main