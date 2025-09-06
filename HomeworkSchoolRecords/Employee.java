/**
  * Represents employee, which is a type of person.
  */

class Employee extends Person { // start class Employee 
   private String office;
   private String salary;
   private String hireDate;
   
   /**
     * Constructs a new Employee object.
     *
     * @param name         person's name
     * @param address      person's address
     * @param phoneNumber  person's phone number
     * @param emailAddress person's email address
     * @param office       person's office location
     * @param salary       person's salary
     * @param hireDate     person's hire date
     */
   public Employee(String name, String address, String phone, String email, String office, String salary, String hireDate) { // start Employee constructor
      super(name, address, phone, email);
      this.office = office;
      this.salary = salary;
      this.hireDate = hireDate;
   } // end Employee constructor
   
   /**
     * Returns employee details as a string.
     *
     * @return formatted employee details
     */
   @Override
   public String toString() {
      return super.toString() + ", Office: " + office + ", Salary: " + salary + ", Hire Date: " + hireDate; 
   }
} // end class Employee