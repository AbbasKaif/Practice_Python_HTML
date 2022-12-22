public class digitsum
{
	public static void main(String args[])
	{
		int i, n, r, s=0;
		for(i=1; ;i++)
		{
			n=i; s=0;
			while(n>=0)
			{	
				r=n%10;
				s=s+r;
				n=n/10;
			}
			if(s==i)
			System.out.println("Digit Sum Number is "+i);
			else
			System.put.println(i+" is invalid");
		}
	}
}