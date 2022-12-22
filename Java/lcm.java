import java.util.*;
class LCM
{
	public static void main(String args[])
	{
		int a, b, i, max, lcm = 0;
		Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the two numbers");
		a = sc.nextInt();
		b = sc.nextInt();		 
  	
		max = a > b ? a : b;
		for(i = 0; i < max; i++)
		{
				if(max % a == 0 && max % b == 0)
				{
					lcm = max;
					break;
				}
				max++;
		}
		System.out.println("LCM of the two numbers = " + lcm);
 	}
}

/*
ans = ( a > b) ? a : b;
// finding LCM
for( ; ; )
{
	if(ans % a == 0 && ans % b == 0)
	{
			// We found our LCM.
			// No need to check further.
			break;
	}
	// Increamenting by 1.
	ans = ans + 1;
}
// Displaying result
System.out.println("The LCM of the numbers " + a + " and " + b + " is " + ans);
*/