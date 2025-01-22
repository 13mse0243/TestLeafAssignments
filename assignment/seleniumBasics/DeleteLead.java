package week2.assignment.seleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DeleteLead {

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
		boolean noRecordsFound = false;
		while(!noRecordsFound)
		{
		driver.findElement(By.partialLinkText("Find Leads")).click();
		
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("456789123");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		String noRecordsText =driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		System.out.println(noRecordsText);
		if(noRecordsText.equalsIgnoreCase("No records to display"))
		{
			System.out.println("Expected message alert: "+noRecordsText);
			noRecordsFound = true;
		}
		else
		{
			String firstLink=driver.findElement(By.xpath("//div[text()='1 456789123'][1]/ancestor::tr/td[1]/div/a")).getText();
			driver.findElement(By.xpath("//a[text()='"+firstLink+"']")).click();
			driver.findElement(By.xpath("//a[text()='Delete']")).click();
			System.out.println(firstLink+" record deleted successfully");
		}
		}
		
		driver.close();
		

	}

}
