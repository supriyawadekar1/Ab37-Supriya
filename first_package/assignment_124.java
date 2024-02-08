package first_package;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class assignment_124
{
	public static void main(String[] args) throws InterruptedException 
	{
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("https://grotechminds.com/x-path/#1");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 WebElement product=driver.findElement(By.xpath("//a[.='Product']"));
		 
		 WebElement books=driver.findElement(By.xpath("//a[.='Books']"));
		 
		 WebElement mobiles=driver.findElement(By.xpath("//a[.='Mobiles']"));
		
		 WebElement clothes=driver.findElement(By.xpath("//a[.='Clothes']"));
		 
		 WebElement choclates=driver.findElement(By.xpath("//a[.='Choclates']"));
	}

}
