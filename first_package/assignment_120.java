package first_package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class assignment_120 
{
	public static void main(String[] args) throws InterruptedException 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		driver.findElement(By.id("fname")).sendKeys("Manish Kumar Tiwari");
		for(int i=1;i<7;i++)
		{
		Thread.sleep(1000);
		driver.findElement(By.id("fname")).sendKeys(Keys.BACK_SPACE);
		}
		Thread.sleep(1000);
		driver.close();
	}

}
