package assignments_testNG;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class assignment_147 extends Launch_Close
{
	@Test
	public void Login_search_pen_cart_logout() throws InterruptedException
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
		search_box.sendKeys("pen");
		search_button.click();
		WebElement pen=driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-square-aspect'])[4]"));
		pen.click();
		
		Set<String> selected_shoe=driver.getWindowHandles();
		Iterator<String> pid=selected_shoe.iterator();
		String pid1=pid.next();
		String cid=pid.next();
		driver.switchTo().window(cid);
		WebElement add_cart=driver.findElement(By.id("add-to-cart-button"));
		add_cart.click();
		
	}
}
