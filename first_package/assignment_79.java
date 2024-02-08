package first_package;

public class assignment_79 
{
	public static void main(String[] args)
	{
		String s="Rahul123";
		char c[]=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			boolean res=Character.isDigit(c[i]);
			if(res==true)
			{
				System.out.println(c[i]+ " is a digit ");
			}
			else
			{
				System.out.println(c[i]+ " is a character ");
			}
		}

	}

}
