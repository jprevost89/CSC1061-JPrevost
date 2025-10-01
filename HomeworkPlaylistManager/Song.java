/**
 * Song class that stores and creates full track data
 *
 * @param artist    Artist name as string value
 * @param song      Song name as string value
 *
 **/

class Song { // start class Song

   String artist;
   String song;
   
   public Song (String artist, String song) { // start Song constructor
      this.artist = artist;
      this.song = song;
   } // end Song constructor
   
   @Override
   public String toString() {
      return artist + " - " + song;
   }
} // end class Song