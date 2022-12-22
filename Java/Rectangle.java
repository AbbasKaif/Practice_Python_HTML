import java.util.*;
class Rectangle
{
	private int length, width;
	Rectangle(int l, int w)
	{
		length=l;
		width=w;
	}
	int rectarea()
	{
		return(length*width);
	}
	int rectperi()
	{
		return(2*(length+width));
	}
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter length: ");
		int l=ob.nextInt();
		System.out.print("Enter width: ");
		int w=ob.nextInt();
		Rectangle r=new Rectangle(l,w);
		System.out.println("Area of Rectangle: "+ r.rectarea());
		System.out.println("Perimeter of Rectangle: "+ r.rectperi());
	}

}