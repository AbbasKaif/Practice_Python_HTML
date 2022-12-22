public class class_room extends room
{
	int h;
	class_room(int x,int y,int z)
	{
		super(x,y);
		h=z;
	}
	int volume()
	{
		return(area()*h);
	}
}