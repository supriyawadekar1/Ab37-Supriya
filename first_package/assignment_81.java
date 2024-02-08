package first_package;

public class assignment_81
{
	public static void main(String[] args)
	{
		{
			String s="Rahul1234";
			char c[]=s.toCharArray();
			int count=0;
			int temp=0;
			
			for(int i=0;i<s.length();i++)
			{
				boolean value=Character.isDigit(c[i]);
				if(value==true)
				{
				count++;
				}
				else
				{
					temp++;
				}
			}
				System.out.println("number of digits are:"+count);
				System.out.println("number of characters are:"+temp);
				
			}
		}
}
