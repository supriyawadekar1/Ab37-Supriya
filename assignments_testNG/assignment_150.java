package assignments_testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class assignment_150
{
	@Test(dataProvider="data")
	public void method1(double number)
	{
		System.out.println(number+20*5);
	}
	@DataProvider(name="data")
	public Object[][] method1()
	{
		return new Object[][] { {2.3},{4.5},{5.6},{8.9} };
		
	}
}
