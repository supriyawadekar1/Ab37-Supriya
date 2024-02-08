package first_package;

public class assignment_9
{
	static void sub(int a,int b)
	{
		int c=a-b;
		System.out.println("the subtraction is:"+c);
	}
	static void multi(int a,int b)
	{
		int c=a*b;
		System.out.println("the multiplication is:"+c);
	}
	static void division(int a,int b)
	{
		int c=a/b;
		System.out.println("the division is:"+c);
	}
	public static void main(String[] args) 
	{
		sub(2,4);
		multi(5,6);
		division(16,4);
		System.out.println("this is main method");

	}

}
