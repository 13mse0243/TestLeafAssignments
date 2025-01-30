package testleaf.Marathon2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TataCliq {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		// 1. Load the url as https://www.tatacliq.com/
		driver.get("https://www.tatacliq.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		WebElement notifyCancel = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='wzrk-cancel']")));
		if (notifyCancel.isDisplayed()) {
			notifyCancel.click();
		}
		
		// 2. MouseHover on 'Brands' using actions class
		WebElement brandsEle = driver.findElement(By.xpath("//div[text()='Brands']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(brandsEle).perform();
		Thread.sleep(3000);
		//MouseHover on 'Watches & Accessories'
		List<WebElement> list= driver.findElements(By.xpath("//div[@class='DesktopHeader__brandLeftDetails']/div"));
		for(WebElement l:list)
		{
			if(l.getText().equals("Watches & Accessories"))
			{
				actions.moveToElement(l).perform();
			}
		}
		//Choose the first option from the 'Featured brands'.
		List<WebElement> featureList= driver.findElements(By.xpath("//div[@class='DesktopHeader__featureBrands']/div"));
		featureList.get(1).click();
		// Select sortby: New Arrivals
		Thread.sleep(3000);
		WebElement sortByDropdown = driver.findElement(By.xpath("//select[@class='SelectBoxDesktop__hideSelect']"));
//		wait.until(ExpectedConditions.visibilityOf(sortByDropdown));
        Select sortBySelect = new Select(sortByDropdown);
        sortBySelect.selectByValue("isProductNew");
		//choose men from catagories filter.
		driver.findElement(By.xpath("//div[text()='Men' and @class='FilterDesktop__newFilName']")).click();
		//print all price of watches
        Thread.sleep(2000); 
        List<WebElement> priceList = driver.findElements(By.xpath("//div[@class='ProductDescription__priceHolder']/h3"));
        for(WebElement price:priceList)
        {
        	System.out.println(price.getText().replaceAll("[^0-9]", ""));
        }
        String priceInParentWindow= priceList.get(0).getText().replaceAll("[^0-9]", "");
        //8. click on the first resulting watch
        String originalWindow = driver.getWindowHandle();
        System.out.println(originalWindow);
        driver.findElement(By.xpath("//div[@class='ProductModule__base']")).click();
        //Handle Alert Pop Up
        Set<String> window=driver.getWindowHandles();
        for (String windowHandle : window) {
            if (!windowHandle.equals(originalWindow)) {
                driver.switchTo().window(windowHandle);
                break;
                }
        }
        //compare two price are similar
        String priceInChildWindow= driver.findElement(By.xpath("//div[@class='ProductDetailsMainCard__price']/h3")).getText();
        System.out.println("Price of the product in Child window-->"+priceInChildWindow.replaceAll("[^0-9]", ""));
        System.out.println("Price of the product in Parent window-->"+priceInParentWindow);
        if(priceInChildWindow.replaceAll("[^0-9]", "").equals(priceInParentWindow))
        {
        	System.out.println("Prices are similiar");
        }
        else
        {
        	System.out.println("prices are not similiar");
        }
        //click Add to cart and get count from the cart icon.
        driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
        System.out.println("Items in the cart: "+driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']")).getText());
        //Click on the cart and  Take a snap of the resulting page.
        driver.findElement(By.className("DesktopHeader__myBagShow")).click();
        Thread.sleep(3000);
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File destinationFile = new File("C:\\Users\\navp1\\eclipse-workspace\\NaveenkumarProjects\\src\\main\\java\\testleaf\\Marathon2\\screenshot_cart.png");
        FileHandler.copy(screenshot, destinationFile);
        System.out.println("Screenshot saved successfully at: " + destinationFile.getAbsolutePath());
        driver.close();
        driver.quit();
        

	}
}
