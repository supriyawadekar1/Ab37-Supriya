package first_package;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class assignment_134
{
	public static void main(String[] args) 
	{
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
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
		WebElement shoes=driver.findElement(By.xpath("(//div[@class='a-section a-spacing-base a-text-center'])[45]"));
		shoes.click();
		
		Set<String> selected_shoe=driver.getWindowHandles();
		Iterator<String> pid=selected_shoe.iterator();
		String pid1=pid.next();
		String cid=pid.next();
		driver.switchTo().window(cid);
		WebElement add_cart=driver.findElement(By.id("add-to-cart-button"));
		add_cart.click();
		
		WebElement proceed_tobuy=driver.findElement(By.name("proceedToRetailCheckout"));
		proceed_tobuy.click();
		WebElement usethis_addr=driver.findElement(By.xpath("(//input[@class='a-button-input'])[2]"));
		usethis_addr.click();
		WebElement radio_button=driver.findElement(By.xpath("//input[@value='SelectableAddCreditCard']"));
		radio_button.click();
		WebElement enter_details=driver.findElement(By.linkText("Enter card details"));
		enter_details.click();
		
		WebElement frame=driver.findElement(By.name("ApxSecureIframe"));
		driver.switchTo().frame(frame);
		
		WebElement card_no=driver.findElement(By.name("addCreditCardNumber"));
		card_no.sendKeys("421345678912345");
		driver.close();

	}

}
