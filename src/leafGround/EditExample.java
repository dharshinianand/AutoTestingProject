package leafGround;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditExample {

	public static void main(String[] args) {
		//Open the EdgeBrowse
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		
		//get the leafground.com
		driver.get("http://leafground.com/");
		
		//maximize the screen
		driver.manage().window().maximize();
		WebElement link = driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a"));
		link.click();
		
		//find Element and do accordingly
		WebElement mail = driver.findElement(By.id("email"));
		mail.sendKeys("dharshiniytoo@gmail.com");
		WebElement append = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input"));
		append.sendKeys("Vidarth");
		WebElement read = driver.findElement(By.name("username"));
		System.out.println(read.getAttribute("value"));
		WebElement clear = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/input"));
		clear.clear();
		WebElement bool = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/div/div"));
		System.out.println(bool.isEnabled());
		//System.out.println(bool.getAttribute("disabled"));
		
		//close the Browser
		driver.close();
	}

}
