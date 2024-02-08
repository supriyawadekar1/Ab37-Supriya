package first_package;

public class assignment_75
{
	public static void main(String[] args) 
	{
		int a[]= {12,40,56,78};
		int temp=0;
		int number=41;
		for(int i=0;i<4;i++)
		{
		if(number==a[i])
		{
			temp=temp+1;//temp++;
			System.out.println(number +" is present");
		}
		}
		if(temp==0) {
			System.out.println(number+" is not found");
		}
		

		
	}

}
