package assignments_testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Launch_Close
{
	WebDriver driver;
	@BeforeMethod
	@Parameters("browser")
	public void Launch(String name_of_browser)
	{
		if(name_of_browser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		if(name_of_browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		if(name_of_browser.equals("edge"))
		{
			driver=new EdgeDriver();
		}

	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterMethod
	public void Close() throws InterruptedException
	{
		WebElement hover=driver.findElement(By.id("nav-link-accountList"));
		Actions a1=new Actions(driver);
		a1.moveToElement(hover).perform();
		driver.findElement(By.linkText("Sign Out")).click();
		Thread.sleep(5000);
		driver.quit();
	}
}
