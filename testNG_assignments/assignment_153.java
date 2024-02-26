package testng_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class assignment_153 
{
	@Test(dataProvider="input")
	public void fb_registartion(String fn,String sn,String mob,String pwd)
	{
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		driver.findElement(By.name("firstname")).sendKeys(fn);
		driver.findElement(By.name("lastname")).sendKeys(sn);
		driver.findElement(By.name("reg_email__")).sendKeys(mob);
		driver.findElement(By.name("reg_passwd__")).sendKeys(pwd);
		WebElement day_dd=driver.findElement(By.id("day"));
		Select s1=new Select(day_dd);
		s1.selectByVisibleText("26");
		WebElement mon_dd=driver.findElement(By.id("month"));
		Select s2=new Select(mon_dd);
		s2.selectByVisibleText("Aug");
		WebElement yr_dd=driver.findElement(By.id("year"));
		Select s3=new Select(yr_dd);
		s3.selectByVisibleText("1991");
																										driver.findElement(By.name("sex")).click();
		driver.findElement(By.name("websubmit")).click();
		driver.close();
	}
	@DataProvider(name="input")
	public Object[][] input_values()
	{
		Object[][] d1=new Object[11][4];
		d1[0][0]="supriya";
		d1[0][1]="wadekar";
		d1[0][2]="8310651719";
		d1[0][3]="facebook123";
			d1[1][0]="suhana";
			d1[1][1]="pathak";
			d1[1][2]="7675988777";
			d1[1][3]="wadekar.supriya19@gmail.com";
				d1[2][0]="sneha";
				d1[2][1]="mishra";
				d1[2][2]="9376578986";
				d1[2][3]="loginfb123";
					d1[3][0]="yogesh"; 
					d1[3][1]="jadhav"; 
					d1[3][2]="6749843978"; 
					d1[3][3]="hgwdfgg@123";
				  		d1[4][0]="puru";
				  		d1[4][1]="jadhav";
				  		d1[4][2]="8957876769";
				  		d1[4][3]="dnuycag$11";
				  	d1[5][0]="muddu";
				  	d1[5][1]="jadhav";
				  	d1[5][2]="9578634627"; 
				  	d1[5][3]="kjkfdhg#1223";
				d1[6][0]="samiksha";
				d1[6][1]="wadekar";
				d1[6][2]="9809876455"; 
				d1[6][3]="smmu@123";
			d1[7][0]="kanhaiyya";
			d1[7][1]="wadekar";
			d1[7][2]="9456867998"; 
			d1[7][3]="kanhu5678";
		d1[8][0]="kedar"; 
		d1[8][1]="wadkar";
		d1[8][2]="7634950887"; 
		d1[8][3]="kedar@123";
				  d1[9][0]="muddu";
				  d1[9][1]="jadhav"; 
				  d1[9][2]="9263576578"; 
				  d1[9][3]="callmemuddu@123";
				  		d1[10][0]="kanika";
				  		d1[10][1]="singh";
				  		d1[10][2]="9756764898";
				  		d1[10][3]="kanika@123";
				 
			
		return d1;
		
	}
}
