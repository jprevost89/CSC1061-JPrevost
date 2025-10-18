import java.util.LinkedList;
/**
 * Custom HashMap class
 * Creates a HashMap that takes two values, combines then via the Entry class,
 * and stores them into an array of LinkedLists by hashing the key
 */
public class MyHashMap<K, V> { // start class MyHashMap
   private class Entry<K, V> { // start class Entry
      K key;
      V value;
      Entry(K key, V value) {
         this.key = key;
         this.value = value;
      }
   } // end class Entry
   
   private LinkedList<Entry<K, V>>[] buckets;
   private int numBuckets;
   private int numEntries;
   private final double loadFactorThreshold = 0.5;
   
   public MyHashMap() { // start constructor MyHashMap
      numBuckets = 10;
      buckets = new LinkedList[numBuckets];
      for(int i = 0; i < numBuckets; i++) {
         buckets[i] = new LinkedList<>();
      }
   } // end constructor MyHashMap
   
   private int getBucketIndex(K key) { // start method getBucketIndex
      int hashCode = Math.abs(key.hashCode());
      return hashCode % numBuckets;
   } // end method getBucketIndex
   
   public void put(K key, V value) { // start method put
        int bucketIndex = getBucketIndex(key);
        LinkedList<Entry<K, V>> bucket = buckets[bucketIndex];

        for (Entry<K, V> entry : bucket) { // start for-loop
            if (entry.key.equals(key)) {
                entry.value = value;
                return;
            }
        } // end for-loop

        bucket.add(new Entry<>(key, value));
        numEntries++;

        if ((double) numEntries / numBuckets > loadFactorThreshold)
            rehash();
    } // end method put

    private void rehash() { // start method rehash
        LinkedList<Entry<K, V>>[] oldBuckets = buckets;
        numBuckets *= 2;
        buckets = new LinkedList[numBuckets];
        for (int i = 0; i < numBuckets; i++) { // start for-loop
            buckets[i] = new LinkedList<>();
        } // end for-loop
        
        numEntries = 0;

        for (LinkedList<Entry<K, V>> bucket : oldBuckets) { // start for-loop
            for (Entry<K, V> entry : bucket) {
                put(entry.key, entry.value);
            }
        } // end for-loop
    } // end method rehash

    public V get(K key) { // start method get
        int bucketIndex = getBucketIndex(key);
        for (Entry<K, V> entry : buckets[bucketIndex]) { // start for-loop
            if (entry.key.equals(key))
                return entry.value;
        } // end for-loop
        return null;
    } // end method get

    public boolean containsKey(K key) { // start method containsKey
        return get(key) != null;
    } // end method containsKey

} // end class MyHashMap