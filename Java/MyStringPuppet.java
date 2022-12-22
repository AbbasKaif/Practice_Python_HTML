package MyPack;
public class MyStringPuppet
{
	public String largestWord(String str)
	{
		str = str + " ";
		String res="", word="";
		int n = str.length(), l = 0;
		for (int i = 0; i < n; i++) 
		{
			if (str.charAt(i) != ' ') 
			{
				word = word + str.charAt(i);
			}
			
			else
			{
				if(word.length() > l)
				{
					l = word.length();
					res = word;
				}
					word = "";
			} 
		} 
		return (res);
	}
	
	public String longestPalindrome(String str)
	{
		str = str + " ";
		String res="", word="", rev="";
		int n = str.length(), l = 0;
		for (int i = 0; i < n; i++) 
		{
			if (str.charAt(i) != ' ') 
			{
				word = word + str.charAt(i);
				rev = str.charAt(i) + rev;
			}
			
			else
			{
				if(word.length() > l && word.equals(rev))
				{
					l = word.length();
					res = word;
				}
					word = "";
			} 
		} 
		return (res);
	}
}

public class MyArrayOcestrate
{
	public int sortRowWise(int m[][])
    {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                for (int k = 0; k < m[i].length - j - 1; k++) {
                    if (m[i][k] > m[i][k + 1]) {
                        int t = m[i][k];
                        m[i][k] = m[i][k + 1];
                        m[i][k + 1] = t;
                    }
                }
            }
        }
        return (m[][]);
    }
}

public class FillArraySpiral
{
	public void formSpiralMatrix(int arr[], int mat[][])  
    {  
        int top = 0,  
            bottom = R - 1,  
            left = 0,  
            right = C - 1;  
      
        int index = 0;  
      
        while (true)  
        {  
            if (left > right)  
                break;  
      
            // print top row  
            for (int i = left; i <= right; i++)  
                mat[top][i] = arr[index++];  
            top++;  
      
            if (top > bottom)  
                break;  
      
            // print right column  
            for (int i = top; i <= bottom; i++)  
                mat[i][right] = arr[index++];  
            right--;  
      
            if (left > right)  
                break;  
      
            // print bottom row  
            for (int i = right; i >= left; i--)  
                mat[bottom][i] = arr[index++];  
            bottom--;  
      
            if (top > bottom)  
                break;  
      
            // print left column  
            for (int i = bottom; i >= top; i--)  
                mat[i][left] = arr[index++];  
            left++;  
        }  
    }
	return(mat[][]);
}