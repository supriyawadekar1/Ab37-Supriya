package first_package;

public class assignment_17 {
	assignment_17()
	{
		System.out.println("this is constructor 1");
	}
	assignment_17(int a)
	{
		System.out.println("this is constructor 2");
	}
	assignment_17(char c)
	{
		System.out.println("this is constructor 3");
	}
	assignment_17(double d)
	{
		System.out.println("this is constructor 4");
	}
	{
		System.out.println("this is iib");
	}
	public static void main(String[] args) {
		System.out.println("this is main method");
		assignment_17 a=new assignment_17();
		assignment_17 a1=new assignment_17(5);
		assignment_17 a2=new assignment_17('a');
		assignment_17 a3=new assignment_17(4.6);
	}

}
