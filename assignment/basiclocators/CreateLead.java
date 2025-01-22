package week2.assignment.basiclocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
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
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Naveen");
		Thread.sleep(1000);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumar");
		Thread.sleep(1000);
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Naveenlogistics");
		Thread.sleep(1000);
		driver.findElement(By.name("generalProfTitle")).sendKeys("Mr");
		driver.findElement(By.className("smallSubmit")).click();
		
		String title=driver.getTitle();
		String expectedTitle="View Lead | opentaps CRM";
		if(title.equalsIgnoreCase(expectedTitle))
		{
			System.out.println(title+" coming as expected");
		}
		else
		{
			System.out.println(title+" not coming as expected");
		}
		//killing the driver instance
		driver.quit();

	}

}
