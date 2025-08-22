// class to assign diameter and distance to planet
public class Planet{ // start class Planet

   public double diameter;
   public double distanceMiles;
   public double distanceYards;
   public double distanceFeet;
   public double distanceInches;
   private String planetName;
   
   // start Planet
   public Planet(String planetNameVar, double diameterScientificNotation, double distanceMilesScientificNotation) {
   
      this.planetName = planetNameVar;
      this.diameter = diameterScientificNotation * 1760 * 3 * 12; // convert input of diameter from miles to inches by multiplying input by yards in one mile, feet in one yard, and inches in one foot
      this.distanceMiles = distanceMilesScientificNotation; // assign miles from input
      this.distanceYards = this.distanceMiles * 1760; // convert miles into yards by multiplying by the amount of yards in one mile
      this.distanceFeet = this.distanceYards * 3; // convert yards into feet by multiplying by the amount of feet in one yard
      this.distanceInches = this.distanceFeet * 12; // convert feet into inches by multiplying by the amount of inches in one foot
      
   } // end Planet
   
   // start converToSunRatio
   public void convertToSunRatio(double sunDiameterRatio) { // take the calculated ratio of sunDiameterRatio - (sunDiameterInches / 12.0 / 5280.0) / sunDiameter - and multiply each value by the ratio
   
      this.diameter = Math.round((this.diameter * sunDiameterRatio) * 10000.0) / 10000.0;             //          
      this.distanceMiles = Math.round((this.distanceMiles * sunDiameterRatio) * 10000.0) / 10000.0;   // 
      this.distanceYards = Math.round((this.distanceYards * sunDiameterRatio) * 10000.0) / 10000.0;   // Math.round(x * 10000.0 / 10000.0) is used to reduce the decimal places to ten-thousandths to keep
      this.distanceFeet = Math.round((this.distanceFeet * sunDiameterRatio) * 10000.0) / 10000.0;     // the results consistent and any additional precision would likely be wasted for the application of this program
      this.distanceInches = Math.round((this.distanceInches * sunDiameterRatio) * 10000.0) / 10000.0; //
      
   } // end convertToSunRatio
   
   // start formatPlanetValues
   public String formatPlanetValues() { // take current planet values and convert them into a formatted string      
      
      String convertedValues = "         " 
         + String.format("%-12s", this.planetName) 
         + String.format("%-16s", this.diameter) 
         + String.format("%-16s", this.distanceInches) 
         + String.format("%-16s", this.distanceFeet) 
         + String.format("%-16s", this.distanceYards) 
         + String.format("%-16s", this.distanceMiles);
         
      return convertedValues;
      
   } // end formatPlanetValues
   
} // end class Planet