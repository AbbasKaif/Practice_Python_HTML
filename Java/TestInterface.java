interface Bank
{ 
	float rateOfInterest(); 
} 
class Sbi implements Bank
{ 
	public float rateOfInterest()
	{ 
		return 5.3f;
	} 
} 
class Pnb implements Bank
{ 
	public float rateOfInterest()
	{ 
		return 5.8f;
	} 
} 
class TestInterface
{ 
	public static void main(String[] args)
	{ 
		Bank b1=new Sbi();
		Bank b2=new Pnb(); 
		System.out.println("Rate of interest: "+b1.rateOfInterest());
		System.out.println("Rate of interest: "+b2.rateOfInterest());
	}
} 
