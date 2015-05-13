/**
 * Class ReturnObjectImpl - implements the ReturnObject Interface.
 * 
 * @author Daryl Smith, MSc IT 
 * @version 1
 */

public class ReturnObjectImpl implements ReturnObject
{
	private boolean hasError = false;
	private ErrorMessage errorValue;
	private Object returnValue;
	
	public ReturnObjectImpl(boolean hasError, ErrorMessage errorValue, Object returnValue) 
	{
		this.hasError = hasError;
		this.errorValue = errorValue;
		this.returnValue = returnValue;
	}
	
	@Override
	public boolean hasError() 
	{	
		if (hasError == true) 
		{
			return hasError;
		} else 
		{
			return false;
		}
	}

	@Override
	public ErrorMessage getError() 
	{
		return errorValue;
	}

	@Override
	public Object getReturnValue() 
	{
		return returnValue;
	}
}