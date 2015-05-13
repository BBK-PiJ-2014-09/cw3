/**
 * Class FunctionalLinkedList - extends LinkedList and implements the FunctionalList Interface.
 * 
 * @author Daryl Smith, MSc IT 
 * @version 1
 */

public class FunctionalLinkedList extends LinkedList implements FunctionalList 
{
	private LinkedList myFunctionalLinkedList = new LinkedList();

	@Override
	public boolean isEmpty() 
	{
		return myFunctionalLinkedList.isEmpty();
	}

	@Override
	public int size() 
	{
		return myFunctionalLinkedList.size();
	}

	@Override
	public ReturnObject get(int index) 
	{
		return myFunctionalLinkedList.get(index);
	}

	@Override
	public ReturnObject remove(int index) 
	{
		return myFunctionalLinkedList.remove(index);
	}

	@Override
	public ReturnObject add(int index, Object item) 
	{
		return myFunctionalLinkedList.add(index, item);
	}

	@Override
	public ReturnObject add(Object item) 
	{
		return myFunctionalLinkedList.add(item);
	}

	@Override
	public ReturnObject head() 
	{
		if (myFunctionalLinkedList.size() == 0) 
		{
			ReturnObjectImpl errorObject = new ReturnObjectImpl(true, ErrorMessage.EMPTY_STRUCTURE, null);			
			return errorObject;
		}
		ReturnObjectImpl returnObject = new ReturnObjectImpl(false, ErrorMessage.NO_ERROR, myFunctionalLinkedList.get(0).getReturnValue());		
		return returnObject ;
	}

	@Override
	public FunctionalList rest() 
	{
		if (myFunctionalLinkedList.size() == 0) 
		{
			FunctionalList emptyList = new FunctionalLinkedList() ;
			return emptyList;
		}
		FunctionalList tailList = new FunctionalLinkedList();
		for (int i = 1; i < myFunctionalLinkedList.size(); i++) 
		{
			tailList.add(myFunctionalLinkedList.get(i).getReturnValue());
		}
		return tailList;
	}

	public void printMe() 
	{
		for (int i = 0; i < myFunctionalLinkedList.size(); i++) 
		{
			System.out.print(this.myFunctionalLinkedList.get(i).getReturnValue() + " ");
		}
		System.out.println();
	}

	public void printHead() 
	{
		System.out.println("head: " + myFunctionalLinkedList.get(0).getReturnValue());
	}

	public void printTail() 
	{
		System.out.print("tail: ");
		for (int i = 1; i < myFunctionalLinkedList.size(); i++) 
		{
			System.out.print(myFunctionalLinkedList.get(i).getReturnValue() + " ");
		}
		System.out.println();
	}
}