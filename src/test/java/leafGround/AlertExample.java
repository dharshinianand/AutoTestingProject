package leafGround;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();

		//open the leafground.com
		driver.get("http://leafground.com/");
		driver.manage().window().maximize();

		WebElement alertTest = driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[9]/a"));
		alertTest.click();

		WebElement alertboxs = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
		alertboxs.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		WebElement alertboxs1 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		alertboxs1.click();
		Thread.sleep(3000L);
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		

		WebElement alertboxs2 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/button"));
		alertboxs2.click();
		Thread.sleep(3000L);
		Alert alert2 = driver.switchTo().alert();
		alert2.sendKeys("Vidarth");
		alert2.accept();
		
		WebElement alertboxs3 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/button"));
		alertboxs3.click();
		Thread.sleep(3000L);
		Alert alert3 = driver.switchTo().alert();
		System.out.println(alert3.getText().chars().count());
		System.out.println(alert3.getText().lines().count());
		alert.accept();
		
		WebElement alertboxs4 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/div/div/button"));
		alertboxs4.click();
		Alert alert4 = driver.switchTo().alert();
		alert4.accept();
		
	}

}
