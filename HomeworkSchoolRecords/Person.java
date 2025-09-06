/**
  * Basic Person Class that contains contact details.
  */
  
class Person { // start class Person
   private String name;
   private String address;
   private String phone;
   private String email;
   
   /**
     * Constructs a new Person object.
     *
     * @param name         person's name
     * @param address      person's address
     * @param phoneNumber  person's phone number
     * @param emailAddress person's email address
     */
   public Person(String name, String address, String phone, String email) { // start Person constructor
      this.name = name;
      this.address = address;
      this.phone = phone;
      this.email = email;
   } // end Person constructor
   
   /**
     * Returns person details as a string.
     *
     * @return formatted person details
     */
   @Override
   public String toString() {
      return "Name: " + name + ", Address: " + address + ", Phone: " + phone + ", Email: " + email;
   }
} // end class Person