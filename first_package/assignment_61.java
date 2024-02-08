package first_package;
import java.util.InputMismatchException;
import java.util.Scanner;

public class assignment_61 {

	public static void main(String[] args) {
		Scanner scan1=new Scanner(System.in);
		System.out.println("enter the value of a:");
		try {
			int a=scan1.nextInt();
			int c=1/0;
			}
		catch(InputMismatchException e1){
			System.out.println("good to go..");
		}
		catch(ArithmeticException e2) {
			System.out.println("thats ok,m handling");
			
		}

}
}