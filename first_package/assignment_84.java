package first_package;
import java.util.Arrays;
public class assignment_84
{
	public static void main(String[] args)
	{
		String s1="race";
		String s2="care";
		if(s1.length()!=s2.length())
		{
			System.out.println("they are not anagram");
		}
		else
		{
			char[] c1=s1.toCharArray();
			Arrays.sort(c1);
			System.out.println(Arrays.toString(c1));
			char[] c2=s2.toCharArray();
			Arrays.sort(c2);
			System.out.println(Arrays.toString(c2));
			if(Arrays.equals(c1, c2)==true)
			{
				System.out.println("They are anagram");
			}
		}

	}

}
