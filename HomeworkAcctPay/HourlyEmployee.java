class HourlyEmployee extends Employee {

   private double hourlyWage;
   private int totalHours;
   
   public HourlyEmployee(String firstName, String lastName, String socialSecurity, double hourlyWage, int totalHours) {
      super(firstName, lastName, socialSecurity);
      this.hourlyWage = hourlyWage;
      this.totalHours = totalHours;
   }
   
   public double getWage() {
      return hourlyWage;
   }
   
   public void setWage(double hourlyWage) {
      this.hourlyWage = hourlyWage;
   }
   
   public int getHours() {
      return totalHours;
   }
   
   public void setHours(int totalHours) {
      this.totalHours = totalHours;
   }
   
   @Override
   public double getPaymentAmount() {
      return hourlyWage * totalHours;
   }
   
   @Override
   public String toString() {
      return super.toString() +
         "\nPayment Amount: " + getPaymentAmount();
   }

}