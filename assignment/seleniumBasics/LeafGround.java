package week2.assignment.seleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class LeafGround {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver(); // Intializing chrome driver object
		driver.get("https://leafground.com/button.xhtml"); // launching the given url
		driver.manage().window().maximize(); // maximizing the browser window using window method
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Click on the button with the text ‘Click and Confirm title.
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		//Verify that the title of the page is ‘dashboard.’
		String expectedTitle="Dashboard";
		String actualTtile=driver.getTitle();
		if(expectedTitle.equals(actualTtile))
		{
			System.out.println(actualTtile+" title is verified successfully");
		}
		else
		{
			System.out.println("Title is not coming as expected");
		}
		Thread.sleep(1000);
		driver.navigate().back();
		//Check if the button with the text ‘Confirm if the button is disabled’ is disabled.
		Thread.sleep(3000);
		boolean isButtonEnabled= driver.findElement(By.xpath("//span[text()='Disabled']")).isEnabled();
		if(!isButtonEnabled)
		{
			System.out.println("Button is disabled as expected");
		}
		else
		{
			System.out.println("Button is enabled which is unexpected");
		}
		
		//Find and print the position of the button with the text ‘Submit.’
		System.out.println(driver.findElement(By.xpath("//button[@name='j_idt88:j_idt94']/span[text()='Submit']")).getLocation());
		//Find and print the background color of the button with the text ‘Find the Save button color.
		System.out.println(driver.findElement(By.xpath("//span[text()='Save']")).getCssValue("background-color"));
		//Find and print the height and width of the button with the text ‘Find the height and width of this button.’
		System.out.println(driver.findElement(By.xpath("//button[@name='j_idt88:j_idt98']//span[text()='Submit']")).getSize());
		
		driver.quit();

	}

}
