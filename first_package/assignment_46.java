package first_package;
class parent1
{
	void java()
	{
		System.out.println("i am java of supermost class");
	}
}
class son extends parent1
{
	void selenium()
	{
		son s1=new son();
		s1.java();
		System.out.println("i am selenium of super class");
	}
	
}
public class assignment_46 extends parent1{
	
	public static void main(String[] args) 
	{
		assignment_46 a1=new assignment_46();
		a1.java();

	}

}
