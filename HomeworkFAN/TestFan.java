/*
Jon Prevost
August 22, 2025
*/

public class TestFan { // start class TestFan

   public static void main(String[] args) { // start
      
      // First fan
      Fan fan1 = new Fan(); 
      fan1.setSpeed(Fan.FAST);
      fan1.setRadius(10);
      fan1.setColor("yellow");
      fan1.setStatus(true);
      
      // Second fan
      Fan fan2 = new Fan();
      fan2.setSpeed(Fan.MEDIUM);
      fan2.setRadius(5);
      fan2.setColor("blue");
      fan2.setStatus(false);
      
      // Display fans
      System.out.println(fan1.toString());
      System.out.println(fan2.toString());
      
   } // end
   
} // end class TestFan