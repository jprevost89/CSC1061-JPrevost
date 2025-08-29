class SalariedEmployee extends Employee { // start class SalariedEmployee
   
   private double weeklySalary;
   
   public SalariedEmployee(String firstName, String lastName, String socialSecurity, double weeklySalary) { // start Constructor Salaried Employee
      super(firstName, lastName, socialSecurity);
      this.weeklySalary = weeklySalary;
   } // end Constructor Salaried Employee
   
   public double getSalary() { // start method getSalary
      return weeklySalary;
   } // end method getSalary
   
   public void setSalary(double weeklySalary) { // start method setSalary
      this.weeklySalary = weeklySalary;
   } // end method setSalary
   
   @Override
   public double getPaymentAmount() { // start method getPaymentAmount
      return weeklySalary;
   } // end method getPaymentAmount
   
   @Override
   public String toString() { // start method toString
      return super.toString() +
         "\nPayment Amount: " + weeklySalary;
   } // end method toString

} // end class SalariedEmployee