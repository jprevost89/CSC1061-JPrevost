import java.util.Scanner;


class Logging { // start class Logging

   Scanner scnr = new Scanner(System.in);
   
   public void programIntro() { // start programIntro
   
      System.out.println("\nThis program will calculate the payment for a given loan amount\n"
      + "and list the entire payment schedule.");
      
   } // end programIntro
   
   
   public void loanValues(double interest, double numPayments, double payment) { // start loanValues
   
      System.out.println("\ninterest rate per period: " + interest
                        +"\nnumber of payments: " + (int) numPayments 
                        +"\npayment: " + String.format("%.2f", payment) 
                        +"\nTotal of all payments: " + String.format("%.2f", payment * numPayments) // factor total cost of loan with interest
                        +"\n\nPayment   Loan Balance   To principle    To interest"); 
      
   } // end loanValues
   
   
   public double loanInput() { // start loanInput
   
      System.out.print("Enter the loan amount (between 1000 and 999999999). ");
      
      double value;
      
      while (true) { // start while-loop
         try {
            value = scnr.nextDouble();
            if( value <= 999999999 && value >= 1000) { // prevent loan values greater than 999,999,999 and less than 1,000
               break;
            }
            System.out.println("Invalid input.\nInput a number greater than or equal to 1000 and less than 10 characters");
         } catch (Exception e) {
             System.out.println("Invalid input.\nInput a number greater than or equal to 1000 and less than 10 characters");
             scnr.nextLine();
         }
      } // end while-loop
      
      return value;
      
   } // end loanInput
   
   
   public double interestInput() { // start interestInput
   
      System.out.print("\nEnter the annual interest rate (between 1 and 30). ");
      
      double value;
      
      while(true) { // start while-loop
         try {
            value = scnr.nextDouble();
            if( value <= 30 && value >= 1) { // prevent interest values greater than 30 and less than 1
               break;
            }
            System.out.println("Invalid input.\nInput a number greater than or equal to 1 and less than or equal to 30");
         } catch (Exception e) {
            System.out.println("Invalid input.\nInput a number greater than or equal to 1 and less than or equal to 30");
            scnr.nextLine();
         }
      } // end while-loop
      
      return value;
      
   } // end interestInput
   
   
   public double yearsInput() { // start yearsInput
   
      System.out.print("\nEnter the number of years to pay off the loan (between 1 and 40). ");
      
      double value;
      
      while(true) { // start while-loop
         try {
            value = scnr.nextDouble();
            if( value <= 40 && value >= 1) { // prevent years values greater than 40 and less than 1
               break;
            }
            System.out.println("Invalid input.\nInput a number greater than or equal to 1 and less than or equal to 40");
         } catch (Exception e) {
            System.out.println("Invalid input.\nInput a number greater than or equal to 1 and less than or equal to 40");
            scnr.nextLine();
         }
      } // end while-loop
      
      return value;
      
   } // end yearsInput
   
   
   public void paymentLogs(int paymentCount, double payment, double loanAmount, double interestPerPeriod) { // start paymentLogs
   
      String convertedValues = String.format("%7s", paymentCount) 
         + String.format("%15.2f", loanAmount) 
         + String.format("%15.2f", payment - (interestPerPeriod * loanAmount)) 
         + String.format("%15.2f", (interestPerPeriod * loanAmount));
            
      System.out.println(convertedValues); // log payment values
      
   } // end paymentLogs
   
   
   public int rerunQuestion() { // start rerunQuestion
   
      System.out.print("\n\nCalculate another loan? (1 for yes) ");
      int rerun = 0;
      try { // start try-catch
         rerun = scnr.nextInt();
      } catch (Exception e) {
         // Ignore error since user did not input a 1 and other value can be interpreted as the user wishing to quit the program
      } // end try-catch
      return rerun;
   } // end rerunQuestion
   
   public void endRun() { // start endRun
   
      System.out.println("\nGoodbye.");
      
   } // end endRun
   
}