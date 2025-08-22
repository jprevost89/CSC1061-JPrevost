class Logging { // start class Logging
   
   
   public void encOrDec() { // start encOrDec
      System.out.print("\nWould you like to encrypt or decrypt? ( 1 for encrypt / 2 for decrypt ) ");  
   } // end encOrDec
   
   public void encOrDecError() { // start encOrDecError
      System.out.println("Please Enter 1 for encryption or 2 for decryption.");  
   } // end encOrDecError
   
   public void encOffset() { // start encOffset
      System.out.print("\nEnter an offset for this encryption between -26 and 26: "); 
   } // end encOffset
   
   public void encText() { // start encText
      System.out.print("\nEnter some text to encrypt: ");
   } // end encText
   
   public void output() { // start output
      System.out.print("\nOutput --> ");
   } // end output
   
   public void decText() { // start decText
      System.out.print("\nEnter some text to decrypt: ");
   } // end decText
   
   public void encKey() { // start encKey
      System.out.print("\nEnter encryption key (-26 to 26): ");
   } // end encKey
   
   public void invalidInput() { // start invalidInput
      System.out.print("\n\nNot a valid input");
   } // end invalidInput
   
   public void runAgain() { // start runAgain
      System.out.print("\n\nRun program again? ( 1 for 'yes' ): ");
   } // end runAgain
   
   public void inputParameters() { // start inputParameters
      System.out.println("Input value between 26 and -26.");
   } // end inputParameters
   
   
} // end class Logging