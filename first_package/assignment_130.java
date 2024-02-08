package first_package;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment_130
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[.='CONTINUE TO LOGIN']")).click();
		driver.findElement(By.id("username")).sendKeys("supriya wadekar");
		Thread.sleep(1000);
		driver.findElement(By.id("label2")).sendKeys("supriya123");
		Thread.sleep(1000);
		driver.findElement(By.id("loginCaptchaValue")).sendKeys("myrk7");
		Thread.sleep(1000);
		driver.close();

	}

}
