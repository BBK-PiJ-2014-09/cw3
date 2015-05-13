/**
 * Class ArrayList - implements the List Interface.
 * 
 * @author Daryl Smith, MSc IT 
 * @version 1
 */

public class ArrayList implements List 
{

	final int INITIAL_ARRAY_SIZE = 16;
	private int arraySize = 0;
	private Object[] myArrayList;
	
	ArrayList() 
	{
		myArrayList = new Object[INITIAL_ARRAY_SIZE];
	}
	
	@Override
	public boolean isEmpty() 
	{
		if (arraySize == 0) 
		{
			return true;
		}
		else 
		{
			return false;
		}	
	}

	@Override
	public int size() 
	{
		return arraySize;
	}

	public ReturnObject get(int index) 
	{
		if (index < 0 || index >= arraySize) 
		{
			ReturnObjectImpl errorObject = new ReturnObjectImpl(true, ErrorMessage.INDEX_OUT_OF_BOUNDS, null);
			return errorObject;
		}
		ReturnObjectImpl returnObject = new ReturnObjectImpl(false, ErrorMessage.NO_ERROR, myArrayList[index]);
		return returnObject;
	}

	@Override
	public ReturnObject remove(int index) 
	{
		if (index < 0 || index >= arraySize) 
		{
			ReturnObjectImpl errorObject = new ReturnObjectImpl(true, ErrorMessage.INDEX_OUT_OF_BOUNDS, null);
			return errorObject;
		}
		ReturnObjectImpl returnObject = new ReturnObjectImpl(false, ErrorMessage.NO_ERROR, myArrayList[index]);
		Object[] myArrayListCopy = myArrayList.clone();
		myArrayList = new Object[INITIAL_ARRAY_SIZE];
		int i = 0;
		for (int j = 0; j < myArrayListCopy.length; j++) 
		{
			if (j != index) 
			{
				myArrayList[i] = myArrayListCopy[j];
				i++;		
			}
		}		
		arraySize--;
		return returnObject;
	}

	@Override
	public ReturnObject add(int index, Object item) 
	{
		if (index < 0 || index >= arraySize) 
		{
			ReturnObjectImpl errorObject = new ReturnObjectImpl(true, ErrorMessage.INDEX_OUT_OF_BOUNDS, null);
			return errorObject;
		}
		if (item == null) 
		{
			ReturnObjectImpl errorObject = new ReturnObjectImpl(true, ErrorMessage.INVALID_ARGUMENT, null);		
			return errorObject;	
		}

		Object[] myArrayListCopy = myArrayList.clone();
	
		//check array has enough space for new element
		if (arraySize == myArrayList.length) {
			myArrayList = new Object[myArrayList.length * 2];
		}

		int i = 0;
		for (int j = 0; j < arraySize; j++) 
		{
			if (i != index) 
			{
				myArrayList[i] = myArrayListCopy[j];
				i++;			
			}
			else 
			{
				myArrayList[i] = item;
				j--;
				i++;		
			}
		}		
		ReturnObjectImpl returnObject = new ReturnObjectImpl(false, ErrorMessage.NO_ERROR, item);		
			arraySize++;
			return returnObject ;
	}

	@Override
	public ReturnObject add(Object item) {
		if (item == null) {
			ReturnObjectImpl errorObject = new ReturnObjectImpl(true, ErrorMessage.INVALID_ARGUMENT, null);		
			return errorObject;	
		}

		//check array has enough space for new element
		if (arraySize == myArrayList.length) {
			Object[] myArrayListCopy = myArrayList.clone();
			myArrayList = new Object[myArrayList.length * 2];

			for (int i = 0; i < arraySize; i++) {
				myArrayList[i] = myArrayListCopy[i];
			}
		}

		myArrayList[arraySize] = item;
		
		ReturnObjectImpl returnObject = new ReturnObjectImpl(false, ErrorMessage.NO_ERROR, item);		
		arraySize++;
		return returnObject;
	}
	
	public void printMe() 
	{
		for (int i = 0; i < arraySize; i++) 
		{
			System.out.print(this.myArrayList[i] + " ");
		}
		System.out.println();
	}
}