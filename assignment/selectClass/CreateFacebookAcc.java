package week2.assignment.selectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateFacebookAcc {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver(); // Intializing chrome driver object
		driver.get("https://en-gb.facebook.com//"); // launching the given url
		driver.manage().window().maximize(); // maximizing the browser window using window method
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.partialLinkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Naveen");
		driver.findElement(By.name("lastname")).sendKeys("Kumar");
		driver.findElement(By.name("reg_email__")).sendKeys("9876543210");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Naveen@123");
		
		WebElement day= driver.findElement(By.name("birthday_day"));
		Select sel=new Select(day);
		sel.selectByIndex(3);
		
		WebElement month= driver.findElement(By.name("birthday_month"));
		Select sel1=new Select(month);
		sel1.selectByVisibleText("Jun");
		
		WebElement year= driver.findElement(By.name("birthday_year"));
		Select sel2=new Select(year);
		sel2.selectByValue("1995");
		
		driver.findElement(By.xpath("//input[@id='sex' and @value='2']")).click();
		
		driver.close();
	}

}
