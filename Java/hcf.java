import java.util.*;
public class GCD  
{  
	public static void main(String[] args)   
	{ 
		int a, b, acopy, bcopy;
		Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the two numbers");
		a = sc.nextInt();
		b = sc.nextInt();
		acopy = a;
		bcopy = b;
		while(a != b)   
		{  
			if(a > b)  
				a = a - b;  
			else  
				b = b - a;  
		}  
		System.out.printf("GCD of " + acopy + " and " + bcopy + " is: " + b);  
	}  
}  

/*
int r=0, a, b;  
a = (x > y) ? x : y; // a is greater number  
b = (x < y) ? x : y; // b is smaller number  
r = b;  // r is GCD
while(a % b != 0)  
{  
	r = a % b;  
	a = b;  
	b = r;  
}  
Sopln(r);
*/