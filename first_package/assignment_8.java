package first_package;

public class assignment_8
{
	assignment_8(int a,int b)
	{
		System.out.println("first constructor");
	}
	assignment_8(int a,double b)
	{
		System.out.println("second constructor");
	}
	public static void main(String[] args)
	{
		assignment_8 a=new assignment_8(4, 5);
		assignment_8 a1=new assignment_8(5, 6.8);
		System.out.println("i am main method");

	}

}
