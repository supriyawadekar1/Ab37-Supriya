package first_package;
import java.util.Scanner;

public class assignment_34_35 {

	public static void main(String[] args)
	{
		System.out.println("demo of all the methods of scanner class");
		Scanner s=new Scanner(System.in);
		System.out.println("enter int value");
		int a=s.nextInt();
		System.out.println("enter float value");
		float b=s.nextFloat();
		System.out.println("enter double value");
		double c=s.nextDouble();
		System.out.println("enter byte value");
		byte d=s.nextByte();
		System.out.println("enter short value");
		short e=s.nextShort();
		System.out.println("enter long value");
		long f=s.nextLong();
		System.out.println("enter string value");
		String g=s.next();
		System.out.println("enter boolean value");
		boolean h=s.nextBoolean();
		System.out.println("thanks for the input");
	}

}
