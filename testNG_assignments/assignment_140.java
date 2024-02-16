package assignments;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class assignment_140
{
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
}
