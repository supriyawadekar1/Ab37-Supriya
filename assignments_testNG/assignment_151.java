package assignments_testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class assignment_151 
{
	@Test(dataProvider="cities")
	public void method(String input)
	{
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys(input);
		search.sendKeys(Keys.ENTER);
		System.out.println(driver.getTitle());
		driver.quit();
	}
	
	@DataProvider(name="cities")
	public Object[][] method1()
	{
		return new Object[][] {{"Bengaluru"},{"Pune"},{"Mumbai"},{"Mysore"},{"Kolkata"}};
		
	}
}
