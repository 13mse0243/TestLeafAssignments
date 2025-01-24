package week2.Assessment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("email")).sendKeys("naveen@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Naveen@123");
		driver.findElement(By.name("login")).click();
		String ActualMessage= driver.findElement(By.xpath("//div[@class='_9ay7']")).getText();
		System.out.println(ActualMessage);
		driver.close();

	}

}
