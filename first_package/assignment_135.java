package first_package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment_135
{
	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.goibibo.com/flights/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@role='presentation']")).click();
		WebElement from=driver.findElement(By.xpath("(//p[@class='sc-12foipm-20 bhnHeQ'])[1]"));
		from.click();
		WebElement text1=driver.findElement(By.xpath("//input[@type='text']"));
		text1.sendKeys("BLR");
		WebElement auto1=driver.findElement(By.xpath("(//div/span/img[@alt='flight Icon'])[1]"));
		auto1.click();
		WebElement to=driver.findElement(By.xpath("//div/div/input[@type='text']"));
		to.click();
		WebElement text2=driver.findElement(By.xpath("//div/div/input[@type='text']"));
		text2.sendKeys("DEL");
		WebElement auto2=driver.findElement(By.xpath("(//div/span/img[@alt='flight Icon'])[1]"));
		auto2.click();
		WebElement date=driver.findElement(By.xpath("(//div[@class='DayPicker-Day'])[3]"));
		date.click();
		driver.findElement(By.className("fswTrvl__done")).click();
		driver.findElement(By.linkText("Done")).click();
		driver.findElement(By.xpath("//span[.='SEARCH FLIGHTS']")).click();

	}

}
