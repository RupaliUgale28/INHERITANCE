package ALL_TYPES;

class rights//parent class
{
	public void m()
	{
		System.out.println("I am from india");
	}
}

class legal extends rights//child 1
{
	public void m1()
	{
		System.out.println("I am from maharashtra.");
	}
}

class fundamental extends rights//child 2
{
	public void m2()
	{
		System.out.println("I am from karnataka.");
	}
}


public class hierarchial 
{
	public static void main(String[] args) 
	{
		legal l=new legal();
		l.m();
		l.m1();
		
		
		System.out.println();
		fundamental f=new fundamental();
		f.m();
		f.m2();
		
	}

}
