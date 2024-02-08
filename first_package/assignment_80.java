package first_package;

public class assignment_80
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
					System.out.println("digit is present at index: "+i);
				}
				
			}

		}
}


