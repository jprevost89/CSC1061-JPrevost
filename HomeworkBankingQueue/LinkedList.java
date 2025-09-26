/**
 * LinkedList class
 * Allows for the adding and removing of
 * node object within the list
 * @param head   stores a Node object
 */

class LinkedList { // start class LinkedList

   Node head;
   
   public LinkedList() { // start method LinkedList
      this.head = null;
   } // end method LinkedList
   
   public void addNode(int data) { // start method addNode
      Node newNode = new Node(data);
      if (head == null) {
         head = newNode;
      } else {
         Node current = head;
         while (current.next != null) {
            current = current.next;
         }
         current.next = newNode;
      }
   } // end method addNode
   
   public int removeNode() { // start method removeNode
      int returnData = head.data;
      head = head.next;
      return returnData;
   } // end method removeNode
   
   public int returnHead() { // start method returnHead
      return head.data;
   } // end method returnHead
   
   public Node returnNext() { // start method returnNext
      return head.next;
   } // end method returnNext
} // end class LinkedList