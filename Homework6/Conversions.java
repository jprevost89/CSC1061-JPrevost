class Conversions { // start class Conversions
   
   public double degreeToDecimal(int[] arr) { // start degreeToDecimal
      double decimalResult = arr[0] + (arr[1]/60.0) + (arr[2]/3600.0); // decimal degrees = degrees + (minutes / 60) + (seconds/3600)
      return decimalResult;
   } // start degreeToDecimal
   
   public String[] stringSplit(double decVal) {  // start stringSplit
      String stringDegrees = String.valueOf(decVal);
      String[] splitDegrees = stringDegrees.split("\\.");
      return splitDegrees;
   } // end stringSplit
   
} // end class Conversions