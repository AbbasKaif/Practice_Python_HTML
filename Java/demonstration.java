class room
{
	private int l,b;
	room(int x,int y)
	{ 
		l=x;
		b=y;
	}
	private int area()
	{
		return(l*b);
	}
}

class class_room extends room
{
	int h;
	class_room(int x,int y,int z)
	{
		super(x,y);
		h=z;
	}
	private int volume()
	{
		return(area()*h);
	}
}

class demonstration
{
	public static void main(String args[])
	{
		class_room cr=new class_room(10,20,15);
		int a1=cr.area();
		int v1=cr.volume();
		System.out.println("Area of Room : "+a1);
		System.out.println("Volume of Room : "+v1);
	}
}