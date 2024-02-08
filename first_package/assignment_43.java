package first_package;
class assign1
{
	void java()
	{
		System.out.println("this is non static java method of parent class");
	}
	void selenium()
	{
		System.out.println("this is non static selenium method of parent class");
	}
	void gk()
	{
		System.out.println("this is gk non static method of parent class");
	}
}

public class assignment_43 extends assign1
{
	public static void main(String[] args) 
	{
     System.out.println("demonstrating single level inheritance");
     assignment_43 a=new assignment_43();
     a.java();
     a.selenium();
     a.gk();
		
	}

}
