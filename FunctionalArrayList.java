/**
 * Class FunctionalArrayList - extends ArrayList and implements the FunctionalList Interface.
 * 
 * @author Daryl Smith, MSc IT 
 * @version 1
 */

public class FunctionalArrayList extends ArrayList implements FunctionalList
{
	private ArrayList myFunctionalArrayList = new ArrayList();

	@Override
	public boolean isEmpty() 
	{
		return myFunctionalArrayList.isEmpty();
	}

	@Override
	public int size() 
	{
		return myFunctionalArrayList.size();
	}

	@Override
	public ReturnObject get(int index) 
	{
		return myFunctionalArrayList.get(index);
	}

	@Override
	public ReturnObject remove(int index) 
	{
		return myFunctionalArrayList.remove(index);
	}

	@Override
	public ReturnObject add(int index, Object item) 
	{
		return myFunctionalArrayList.add(index, item);
	}

	@Override
	public ReturnObject add(Object item) 
	{
		return myFunctionalArrayList.add(item);
	}

	@Override
	public ReturnObject head() 
	{
		if (myFunctionalArrayList.size() == 0) 
		{
			ReturnObjectImpl errorObject = new ReturnObjectImpl(true, ErrorMessage.EMPTY_STRUCTURE, null);			
			return errorObject;
		}
		ReturnObjectImpl returnObject = new ReturnObjectImpl(false, ErrorMessage.NO_ERROR, myFunctionalArrayList.get(0).getReturnValue());		
		return returnObject ;
	}

	@Override
	public FunctionalList rest() 
	{
		if (myFunctionalArrayList.size() == 0) 
		{
			FunctionalList emptyList = new FunctionalArrayList() ;
			System.out.println("empty FunctionalArrayList created");
			return emptyList;
		}
		FunctionalList tailList = new FunctionalArrayList();
		for (int i = 1; i < myFunctionalArrayList.size(); i++) 
		{
			tailList.add(myFunctionalArrayList.get(i).getReturnValue());
		}
		return tailList;
	} 
	
	public void printMe() 
	{
		for (int i = 0; i < myFunctionalArrayList.size(); i++) 
		{
			System.out.print(this.myFunctionalArrayList.get(i).getReturnValue() + " ");
		}
		System.out.println();
	}

	public void printHead() 
	{
		System.out.println("head: " + myFunctionalArrayList.get(0).getReturnValue());
	}

	public void printTail() 
	{
		System.out.print("tail: ");
		for (int i = 1; i < myFunctionalArrayList.size(); i++) 
		{
			System.out.print(myFunctionalArrayList.get(i).getReturnValue() + " ");
		}
		System.out.println();
	}
}