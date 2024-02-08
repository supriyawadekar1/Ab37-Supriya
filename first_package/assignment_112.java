package first_package;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class assignment_112
{
	public static void main(String[] args) throws InterruptedException
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("wadekar.supriya@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("**********");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
