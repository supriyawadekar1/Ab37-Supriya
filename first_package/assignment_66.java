package first_package;

public class assignment_66 
{
	public static void main(String[] args)
	{
		int a[]=new int[4];
		a[0]=10;
		a[1]=11;
		a[2]=12;
		a[3]=13;
		double avg=0;
		double rem=0;
		double sum=0;
		for(int i=0;i<a.length;i++)
		{
			 sum=sum+a[i];
			 avg=sum/a.length;
			
		}
		System.out.println("the average is: "+avg);
		
		

	}

}
