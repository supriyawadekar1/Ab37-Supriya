package first_package;
public class assignment_82 
{
	public static void main(String[] args)
	{
		String s1="supriya";
		String s2="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			char c1=s1.charAt(i);
			s2=s2+c1;
		}
		System.out.println("the reversed string is: "+s2);

	}

}
