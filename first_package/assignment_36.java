package first_package;
import java.util.Scanner;
public class assignment_36 {
	static void add(int a,int b)
	{
		double sum=a+b;
		System.out.println("The sum is: "+sum);
	}
	 static void sub(int a,int b)
	{
		double sub=a-b;
		System.out.println("the subtraction is: "+sub);
	}
	static void mul(int a,int b)
	{
		double mul=a*b;
		System.out.println("the sum is: "+mul);
	}
	static void div(int a,int b)
	{
		double div=a/b;
		System.out.println("the division is: "+div);
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value of a:");
		int a=s.nextInt();
		System.out.println("enter the value of b:");
		int b=s.nextInt();
		add(a,b);
		sub(a,b);
		mul(a,b);
		div(a,b);
		

	}

}
