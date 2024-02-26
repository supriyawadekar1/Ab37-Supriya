package assignments_testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class assignment_148 extends Launch_Close 
{
	@Test
	public void Login_search_logout()
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
		WebElement dd=driver.findElement(By.id("searchDropdownBox"));
		Select s1=new Select(dd);
		s1.selectByVisibleText("Books");
		driver.findElement(By.xpath("(//input[@id='twotabsearchtextbox'])[1]")).sendKeys("Software");
		driver.findElement(By.xpath("//input[@value='Go']")).click();
	}
}
