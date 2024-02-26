package assignments_testNG;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class assignment_137
{
	@BeforeSuite
	public void bs()
	{
		System.out.println("Before suite");
	}
	@BeforeTest
	public void bt()
	{
		System.out.println("Before Test");
	}
	@BeforeClass
	public void bc()
	{
		System.out.println("Before Class");
	}
	@BeforeMethod
	public void bm()
	{
		System.out.println("Before method");
	}
	@Test
	public void test()
	{
		System.out.println("test");
	}
}
