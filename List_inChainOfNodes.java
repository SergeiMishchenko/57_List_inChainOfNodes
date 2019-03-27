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

     public boolean addIndex(int index, Object val) { //assumes that index is a valid index
		 int counter = 0;
		 Node previousNode = headReference;
		 while (counter != index - 1 && previousNode != null){
			 counter++;
			 previousNode = previousNode.getReferenceToNextNode();
		 }
		 Node referenceOfPreviousNode = previousNode.getReferenceToNextNode();
		 Node addedNode = new Node(val, referenceOfPreviousNode);
		 previousNode.setReferenceToNextNode(addedNode);
		 return true;
     }	 
	
	public void set( int index, Object newValue ) {
        Node indexedReference = get(index);
		indexedReference.setCargoReference(newValue);
    }
	
    public Node get( int index ) {
        // cycles through the list in chain of nodes. Assumes that the index is a valid index 
		Node cycleNode = headReference;
		for (int counter  = 0; counter < index + 1 && cycleNode != null; counter++){
			cycleNode = cycleNode.getReferenceToNextNode();
			counter++;
		}
        return cycleNode;
    }
	 
	 public void remove( int index) {
        Node removedNode = get(index);
		Node previousNode = get (index -1);
		previousNode.setReferenceToNextNode(removedNode.getReferenceToNextNode());
     }
}