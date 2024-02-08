package first_package;
import java.util.Arrays;

public class assignment_65 
{
	public static void main(String[] args)
	{
		int rollno[]=new int[4];
		rollno[0]=25;
		rollno[1]=56;
		rollno[2]=78;
		rollno[3]=90;
		int rno[]=new int[4];
		
		System.out.println("the original array is: "+Arrays.toString(rollno));
		for(int i=0;i<rollno.length;i++)
		{
			 rno[i]=rollno[i];
			 System.out.println("the copied array is: "+Arrays.toString(rno));
			 
		}
		//System.out.println("the copied array is: "+Arrays.toString(rno));
		

	}

}
