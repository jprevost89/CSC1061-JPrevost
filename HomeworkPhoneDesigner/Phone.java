import java.util.ArrayList;

/**
 * An abstract base class representing a generic mobile phone.
 * 
 * This class provides common properties and behaviors for a phone,
 * such as IMEI, storage, cache, and processor. It also implements the
 * Cloneable interface to support object cloning.
 *
 * @author Jon Prevost
 */
 
abstract class Phone implements Cloneable { // start class Phone
   
   /** The phone's IMEI as a list of characters. */
   protected ArrayList<Character> imei;
   
   /** The phone's storage capacity. */
   protected String storage;
   
   /** The phone's cache size. */
   protected String cache;
   
   /** The phone's processor model */
   protected String processor;
   
   /**
     * Constructs a new Phone with the specified details.
     *
     * @param imei      the phone's International Mobile Equipment Identity.
     * @param storage   the phone's storage capacity.
     * @param cache     the phone's cache size.
     * @param processor the phone's processor model.
     */
   public Phone(String imei, String storage, String cache, String processor) { // start Phone constructor
      this.setImei(imei);
      this.storage = storage;
      this.cache = cache;
      this.processor = processor;
   } // end Phone constructor
   
   /**
     * Sets the phone's IMEI.
     * The method converts the input string into a list of characters.
     * @param imei
     */
   public void setImei(String imei) { // start setImei method
      this.imei = new ArrayList<Character>();
      for (int i = 0; i < imei.length() ; i++) {
         this.imei.add(imei.charAt(i));
      }
   } // end setImei method
   
   /**
     * Returns the phone's IMEI.
     *
     * @return the IMEI as a list of characters.
     */
   public ArrayList<Character> getImei() { // start getImei method
      return imei;
   } // end getImei method
   
   /**
     * Sets the phone's cache size.
     *
     * @param cache the new cache size.
     */
   public void setCache(String cache) { // start setCache method
      this.cache = cache;
   } // end setCache method
   
   /**
     * Returns the phone's cache size.
     *
     * @return the cache size as a string.
     */
   public String getCache() { // start getCache method
      return cache;
   } // end getCache method
   
   /**
     * Sets the phone's storage capacity.
     *
     * @param storage the new storage capacity.
     */
   public void setStorage(String storage) { // start setStorage method
      this.storage = storage;
   } // end setStorage method
   
   /**
     * Returns the phone's storage capacity.
     *
     * @return the storage capacity as a string.
     */
   public String getStorage() { // start getStorage method
      return storage;
   } // end getStorage method
   
   /**
     * Sets the phone's processor model.
     *
     * @param processor the new processor model.
     */
   public void setProcessor(String processor) { // start setProcessor method
      this.processor = processor;
   } // end setProcessor method
   
   /**
     * Returns the phone's processor model.
     *
     * @return the processor model as a string.
     */
   public String getProcessor() { // start getProcessor method
      return processor;
   } // end getProcessor method
   
   /**
     * Creates and returns a copy of this object.
     *
     * @return a clone of this Phone instance.
     * @throws CloneNotSupportedException
     */
	public Phone clone() throws CloneNotSupportedException { // start clone method
      return (Phone) super.clone();
	} // end clone method
   
} // end class Phone