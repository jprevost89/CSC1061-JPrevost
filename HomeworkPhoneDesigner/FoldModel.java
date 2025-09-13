class FoldModel extends Phone implements Comparable{ // start class FoldModel
   
   public FoldModel(String imei) { // start FoldModel constructor
      super(imei, "64GB", "6MB", "SpeedRacer 800 processor");
   } // end FoldModel constructor
   
   public FoldModel(String imei, String storage, String cache, String processor) { // start FoldModel constructor
      super(imei, storage, cache, processor);
   } // end FoldModel constructor
  
   public String compare(Phone a) { // start compare method
      return "        " + this.getClass().getSimpleName() + " | " + a.getClass().getSimpleName() + "\n"
         + "Cache:       " + this.getCache() + "  | " + a.getCache() + "\n"
         + "Storage:     " + this.getStorage() + " | " + a.getStorage() + "\n";
   } // end compare method
   
} // end class FoldModel