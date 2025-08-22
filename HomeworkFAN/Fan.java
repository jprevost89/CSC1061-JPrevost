
public class Fan { // start class Fan

   public static final int SLOW = 1;
   public static final int MEDIUM = 2;
   public static final int FAST = 3;
   
   private static int counter = 0;
   
   private int speed = SLOW;
   private boolean on = true;
   private double radius = 5;
   private String color = "blue";
   private int id;
   
   public int getSpeed() { // end method getSpeed
      return speed;
   } // end method getSpeed
   
   public void setSpeed(int newSpeed) { // start method setSpeed
      this.speed = newSpeed;
   } // end method setSpeed
   
   public boolean getStatus() { // start method getStatus
      return on;
   } // end method getStatus
   
   public void setStatus(boolean newStatus) { // start method setStatus
      this.on = newStatus;
   } // end method setStatus
   
   public double getRadius() { // start method getRadius
      return radius;
   } // end method getRadius
   
   public void setRadius(double newRadius) { // start method setRadius
      this.radius = newRadius;
   } // end method setRadius
   
   public String getColor() { // start method getColor
      return color;
   } // end method getColor
   
   public void setColor(String newColor) { // start method setColor
      this.color = newColor;
   } // end method setColor
   
   public Fan() { // start default Fan constructor
      this.speed = speed;
      this.on = on;
      this.radius = radius;
      this.color = color;
      this.id = ++counter;
   } // end default Fan constructor
   
   @Override // added for clarity
   public String toString(){ // start method toString
      if (this.on) {
         return "Fan ID: " + id 
              + "\nFan Speed: " + speed
              + "\nFan Color: " + color
              + "\nFan Radius: " + radius;
      } else {
         return "\nFan ID: " + id 
              + "\nFan Color: " + color
              + "\nFan Radius: " + radius
              + "\nfan is off";
      }
   } // end method toString

} // end class Fan