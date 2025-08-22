/* 
Jon Prevost
March 4, 2025
*/

class GPSConverter { // start class GPSConverter

   public static void main(String[] args) { // start
      Logging out = new Logging();
      Conversions conv = new Conversions();
      
      int run = 1;
      while(run == 1) { // start while-loop
      
         int[] degreeArray = new int[3]; // array to store degree, minutes, and seconds
         
         out.introduction();
                           
         int selection = out.menuSelect(); // select menu option
         
         if( selection == 1) { // Degree to Decimal Selection
            degreeArray = out.degreeInput();
            
            double decimalResult = conv.degreeToDecimal(degreeArray);
            
            char direction = out.directionInput();
            
            out.decConversionResult(decimalResult);
         }
         
         if( selection == 2) { // Decimal to Degree Selection
            /* 
               The whole number is degrees.
               Multiply the remaining decimal by 60.
               The whole number is minutes.
               Multiply the remaining decimal by 60.
               The float number is seconds.
            */
            double decimalValue = out.decimalInput();
            
            String[] splitDegrees = conv.stringSplit(decimalValue);
           
            String degreeResult = splitDegrees[0];
            double degreeRemainder = Double.parseDouble("." + splitDegrees[1]);
            
            double minutesValue = (degreeRemainder * 60);
   
            String[] splitMinutes = conv.stringSplit(minutesValue);
            
            String minuteResult = splitMinutes[0];
            double minuteRemainder = Double.parseDouble("." + splitMinutes[1]);
            
            double secondResult = (minuteRemainder * 60);
            
            out.degreeConversionResult(degreeResult, minuteResult, secondResult);
         }
        
         run = out.runAgain(); // 1 to run again
         
      } // end while-loop
      
   } // end
   
} // end class GPSConverter