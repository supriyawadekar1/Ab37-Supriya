package first_package;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class assignment_129 
{
	public static void main(String[] args) throws InterruptedException
	{
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://grotechminds.com/javascript-popup/");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		driver.manage().window().maximize();
		System.out.println("The page title is :"+driver.getTitle());
		driver.close();
	}

}
