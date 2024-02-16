package Amazon_scenarios;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class test_case1 extends Launch_Close
{
	@Test
	public void Login_search_logout() throws InterruptedException
	{
		WebElement sign_in=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		
		Actions a1=new Actions(driver);
		a1.moveToElement(sign_in).perform();
		WebElement sign_in1=driver.findElement(By.xpath("(//span[.='Sign in'])[1]"));
		sign_in1.click();
		WebElement email=driver.findElement(By.id("ap_email"));
		email.sendKeys("wadekar.supriya19@gmail.com");
		WebElement click_continue=driver.findElement(By.id("continue"));
		click_continue.click();
		WebElement pass=driver.findElement(By.id("ap_password"));
		                                                                                          pass.sendKeys("amazonin@123");
		WebElement sign_in2=driver.findElement(By.id("signInSubmit"));
		sign_in2.click();
		WebElement search_box=driver.findElement(By.id("twotabsearchtextbox"));
		WebElement search_button=driver.findElement(By.id("nav-search-submit-button"));
		search_box.sendKeys("shoes");
		search_button.click();
		WebElement shoes=driver.findElement(By.xpath("(//div[@class='a-section a-spacing-base a-text-center'])[4]"));
		shoes.click();
		Thread.sleep(5000);
		
		Set<String> selected_pen=driver.getWindowHandles();
		Iterator<String> pid=selected_pen.iterator();
		String parentid=pid.next();
		String childid=pid.next();
		driver.switchTo().window(childid);
	}
	
}
