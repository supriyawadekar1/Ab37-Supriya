package first_package;

public class assignment_76 
{
	public static void main(String[] args)
	{
		int a[]= {20,24,30,41,50};
		int temp=0;
		int number=41;
		for(int i=0;i<5;i++)
		{
			if(number==a[i])
			{
				System.out.println("number found at index: "+i);
				temp++;
			}
			
		}
		if(temp==0)
		{
		System.out.println("the number is not found");	
		}

	}

}
