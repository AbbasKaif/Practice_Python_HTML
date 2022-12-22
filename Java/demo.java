import java.io.*;
import java.util.*;
class demo extends Thread implements Runnable
{
	private int count=5;
	Thread thr=new Thread();
	demo(String s, int p)
	{
		thr=new Thread(this, s);
		thr.setPriority(p);
		thr.start();
	}
	public void run()
	{
		while(true)
		{
			System.out.println("#"+thr.getname()+":"+count);
			if(--count==0)
			return;
		}
	}
}
