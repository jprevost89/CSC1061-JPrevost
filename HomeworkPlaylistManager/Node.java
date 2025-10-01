/**
 * Class to create a node for LinkedLists
 *
 *@param data   string value for Node
 *@param next   reference to next Node object in LinkedList
 *
 **/

class Node { // start class Node

   String data;
   Node next;
   Node prev;
   
   public Node(String artist, String song) { // start Node constructor
      Song track = new Song(artist, song);
      this.data = track.toString();
      this.next = null;
      this.prev = null;
   } // end Node constructor

} // end clas Node