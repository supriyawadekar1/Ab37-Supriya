package first_package;
public class assignment_11
{
	static void addition(int a,int b)
	{
		int c=a+b;
		System.out.println("the sum is integer"+c);
	}
	static void addition(double a,double b)
	{
		double c=a+b;
		System.out.println("the sum is double:"+c);
	}
	static void addition(char a,char b)
	{
		int d=a+b;
		System.out.println("the sum is char:"+d);
	}
	void addition(boolean a,boolean b)
	{
		boolean c=true;
		System.out.println("the sum is boolean:"+c);
	}
	void addition(String a,String b)
	{
		String c=a.concat(b);
		System.out.println("the sum is string:"+c);
	}
	public static void main(String[] args)
	{
		addition(25,36);
		addition(5.5,4.7);
		addition('a','x');
		assignment_11 a=new assignment_11();
		a.addition(false, true);
		a.addition("hello","world");
		System.out.println("this is main method");
	}

}
