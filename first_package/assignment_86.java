package first_package;
public class assignment_86 
{
	public static void main(String[] args)
	{
		int weight=57;
		System.out.println("The weight in int is:"+weight);
		//double wt=57;  //implicit widening
		double wt=(int)57;  //explicit widening
		System.out.println("The weight in double is:"+wt);
	}

}
