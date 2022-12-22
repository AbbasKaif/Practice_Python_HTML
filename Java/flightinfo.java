import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class flightinfo
{
	String from;
	String to;
	int distance;
	boolean skip;
	flightinfo(String f, String t, int d)
	{
		from=t;
		to=t;
		distance=d;
		skip=false;
	}
}