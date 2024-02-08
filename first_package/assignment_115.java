package first_package;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class assignment_115
{
	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Gmail")).click();

	}

}
