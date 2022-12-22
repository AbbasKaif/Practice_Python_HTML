import java.io.*;
import java.util.*;
class demo implements Runnable
{
	private int count=3;
	Thread thr;
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
class abc
{
	public static void main(String args[])
	{
		new demo("Runnable thread one", thread.MIN_PRIORITY);
		new demo("Runnable thread two", thread.MAX_PRIORITY);
		new demo("Runnable thread three", thread.NORM_PRIORITY);
	}
}
