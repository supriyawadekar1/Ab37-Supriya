package first_package;
import java.util.Scanner;

public class assignment_63 
{
	public static void main(String[] args)
	{
	int rollno[]=new int[5];
	for(int i=0;i<5;i++)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of index: "+i);
		rollno[i]=s.nextInt();
	}
	System.out.println(rollno[0]);
	System.out.println(rollno[1]);
	System.out.println(rollno[2]);
	System.out.println(rollno[3]);
	System.out.println(rollno[4]);
	}

}
