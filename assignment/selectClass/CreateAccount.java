package week2.assignment.selectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

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
		driver.findElement(By.id("accountName")).sendKeys("Naveen03");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		WebElement indID= driver.findElement(By.name("industryEnumId"));
		Select sel=new Select(indID);
		sel.selectByIndex(3);
		
		WebElement ownID= driver.findElement(By.name("ownershipEnumId"));
		Select sel2=new Select(ownID);
		sel2.selectByVisibleText("S-Corporation");
		
		WebElement sourceID= driver.findElement(By.name("dataSourceId"));
		Select sel3=new Select(sourceID);
		sel3.selectByValue("LEAD_EMPLOYEE");
		
		WebElement mcID= driver.findElement(By.name("marketingCampaignId"));
		Select sel4=new Select(mcID);
		sel4.selectByIndex(6);
		
		WebElement stateID= driver.findElement(By.name("generalStateProvinceGeoId"));
		Select sel5=new Select(stateID);
		sel5.selectByValue("TX");
		
		
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

