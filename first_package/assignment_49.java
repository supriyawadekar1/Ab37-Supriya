package first_package;
class shopping
{
	static void add()
	{
		System.out.println("this is addition function");
	}
	public interface Amazon
	 {
		 void login();
		 void logout();
		
	 }
}
public class assignment_49 extends shopping
{
 public static void main(String[] args) 
	{
		System.out.println("main method class extends shopping class which has interface");
		add();
	}

}
