package first_package;

import org.openqa.selenium.chrome.ChromeDriver;

public class assignment_111 {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		String s=driver.getTitle();
		System.out.println(s);
		String s1[]=s.split(" ");
		for(int i=0;i<s1.length;i++)
		{
			System.out.println(s1[i]);
		}
		
		driver.close();
	}

}
