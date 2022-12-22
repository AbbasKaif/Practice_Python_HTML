import java.util.Scanner;
public class areanperi 
{
	double area(double r)
	{
		return (3.14*r*r);
	}
	double peri(double r)
	{
		return (2*3.14*r);
	}
    	public static void main(String[] args) 
    	{
		areanperi ap=new areanperi();
        	Scanner sc=new Scanner(System.in);
		System.out.println("Enter area of a circle: ");
		double r=sc.nextDouble();
		System.out.println("Area of circle: "+ ap.area(r));
		System.out.println("Perimeter of circle: "+ ap.peri(r));
    	}
}