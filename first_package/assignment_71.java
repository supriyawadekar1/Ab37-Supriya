package first_package;
import java.util.Date;

public class assignment_71
{
	public static void main(String[] args)
	{
		Date d1=new Date();
		System.out.println(d1.getTime());
		Date d2=new Date(d1.getTime());
		System.out.println(d2);
		String time=d2.toString();
		
		String day=time.substring(0, 3);
		System.out.println(day);
		
		String month=time.substring(4, 7);
		System.out.println(month);
		
		String date=time.substring(8, 10);
		System.out.println(date);
		
		String year=time.substring(24);
		System.out.println(year);
		

	}

}
