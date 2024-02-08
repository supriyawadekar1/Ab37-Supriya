package first_package;
import java.util.Scanner;

public class assignment_42 {

	public static void main(String[] args)
	{

		Scanner s=new Scanner(System.in);
		System.out.println("Ether the value of a: ");
		int a=s.nextInt();
		System.out.println("Ether the value of b: ");
		int b=s.nextInt();
		System.out.println("Ether the value of c: ");
		int c=s.nextInt();
		
		switch(a)
	{
		  case 1:
			  System.out.println("Addition of b and c is: "+(b+c));
			  
		  case 2:
			  System.out.println("subtraction of b and c is: "+(b-c));
			  
		  case 3:
			  System.out.println("multiplication of b and c is: "+(b*c));
		   
		  case 4:
			  System.out.println("division of b and c is: "+(b/c));

	}

	}

}
