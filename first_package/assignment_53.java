package first_package;
interface clone2
{
	void upper();
}
interface clone3
{
	void greater();
}
interface clone4
{
	void lower();
}
interface clone5
{
	void smaller();
}
public class assignment_53 implements clone2,clone3,clone4,clone5{

	public static void main(String[] args)
	{
		System.out.println("demo of multiple level inheritance,possible using only interface");
		assignment_53 ref=new assignment_53();
		ref.upper();
		ref.lower();
		ref.greater();
		ref.smaller();

	}
	public void greater() {
		System.out.println("this is greater function");
		
	}
	public void smaller() {
		System.out.println("this is smaller function");
		
	}

	public void upper() {
		System.out.println("this is upper function");
		
	}

	public void lower() {
		System.out.println("this is lower function");
		
	}
}
