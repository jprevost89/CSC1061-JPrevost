/* 
Jon Prevost
April 12, 2025
*/


import java.io.IOException;

class DemographicTest { // start class DemographicTest

   public static void main(String[] args) { // start
      try {
         DemographicLL demo = new DemographicLL();
         demo.printList();
      }
      catch(IOException e) {
         System.err.println("An IOException occurred: " + e.getMessage());
         e.printStackTrace();
      }
   } // end 
} // end class DemographicTest