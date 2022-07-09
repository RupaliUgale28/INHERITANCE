package ALL_TYPES;

class parent
{
	public void d1()
	{
		System.out.println("i am parent of single class");
	}
}

public class single extends parent 
{
	public void s1()
	{
		System.out.println("hi i am child of parent class");
	}
	
	
	public static void main(String[] args) 
	{
		
		single s=new single();
		s.d1();
		s.s1();
		
	}
}
////we cant use access modifier to the class***********check it
//5 types -single multilevel,hierarchial.multiple,hybrid.
//diamond ambiguity problem= multiple and hybrid inheritance--
//thats why java is not 100% object oriented programming language
//we have to create object of child class
//
//