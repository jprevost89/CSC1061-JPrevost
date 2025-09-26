/**
 * BankQueue.java
 * @author Jon Prevost
 * @since September 26, 2025
 */
 
import java.util.Scanner;

class BankQueue { // start class BankQueue

   public static void main (String[] args) { // start
      
      ArrayQueue ticket = new ArrayQueue();
      
      Scanner scnr = new Scanner(System.in);
      
      String counter1 = "Not assigned";
      String counter2 = "Not assigned";
      String counter3 = "Not assigned";
      String counter4 = "Not assigned";
      
      while(true) {
      
         System.out.print("0 -> Issue new ticket number\n"
            + "1 -> Assign first ticket in queue to Counter 1\n"
            + "2 -> Assign first ticket in queue to Counter 2\n"
            + "3 -> Assign first ticket in queue to Counter 3\n"
            + "4 -> Assign first ticket in queue to Counter 4\n"
            + "5 -> Quit program\n"
            + "Tickets in queue: [");
         ticket.getArray();
         System.out.println("]\nCounter assignment: {'Counter 1': " + counter1 + ", 'Counter 2': " 
            + counter2 + ",\n'Counter 3': " + counter3 + ", 'Counter 4': " + counter4 + "}\n"
            + "Enter your option: ");
            
         String input = scnr.next();
         int num = 6;
         try {
            num = Integer.parseInt(input);
         } catch (NumberFormatException e) {
            System.err.println("Error: Invalid input '" + input + "'");
         }
         switch (num) { // start swith case
            case 0:
               ticket.enqueue();
               break;
            case 1:
               if (ticket.isEmpty() == true) {
                  System.out.println("Queue is empty. Please add a ticket to the queue before assigning to a counter.");
                  break;
               }
               counter1 = ticket.dequeue();
               break;
            case 2:
               if (ticket.isEmpty() == true) {
                  System.out.println("Queue is empty. Please add a ticket to the queue before assigning to a counter.");
                  break;
               }
               counter2 = ticket.dequeue();
               break;
            case 3:
               if (ticket.isEmpty() == true) {
                  System.out.println("Queue is empty. Please add a ticket to the queue before assigning to a counter.");
                  break;
               }
               counter3 = ticket.dequeue();
               break;
            case 4:
               if (ticket.isEmpty() == true) {
                  System.out.println("Queue is empty. Please add a ticket to the queue before assigning to a counter.");
                  break;
               }
               counter4 = ticket.dequeue();
               break;
            case 5:
               return;
            default:
               System.out.println("Please enter a valid input.");
         } // end switch case
      
      }
   
   } // end
   
} // end class BankQueue