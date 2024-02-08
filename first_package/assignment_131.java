package first_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class assignment_131
{
		public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		WebElement fashion=driver.findElement(By.xpath("//span[.='Fashion']"));
		Thread.sleep(2000);
		Actions a1=new Actions(driver);
		a1.moveToElement(fashion).perform();
		Thread.sleep(2000);
		WebElement shirt=driver.findElement(By.linkText("Men's T-Shirts"));
		shirt.click();

	}

}
