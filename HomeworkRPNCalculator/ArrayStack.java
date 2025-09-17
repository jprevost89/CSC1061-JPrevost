import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * ArrayStack class for the Calc project.
 * Implements Stack and defines methods for managing 
 * and maintaining data in Array Stack
 */
class ArrayStack implements Stack { // start class ArrayStack
   private Integer[] intArray;
   private int size;
   private static final int DEFAULT_CAPACITY = 10;
   
   public ArrayStack() { // start default constructor for ArrayStack
      intArray = new Integer[DEFAULT_CAPACITY];
      size = 0;
   } // end default constructor for ArrayStack
   
   public void push(int input) { // start method push
      if (intArray.length == size) {
         intArray = Arrays.copyOf(intArray, intArray.length * 2);
      }
      intArray[size] = input;
      size++;
   } // end method push
   
   public int pop() { // start method pop
      if(isEmpty()) {
         System.out.println("ArrayStack is empty");
         return 0;
      }
      int popValue = intArray[size - 1];
      intArray[size - 1] = null;
      --size;
      return popValue;
   } // end method pop
   
   public int peek() { // start method peek
      if(isEmpty()) {
         throw new EmptyStackException();
      }
      return intArray[size - 1];
   } // end method peek
   
   public boolean isEmpty() { // start method isEmpty
      return size == 0;
   } // end method isEmpty
   
   public int size() { // start method size
      return size;
   } // end method size
   
   public String toString() { // start method toString
      int[] stringArray = new int[size];
      for ( int i = 0; i < size; i++ ) {
         stringArray[i] = intArray[i];
      }
      return Arrays.toString(stringArray);
   } // end method toString
} // end class ArrayStack