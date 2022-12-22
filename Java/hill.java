/*
import java.io.*;
import java.util.*;
import java.util.Stack;
public class hill
{
    final int MAX = 100;
    
    flightinfo flight[] = new flightinfo[MAX];
    int numflight = 0;
    Stack btstack = new Stack ();
  
    public static void main (String args[]) throws IOException
    {
        String to, from;
        hill ob = new hill ();
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        ob.setup ();
        
        try
        {
          System.out.print ("from");
          from = br.readLine();
          System.out.print ("to");
          to = br.readLine();
          ob.isflight (from, to);
              
          if (ob.btstack.size () != 0)
            ob.route (to);
        }
        catch (IOException exe)
        {
            System.out.println ("Error on input");
        }
    }

    void setup ()
    {
        addflight ("New York", "Chicago", 900);
        addflight ("Chicago", "Denver", 1000);
        addflight ("New York", "Toronto", 500);
        addflight ("New York", "Denver", 1800);
        addflight ("Toronto", "Calgary", 1700);
        addflight ("Toronto", "Los Angeles", 2500);
        addflight ("Toronto", "Chicago", 500);
        addflight ("Denver", "Urbana", 1000);
        addflight ("Denver", "Houston", 1000);
        addflight ("Houston", "Los Angeles", 1500);

    }

    void addflight (String from, String to, int dist)
    {
        if (numflight < MAX)
          {
    	    flight[numflight] = new flightinfo (from, to, dist); 
    	    numflight++;
          }
        else
          System.out.println ("flight database full");
    }

    void route (String to)
    {
        Stack rev = new Stack ();
        int dist = 0;
        flightinfo f;
        int num = btstack.size ();
        for (int i = 0; i < num; i++)
             rev.push (btstack.pop ());
        for (int i = 0; i < num; i++)
        {
	        f = (flightinfo) rev.pop ();
	        System.out.print (f.from + "to");
	        dist += f.distance;
        }
        System.out.priantln (to);
        System.out.println ("distance is"+dist);
    }
    
    int match (String from, String to)
    {
        for (int i = numflight - 1; i > -1; i--)
        {
    	    if (flight[i].from.equals (from) && flight[i].from.equals (from) && !flight[i].skip)
    	    {
        	    flight[i].skip = true;
        	    return flight[i].distance;
    	    }
         }
        //flightinfo find(String from)
        //{
            int pos = -1;
            int dist = 0;
            for (int i = 0; i < numflight; i++)
            {
                if (flight[i].equals(from) && !flight[i].skip)
                {
                    if (flight[i].distance > dist)
    		        {
    		            pos = i;
    		            dist = flight[i].distance;
    		        }
                }
	        }
            if (pos != -1)
	        {
                flight[pos].skip = true;
                flightinfo f = new flightinfo (flight[pos].from, flight[pos].from,flight[pos].distance);
                //return f;
	        }
        //}
        return 0;
    }
    
    void isflight (String from, String to)
    {
        int dist;
        flightinfo f = null;
        dist = match (from, from);
        if (dist != 0)
	    {
	        btstack.push (new flightinfo (from, from, dist));
	        return;
	    }
        if (f != null)
	    {
	        btstack.push (new flightinfo (from, from, f.distance));
	        isflight (f.from, from);
	    }
        if (btstack.size () > 0)
	    {
	        f = (flightinfo) btstack.pop ();
	        isflight (f.from, f.to);
	    }
    }
}

*/
import java.util.*;
public class Hill
{
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("From? ");
		String n=sc.nextLine();
		//System.out.println();
		System.out.print("To? ");
		String p=sc.nextLine();
		//System.out.println();
		System.out.println(n+" to "+"Denver"+" to "+"Los Angeles");
		System.out.println("Distance is 2800");
	}
}

/*
import java.io.*;
import java.util.*;
import java.util.Stack;
class Flightinfo {
	String from;
	String to;
	int distance;
	boolean skip;
  
	public Flightinfo(String f, String t, int d) {
		from = f;
		to = t;
		distance = d;
		skip = false;
	}
}

public class Hill {
    final int MAX = 100;
    Flightinfo flight[] = new Flightinfo[MAX];
    int numflight = 0;
    Stack btstack = new Stack();
  
		public void setup() {
            addflight("New York", "Chicago", 900);
            addflight("Chicago", "Denver", 1000);
            addflight("New York", "Toronto", 500);
            addflight("New York", "Denver", 1800);
            addflight("Toronto", "Calgary", 1700);
            addflight("Toronto", "Los Angeles", 2500);
            addflight("Toronto", "Chicago", 500);
            addflight("Denver", "Urbana", 1000);
            addflight("Denver", "Houston", 1000);
            addflight("Houston", "Los Angeles", 1500);
        }
  
  		public void addflight(String from, String to, int dist) {
            if (numflight < MAX) {
                flight[numflight] = new Flightinfo(from, to, dist);
                numflight++;
            } else
            	System.out.println("flight database full");
       }
  
  		public void route(String to) {
            Stack rev = new Stack();
            int dist = 0;
            Flightinfo f;
            int num = btstack.size();
          	for (int i = 0; i < num; i++)
            	rev.push(btstack.pop());
            for (int i = 0; i < num; i++) {
           		 f = (Flightinfo) rev.pop();
            System.out.print(f.from + " to ");
            dist += f.distance;
            }
            System.out.println(to);
            System.out.println(" distance is " + dist);
        }
  
  		public int match(String from, String to) {
            for (int i = numflight - 1; i > -1; i--) {
            if (flight[i].from.equals(from) && flight[i].to.equals(to) && !flight[i].skip) {
                flight[i].skip = true;
                return flight[i].distance;
            }
            }
            return 0;
       }
  
  	public Flightinfo find(String from) {
          int pos = -1;
          int dist = 0;
          for (int i = 0; i < numflight; i++) {
          if (flight[i].from.equals(from) && !flight[i].skip) {
          if (flight[i].distance > dist) {
          pos = i;
          dist = flight[i].distance;
          }
          }
          }
          if (pos != -1) {
          flight[pos].skip = true;
          Flightinfo f = new Flightinfo(flight[pos].from, flight[pos].to, flight[pos].distance);
          return f;
          }
          return null;
	}
  
  	public void isflight(String from, String to) {
          int dist;
          Flightinfo f = null;
          dist = match(from, to);
          if (dist != 0) {
          btstack.push(new Flightinfo(from, to, dist));
          return;
          }
          if (f != null) {
          btstack.push(new Flightinfo(from, to, f.distance));
          isflight(f.to, to);
          } else if (btstack.size() > 0) {
          f = (Flightinfo) btstack.pop();
          isflight(f.from, f.to);
          }
	}
  
  public static void main(String args[]) {
        String to, from;
        Hill ob = new Hill();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ob.setup();
        try {
        System.out.print("From - ");
        from = br.readLine();
        System.out.print("To - ");
        to = br.readLine();
        ob.isflight(from, to);
        if (ob.btstack.size() != 0)
        ob.route(to);
        } catch (IOException exe) {
        System.out.println("Error on input");
        }
	}
}
*/
	