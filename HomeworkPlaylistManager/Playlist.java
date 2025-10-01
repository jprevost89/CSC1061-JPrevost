import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Playlist class that takes in Nodes and tracks them
 * through references to Node objects
 *
 * @param head      lead Node in list
 * @param numSongs   int value to track number of songs added or removed
 *
 **/

class Playlist { // start class Playlist
   
   Node head;
   Node tail;
   public static int numSongs = 0; 
   
   public Playlist() { // start Playlist constructor
      head = null;
      tail = null;
   } // end Playlist constructor
   
   public void addNode(String artist, String song) { // start method addNode
      Node newNode = new Node(artist, song);
      
      if (head == null) {
         head = newNode;
         tail = newNode;
      } else {
         tail.next = newNode;
         newNode.prev = tail;
         tail = newNode;
      } 
      
      numSongs++;
   } // end method addNode
   
   public void removeNode(String artist, String song) { // start method removeNode
      String track = song + " - " + artist;
      if (this.head != null) {
         Node current = this.head;
         Node previous = null;
         
         while (current != null && !current.data.equals(track)) {
            previous = current;
            current = current.next;
         }
         
         if(current != null && previous != null) {
            previous.next = current.next;
            numSongs--;
         } 
         else if (previous == null) {
            this.head = current.next;
            numSongs--;
         } else {
            System.err.println("No matching Artist/Song for requested values.");
         }
      } else {
         System.err.println("No matching Artist/Song for requested values.");
      }
   } // end method removeNode
   
   public void reorganizeNodes(int choice) { // start method reorganizeNodes
      ArrayList<String> strArray = new ArrayList<>();
      if (this.head == null) {
         System.out.println("No tracks available");
      } else {
         Node current = this.head;
      
         while (current != null) {
            strArray.add(current.data);
            current = current.next;
         }
         
         switch (choice) { // start switch-case
            case 1: // shuffle list
               Collections.shuffle(strArray);
               current = this.head;
               int index = 0;
               while (current != null) {
                  current.data = strArray.get(index);
                  current = current.next;
                  index++;
               }
               break;
            case 2: // reverse list
               Collections.reverse(strArray);
               current = this.head;
               index = 0;
               while (current != null) {
                  current.data = strArray.get(index);
                  current = current.next;
                  index++;
               }
               break;
            default:
               System.out.println("Invalid choice. 1 - shuffle, 2 - reverse");
               break;
         } // end switch-case
         
         current = this.head;
         int index = 0;
         while (current != null) {
            current.data = strArray.get(index);
            current = current.next;
            index++;
         }
      }
   } // end method reorganizeNodes
   
   public void savePlaylist(String filename) throws IOException { // start class savePlaylist
      try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
         Node current = head;
         while (current != null) {
            writer.write(current.data);
            writer.newLine();
            current = current.next;
         }
      } catch (IOException e) {
         System.out.println("Unable to save playlist");
      }
   } // end class savePlaylist
   
   public void loadPlaylist(String filename) throws IOException { // start class loadPlaylist
      try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
         String line;
         while ((line = reader.readLine()) != null) {
            String[] parts = line.split(" - ");
            if (parts.length == 2) {
               addNode(parts[0], parts[1]);
            }
         }
      }
   } // end class loadPlaylist
   
   public void play() { // start method play
      Node current = head;
      System.out.println(current.data);
      
      while (current.next != null) {
         current = current.next;
         System.out.println(current.data);
      }
   } // end method play
} // end class Playlist