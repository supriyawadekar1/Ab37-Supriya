package first_package;
import java.util.Arrays;

public class assignment_85
{
	public static void main(String[] args)
	{
		String s1="supriya";
		String s2="shreya";
		char[] c1=s1.toCharArray();
		System.out.println(Arrays.toString(c1));
		char[] c2=s2.toCharArray();
		System.out.println(Arrays.toString(c2));
		if(Arrays.equals(c1, c2))
		{
			System.out.println("both strings are equal");
		}
		else
		{
			System.out.println("both are not equal");
		}

	}

}
