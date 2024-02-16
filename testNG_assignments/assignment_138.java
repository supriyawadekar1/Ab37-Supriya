package assignments;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class assignment_138
{
	@BeforeSuite
	public void bs()
	{
		System.out.println("Before suite");
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
	@AfterSuite
	public void as()
	{
		System.out.println("after suite");
	}
	@AfterClass
	public void ac()
	{
		System.out.println("after Class");
	}
	@Test
	public void test()
	{
		System.out.println("test");
	}
}
