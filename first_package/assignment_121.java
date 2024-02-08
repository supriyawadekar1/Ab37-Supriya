package first_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class assignment_121 
{
	public static void main(String[] args) throws InterruptedException 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		
		WebElement one=driver.findElement(By.id("fname"));
		one.sendKeys("Supriya");
		Thread.sleep(1000);
		WebElement two=driver.findElement(By.id("lname"));
		two.sendKeys("Wadekar");
		Thread.sleep(1000);
		WebElement three=driver.findElement(By.id("Username"));
		three.sendKeys("Supriya_wadekar");
		Thread.sleep(1000);
		WebElement four=driver.findElement(By.id("password"));
		four.sendKeys("kasbfkucb");
		Thread.sleep(1000);
		WebElement five=driver.findElement(By.id("FeMale"));
		five.click();
		Thread.sleep(1000);
		WebElement six=driver.findElement(By.id("w3review"));
		six.sendKeys("kasbfkucb skgdk klushdlkjfh");
		Thread.sleep(1000);
		WebElement seven=driver.findElement(By.id("Address"));
		seven.sendKeys("kasbfkucb sdkjbvw askjdfhkjw");
		Thread.sleep(1000);
		WebElement eight=driver.findElement(By.id("Pincode"));
		eight.sendKeys("585102");
		Thread.sleep(1000);
		WebElement nine=driver.findElement(By.id("Agree"));
		nine.click();
		Thread.sleep(1000);
		driver.close();
	}

}
