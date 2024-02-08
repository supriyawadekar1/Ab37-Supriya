package first_package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment_133 
{

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement drop_down=driver.findElement(By.id("searchDropdownBox"));
		
		Select s1=new Select(drop_down);
		List<WebElement> count=s1.getOptions();
		
		int count1=count.size();
		System.out.println("Number of drop downs is: "+count1);
		
		for(int i=0;i<count1;i++)
		{
			System.out.println(drop_down.getText());
		}
		
		driver.close();

	}

}
