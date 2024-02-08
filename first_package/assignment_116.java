package first_package;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class assignment_116
{
	public static void main(String[] args)
	{
		EdgeDriver driver=new EdgeDriver();
		String links[]= {"Arab Emirates","United Kingdom","United Stat"};
		
		for(int i=0;i<links.length;i++)
		{
			driver.get("https://www.amazon.in");
			driver.manage().window().maximize();
			driver.findElement(By.partialLinkText(links[i])).click();
			String title=driver.getTitle();
			System.out.println(title);
		}
		driver.close();
	}

}
