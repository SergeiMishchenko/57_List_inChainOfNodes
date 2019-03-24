/**
  Represent a list, implemented in a chain of nodes
 */

public class List_inChainOfNodes{
    private Node headReference;

    /**
      Construct an empty list
     */
     

    /**
      @return the number of elements in this list
     */
     public int size() {
		 int length = 0;
		 Node cycleNode = headReference;
		 while (cycleNode != null){
			 cycleNode = cycleNode.getReferenceToNextNode();
			 length++;
		 }
		 return length;
     }

    
     /**
       @return a string representation of this list,
       format:
           # elements [element0,element1,element2,] 
      */
     public String toString() {
		 String description = "# elements" + "[";
		 Node cycleNode = headReference;
		 while (cycleNode != null){
			 description += cycleNode.getCargoReference() + ",";
			 cycleNode = cycleNode.getReferenceToNextNode();
		 }
		 description += "]";
		 return description;
     }
    
    
    /**
      Append @value to the head of this list.

      @return true, in keeping with conventions yet to be discussed
     */
     public boolean addAsHead( Object val) {
		 Node copyNode = headReference;
		 headReference = new Node(val, copyNode);
		 return true;
     }
	 
}