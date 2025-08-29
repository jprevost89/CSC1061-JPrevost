class Employee { // start class Employee

   private String firstName;
   private String lastName;
   private String socialSecurity;
   
   public double getPaymentAmount() { // start method getPaymentAmount
      return 00.0;
   }; // end method getPaymentAmount
   
   public Employee(String firstName, String lastName, String socialSecurity) { // start Employee Constructor
      this.firstName = firstName;
      this.lastName = lastName;
      this.socialSecurity = socialSecurity;
   } // end Employee Constructor
   
   public void setFirstName(String firstName) { // start method setFirstName
      this.firstName = firstName;
   } // end method setFirstName
   
   public String getFirstName() { // start method getFirstName
      return firstName;
   } // end method getFirstName
   
   public void setLastName(String lastName) { // start method setLastName
      this.lastName = lastName;
   } // end method setLastName
   
   public String getLastName() { // start method getLastName
      return lastName;
   } // end method getLastName
   
   public void setSocial(String socialSecurity) { // start method setSocial
      this.socialSecurity = socialSecurity;
   } // end method setSocial
   
   public String getSocial() { // start method getSocial
      return socialSecurity;
   } // end method getSocial
   
   public String toString() { // start method toString
      return "\nFirst: " + firstName
           + "\nLast: " + lastName
           + "\nSocial: " + socialSecurity;
   } // end method toString

} // end class Employee