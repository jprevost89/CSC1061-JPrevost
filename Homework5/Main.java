/* 
Jon Prevost
February 27, 2025
*/

import java.util.Scanner;


class Main { // start class Main


   public static void main(String[] args) { // start
   
      Scanner scnr = new Scanner(System.in);
      Cypher cyph = new Cypher();
      Logging log = new Logging();
      
      int cypherOffset = 0; // set cypher offset default to 0
      
      int run = 1; // set run to 1 to enter while loop
      
      while( run == 1 ) { // start main while loop
      
         log.encOrDec(); // print choice options
         int choiceSelect = cyph.choiceSelect();
         
         cyph.setAlpha(); // create standard alphabet array
         
         if(choiceSelect == 1) { // encryption
         
            log.encOffset();
         
            cypherOffset = cyph.cypherOffset();
            
            cyph.setCypher(cypherOffset);
            cyph.logCypher();
            
            log.encText();
            
            String userTextInput = scnr.nextLine(); // text to encrypt
            String userTextUpper = userTextInput.toUpperCase(); // convert to upper for case-agnostic comparison
            log.output();
            cyph.encodeCypher(userTextUpper);
            
         } 
         
         else if(choiceSelect == 2 ) { // decryption
         
            log.decText();
            String userTextInput = scnr.nextLine(); // text to decrypt
            String userTextUpper = userTextInput.toUpperCase(); // convert to upper for case-agnostic comparison
         
         
            log.encKey();
      
            cypherOffset = cyph.cypherOffset();
            
            cyph.setCypher(cypherOffset);
            log.output();
            cyph.decodeCypher(userTextUpper);
            
         }
         
         else {
            log.invalidInput();
         }
         
         log.runAgain();
         
         try {
            run = scnr.nextInt(); // if run = 1, continue loop. Else, end program
            scnr.nextLine(); // clear nextInt input
         } 
         catch( Exception e ){
            run = 0;
         }
      } // end main while loop
   } // end
} // end class Main  