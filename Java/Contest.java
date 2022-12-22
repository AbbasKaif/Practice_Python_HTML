import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Contest
{
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		addElements(list);
		displayElements(list);
	}
	
	static void addElements(ArrayList<Integer> list)
	{
		int i;
		for(i=0; i<4; i++)
			list.add(sc.nextInt());
	}
	
	static void displayElements(ArrayList<Integer> list)
	{
		int i;
		for(int item:list)
			System.out.print(item + " ");
	}
	
	static void sortElements(ArrayList<Integer> list)
	{
		System.out.println();
	}
}