import java.io.IOException;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;

class WorkoutLL { //start class WorkoutLL
   private WorkoutNode head;
   private WorkoutNode tail;
   private int days;
   private int weeks;
   
  
   WorkoutNode newNode;
   Scanner scnr = new Scanner(System.in);
   boolean weekBool = false;
   boolean daysBool = false;
   
   public WorkoutLL() throws Exception{ //start constructor WorkoutLL
      this.head = null;
      this.tail = null;
      readDataFile();
   } //end constructor WorkoutLL
   
   private void readDataFile() throws FileNotFoundException, Exception { //start method readDataFile
      while(!weekBool) {
         try {
            System.out.print("\nHow many weeks will this cycle be? ");
            weeks = scnr.nextInt();
            
            if ( weeks > 6 ) {
               throw new IllegalArgumentException("Weeks must be less than 7.");
            } else {
               weekBool = true;
            }
         }
         catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
         }
      }
      
      while (!daysBool) {   
         try {
            System.out.print("\nHow many days will you workout per week? ");
            days = scnr.nextInt();
            if ( days > 7 ) {
               throw new IllegalArgumentException("Days must be less than 8.");
            } else {
               daysBool = true;
            }
         }
         catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
         }
      }
      
      try {
         String fileName = "exercises.txt";
         String[] readText = new String[3];
         int value = 0;
         int tracker = 0;
         FileInputStream inputStream = new FileInputStream(fileName);
         Scanner inFS = new Scanner(inputStream);
         while (inFS.hasNextLine()) {
            String line = inFS.nextLine();
            if ( line.isEmpty() ) {
               if ( readText[2].equals("Weights") ) {
                  System.out.print("\nInput starting weight for " + readText[0] + " at 15 reps: ");
                  readText[2] = scnr.next(); 
                  // readText[2] = "100"; 
               } else {
                  addNode(readText[0], readText[1], null, weeks, days);
                  tracker = 0;
                  value +=1;
                  continue;
               }
               addNode(readText[0], readText[1], readText[2], weeks, days);
               // workouts[value].weekWeightCycle(weeks);
               tracker = 0;
               value +=1;
               continue;
            }
            readText[tracker] = line;
            tracker += 1;
         }
         inputStream.close();
      } 
      catch ( FileNotFoundException e ) {
         System.out.println("Error reading file: " + e.getMessage());
         System.exit(0);
      }
      catch ( InputMismatchException e ) {
         System.out.println("Unexpected input: " + e.getMessage());
         System.exit(0);
      }
      catch ( Exception e ) {
         System.out.println("Error occured: " + e.getMessage());
         System.exit(0);
      }
   } //end method readDataFile
   
   private void addNode(String val1, String val2, String val3, int val4, int val5) { //start method addNode(String, String, String, int)
      Workouts info = new Workouts(val1, val2, val3, val4, val5);
      newNode = new WorkoutNode(info);
      // logic to add node to the end of linked list
      if (this.head == null) {
      
         this.head = newNode;
      
      } else {
      
         this.tail.setNext(newNode);
      
         newNode.setPrev(this.tail);
      
      }
      
      this.tail = newNode;
   
   } //end method addNode(String, String, String)
   
   public void printList(){ //start method printList
      // WorkoutNode currObj = this.head;
      System.out.println();
      for(int day = 1; day <= days * weeks; ++day) {
         WorkoutNode currObj = this.head;
         System.out.println("\n\nDay " + day);
         while (currObj != null) { // loop through linkedlist and print node details
            
            currObj.printNodeData(day);
            currObj = currObj.getNext();
            
         }
      }
   } //end method printList

} //end class WorkoutLL