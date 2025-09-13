class BarModel extends Phone implements Repairable, Comparable{ // start class BarModel

   public BarModel(String imei) { // start BarModel constructor
      super(imei, "32GB", "8MB", "DragonSleyer 600 processor");
   } // end BarModel constructor

   public BarModel(String imei, String storage, String cache, String processor) { // start BarModel constructor
      super(imei, storage, cache, processor);
   } // end BarModel constructor
   
   public String howToRepair() { // start howToRepair method
      return "Repairing this Bar phone is like this.";
   } // end howToRepair method
   
   public String costToRepair() { // start costToRepair method
      return "The Bar costs $400 to repair.";
   } // end costToRepair method
   
   public String compare(Phone a) { // start compare method
      return "         " + this.getClass().getSimpleName() + " | " + a.getClass().getSimpleName() + "\n"
         + "Cache:       " + this.getCache() + "  | " + a.getCache() + "\n"
         + "Storage:     " + this.getStorage() + " | " + a.getStorage() + "\n";
   } // end compare method

} // end class BarModel