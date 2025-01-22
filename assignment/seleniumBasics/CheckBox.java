package week2.assignment.seleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class CheckBox {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver(); // Intializing chrome driver object
		driver.get("https://leafground.com/checkbox.xhtml"); // launching the given url
		driver.manage().window().maximize(); // maximizing the browser window using window method
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement basicCheckbox = driver.findElement(By.xpath("//span[text()='Basic']"));
		basicCheckbox.click();
		WebElement notiCheckbox = driver.findElement(By.xpath("//span[text()='Ajax']"));
		notiCheckbox.click();
		
		String expected="Checked";
		String actMessage=driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
		if(actMessage.equalsIgnoreCase(expected))
		{
			System.out.println(actMessage+" is coming as expected");
		}
		else
		{
			System.out.println(actMessage+" is not coming as expected");
		}
		
        driver.findElement(By.xpath("//input[@value='java']/parent::div/following-sibling::div/span")).click();
        driver.findElement(By.xpath("//input[@value='py']/parent::div/following-sibling::div/span")).click();
        
//        driver.findElement(By.xpath("//span[@class='ui-chkbox-icon ui-c']")).click();
        
	}

}
