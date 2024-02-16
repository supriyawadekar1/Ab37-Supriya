package second_package;
class write
{
	public void write()
	{
		System.out.println("this is method of class with package access specifier");
	}
}
public class assignment_105b 
{
	 public static void alpha()
	{
		System.out.println("this is method of class with public access specifier");
	}
	public static void main(String[] args)
	{
		write w1=new write();
		w1.write();
		alpha();
		
		
	}

}
