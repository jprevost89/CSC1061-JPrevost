/**
  * Represents faculty, which is a type of employee.
  */

class Faculty extends Employee { // start class Faculty
   private String officeHours;
   private String rank;
   
   /**
     * Constructs a new Faculty object.
     *
     * @param name         person's name
     * @param address      person's address
     * @param phoneNumber  person's phone number
     * @param emailAddress person's email address
     * @param office       person's office location
     * @param salary       person's salary
     * @param hireDate     person's hire date
     * @param officeHours  person's office hours
     * @param rank         person's rank
     */
   public Faculty(String name, String address, String phone, String email, String office, String salary, String hireDate, String officeHours, String rank) { // start Faculty constructor
      super(name, address, phone, email, office, salary, hireDate);
      this.officeHours = officeHours;
      this.rank = rank;
   } // end Faculty constructor
   
   /**
     * Returns faculty details as a string.
     *
     * @return formatted faculty details
     */
   @Override
   public String toString() {
      return "Faculty - " + super.toString() + ", Office Hours: " + officeHours + ", Rank: " + rank  + "\n"; 
   }
} // end class Faculty