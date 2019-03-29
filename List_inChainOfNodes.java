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
		   
		Iterated though a chan of notdes using a simple for:
      */
     public String toString() {
		 String description = "# elements" + "[";
		 for (Node cycleNode = headReference; 
		      cycleNode != null;
			  cycleNode = cycleNode.getReferenceToNextNode())
			  description += cycleNode.getCargoReference();
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
		 if (index == 0) addAsHead (val);
		 else{
			int counter = 0;
			Node previousNode = getNode(index - 1);
			Node referenceOfPreviousNode = previousNode.getReferenceToNextNode();
			Node addedNode = new Node(val, referenceOfPreviousNode);
			previousNode.setReferenceToNextNode(addedNode);
		 }
		 return true;
     }	 
	
	public Object set( int index, Object newValue ) {
        Node indexedReference = getNode(index);
		indexedReference.setCargoReference(newValue);
		return get (index);
    }
	
    public Node getNode ( int index ) {
        // cycles through the list in chain of nodes. Assumes that the index is a valid index 
		Node cycleNode = headReference;
		for (int counter  = 0; counter < index  && cycleNode != null; counter++){
			cycleNode = cycleNode.getReferenceToNextNode();
		}
        return cycleNode;
    }
	
	public Object get (int index) {
		return getNode(index).getCargoReference();
	}
	 
	 public void remove( int index) {
        Node removedNode = getNode(index);
		Node previousNode = getNode (index -1);
		previousNode.setReferenceToNextNode(removedNode.getReferenceToNextNode());
     }
}