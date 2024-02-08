package first_package;
class operation
{
	static void add()
	{
		System.out.println("this is add ");
	}
	void sub()
	{
		System.out.println("this is sub");
	}
}
abstract class manipulation extends operation
{
	abstract void mul();
	abstract void div();
}
public class assignment_48 extends manipulation 
{
	public static void main(String[] args) 
	{
		assignment_48 d=new assignment_48();
		System.out.println("my main has two concrete methods");
	    	add();
	    	d.sub();
	    	d.mul();
	    	d.div();
	    	
	}
	void mul() {
		System.out.println("this is multi implemented");
		
	}
	void div() {
		System.out.println("this is div implemented");
		
	}

	

}
