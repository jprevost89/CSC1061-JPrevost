/* 
Jon Prevost
March 14, 2025
*/

import java.util.Scanner;


class Driver { // start class Driver


   public static void main(String[] args) { // start
   
      Composition comp = new Composition();
      Scanner scnr = new Scanner(System.in);
      
      int selection = 0;
      
      while(selection != 4) { // start while-loop
         System.out.print("This program allows a user to enter a written composition in pieces:"
                         +"  \n1. Enter a new sentence."
                         +"  \n2. Start a new paragraph"
                         +"  \n3. Print the composition"
                         +"  \n4. QUIT");
         System.out.print("\nYour menu selection is: ");

         while (true) { // start while-loop
            try {
               selection = scnr.nextInt();
               if( selection >= 1 && selection <= 4 ) { // selection must be between 1 and 4
                  break;
               }
               System.out.print("\nPlease enter 1, 2, 3, or 4: ");
            } catch (Exception e) {
               System.out.print("\nPlease enter 1, 2, 3, or 4: ");;
               scnr.next(); // clear invalid input
            }
         } // end while-loop
         
         switch( selection ) { // start switch-case
            case 1:
               System.out.println("Type a sentence, then press ENTER;");
               comp.addSentence();
               break;
            case 2:
               comp.addParagraph();
               break;
            case 3:
               comp.print();
               break;
            case 4:
               System.out.println("Goodbye!");
               break;
         } // end switch-case
      } // end while-loop
   } // end
} // end class Driver