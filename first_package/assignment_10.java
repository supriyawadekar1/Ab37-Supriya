package first_package;
public class assignment_10
{
	static void add(int a,int b)
	{
		int c=a+b;
		System.out.println("the sum is:"+c);
	}
	static void sub(int a,int b)
	{
		int c=a-b;
		System.out.println("the subtraction is:"+c);
	}
	void multi(int a,int b)
	{
		int c=a*b;
		System.out.println("the multiplication is:"+c);
	}
	void division(int a,int b)
	{
		int c=a/b;
		System.out.println("the division is:"+c);
	}
	public static void main(String[] args)
	{
		add(2,4);
		sub(4,2);
		assignment_10 a=new  assignment_10();
		a.multi(5, 5);
		a.division(49, 7);
		System.out.println("this is main method");
	}

}
