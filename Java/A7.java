interface Printable
{
	void print();
}
interface Showable
{
	void show();
}
class TestMultipleInterface implements Printable,Showable
{
	public void print()
	{
		System.out.println("Hello");
	}
	public void show()
	{
		System.out.println("World");
	}
	public static void main(String args[])
	{
		TestMultipleInterface obj = TestMultipleInterface A7();
		obj.print();
		obj.show();
	}
}