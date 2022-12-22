import java.util.*;
class Interest
{
	private float p,n,r;
	Interest(float p, float n, float r)
	{
		this.p=p;
		this.n=n;
		this.r=r;
	}
	float simpleInterest()
	{
		return((p*n*r)/100);
	}
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter p: ");
		float p=ob.nextFloat();
		System.out.print("Enter n: ");
		float n=ob.nextFloat();
		System.out.print("Enter r: ");
		float r=ob.nextFloat();
		Interest i=new Interest(p,n,r);
		System.out.println("Simple Interest: "+ i.simpleInterest());
	}

}