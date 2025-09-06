import java.io.*;
import java.util.ArrayList;

/**
  * Writes person to file and reads it back
  */
class Database { // start class Database
   private static final String dataFile = "PersonDatabase.txt";
   
   /**
     * Constructs a new Database object and creates file if one does not exist
     */
   public Database() { // start Database constructor
      try {
         File file = new File(dataFile);
         if (!file.exists()) {
            file.createNewFile();
         }
      } catch (IOException e) {
         e.printStackTrace();
      }
   } // end Database constructor
   
  /**
   * Writes person to file
   */
   public void writePerson(Person person) { // start method writePerson
      try ( FileWriter writer = new FileWriter(dataFile, true)) { // pass file name and set append mode to true
         writer.write(person.toString()); 
      } catch (IOException e) {
         e.printStackTrace();
      }
   } // end method writePerson
   
   
   /**
    * Reads person from file
    */
   public ArrayList<String> readDatabase() { // start method readDatabase
      ArrayList<String> persons = new ArrayList<String>();
      try (BufferedReader reader = new BufferedReader(new FileReader(dataFile))) {
         String line;
         while ((line = reader.readLine()) != null) {
            persons.add(line);
         }
         reader.close();
      } catch (IOException e) {
         e.printStackTrace();
      }
      return persons;
   } // end method readDatabase
} // start class Database