package week2.assignment.seleniumBasics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver(); // Intializing chrome driver object
		driver.get("https://leafground.com/radio.xhtml"); // launching the given url
		driver.manage().window().maximize(); // maximizing the browser window using window method
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Select 'Your most favourite browser' from the radio buttons
		String browser="Chrome";
		driver.findElement(By.xpath("//label[text()='"+browser+"'][1]")).click();
		//Click on a radio button, then click on the same radio button again to verify that it becomes ‘unselected’
		WebElement unSelectableRadio= driver.findElement(By.xpath("//label[text()='Chennai']"));
		unSelectableRadio.click();
		Thread.sleep(3000);
		unSelectableRadio.click();
//		WebElement checkRadio= driver.findElement(By.xpath("//input[@value='Chennai']"));
		if(unSelectableRadio.isSelected())
		{
			System.out.println("Selected as Unexpected");
		}
		else
		{
			System.out.println("UnSelected as expected");
		}
		System.out.println("------------------------------------");
		driver.navigate().refresh();
		Thread.sleep(2000);
		//Identify the radio button that is initially selected by default.
		List<WebElement> listElement= driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("Default selected Radio Buttons are:");
		for(WebElement ele: listElement)
		{
			if(ele.isSelected())
			{
				System.out.println(ele.getAttribute("Value"));
			}
		}
		System.out.println("------------------------------------");
		//Check and select the age group (21-40 Years) if not already selected.
		
		WebElement ageRadio= driver.findElement(By.xpath("//input[@value='21-40 Years']"));
		Boolean radioCheck= ageRadio.isSelected();
		if(!radioCheck)
		{
			ageRadio.click();
		}
		else
		{
			System.out.println("21-40 years is already selected");
		}
		
		driver.quit();
		
	}

}
