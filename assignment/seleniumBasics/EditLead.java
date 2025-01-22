package week2.assignment.seleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

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
		//Enter the CompanyName Field Using Xpath.
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Kaviyalogistics");
		//Enter the FirstName Field Using Xpath.
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Kaviya");
		//Enter the LastName Field Using Xpath
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("D");
		//Enter the FirstName (Local) Field Using Xpath.
		driver.findElement(By.xpath("//input[@name='firstNameLocal']")).sendKeys("DK");
		//Enter the Department Field Using any Locator of Your Choice.
		driver.findElement(By.name("departmentName")).sendKeys("Logistics");
		//Enter the Description Field Using any Locator of your choice.
        driver.findElement(By.id("createLeadForm_description")).sendKeys("Logistics and courier services");
        //Enter your email in the E-mail address Field using the locator of your choice.
        driver.findElement(By.xpath("//td//input[@name='primaryEmail']")).sendKeys("naveen@gmail.com");
        //Select State/Province as NewYork Using Visible Text.
        WebElement stateEle= driver.findElement(By.name("generalStateProvinceGeoId"));
        Select sel1=new Select(stateEle);
        sel1.selectByVisibleText("New York");
        //Click on the Create Button.
        driver.findElement(By.className("smallSubmit")).click();
        //Click on the edit button.
        driver.findElement(By.xpath("//a[text()='Edit']")).click();
        //Clear the Description Field.
        driver.findElement(By.id("updateLeadForm_description")).clear();
        //Fill the Important Note Field with Any text.
        driver.findElement(By.name("importantNote")).sendKeys("Created for testing");
        //Click on the update button.
        driver.findElement(By.xpath("//input[@value='Update']")).click();
        //Get the Title of the Resulting Page.
        System.out.println(driver.getTitle());
        
        driver.close();
		

	}

}
