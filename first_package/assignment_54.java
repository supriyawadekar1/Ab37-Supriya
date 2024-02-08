package first_package;
interface matrix
{
	void oper();
}
interface sign
{
	void mul();
}
abstract class duel implements sign,matrix
{
	abstract void add();
	void sub()
	{
			System.out.println("this is concrete method");
	}
}
public class assignment_54 extends duel
{
	 
	public static void main(String[] args)
	{
		System.out.println("extending abstract class which is implementing interface");
	    	assignment_54 ref=new assignment_54();
	        ref.add();
	        ref.sub();
	        ref.mul();
	        ref.oper();
	}
	void add() 
	{
		System.out.println("done..implementation");
			
	}

	public void mul()
	{
			System.out.println("this is also done");
			
	}
	public void oper()
	{
		System.out.println("some operation");
		
	}

}

