package first_package;
import java.util.Scanner;

public class assignment_37
{
	int a=20,b=60;
	void add(int a,int b)
	{
		a=this.a;
		b=this.b;
		double sum=a+b;
		System.out.println("The sum is: "+sum);
	}
	void sub(int a,int b)
	{
		a=this.a;
		b=this.b;
		double sub=a-b;
		System.out.println("the subtraction is: "+sub);
	}
	void mul(int a,int b)
	{
		a=this.a;
		b=this.b;
		double mul=a*b;
		System.out.println("the sum is: "+mul);
	}
	void div(int a,int b)
	{
		a=this.a;
		b=this.b;
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
		assignment_37 a1=new assignment_37();
		a1.add(a,b);
		a1.sub(a,b);
		a1.mul(a,b);
		a1.div(a,b);
		

	}

}
