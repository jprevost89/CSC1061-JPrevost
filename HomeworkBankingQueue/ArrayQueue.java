/**
 *  Creates the ArrayQueue class
 *  @param queue  LinkedList object
 *  @param queueNumber  starting int value for ticket queue meant to be iterated
 */

class ArrayQueue implements Queue { // start ArrayQueue class
   LinkedList queue;
   private static int queueNumber = 1001;
   
   public ArrayQueue() { // start class ArrayQueue
      queue = new LinkedList();
   } // end class ArrayQueue
   
   @Override
   public void enqueue() { // start class enqueue
      queue.addNode(queueNumber++);
   } // end class enqueue
   
   @Override
   public String dequeue() { // start class dequeue
      return queue.removeNode() + "";
   } // end class dequeue
   
   @Override
   public int peek() { // start class peek
      return queue.returnHead();
   } // end class peek
   
   @Override
   public boolean isEmpty() { // start class isEmpty
      return queue.head == null;
   } // end class isEmpty
    
   public void getArray() { // start class getArray
      Node current = queue.head;
      if (current != null) {
         System.out.print(current.data);
         current = current.next;
      }
      while (current != null) {
         System.out.print(", " + current.data);
         current = current.next;
      }
   } // end class getArray
} // end ArrayQueue class