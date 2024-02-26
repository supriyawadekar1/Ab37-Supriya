package assignments_testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class assignment_152
{
	@Test(dataProvider="testdata")
	public void login_amazon(String un,String pwd)
	{
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement sign_in=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		Actions a1=new Actions(driver);
		a1.moveToElement(sign_in).perform();
		WebElement sign_in1=driver.findElement(By.xpath("(//span[.='Sign in'])[1]"));
		sign_in1.click();
		driver.findElement(By.id("ap_email")).sendKeys(un);
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys(pwd);
		driver.findElement(By.id("signInSubmit")).click();
		driver.close();
	}
	@DataProvider(name="testdata")
	public Object[][] testdata_amazon()
	{
		Object[][] d1=new Object[7][2];
		d1[0][0]="wadekar.supriya19@gmail.com";
																										d1[0][1]="amazonin@123";
			d1[1][0]="wadekar.supriya19@gmail.com";
			d1[1][1]="amazonin";
				d1[2][0]="abcd@gmail.com";
																										d1[2][1]="amazonin@123";
						d1[3][0]="abcd@gmail.com";
						d1[3][1]="amazonin";
				d1[4][0]="";
				d1[4][1]="amazonin";
			d1[5][0]="wadekar.supriya19@gmail.com";
			d1[5][1]="";
		d1[6][0]="";
		d1[6][1]="";
		return d1;
		
	}
}
