import java.util.Scanner;

class Cypher { // start class Cypher
   Scanner scnr = new Scanner(System.in);
   Logging log = new Logging();
   
   private char[] alpha = new char[26]; // create array to hold 26 char standard alphabet
   private char[] cypher = new char[26]; // create array to hold 26 char offset alphabet
   
   public void setAlpha() { // start setAlpha
      for( int a = 0; a < 26; ++a ) {
         this.alpha[a] = (char) ('A' + a);
         System.out.print(this.alpha[a] + " ");
      }   
   } // end setAlpha
   
   public int cypherOffset() { // start cypherOffset
      int offset;
      while (true) {
         try {
            offset = scnr.nextInt();
            if(offset <= 26 && offset >= -26) { // offset cannot exceed positive or negative length of alpha array
               break;
            }
            log.inputParameters();
         } catch (Exception e) {
            log.inputParameters();
            scnr.next(); // clear invalid input
         }
      }
      scnr.nextLine(); // consume nextInt line
      return offset;
   } // end cypherOffset
   
   public int choiceSelect() { // start choiceSelect
      int choice = 0;
      try {
         choice = scnr.nextInt();
      } catch (Exception e) {
         log.encOrDecError();
         scnr.next(); // clear invalid input
      }
      return choice;
   } // end choiceSelect
   
   public void setCypher(int cypherOffset) { // start setCypher
      for( int i = 0; i < this.alpha.length; ++i ) {
         if( cypherOffset >= 0 ) {
            if( i > this.alpha.length - 1 - cypherOffset ) {
               this.cypher[i] = this.alpha[i + cypherOffset - this.alpha.length];
            } else {
               this.cypher[i] = this.alpha[i+cypherOffset];
            }
         } else {
            if( i < -cypherOffset ) { 
               this.cypher[i] = this.alpha[i + cypherOffset + this.alpha.length];
            } else {
               this.cypher[i] = this.alpha[i + cypherOffset];
            }
         }
      }
   } // end setCypher
   
   public void logCypher() { // start logCypher
      for( int i = 0; i < this.cypher.length; ++i) {
         System.out.print(cypher[i] + " ");
      }
   } // end logCypher
   
   public void encodeCypher(String userTextUpper) { // start encodeCypher
      for( int i = 0; i < userTextUpper.length(); ++i ) {
         if( Character.isAlphabetic(userTextUpper.charAt(i) ) ) {
            for( int n = 0; n < this.alpha.length; ++n ) {
               if( userTextUpper.charAt(i) == this.alpha[n] ) {
                  System.out.print(this.cypher[n]);
               }
            }
         } else {
            System.out.print(" ");
         }
      }
   } // end encodeCypher
   
   public void decodeCypher(String userTextUpper) { // start decodeCypher   
      for( int i = 0; i < userTextUpper.length(); ++i ) {
         if( Character.isAlphabetic(userTextUpper.charAt(i) ) ) {
            for( int n = 0; n < this.cypher.length; ++n ) {
               if( userTextUpper.charAt(i) == this.cypher[n] ) {
                  System.out.print(this.alpha[n]);
               }
            }
         } else {
            System.out.print(" ");
         }
      }
   } // end decodeCypher
   
   
} // end class Cypher