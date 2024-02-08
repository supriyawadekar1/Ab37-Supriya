package first_package;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment_117
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/NILESH/Desktop/learningHTML1.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/input")).sendKeys("Manish@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(/html/body/input)[2]")).sendKeys("my name is manish");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(/html/body/input)[3]")).sendKeys("Manish@123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(html/body/form/input)[1]")).sendKeys("Manish");
		Thread.sleep(1000);
		//driver.findElement(By.xpath("(html/body/form/input)[3]")).click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("(html/body/form/input)[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(html/body/input)[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(html/body/input)[6]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(html/body/input)[7]")).click();
		Thread.sleep(1000);
		driver.close();
	}

}
