import java.util.Scanner;
import java.io.IOException;

class Driver { // start class Driver

   public static void main (String[] args) throws IOException { // start
   
      Playlist playlist = new Playlist();
      Scanner sc = new Scanner(System.in);  
      boolean running = true;

      while (running) {
         System.out.print("\n--- Playlist Menu ---"
            + "\n1. Add a song"
            + "\n2. Remove a song"
            + "\n3. Print number of songs"
            + "\n4. Play playlist"
            + "\n5. Shuffle playlist"
            + "\n6. Reverse playlist"
            + "\n7. Save playlist"
            + "\n8. Load playlist"
            + "\n9. Quit"
            + "\nChoose an option: ");

         String choice = sc.nextLine();
         
         int num = 10;
         try {
            num = Integer.parseInt(choice);
         } catch (NumberFormatException e) {
            System.err.println("Error: Invalid input '" + choice + "'");
         }
         
         switch (num) { // start switch-case
            case 1:
               System.out.print("Enter song title: ");
               String title = sc.nextLine();
               System.out.print("Enter artist: ");
               String artist = sc.nextLine();
               playlist.addNode(title, artist);
               break;
            case 2:
               System.out.print("Enter artist name to remove: ");
               String removeArtist = sc.nextLine();
               System.out.print("Enter title of song to remove: ");
               String removeSong = sc.nextLine();
               System.out.println(removeArtist + " - " + removeSong);
               playlist.removeNode(removeArtist, removeSong);
               break;
            case 3:
               System.out.println("Total songs on playlist: " + playlist.numSongs);
               break;
            case 4:
               playlist.play();
               break;
            case 5:
               playlist.reorganizeNodes(1);
               System.out.println("Playlist shuffled.");
               break;
            case 6:
               playlist.reorganizeNodes(2);
               System.out.println("Playlist reversed.");
               break;
            case 7:
               System.out.print("Enter filename to save: ");
               String saveFile = sc.nextLine();
               playlist.savePlaylist(saveFile);
               System.out.println("Playlist saved.");
               break;
            case 8:
               System.out.print("Enter filename to load: ");
               String loadFile = sc.nextLine();
               playlist.loadPlaylist(loadFile);
               System.out.println("Playlist loaded.");
               break;
            case 9:
               running = false;
               System.out.println("Goodbye.");
               break;
            default:
               System.out.println("Invalid option.");
         } // end switch-case    
         
      }   
   sc.close();
   } // end
} // end class Driver