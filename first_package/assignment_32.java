package first_package;
class assign 
{
	assign()
	{	
		System.out.println("this is parent class consturctor");
	}
	assign(int a)
	{
		System.out.println("this is parameterized constructor");
	}
	static void add()
	{
		System.out.println("this is a method");
	}
	void sub() {
		System.out.println("hii");
	}
}
public class assignment_32 extends assign
{

	public static void main(String[] args)
	{
		System.out.println("calling one class inside another class");
		assign a=new assign();
		assign a1=new assign(4);
		add();
		a1.sub();
	}
	

}

