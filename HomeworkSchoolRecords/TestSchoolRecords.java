/**
  * TestSchoolRecords.java
  * @author Jon Prevost
  * @since September 6, 2025
  */
  
import java.util.ArrayList;

/**
 * Driver class for the SchoolRecords project.
 * Creates Person objects, writes them to a file, and reads them back.
 */
class TestSchoolRecords { // start class TestSchoolRecords

   /**
     * Main entry point of the program.
     *
     * @param args command-line arguments (not used)
     */
   public static void main(String[] args) { // start
      Database database = new Database();
      
      // create first person
      Student student1 = new Student(
         "Dave Jones", 
         "1154 E 100th Ln, Thornton CO, 80229", 
         "719-242-1587", 
         "jonprevost86@gmail.com", 
         "sophomore"
      );
      // create second person
      Student student2 = new Student(
         "Amy Berg", 
         "114 20th Street, Denver CO, 80202", 
         "303-290-8097", 
         "bergermeister93@gmail.com", 
         "freshman"
      );
      // create third person
      Faculty faculty1 = new Faculty(
         "Opie Manamana", 
         "16 4th Street, Denver CO, 80205", 
         "303-330-4309", 
         "cheesyboi23@gmail.com", 
         "Main",
         "75,000",
         "03/12/2019",
         "8:30 - 3:00",
         "3"
      );
      // create fourth person
      Faculty faculty2 = new Faculty(
         "Lappie Oglum", 
         "123 Main Street, Denver CO, 80205", 
         "303-330-1122", 
         "oglumboglim@gmail.com", 
         "Downtown",
         "80,000",
         "08/23/2014",
         "8:00 - 2:00",
         "2"
      );
      // create fifth person
      Staff staff1 = new Staff(
         "Quinn Habladder", 
         "456 Unmain Street, Denver CO, 80205", 
         "303-332-1124", 
         "IHabladderProblems@gmail.com", 
         "Downtown",
         "82,000",
         "08/01/2022",
         "Office Administrator"
      );
      // create sixth person
      Staff staff2 = new Staff(
         "Bird McMird", 
         "789 Kaloola, Denver CO, 80205", 
         "222-222-2222", 
         "justPress2ForAwhile@gmail.com", 
         "Main",
         "54,000",
         "01/06/2020",
         "Coffee Guy"
      );
      
      // write persons to file
      database.writePerson(student1);
      database.writePerson(student2);
      database.writePerson(faculty1);
      database.writePerson(faculty2);
      database.writePerson(staff1);
      database.writePerson(staff2);
      
      // read persons from file
      ArrayList<String> persons = database.readDatabase();
      for (String person : persons) {
         System.out.println(person);
      }
      
   } // end
} // end class TestSchoolRecords