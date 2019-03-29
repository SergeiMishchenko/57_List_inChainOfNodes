/**
 Test list features.
 */
public class UserOfList {
    public static void main( String[] args ) {
        List_inChainOfNodes list = new List_inChainOfNodes();

        System.out.println( "number of elements: " + list.size() );
        
        // the spec requests that toString include the size
        System.out.println( "empty list: " + list
                            + System.lineSeparator());

        /* Populate the list with elements.
           Create the test data in an array, for the programming
           convenience of being able to loop through it.
        */
        String[] elements = new String[]{"y","u","t","S",};
            /* convenient syntax      ^^^^^^^^^^^^^^^^^^^^
               for convenient way to init an array of Strings */
        int elemIndex;
        for( String elem : elements ) {
            list.addAsHead( elem);
            System.out.println( "number of elements: " + list.size()  );
        }
        System.out.println( "populated list: " + list
                          + System.lineSeparator());
		
		//Tests middle case
		System.out.println("Test:" + System.lineSeparator()
		                   +"set: " + list.set(1, "v") + ", expecting v" 
		                   + System.lineSeparator()
						   + "get: " + list.get(2) + ", expecting u"
						   + System.lineSeparator()
        //Tests edge case
                           + "get: " + list.get(0) + ", expecting S"
						   + System.lineSeparator()
						                              + "get: " + list.get(1) + ", expecting S"
						   + System.lineSeparator()
                           + "set: " + list.set(0, "x") + ", expecting x" 		
		                   + System.lineSeparator()
						   + "get: " + list.get(3) + ", expecting y"
		                   + System.lineSeparator()
						   + "set: " + list.set(3, "w") + ", expecting w"
						   + System.lineSeparator()
						   + "new edited list: " + list);								   
    }
}
