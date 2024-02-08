package first_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment_123
{
	public static void main(String[] args) throws InterruptedException 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement drop_d=driver.findElement(By.id("Skills"));
		Select s1=new Select(drop_d);
		s1.selectByIndex(1);
		Thread.sleep(2000);
		WebElement drop_d1=driver.findElement(By.id("Country"));
		Select s2=new Select(drop_d1);
		s2.selectByValue("India");
		Thread.sleep(1000);
		WebElement drop_d2=driver.findElement(By.id("Relegion"));
		Select s3=new Select(drop_d2);
		s3.selectByIndex(1);
		Thread.sleep(1000);
		driver.close();
	}

}
