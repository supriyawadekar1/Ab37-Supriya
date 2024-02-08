package first_package;
interface one extends two
{
	void add();
	void sub();
}
interface two
{ 
	void mul();
	void div();
}
public class assignment_50 implements one {

	public static void main(String[] args)
	{
	 System.out.println("calling inside main,the interfcae methods");
	 assignment_50 ref=new assignment_50();
	 ref.add();
	 ref.sub();
	 ref.mul();
	 ref.div();

	}
	public void mul() {
		
		System.out.println("this is multiplication");
		
	}
	public void div() {
		System.out.println("this is division");
		
	}
	public void add() {
		System.out.println("this is addition");
		
	}

	
	public void sub()
	{
		System.out.println("this is subtraction");
		
	}

}
