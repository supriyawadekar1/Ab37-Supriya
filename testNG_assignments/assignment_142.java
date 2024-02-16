package assignments;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class assignment_142
{
	@BeforeMethod
	public void bm()
	{
		System.out.println("Before method");
	}
	@Test(invocationCount=11)
	public void test()
	{
		System.out.println("test");
	}
	@Test
	public void test1()
	{
		System.out.println("test1");
	}
	@Test
	public void test2()
	{
		System.out.println("test2");
	}
	@Test
	public void test3()
	{
		System.out.println("test3");
	}
	@AfterMethod
	public void am()
	{
		System.out.println("After method");
	}
}
