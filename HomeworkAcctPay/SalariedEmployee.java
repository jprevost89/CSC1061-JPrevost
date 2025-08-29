class SalariedEmployee extends Employee {
   
   private double weeklySalary;
   
   public SalariedEmployee(String firstName, String lastName, String socialSecurity, double weeklySalary) {
      super(firstName, lastName, socialSecurity);
      this.weeklySalary = weeklySalary;
   }
   
   public double getSalary() {
      return weeklySalary;
   }
   
   public void setSalary(double weeklySalary) {
      this.weeklySalary = weeklySalary;
   }
   
   @Override
   public double getPaymentAmount() {
      return weeklySalary;
   }
   
   @Override
   public String toString() {
      return super.toString() +
         "\nPayment Amount: " + weeklySalary;
   }

}