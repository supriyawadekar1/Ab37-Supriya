package assignments;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class assignment_139 
{
	@Test
	public void test()
	{
		System.out.println("test");
	}
	@BeforeMethod
	public void bm()
	{
		System.out.println("Before method");
	}
	@Test
	public void test1()
	{
		System.out.println("test1");
	}
	@AfterMethod
	public void am()
	{
		System.out.println("After method");
	}
}
