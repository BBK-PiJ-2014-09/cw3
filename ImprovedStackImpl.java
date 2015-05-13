/**
 * Class ImprovedStackImpl - implements the ImprovedStack interface.
 * 
 * @author Daryl Smith, MSc IT 
 * @version 1
 */

public class ImprovedStackImpl implements ImprovedStack 
{
	protected List myInternalList;

	public ImprovedStackImpl(ArrayList list) 
	{
		this.myInternalList = list; 
	}

	@Override
	public ImprovedStack reverse() 
	{
        ImprovedStack myReverseStack = new ImprovedStackImpl(new ArrayList());
        for (int i = (this.myInternalList.size() - 1); i >= 0; i--) 
        {
            myReverseStack.push(this.myInternalList.get(i).getReturnValue());
        }
        return myReverseStack;		
	}

	@Override
	public void remove(Object object) 
	{
        for (int i = 0; i < size(); i++) 
        {
            if (this.myInternalList.get(i).getReturnValue().equals(object)) 
            {
            	this.myInternalList.remove(i);
            }
        }
 	}

	@Override
	public boolean isEmpty() 
	{
		return this.myInternalList.isEmpty();
	}

	@Override
	public int size() 
	{
		return this.myInternalList.size();
	}

	@Override
	public void push(Object item) 
	{
		this.myInternalList.add(item);
	}

	@Override
	public ReturnObject top() 
	{
		if (this.myInternalList.size() == 0) 
		{
			ReturnObjectImpl errorObject = new ReturnObjectImpl(true, ErrorMessage.EMPTY_STRUCTURE, null);			
			return errorObject;
		}
		ReturnObjectImpl returnObject = new ReturnObjectImpl(false, ErrorMessage.NO_ERROR, this.myInternalList.get(this.myInternalList.size()-1).getReturnValue());
		return returnObject;
	}

	@Override
	public ReturnObject pop() 
	{
		if (this.myInternalList.size() == 0) 
		{
			ReturnObjectImpl errorObject = new ReturnObjectImpl(true, ErrorMessage.EMPTY_STRUCTURE, null);			
			return errorObject;
		}
		ReturnObjectImpl returnObject = new ReturnObjectImpl(false, ErrorMessage.NO_ERROR, this.myInternalList.get(this.myInternalList.size()-1));
		this.myInternalList.remove(this.myInternalList.size()-1);
		return returnObject ;
	}

	public void printMe() 
	{
		for (int i = 0; i < this.size(); i++) 
		{
			System.out.print(this.myInternalList.get(i).getReturnValue() + " ");
		}
		System.out.println();
	}

	public void printReverse() 
	{
		for (int i = this.size()-1; i >= 0; i--) 
		{
			System.out.print(this.myInternalList.get(i).getReturnValue() + " ");
		}
		System.out.println();
	}
}