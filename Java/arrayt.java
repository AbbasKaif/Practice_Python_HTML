import java.io.*;
class GFG 
{
	private static void shiftall(List<Integer> arr)
	{
		int left = 0, right = arr.length;
		int j = 0, temp;
		for (int i = left; i < right; i++) {
			if (arr[i] < 0) {
				if (i != j) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				j++;
			}
		}
		
		for (int i = left; i < right; i++)
			System.out.print(arr[i] + " ");
	}
	
    public static void main(String args[])
    {
        int arr[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
        int n = arr.length;
        shiftall(arr);
    }
}