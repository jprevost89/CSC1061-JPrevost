class Workouts { // start class Workouts
   private String workout;
   private int startWeight = 0;
   private int[] weeklyWeight;
   private String workoutType;
   private int reps = 15;
   private int sets = 3;
   private int weeks;
   private int days;
   
   public Workouts(String workout, String workoutType, int weeks, int days) { // start constructor Workouts (String, String, int, int)
      this.workout = workout;
      this.workoutType = workoutType;
      this.weeks = weeks;
      this.days = days;
      weekWeightCycle(weeks);
   } // end constructor Workouts
   
   public Workouts(String workout, String workoutType, String startWeight, int weeks, int days) { // start constructor Workouts (String, String, String, int, int)
      this.workout = workout;
      this.workoutType = workoutType;
      if(startWeight != null) {
         this.startWeight = Integer.parseInt(startWeight);
      }
      this.weeks = weeks;
      this.days = days;
      weekWeightCycle(weeks);
   } // end constructor Workouts
   
   private void weekWeightCycle(int weeks) { // start method weekWeightCycle
      this.weeklyWeight = new int[weeks];
      this.updateWeight(weeks);
   } // end method weekWeightCycle
   
   private void updateWeight(int weeks) { // start method updateWeight
      int currentWeight = startWeight;
      for( int i = 0; i < weeks; ++i ) {
         this.weeklyWeight[i] = currentWeight;
         currentWeight += 5;
      } 
   } // end method updateWeight
   
   public void printWorkoutDay(int day) { // start method printWorkoutDay

      int totalDays = this.weeks * this.days;

      if ( day % 3 == 0 ) {
         switch (this.workoutType) {
            case "Legs":
               this.exerciseArray(day, totalDays);
               break;
            case "Shoulders":
               this.exerciseArray(day, totalDays);
               break;
         } 
      }
      else if ( day % 2 == 0 ) {   
         switch (this.workoutType) {
            case "Back":
               this.exerciseArray(day, totalDays);
               break;
            case "Biceps":
               this.exerciseArray(day, totalDays);
               break;
         }
      } else {
         switch (this.workoutType) {
            case "Chest":
               this.exerciseArray(day, totalDays);
               break;
            case "Triceps":
               this.exerciseArray(day, totalDays);
               break;
         }
      }
   } // end method printWorkoutDay
   
   public void exerciseArray(int day, int totalDays) { // start method exerciseArray
      System.out.println();
      System.out.println(" - " + this.workout);
      int index = (int) Math.ceil((this.weeks/(double) totalDays) * day) - 1;
     
      if ( this.startWeight > 0 ) {
         System.out.print("      Weight: " + this.weeklyWeight[index]);
         System.out.print(", Reps: " + (this.reps - (2 * index)));
         System.out.print(", Sets: " + this.sets);
      } else {
         System.out.print("      Reps: " + (this.reps + (2 * index)));
         System.out.print(", Sets: " + this.sets);
      }        
   } // end method exerciseArray
} // end class Workouts