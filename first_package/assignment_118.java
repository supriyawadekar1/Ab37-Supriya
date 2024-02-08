package first_package;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class assignment_118
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("supriya@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("supriya@123");
		driver.findElement(By.xpath("//button[@name='login']")).click();


	}

}
