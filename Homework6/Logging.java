import java.util.Scanner;

class Logging { // start class Logging


   Scanner scnr = new Scanner(System.in);
   
   public void introduction() {  // start introduction
      System.out.println("This program converts between two GPS coordinate systems:\n"
                        +"  1. degrees, minutes and seconds with a cardinal direction (N, S, E W)\n"
                        +"     to decimal degrees\n"
                        +"  2. decimal degrees to\n"
                        +"     degrees, minutes and seconds with a cardinal direction (N, S, E, W)");
   } // end introduction
   
   public int menuSelect() { // start menuSelect
      System.out.print("\nInput your menu selection: ");
      int selection;
      while (true) {
         try {
            selection = scnr.nextInt();
            if( selection == 1 || selection == 2 ) { // selection must be 1 or 2
               break;
            }
            System.out.print("\nPlease enter a 1 or 2: ");
         } catch (Exception e) {
            System.out.print("\nPlease enter a 1 or 2: ");
            scnr.next(); // clear invalid input
         }
      }
      scnr.nextLine(); // consume nextInt line
      return selection;
   } // end menuSelect
   
   public double decimalInput() { // start decimalInput
      System.out.print("\n\nEnter the decimal degrees: -180 to 180: ");
      double decDegrees;
      while (true) {
         try {
            decDegrees = scnr.nextDouble();
            if( decDegrees >= -180 && decDegrees <= 180 ) { // decDegrees must be between 0 and 180
               break;
            }
            System.out.print("\nPlease enter a value from -180 to 180: ");
         } catch (Exception e) {
            System.out.print("\nPlease enter a value from -180 to 180: ");;
            scnr.next(); // clear invalid input
         }
      }
      scnr.nextLine(); // consume nextDouble line
      return decDegrees;
   } // end decimalInput
   
   public int[] degreeInput() { // start degreeInput
      int[] degreeInputs = new int[3];
      
      System.out.print("\nEnter the degrees: -180 to 180: ");
      while (true) {
         try {
            degreeInputs[0] = scnr.nextInt();
            if( degreeInputs[0] >= -180 && degreeInputs[0] <= 180 ) { // degreeInputs[0] must be between 0 and 180
               break;
            }
            System.out.print("\nPlease enter a value from -180 to 180: ");
         } catch (Exception e) {
            System.out.print("\nPlease enter a value from -180 to 180: ");;
            scnr.next(); // clear invalid input
         }
      }
      scnr.nextLine(); // consume nextInt line

      System.out.print("\nEnter the minutes: 0 to 60: ");
      while (true) {
         try {
            degreeInputs[1] = scnr.nextInt();
            if( degreeInputs[1] >= 0 && degreeInputs[1] <= 60 ) { // degreeInputs[1] must be between 0 and 60
               break;
            }
            System.out.print("\nPlease enter a value from 0 to 60: ");
         } catch (Exception e) {
            System.out.print("\nPlease enter a value from 0 to 60: ");;
            scnr.next(); // clear invalid input
         }
      }
      scnr.nextLine(); // consume nextInt line

      System.out.print("\nEnter the seconds: 0 to 60: ");
      while (true) {
         try {
            degreeInputs[2] = scnr.nextInt();
            if( degreeInputs[2] >= 0 && degreeInputs[2] <= 60 ) { // degreeInputs[2] must be between 0 and 60
               break;
            }
            System.out.print("\nPlease enter a value from 0 to 60: ");
         } catch (Exception e) {
            System.out.print("\nPlease enter a value from 0 to 60: ");;
            scnr.next(); // clear invalid input
         }
      }
      scnr.nextLine(); // consume nextInt line 
           
      return degreeInputs;
   } // end degreeInput
   
   public char directionInput() { // start directionInput
      System.out.print("\nEnter the cardinal direction (N, S, E, W): ");
      char direction;
      while (true) {
         try {
            direction = scnr.next().charAt(0);
            if( Character.toUpperCase(direction) == 'N' || Character.toUpperCase(direction) == 'S' || Character.toUpperCase(direction) == 'W' || Character.toUpperCase(direction) == 'E' ) { // direction must be N, E, S, or W
               break;
            }
            System.out.print("\nPlease enter a cardinal direction (N, S, E, W): ");
         } catch (Exception e) {
            System.out.print("\nPlease enter a cardinal direction (N, S, E, W): ");;
            scnr.next(); // clear invalid input
         }
      }
      scnr.nextLine(); // consume nextInt line 
      
      return direction;
   } // end directionInput
   
   public void decConversionResult(double decResult) { // start decConversionResult
      System.out.println("Decimal Output --> " + decResult);
   } // end decConversionResult
   
   public void degreeConversionResult(String degreeResult, String minuteResult, double secondResult) { // start degreeConversionResult
      char negOrPos = degreeResult.charAt(0);
      if( negOrPos == '-' ) {
         System.out.printf("Degree Output --> " + degreeResult + " " + minuteResult + "' %.2f\"  S or W", secondResult);
      } else {
         System.out.printf("Degree Output --> " + degreeResult + " " + minuteResult + "' %.2f\" N or E", secondResult);
      }
   } // end degreeConversionResult
   
   public int runAgain() { // start runAgain
      int run = 0;
      System.out.print("\n\nWould you like to run this program again? (1 for yes): ");
      try {
         run = scnr.nextInt();
      } catch (Exception e) {}
      
      return run;
   } // end runAgain
} // end class Logging