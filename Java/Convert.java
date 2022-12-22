import java.util.*;
public class Convert
{
    Scanner scan;
    int num;
    public static void main(String args[])
    {
         Convert obj = new Convert();
         obj.getVal();
         obj.convert();
    }
    void getVal()
     {
          System.out.println("Decimal to HexaDecimal,Octal and Binary");
          scan = new Scanner(System.in);
          System.out.print("Enter the number : ");
          num = Integer.parseInt(scan.nextLine());
	  System.out.println();
     }
    void convert()
      {
           String hexa = Integer.toHexString(num);
           System.out.println("HexaDecimal Value is : " + hexa);
           String octal = Integer.toOctalString(num);
           System.out.println("Octal Value is : " + octal);
           String binary = Integer.toBinaryString(num);
           System.out.println("Binary Value is : " + binary);
       }
}

