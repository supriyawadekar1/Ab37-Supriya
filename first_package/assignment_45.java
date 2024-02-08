package first_package;
class grandparent
{
	void java()
	{
		System.out.println("i am java of supermost class");
	}
}
class parent extends grandparent
{
	void selenium()
	{
		System.out.println("i am selenium of super class");
	}
	 void gk()
	 {
		 System.out.println("i am gk of sub class");
	 }
}
public class assignment_45 extends parent
{

	public static void main(String[] args)
	{
		assignment_45 a1=new assignment_45();
		a1.java();
		a1.selenium();
		a1.gk();

	}

}
