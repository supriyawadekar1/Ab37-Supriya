package first_package;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class assignment_127 
{
	public static void main(String[] args) throws InterruptedException
	{
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("shoes");
		Thread.sleep(2000);
		List<WebElement> auto_suggestion=driver.findElements(By.xpath("//form/ul/li"));
		int count=auto_suggestion.size();
		System.out.println("The number of auto_suggestions is: "+count);
		WebElement second_option=auto_suggestion.get(count-7);
		second_option.click();
		driver.close();
	}

}
