package first_package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class assignment_126
{
	public static void main(String[] args)
	{
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		List<WebElement> links= driver.findElements(By.tagName("a"));
		System.out.println("The number of links is :"+links.size());
		driver.close();
	}

}
