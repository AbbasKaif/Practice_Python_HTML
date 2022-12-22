import java.io.*;
import java.util.Thread;
class MyException extends Exception 

{ 
    
   MyException(String s) 
    
   { 
        
 
        super(s); 
    
   }

} 
  


class testException 
{
	public static void main(String args[])
	{
		try
		{
			throw new MyException("My Exception");
		}
		catch(MyException e)
		{
			System.out.println("My Exception Caught");
		}
	}
}