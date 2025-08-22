class InterestCalculator { // start class InterestCalculator

   Logging mssg = new Logging();
   
   public void interestCalculator() { // start interestCalculator
   
      mssg.programIntro();
      
      double loanAmount = mssg.loanInput();
      double interestRate = mssg.interestInput();
      double numberOfYears = mssg.yearsInput();
      
      double interestPerPeriod = ( interestRate / 100.00 ) / 12; // Annual interestRate converted to decimal and divided by 12 for rate per pay period
      double numPayments = numberOfYears * 12; // 12 payments per year
      
      numPayments = (numPayments % 2 != 0) ? Math.ceil(numPayments) : numPayments; 
      // if numPayments is a floating value then numPayments is rounded up
      
      double payment = (interestPerPeriod * loanAmount) / (1 - Math.pow(1 + interestPerPeriod, -numPayments)); 
      /* 'payment' is calculated with the following formula:       
                                      r = rate per period    
            r(PV)                    PV = PRESENT VALUE 
       _________________              n = number of years                            
       1 - ( 1 + r ) ^-n                                     */
                                                                                                                                                                  
      mssg.loanValues(interestPerPeriod, numPayments, payment);
      
      int paymentCount = 1; // track payment amortization
      
      while( numPayments > 0) { // start while loop
      
         mssg.paymentLogs(paymentCount, payment, loanAmount, interestPerPeriod);
         
         loanAmount = loanAmount - (payment - (interestPerPeriod * loanAmount)); // subtract payment to principle from loan balance
         paymentCount += 1; // increase paymentCount by 1
         numPayments -= 1; // decrease numPayments by 1
         
      } // end while loop
      
   } // end interestCalculator
   
} // end class InterestCalculator