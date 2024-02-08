package first_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class assignment_132
{
	public static void main(String[] args) throws InterruptedException
	{
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		WebElement drag=driver.findElement(By.id("drag7"));
		WebElement drop=driver.findElement(By.id("div2"));
		WebElement target=driver.findElement(By.xpath("(//div[@id='div1'])[7]"));
		
		Actions a1=new Actions(driver);
		a1.dragAndDrop(drag, drop).perform();
		Thread.sleep(2000);
		a1.dragAndDrop(drag, target).perform();
		Thread.sleep(2000);
		driver.close();
	}

}
