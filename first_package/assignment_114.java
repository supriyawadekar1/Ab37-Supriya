package first_package;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class assignment_114 
{
	public static void main(String[] args) throws InterruptedException
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Mobiles")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
