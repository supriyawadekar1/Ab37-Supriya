package first_package;
import java.util.Scanner;

public class assignment_62 {


	public static void main(String[] args) {
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the age of a person :");
		int age=s1.nextInt();
		if(age==18) {
			System.out.println("allowed to click www.google.com");
		}
		else {
			throw new ArithmeticException("sorry,you are not eligible");
		}
		
	}
}
