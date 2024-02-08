package first_package;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class assignment_125 
{
	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/NILESH/Desktop/learningHTML1.html");
		driver.manage().window().maximize();
		WebElement lname=driver.findElement(By.id("121"));
		if(lname.isEnabled()==true)
		{
			lname.sendKeys("wadekar");
		}
		else
		{
			System.out.println("The exception name is : "+" ElementNotInteractableException");
		}
		driver.close();
	}

}
