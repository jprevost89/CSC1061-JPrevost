/*
Jon Prevost
Jan 28, 2025
*/

import java.util.Scanner;

public class SolarSystem { // start class SolarSystem
   // start
   public static void main(String[] args) {
   
      Scanner scnr = new Scanner(System.in);
      Logging logMessage = new Logging();
      
      // start defining CONSTANTS for planet diameter and distance from Sun in scientific notation
      final double sunDiameter = 8.7E5;

      final double mercuryDiameter = 3E3;
      final double mercuryDistance = 3.6E7;
      
      final double venusDiameter = 7.5E3;
      final double venusDistance = 6.72E7;
      
      final double earthDiameter = 8E3;
      final double earthDistance = 9.3E7;
      
      final double marsDiameter = 4.222E3;
      final double marsDistance = 1.416E8;
      
      final double jupiterDiameter = 8.6881E4;
      final double jupiterDistance = 4.836E8;
      
      final double saturnDiameter = 7.5E4;
      final double saturnDistance = 8.867E8;
      
      final double uranusDiameter = 3.176E4;
      final double uranusDistance = 1.784E9;
      
      final double neptuneDiameter = 3.0775E4;
      final double neptuneDistance = 2.7944E9;
      
      final double plutoDiameter = 1.4E3;
      final double plutoDistance = 3.6745E9;
      // stop defining CONSTANTS for planet diameter and distance from Sun in scientific notation
      
      double sunDiameterInches = 0.0; // set value for use in a 'try catch' statement
      
      // create instance of every planet in the Solar System that calculates feet, yard, and inch values based off CONSTANT inputs for planet diameter and distance from Sun
      Planet mercury = new Planet("Mercury", mercuryDiameter, mercuryDistance);
      Planet venus = new Planet("Venus", venusDiameter, venusDistance);
      Planet earth = new Planet("Earth", earthDiameter, earthDistance);
      Planet mars = new Planet("Mars", marsDiameter, marsDistance);
      Planet jupiter = new Planet("Jupiter", jupiterDiameter, jupiterDistance);
      Planet saturn = new Planet("Saturn", saturnDiameter, saturnDistance);
      Planet uranus = new Planet("Uranus", uranusDiameter, uranusDistance);
      Planet neptune = new Planet("Neptune", neptuneDiameter, neptuneDistance);
      Planet pluto = new Planet("Pluto", plutoDiameter, plutoDistance);
      
      logMessage.programIntroduction(); // Message introducing function of program
      
      try { // implement try catch to throw a custom error if an invalid input is registered
      
         logMessage.sunSizeInput(); // Give user input criteria
         sunDiameterInches = scnr.nextDouble(); // user input value
          
         if (sunDiameterInches > 0 && sunDiameterInches < 20000) { // if statement to handle inputs less than or equal to zero and greater than or equal to 20000 to reduce unexpected results
      
            double sunDiameterRatio = (sunDiameterInches / 12.0 / 5280.0) / sunDiameter; 
            // convert sunDiameterInches from inches to miles, and then divide by CONSTANT sunDiameter
             
            // run conversion method against stored values in each Planet class 
            mercury.convertToSunRatio(sunDiameterRatio);
            venus.convertToSunRatio(sunDiameterRatio);
            earth.convertToSunRatio(sunDiameterRatio);
            mars.convertToSunRatio(sunDiameterRatio);
            jupiter.convertToSunRatio(sunDiameterRatio);
            saturn.convertToSunRatio(sunDiameterRatio);
            uranus.convertToSunRatio(sunDiameterRatio);
            neptune.convertToSunRatio(sunDiameterRatio);
            pluto.convertToSunRatio(sunDiameterRatio);
       
            logMessage.dimensionsOutput(sunDiameterInches); // log user input
               
         } else {
         
            logMessage.exceptionMessage(); 
            // logs exception and prints default values in scientific notation
         
         } // end if else

      } catch (Exception e) {
      
         logMessage.exceptionMessage(); 
         // logs exception and prints default values in scientific notation

      } // end try catch
      

      logMessage.labelOutput(); // log measurement label table
      
      // call planet method formatPlanetValues to return formatted Planet values in print statement
      System.out.println(mercury.formatPlanetValues());
      System.out.println(venus.formatPlanetValues());
      System.out.println(earth.formatPlanetValues());
      System.out.println(mars.formatPlanetValues());
      System.out.println(jupiter.formatPlanetValues());
      System.out.println(saturn.formatPlanetValues());
      System.out.println(uranus.formatPlanetValues());
      System.out.println(neptune.formatPlanetValues());
      System.out.println(pluto.formatPlanetValues());
 
      
      logMessage.endMessage(); // Log end program request
      
      try { //experiment with "Press button to continue"
      
         System.in.read();
 
      } catch ( Exception e ) {} // end try catch
      
   } // end main()
   // stop
} // end class SolarSystem