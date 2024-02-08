package first_package;
import second_package.assignment_105b;
class read
{
	void book()
	{
		System.out.println("this is method of class with default access specifier");
	}
}
public class assignment_105a 
{
	static public void text()
	{
		System.out.println("this is method of class with public access specifier");
	}
	public static void main(String[] args)
	{
		read r1=new read();
		r1.book();
		text();
		assignment_105b.alpha();
		
	}

}
