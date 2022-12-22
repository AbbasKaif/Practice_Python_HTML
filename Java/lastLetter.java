/*
*Input
*Hello World! This is my TCS Program
*
*Output
*o!ssySm
*/

import java.util.*;
public class lastLetter
{
	public static void main(String args[])
	{
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		s = sc.nextLine();
		StringTokenizer st = new StringTokenizer(s," ");
		while (st.hasMoreTokens())
		{
			String word = st.nextToken();
			System.out.print(word.charAt(word.length()-1) + "");
		}
	}
}