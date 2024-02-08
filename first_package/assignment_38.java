package first_package;
import java.util.Scanner;

public class assignment_38 {

	static void area(float b,float h)
	{
		double a=(b*h)/2;
		System.out.println("Area of triangle is: "+a);
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of b:");
		float b=s.nextFloat();
		System.out.println("Enter the value of h:");
		float h=s.nextFloat();
		area(b,h);
	}

}
