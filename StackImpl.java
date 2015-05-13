/**
 * Class StackImpl - extends AbstractStack class.
 * 
 * @author Daryl Smith, MSc IT 
 * @version 1
 */

public class StackImpl extends AbstractStack 
{
    public StackImpl(ArrayList list) 
    {
        super(list);
    }

    @Override
    public boolean isEmpty() 
    {
        return super.internalList.isEmpty();
    }

    @Override
    public int size() 
    {
        return super.internalList.size();
    }

    @Override
    public void push(Object item) 
    {
        super.internalList.add(item);
    }

    @Override
    public ReturnObject top() 
    {
        return super.internalList.get(super.internalList.size()-1);
    }

    @Override
    public ReturnObject pop() 
    {
        return super.internalList.remove(super.internalList.size()-1);
    }

	public void printMe() 
	{
		for (int i = 0; i < this.size(); i++) 
		{
			System.out.print(super.internalList.get(i).getReturnValue() + " ");
		}
		System.out.println();
	}
}