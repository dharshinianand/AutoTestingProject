package leafGround;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class linkExample {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();

		//open the leafground.com
		driver.get("http://leafground.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Go to Home Page")).click();
		driver.findElement(By.partialLinkText("Home Page")).click();
		
		
		
	}

}
