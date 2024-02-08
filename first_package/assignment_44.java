package first_package;
class assign2
{
	void java()
	{
		System.out.println("this is non static java method of parent class");
	}
	void selenium()
	{
		System.out.println("this is non static selenium method of parent class");
	}
	static void gk()
	{
		System.out.println("this is gk non static method of parent class");
	}
}

public class assignment_44 extends assign2
{

	public static void main(String[] args)
	{
		System.out.println("demonstrating single level inheritance");
	     assignment_44 a=new assignment_44();
	     a.java();
	     a.selenium();
	     gk();

	}

}
