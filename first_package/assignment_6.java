package first_package;
public class assignment_6
{
	void addition()
	{
		System.out.println("i am non static method 1");
	}
	void addition1()
	{
		System.out.println("i am non static method 2");
	}
	void addition2()
	{
		System.out.println("i am non static method 3");
	}
	void addition3()
	{
		System.out.println("i am non static method 4");
	}
	public static void main(String[] args)
	{
		assignment_6 a=new assignment_6();
		a.addition();
		a.addition1();
		a.addition2();
		a.addition3();
		System.out.println("this is main method");
	}

}
