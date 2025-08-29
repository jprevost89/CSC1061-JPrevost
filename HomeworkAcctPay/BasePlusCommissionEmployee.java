class BasePlusCommissionEmployee extends CommissionEmployee {

   private double basePay;
   
   public BasePlusCommissionEmployee(String firstName, String lastName, String socialName, double grossSales, double commissionRate, double basePay) {
      super(firstName, lastName, socialName, grossSales, commissionRate);
      this.basePay = basePay;
   }
   
   public double getBase() {
      return basePay;
   }
   
   public void setBase(double basePay) {
      this.basePay = basePay;
   }
   
   @Override
   public double getPaymentAmount() {
      return super.getPaymentAmount() + basePay;
   }
   
   @Override
   public String toString() {
      return super.toString();
   }

}