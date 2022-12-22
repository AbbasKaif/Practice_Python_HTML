class j2exception
{
	public static void main(String args[])
	{
		int a=10, b=0;
		try
		{
			a=a/b;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divide by Zero");
		}
	}
}