/**
  Implement a list of diverse types, including
  integers, double-precision floating point numbers,
  and Strings.
 */

public class List_inArraySlots {

    private int[]    intElements;
    private double[] doubleElements;
    private String[] stringElements;
    private int filledElements; // the number of elements in this list
    
    /* type identifier for each element
       That is, typeOfElements[i] == 0 means element i is an integer;
                                     1 means element i is a double;
                                     2 means element i is a String.
        Optional extra education in programming (not comp sci):
            replace these "magic numbers" with an "enumerated type".
     */
    private int[] typeOfElements;

    private static final int INITIAL_CAPACITY = 10;

    /**
      Construct an empty list with a small initial capacity.
     */
    public List_inArraySlots() {
         intElements = new int[5];
         doubleElements = new double[5];
         stringElements = new String[5];
         typeOfElemenrs = new int[15];
         filledElements = 0;
    }


    /**
      @return the number of elements in this list
     */
     public int size() {
           return filledElements;
     }


     /**
       @return a string representation of this list,
       in [a,b,c,] format
      */
     public String toString() {
          
     }


    /**
      Appends @value to the end of this list.

      @return true, in keeping with conventions yet to be discussed
     */
      public boolean add( int type   // same meaning as in typeOfElements
                        , int    intValue
                        , double doubleValue
                        , String stringValue
                        ) {
        if (filledElements == typeOfElements.length)
            expand();
        intElements[filledElements] = intValue;
        doubleElements[filledElements] = doubleValue;
        stringElements[filledElements] = stringValue;
        typeOfElements[filledElements ++] = type;
        return true;
      }


    /**
      Double the capacity of the List_inArraySlots,
      preserving existing data.
     */
      private void expand() {
          System.out.println( "expand... (for debugging)");
          int[] intStorage = intElements; //store old list
          intElements = new int[2 * slotsFilled]; //create new list
          for(int i = 0; i < intStorage.length; i++) //repopulate with old values
          intElements[i] = intStorage[i];   
          int[] storage = list; //store old list
          list = new int[2 * slotsFilled]; //create new list
          for(int i = 0; i < storage.length; i++) //repopulate with old values
          list[i] = storage[i];  
          int[] storage = list; //store old list
          list = new int[2 * slotsFilled]; //create new list
          for(int i = 0; i < storage.length; i++) //repopulate with old values
          list[i] = storage[i];  
          int[] storage = list; //store old list
          list = new int[2 * slotsFilled]; //create new list
          for(int i = 0; i < storage.length; i++) //repopulate with old values
          list[i] = storage[i];         
      
      }
}