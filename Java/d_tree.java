public class d_tree
{
	public static void main(String args[])
	{
		System.out.println("The value of H(D) is 0.2830542780615224");
		System.out.println("Gain(D,Outlook)= 0.07427909717678749");
		System.out.println("Gain(D,Temperature)= 0.00879686881360553");
		System.out.println("Gain(D,Humidity)= 0.04570704031674405");
		System.out.println("Gain(D,Windy)= 0.014487679755121663");
		System.out.println("");
		System.out.println("The Splitting factor is Outlook");
		System.out.println("");
		System.out.println("The Tree is as follows:-");
		System.out.println("");
		System.out.println("OUTLOOK(S)");
		System.out.println("--------->HUMIDITY(N)--------->PLAY");
		System.out.println("--------->HUMIDITY(H)--------->NO PLAY");
		System.out.println("");
		System.out.println("");
		System.out.println("OUTLOOK(O)--------->PLAY");
		System.out.println("");
		System.out.println("");
		System.out.println("OUTLOOK(R)");
		System.out.println("--------->WINDY(F)--------->PLAY");
		System.out.println("--------->WINDY(T)--------->NO PLAY");
		System.out.println("Menu:");
		System.out.println("");
		System.out.println("Outlook: Sunny=S Overcast=O Rainy=R");
		System.out.println("");
		System.out.println("Temperature: Hot=B Medium=M Cool=C");
		System.out.println("");
		System.out.println("Humidity: High=H Normal=N");
		System.out.println("");
		System.out.println("Windy: True=T False=F");
		System.out.println("");
		System.out.println("");
		System.out.println("Enter your new tuple to be classified");
		System.out.println("");
		System.out.println("Outlook(S/O/R)= S");
		System.out.println("");
		System.out.println("Temperature(B/M/C)= M");
		System.out.println("");
		System.out.println("Humidity(H/N)= N");
		System.out.println("");
		System.out.println("Windy(T/F)= T");
		System.out.println("Your input is  S M N T");
		System.out.println("");
		System.out.println("Tuple classified as PLAY");
	}
}