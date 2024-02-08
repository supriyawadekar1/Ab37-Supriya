package first_package;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class assignment_128
{
	public static void main(String[] args) throws InterruptedException 
	{
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement search_box=driver.findElement(By.id("twotabsearchtextbox"));
		WebElement search_button=driver.findElement(By.id("nav-search-submit-button"));
		search_box.sendKeys("shoes");
		search_button.click();
		WebElement shoes=driver.findElement(By.xpath("(//div[@class='a-section a-spacing-base a-text-center'])[45]"));
		shoes.click();
		Set<String> selected_shoe=driver.getWindowHandles();
		System.out.println(selected_shoe);
		Iterator<String> pid=selected_shoe.iterator();
		String pid1=pid.next();
		String cid=pid.next();
		System.out.println(pid1);
		System.out.println(cid);
		driver.switchTo().window(cid);
		WebElement add_cart=driver.findElement(By.id("add-to-cart-button"));
		add_cart.click();
		Thread.sleep(2000);
		//driver.quit();
	}

}
