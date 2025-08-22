class DemographicInfo { //start class DemographicInfo
   private String firstName; 
   private String lastName; 
   private String age; 
   private String sex; 
   private String maritalStatus; 
   private String occupation; 
   private String streetAddress; 
   private String city; 
   private String state;
   private String zipCode;
   
   public DemographicInfo(String record) { //start constructor DemographicInfo
      String[] info = record.split(",");
      this.setAll(info);
   } //end constructor DemographicInfo
   
   private void setAll(String[] info) { //start method setAll
      this.firstName = info[0]; 
      this.lastName = info[1]; 
      this.age = info[2]; 
      this.sex = info[3]; 
      this.maritalStatus = info[4]; 
      this.occupation = info[5]; 
      this.streetAddress = info[6]; 
      this.city = info[7]; 
      this.state = info[8];
      this.zipCode = info[9];
   } //end method setAll
   
   public void printInfoShort() { //start method printInfoShort
      System.out.printf("%12s %12s %4s %7s %8s %20s %18s %13s %6s %6s\n", // sort and print demographic details
                        this.lastName,  
                        this.firstName, 
                        this.age, 
                        this.sex,
                        this.maritalStatus, 
                        this.occupation, 
                        this.streetAddress,
                        this.city,
                        this.state,
                        this.zipCode);
   } //end method printInfoShort

} //end class DemographicInfo