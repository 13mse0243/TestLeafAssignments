package week2.assignment.basiclocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class CreateAccount {
	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver(); // Intializing chrome driver object
		driver.get("http://leaftaps.com/opentaps/"); // launching the given url
		driver.manage().window().maximize(); // maximizing the browser window using window method
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//entering username and password using sendKeys method and click on submit button
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		//clicking on CRM/SFA link using link text
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		//entering account details to create a new account
		driver.findElement(By.id("accountName")).sendKeys("Naveen01");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.id("numberEmployees")).sendKeys("2");
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		driver.findElement(By.className("smallSubmit")).click();
		//verifying the title
		String title=driver.getTitle();
		String expectedTitle="Account Details | opentaps CRM";
		if(title.equalsIgnoreCase(expectedTitle))
		{
			System.out.println(title+" coming as expected");
		}
		else
		{
			System.out.println(title+" not coming as expected");
		}
		//killing the driver instance
		driver.close();
	}

}
