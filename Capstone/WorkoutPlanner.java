import java.util.Scanner;
import java.util.InputMismatchException;

class WorkoutPlanner { // start class WorkoutPlanner
   Scanner scnr = new Scanner(System.in);


   public static void main(String[] args) { // start
      try {
         WorkoutLL workouts = new WorkoutLL();
         workouts.printList();
      } 
      catch (Exception e) {
         System.out.println("An error occurred: " + e.getMessage());
      }
   } // end
} // end class WorkoutPlanner