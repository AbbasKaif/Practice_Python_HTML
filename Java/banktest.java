class Bank
{
	int interest()
	{
		return 0;
	}
}
class sbi extends Bank
{
	int interest()
	{
		return 5;
	}
}
class pnb extends Bank
{
	int interest()
	{
		return 7;
	}
}
class banktest
{
	public static void main(String args[])
	{
		Bank b=new Bank();
		sbi sb=new sbi();
		pnb pn=new pnb();
		System.out.println("Bank: "+b.interest());
		System.out.println("SBI: "+sb.interest());
		System.out.println("PNB: "+pn.interest());
	}
}