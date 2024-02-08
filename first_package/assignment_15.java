package first_package;

public class assignment_15 {
	static {
		System.out.println("this is sib");
	}
	{
		System.out.println("this is iib");
	}
	assignment_15(){
		System.out.println("this is constructor");
	}
	public static void main(String[] args) {
		System.out.println("this is my main method");
		assignment_15 a=new assignment_15();
	}

}
