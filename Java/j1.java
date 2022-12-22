class MyException extends Exception
{
	MyException(String s)
	{
		super(s);
	}
}
class j1
{
	public static void main(String args[])
	{
		try
		{
			throw new MyException("My");
		}
		catch(MyException e)
		{
			System.out.println("My Exception Caught");
		}
	}
}