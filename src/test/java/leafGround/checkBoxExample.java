package leafGround;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class checkBoxExample {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();

		//open the leafground.com
		driver.get("http://leafground.com/");
		driver.manage().window().maximize();
		
		WebElement check = driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[7]/a/img"));
		check.click();
		
		WebElement java = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div[1]/input[1]"));
		java.click();
		
		WebElement check1 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/input"));
		System.out.println(check1.isSelected());
		
		WebElement check2 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div[1]/input"));
		if (check2.isSelected()) {
			check2.click();
		}
		
		WebElement check3 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div[2]/input"));
		if(check3.isSelected()) {
			check3.click();
		}
		WebElement check4 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div[1]/input"));
		check4.click();
	}

}
