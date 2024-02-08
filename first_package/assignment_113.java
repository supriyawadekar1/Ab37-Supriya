package first_package;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class assignment_113
{
	public static void main(String[] args)
	{
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	driver.manage().window().maximize();
	driver.findElement(By.id("ap_email")).sendKeys("9769480041");
	driver.findElement(By.id("continue")).click();
	driver.findElement(By.id("ap_password")).sendKeys("askndjsjci");
	driver.findElement(By.id("signInSubmit")).click();
	driver.close();
	}

}
