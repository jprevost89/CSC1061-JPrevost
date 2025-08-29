class HourlyEmployee extends Employee { // start class HourlyEmployee

   private double hourlyWage;
   private int totalHours;
   
   public HourlyEmployee(String firstName, String lastName, String socialSecurity, double hourlyWage, int totalHours) { // start Constructor HourlyEmployee
      super(firstName, lastName, socialSecurity);
      this.hourlyWage = hourlyWage;
      this.totalHours = totalHours;
   } // end Constructor HourlyEmployee
   
   public double getWage() { // start method getWage
      return hourlyWage;
   } // end method getWage
   
   public void setWage(double hourlyWage) { // start method setWage
      this.hourlyWage = hourlyWage;
   } // end method setWage
   
   public int getHours() { // start method getHours
      return totalHours;
   } // end method getHours
   
   public void setHours(int totalHours) { // start method setHours
      this.totalHours = totalHours;
   } // end method setHours
   
   @Override
   public double getPaymentAmount() { // start method getPaymentAmount
      return hourlyWage * totalHours;
   } // end method getPaymentAmount
   
   @Override
   public String toString() { // start method toString
      return super.toString() +
         "\nPayment Amount: " + getPaymentAmount();
   } // end method toString

} // end class HourlyEmployee