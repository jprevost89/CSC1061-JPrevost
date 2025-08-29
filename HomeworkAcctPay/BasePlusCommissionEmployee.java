class BasePlusCommissionEmployee extends CommissionEmployee { // start class BasePlusCommissionEmployee

   private double basePay;
   
   public BasePlusCommissionEmployee(String firstName, String lastName, String socialName, double grossSales, double commissionRate, double basePay) { // start Constructor BasePlusCommissionEmployee
      super(firstName, lastName, socialName, grossSales, commissionRate);
      this.basePay = basePay;
   } // end Constructor BasePlusCommissionEmployee
   
   public double getBase() { // start method getBase
      return basePay;
   } // end method getBase
   
   public void setBase(double basePay) { // start method setBase
      this.basePay = basePay;
   } // end method setBase
   
   @Override
   public double getPaymentAmount() { // start method getPaymentAmount
      return super.getPaymentAmount() + basePay;
   } // end method getPaymentAmount
   
   @Override
   public String toString() { // start method toString
      return super.toString();
   } // end method toString

} // end class BasePlusCommissionEmployee