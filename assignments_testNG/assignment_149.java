package assignments_testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class assignment_149
{
	public static void main(String[] args) throws InterruptedException
	{
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("search_query")).sendKeys("Geckos Garage");
		WebElement test_new=driver.findElement(By.linkText("Test new features"));
		Point test=test_new.getLocation();
		int x=	test.getX();
		int y=	test.getY();
		for(int i=0;i>-1;i++)
		{
			JavascriptExecutor jse=	driver;
			jse.executeScript("window.scrollBy(0,"+y+")");
			Thread.sleep(3000);
		}

	}

}
