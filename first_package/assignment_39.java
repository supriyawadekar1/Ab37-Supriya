package first_package;
import java.util.Scanner;

public class assignment_39 {

	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the age: ");
		int age=s1.nextInt();
		if(age>=18)
		{
			System.out.println("i am an adult");
		}
		else
		{
			System.out.println("i am young");
		}

	}

}
