/**
  * Represents a student, which is a type of person.
  */

class Student extends Person { // start class Student
   private String status;
   
   /**
     * Constructs a Student object.
     *
     * @param name         the student's name
     * @param address      the student's address
     * @param phoneNumber  the student's phone number
     * @param emailAddress the student's email address
     * @param status       the student's academic status
     */
   public Student(String name, String address, String phone, String email, String status) { // start Student constructor
      super(name, address, phone, email);
      this.status = status;
   } // end Student constructor
   
   /**
     * Returns student details as a string.
     *
     * @return formatted student details
     */
   @Override
   public String toString() { // start method toString
      return "Student - " + super.toString() + ", Status: " + status + "\n"; 
   } // end method toString
} // end class Student