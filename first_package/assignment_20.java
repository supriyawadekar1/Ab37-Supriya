package first_package;

public class assignment_20 {
	static int a,b;
	static void add()
	{
		int a=30,b=20;
		System.out.println("the sum is: "+(a+b));
	}
	static void sub() {
		int a=40,b=10;
		System.out.println("the sub is: "+(a-b));
	}
	public static void main(String[] args) {
		System.out.println("calling static methods inside main method");
		add();
		sub();

	}

}
