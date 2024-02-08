package first_package;
public class assignment_83 
{
	public static void main(String[] args)
	{
		String s1="mom";
		String s2="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			char c=s1.charAt(i);
			s2=s2+c;
		}
		System.out.println("The reversed string is:"+s2);
		if(s1.equals(s2))
		{
			System.out.println("given string is a palindrome");
		}
		else
		{
			System.out.println("given string is not a palindrome");
		}
	  
	}

}
