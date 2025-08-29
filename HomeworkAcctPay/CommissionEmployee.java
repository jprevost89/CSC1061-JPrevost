class CommissionEmployee extends Employee {

   private double grossSales;
   private double commissionRate;
   
   public CommissionEmployee(String firstName, String lastName, String socialSecurity, double grossSales, double commissionRate) {
      super(firstName, lastName, socialSecurity);
      this.grossSales = grossSales;
      this.commissionRate = commissionRate;
   }
   
   public double getSales() {
      return grossSales;
   }
   
   public void setSales(double grossSales) {
      this.grossSales = grossSales;
   }
   
   public double getRate() {
      return grossSales;
   }
   
   public void setRate(double commissionRate) {
      this.commissionRate = commissionRate;
   }
   
   @Override
   public double getPaymentAmount() {
      return grossSales * commissionRate;
   }
   
   @Override
   public String toString() {
      return super.toString() +
         "\nPayment Amount: " + getPaymentAmount();
   }

}