/**
  * Represents staff, which is a type of employee.
  */
  
class Staff extends Employee { // start class Staff
   private String title;
   
   /**
     * Constructs a new Staff object.
     *
     * @param name         person's name
     * @param address      person's address
     * @param phoneNumber  person's phone number
     * @param emailAddress person's email address
     * @param office       person's office location
     * @param salary       person's salary
     * @param hireDate     person's hire date
     * @param title        person's job title
     */
   public Staff(String name, String address, String phone, String email, String office, String salary, String hireDate, String title) { // start Staff constructor
      super(name, address, phone, email, office, salary, hireDate);
      this.title = title;
   } // end Staff constructor

   /**
     * Returns staff details as a string.
     *
     * @return formatted staff details
     */
   @Override
   public String toString() { // start method toString
      return "Staff - " + super.toString() + ", Title: " + title + "\n"; 
   } // end method toString
} // end class Staff