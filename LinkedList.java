/**
 * Class LinkedList - implements the List Interface.
 * 
 * @author Daryl Smith, MSc IT 
 * @version 1
 */

public class LinkedList implements List 
{

	Node headNode;
	
	// true if this list contains no elements
     public boolean isEmpty()
     {
    	 if(headNode == null) 
    	 {
    		 return true;
    	 }
    	 else 
    	 {
    		 return false;
    	 }
    		 
     }
     
     // the number of elements in this list
     public int size()
     {
    	 if (this.isEmpty()) 
    	 {
    		 return 0;
    	 }
 
    	 Node currentNode = headNode;
    	 int i = 1;
    	 while (currentNode.getNext() != null) 
    	 {
    		 i++;
    		 currentNode = currentNode.getNext();
    	 }
    	 return i;
     }

    @Override
	public ReturnObject get(int index) 
    {
		 if (index < 0 || index >= size()) 
		 {
			ReturnObjectImpl errorObject = new ReturnObjectImpl(true, ErrorMessage.INDEX_OUT_OF_BOUNDS, null);
			return errorObject;
		 }
		 if (this.isEmpty()) 
		 {
				ReturnObjectImpl errorObject = new ReturnObjectImpl(true, ErrorMessage.EMPTY_STRUCTURE, null);
				return errorObject;
		 }
	
		 Node currentNode = headNode;
		 if (index == 0 ) 
		 {
			 ReturnObjectImpl returnObject = new ReturnObjectImpl(false, ErrorMessage.NO_ERROR, headNode.getObject());
			 return returnObject;
		 }

		 int i = 0;
		 while (i != index) 
		 {
			 i++;
			 currentNode = currentNode.getNext();
		 }

		 ReturnObjectImpl returnObject = new ReturnObjectImpl(false, ErrorMessage.NO_ERROR, currentNode.getObject());
		 return returnObject;
		 
 	 }

	@Override
	public ReturnObject remove(int index) 
	{
		 if (index < 0 || index >= size()) 
		 {
			ReturnObjectImpl errorObject = new ReturnObjectImpl(true, ErrorMessage.INDEX_OUT_OF_BOUNDS, null);
			return errorObject;
		 }

		 if (index == 0) 
		 {
			 Node savedNode = headNode;
			 headNode = savedNode.getNext();
			 
			 ReturnObjectImpl returnObject = new ReturnObjectImpl(false, ErrorMessage.NO_ERROR, savedNode.getObject());		
			 return returnObject;			 
		 }
		 
		 Node currentNode = headNode;
		 int i = 0;
		 while (i != index -1) 
		 {
			 i++;
			 currentNode = currentNode.getNext();
		 }
		 Node savedNode = currentNode.getNext();
		 currentNode.setNext(currentNode.getNext().getNext());
		 
		 ReturnObjectImpl returnObject = new ReturnObjectImpl(false, ErrorMessage.NO_ERROR, savedNode.getObject());		
		 return returnObject;			 
	}

	@Override
	public ReturnObject add(int index, Object item) 
	{
		 if (index < 0 || index >= size()) 
		 {
			ReturnObjectImpl errorObject = new ReturnObjectImpl(true, ErrorMessage.INDEX_OUT_OF_BOUNDS, null);
			return errorObject;
		 }
		if (item == null) 
		{
			ReturnObjectImpl errorObject = new ReturnObjectImpl(true, ErrorMessage.INVALID_ARGUMENT, null);		
			return errorObject;	
		}

		Node currentNode = headNode;
		if (index == 0) 
		{
			 Node newNode = new Node(item, headNode);		
			 headNode = newNode;
			 
			 ReturnObjectImpl returnObject = new ReturnObjectImpl(false, ErrorMessage.NO_ERROR, item);		
			 return returnObject;	
		}
			
		int i = 0;
		 while (i != index -1) 
		 {
			 i++;
			 currentNode = currentNode.getNext();
		 }
		 Node newNode = new Node(item, null);		
		 Node savedNode = currentNode.getNext();
		 currentNode.setNext(newNode);
		 currentNode = currentNode.getNext();
		 currentNode.setNext(savedNode);
		 
		 ReturnObjectImpl returnObject = new ReturnObjectImpl(false, ErrorMessage.NO_ERROR, item);		
		 return returnObject;	
	}

	@Override
	public ReturnObject add(Object item) 
	{
		if (item == null) {
			ReturnObjectImpl errorObject = new ReturnObjectImpl(true, ErrorMessage.INVALID_ARGUMENT, null);		
			return errorObject;	
		}
		
		if (headNode == null) 
		{
			 Node newNode = new Node(item, headNode);		
			 headNode = newNode;
			 
			 ReturnObjectImpl returnObject = new ReturnObjectImpl(false, ErrorMessage.NO_ERROR, item);		
			 return returnObject;	
		}
		
		 Node currentNode = headNode;
		 while (currentNode.getNext() != null) 
		 {
			 currentNode = currentNode.getNext();
		 }
		 Node newNode = new Node(item, null);		
		 currentNode.setNext(newNode);
		 ReturnObjectImpl returnObject = new ReturnObjectImpl(false, ErrorMessage.NO_ERROR, item);		
		 return returnObject;	
	}
	
	public void printMe() 
	{
		if (this.headNode == null) 
		{
			return;
		}
		
		Node currentNode = headNode;
		while (currentNode != null) 
		{
			System.out.print(currentNode.getObject() + " ");
			currentNode = currentNode.getNext();
		}
		System.out.println();
	}
}     