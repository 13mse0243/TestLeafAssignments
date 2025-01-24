package testleaf.Marathon;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCase1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Thread.sleep(1000);
		driver.navigate().refresh();
		//Type "Bags for boys" in the Search box
		String searchText="bags for boys";
		driver.findElement(By.xpath("//input[@role='searchbox']")).sendKeys(searchText);
		//Choose the item in the result (bags for boys)
		driver.findElement(By.xpath("//div[text()='"+searchText+"']")).click();
		//Print the total number of results (like 50000)
		System.out.println(driver.findElement(By.xpath("//h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']")).getText());
		//Select the first 2 brands in the left menu
		driver.findElement(By.xpath("//div[@id='brandsRefinements']/div/following::i[1]")).click();
		driver.findElement(By.xpath("//div[@id='brandsRefinements']/div/following::i[2]")).click();
		//Choose New Arrivals (Sort)
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='s']"));
		Select dropdown = new Select(dropdownElement);
		dropdown.selectByVisibleText("Newest Arrivals");
		
	}

}
