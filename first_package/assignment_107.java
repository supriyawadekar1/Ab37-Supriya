package first_package;
import java.util.Scanner;
public class assignment_107
{
	private double radius;
	private float x;
	private float y;
	boolean isright()
	{
		return false;
	}
	double result(double d)
	{
		this.radius = d;
		double area=3.14*radius*radius;
		return area;
		
	}
	float sum(float x2,float y2)
	{
		this.x=x2;
		this.y=y2;
		return x2+y2;
	}
	
	String name(String s1)
	{
		return s1;
	}
	public static void main(String[] args) 
	{
		assignment_107 a1=new assignment_107();
		Scanner s=new Scanner(System.in);
		
		 System.out.println("enter your age: ");
		 int a=s.nextInt();
		  if(a<18)
		  {
		  System.out.println("individuals with age below 18 are not allowed to vote "+a1.isright()); 
		  }
		  if(a>=18)
		  {
		  System.out.println("individuals with age 18 and above are allowed to vote "+true);
		  }
		 
		System.out.println("enter the value of radius: ");
		double d=s.nextDouble();
		System.out.println("the value of area is: "+a1.result(d));
		
		System.out.println("enter the value of a: ");
		float x=s.nextFloat();
		System.out.println("enter the value of b: ");
		float y=s.nextFloat();
		System.out.println("the sum is: "+a1.sum(x,y));
		
		System.out.println("Enter your name: ");
		String s2=s.next();
		System.out.println("the entered name is: "+a1.name(s2));
		
		}
}
