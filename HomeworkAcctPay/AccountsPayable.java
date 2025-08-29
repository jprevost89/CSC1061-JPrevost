import java.util.Scanner;

class AccountsPayable { // start class AccountsPayable

   public static void main(String[] args) { // start
      
      Scanner scnr = new Scanner(System.in);
      
      Employee[] payableEmployees = new Employee[6];
      
      for (int i = 0; i < payableEmployees.length; i++) { // start for-loop
         System.out.println("\nEnter Employee Type: 1 = Salaried, 2 = Hourly, 3 = Commission, 4 = Base + Commission\n");
         int employeeType = scnr.nextInt();
         scnr.nextLine();
         
         System.out.println("\nEnter employee first name: ");
         String first = scnr.nextLine();
         
         System.out.println("\nEnter employee last name: ");
         String last = scnr.nextLine();
         
         System.out.println("\nEnter employee social security number: ");
         String social = scnr.nextLine();
         
         switch(employeeType) { // start switch-case
            case 1: // Salaried Employee
               System.out.println("\nEnter employee salary: ");
               double salary = scnr.nextDouble();
               scnr.nextLine();
               
               payableEmployees[i] = new SalariedEmployee(first, last, social, salary);
               break;
               
            case 2: // Commission Employee
               System.out.println("\nEnter employee commission: ");
               double commission = scnr.nextDouble();
               scnr.nextLine();
               
               System.out.println("\nEnter employee commission rate: ");
               double rate = scnr.nextDouble();
               scnr.nextLine();
               
               payableEmployees[i] = new CommissionEmployee(first, last, social, commission, rate);
               break;
               
            case 3: // Hourly Employee
               System.out.println("\nEnter employee hourly rate: ");
               double hourly = scnr.nextDouble();
               scnr.nextLine();
               
               System.out.println("\nEnter employee hours worked: ");
               int hours = scnr.nextInt();
               scnr.nextLine();
               
               payableEmployees[i] = new HourlyEmployee(first, last, social, hourly, hours);
               break;
               
            case 4: // Base + Commission Employee
               System.out.println("\nEnter employee commission: ");
               commission = scnr.nextDouble();
               scnr.nextLine();
               
               System.out.println("\nEnter employee commission rate: ");
               rate = scnr.nextDouble();
               scnr.nextLine();
               
               System.out.println("\nEnter employee base pay: ");
               salary = scnr.nextDouble();
               scnr.nextLine();
               
               payableEmployees[i] = new BasePlusCommissionEmployee(first, last, social, commission, rate, salary);
               break;
         } // end switch-case
      
      } // end for-loop
      System.out.println("-------------- Original Pay --------------");
      for (Employee e : payableEmployees) {
         printEmployee(e); // print employee name with initial pay
         if (e instanceof BasePlusCommissionEmployee) { // increase BasePlusCommisionEmployee basePay by 10%
            BasePlusCommissionEmployee bp = (BasePlusCommissionEmployee) e;
            double newBase = bp.getBase() * 1.10;
            bp.setBase(newBase);
         }
      }
      
      System.out.println("\n-------------- Updated Pay --------------");
      for (Employee e : payableEmployees) {
         printEmployee(e); // print employee name with updated pay
      }
      
   } // end
   
   public static void printEmployee(Employee e) { // start method printEmployee
      System.out.println("\nEmployee Name: " + e.getFirstName() + " " + e.getLastName());
      System.out.println("Payment: " + String.format("%.2f", e.getPaymentAmount()));
   } // end method printEmployee

} // end class AccountsPayable