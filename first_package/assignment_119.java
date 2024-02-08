package first_package;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment_119 
{
	public static void main(String[] args) throws InterruptedException 
	{
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.id("searchDropdownBox")).click();
		for(int i=1;i<=11;i++)
		{
			driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);	
		}
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Software");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		
		//WebElement drop_down=driver.findElement(By.id("searchDropdownBox"));
		//Select s1=new Select(drop_down);
		//s1.selectByVisibleText("Books");
		Thread.sleep(3000);
		
		
	}

}
