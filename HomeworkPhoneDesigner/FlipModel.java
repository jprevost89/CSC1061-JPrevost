class FlipModel extends Phone implements Comparable, Repairable{ // start class FlipModel

   public FlipModel(String imei) { // start FlipModel constructor
      super(imei, "16GB", "3MB", "HorseRacer 300 processor");
   } // end FlipModel constructor

   public FlipModel(String imei, String storage, String cache, String processor) { // start FlipModel constructor
      super(imei, storage, cache, processor);
   } // end FlipModel constructor
   
   public String howToRepair() { // start howToRepair method
      return "Repairing this Flip phone is like this.";
   } // end howToRepair method
   
   public String costToRepair() { // start costToRepair method
      return "The Flip costs $300 to repair.";
   } // end costToRepair method
   
   public String compare(Phone a) { // start compare method
      return "        " + this.getClass().getSimpleName() + " | " + a.getClass().getSimpleName() + "\n"
         + "Cache:       " + this.getCache() + "  | " + a.getCache() + "\n"
         + "Storage:     " + this.getStorage() + " | " + a.getStorage() + "\n";
   } // end compare method

} // end class FlipModel