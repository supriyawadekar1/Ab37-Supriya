package first_package;
interface clone
{
	void upper();
	void lower();
}
interface clone1
{
	void greater();
	void smaller();
}
public class assignment_52 implements clone,clone1
{
	public static void main(String[] args) 
	{
		System.out.println("demo of multiple level inheritance,possible using only interface");
		assignment_52 ref=new assignment_52();
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
