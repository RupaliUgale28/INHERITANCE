package ALL_TYPES;

class shahajiraje//supermost class
{
	public void m1()
	{
		System.out.println("I am Shahaji Raje-First generation");
	}
}
class shivajiraje extends shahajiraje// super class
{
	public void m2()
	{
		System.out.println("I am Shivaji Raje-Second generation");
	}
}
class sambhajiraje extends shivajiraje//sub class
{
	public void m3()
	{
		System.out.println("I am Sambhaji Raje- Third generation");
	}
}

public class multilevel {

	public static void main(String[] args) {
		
		sambhajiraje s=new sambhajiraje();
		s.m1();
		s.m2();
		s.m3();

	}

}
