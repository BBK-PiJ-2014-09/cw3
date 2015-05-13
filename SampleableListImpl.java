/**
 * Class SampleableListImpl - implements the SampleableList Interface.
 * 
 * @author Daryl Smith, MSc IT 
 * @version 1
 */

public class SampleableListImpl implements SampleableList 
{
	private LinkedList mySampleList = new LinkedList();
	
	@Override
	public boolean isEmpty() 
	{
		return mySampleList.isEmpty();
	}

	@Override
	public int size() 
	{
		return mySampleList.size();
	}

	@Override
	public ReturnObject get(int index) 
	{
		return mySampleList.get(index);
	}

	@Override
	public ReturnObject remove(int index) 
	{
		return mySampleList.remove(index);
	}

	@Override
	public ReturnObject add(int index, Object item) 
	{
		return mySampleList.add(index, item);
	}

	@Override
	public ReturnObject add(Object item) 
	{
		return mySampleList.add(item);
	}

	@Override
	public SampleableList sample() 
	{
		if (mySampleList.size() == 0) 
		{
			SampleableListImpl emptyList = new SampleableListImpl() ;
			return emptyList;
		}
		SampleableListImpl sampleList = new SampleableListImpl();
		for (int i = 0; i < mySampleList.size(); i = i + 2) 
		{
			sampleList.add(mySampleList.get(i).getReturnValue());
		}
		return sampleList;
	}

	public void printMe() 
	{
		for (int i = 0; i < mySampleList.size(); i++) 
		{
			System.out.print(this.mySampleList.get(i).getReturnValue() + " ");
		}
		System.out.println();
	}
}