import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

class DemographicLL { //start class DemographicLL
   private DemographicNode head;
   private DemographicNode tail;
   
   FileInputStream inputStream;
   Scanner inFS;
   DemographicNode newNode;
   
   public DemographicLL() throws IOException{ //start contructor DemographicLL
      this.head = null;
      this.tail = null;
      readDataFile();
   } //end contructor DemographicLL
   
   private void readDataFile() throws IOException { //start method readDataFile
      try {   
         String fileName = "demographicData.txt";
         inputStream = new FileInputStream(fileName); 
   
         inFS = new Scanner(inputStream);
         
         while(inFS.hasNextLine()) { // scan each line from txt file
            this.addNode(inFS.nextLine()); // convert each line into a node
         }
         
         inputStream.close();
      } catch (IOException e) {
            System.err.println("An IOException occurred: " + e.getMessage());
            e.printStackTrace();
      }
         
   } //end method readDataFile
   
   private void addNode(String aRecord) { //start method addNode
      DemographicInfo info = new DemographicInfo(aRecord);
      newNode = new DemographicNode(info);
      // logic to add node to the end of linked list
      if (this.head == null) {
         
         this.head = newNode;
      
      } else {
      
         this.tail.setNext(newNode);
         
         newNode.setPrev(this.tail);
      
      }
      
      this.tail = newNode;
      
   } //end method addNode
   
   public void printList(){ //start method printList
      DemographicNode currObj = this.head;
      System.out.printf("%12s %12s %4s %7s %8s %20s %18s %13s %6s %6s\n", 
                        "last",  
                        "first", 
                        "age", 
                        "sex",
                        "status", 
                        "occupation", 
                        "street",
                        "city",
                        "state",
                        "zip");

      while (currObj != null) { // loop through linkedlist and print node details
         currObj.printNodeData();
         currObj = currObj.getNext();
      }
   } //end method printList
} //end class DemographicLL