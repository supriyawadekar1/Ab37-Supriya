package first_package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class assignment_122 
{
	public static void main(String[] args) throws InterruptedException
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		driver.findElement(By.id("fname")).sendKeys("Manish Kumar Tiwari");
		Thread.sleep(2000);
		driver.findElement(By.id("fname")).sendKeys(Keys.CONTROL+"a");
		driver.findElement(By.id("fname")).sendKeys(Keys.CONTROL+"c");
		Thread.sleep(1000);
		driver.findElement(By.id("lname")).sendKeys(Keys.CONTROL+"v");
		Thread.sleep(1000);
		driver.findElement(By.id("Username")).sendKeys(Keys.CONTROL+"v");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys(Keys.CONTROL+"v");
		Thread.sleep(1000);
		driver.close();
	}

}
