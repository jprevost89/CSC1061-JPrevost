class CommissionEmployee extends Employee { // start class CommissionEmployee

   private double grossSales;
   private double commissionRate;
   
   public CommissionEmployee(String firstName, String lastName, String socialSecurity, double grossSales, double commissionRate) { // start Constructor CommissionEmployee
      super(firstName, lastName, socialSecurity);
      this.grossSales = grossSales;
      this.commissionRate = commissionRate;
   } // end Constructor CommissionEmployee
   
   public double getSales() { // start method getSales
      return grossSales;
   } // end method getSales
   
   public void setSales(double grossSales) { // start method setSales
      this.grossSales = grossSales;
   } // end method setSales
   
   public double getRate() { // start method getRate
      return grossSales;
   } // end method getRate
   
   public void setRate(double commissionRate) { // start method setRate
      this.commissionRate = commissionRate;
   } // end method setRate
   
   @Override
   public double getPaymentAmount() { // start method getPaymentAmount
      return grossSales * commissionRate;
   } // end method getPaymentAmount
   
   @Override
   public String toString() { // start method toString
      return super.toString() +
         "\nPayment Amount: " + getPaymentAmount();
   } // end method toString

} // end class CommissionEmployee