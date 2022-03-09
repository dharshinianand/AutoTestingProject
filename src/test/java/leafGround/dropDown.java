package leafGround;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropDown {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();

		//open the leafground.com
		driver.get("http://leafground.com/");
		driver.manage().window().maximize();

		WebElement dropdwn = driver.findElement(By.partialLinkText("Drop down"));
		dropdwn.click();
		WebElement drop1 = driver.findElement(By.id("dropdown1"));
		Select obj = new Select(drop1);
		obj.selectByIndex(2);

		WebElement drop2 = driver.findElement(By.name("dropdown2"));
		Select obj1 = new Select(drop2);
		obj1.selectByVisibleText("Loadrunner");

		WebElement drop3 = driver.findElement(By.name("dropdown3"));
		Select obj2 = new Select(drop3);
		obj2.selectByValue("4");

		WebElement drop4 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/select"));
		Select obj3 = new Select(drop4);
		int b = obj3.getOptions().size();
		System.out.println(b);
		int a = obj3.getOptions().toArray().length;
		System.out.println(a);

		WebElement drop5 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/select"));
		drop5.sendKeys("Loadrunner");
		
		WebElement drop6 = driver.findElement(By.partialLinkText("//*[@id=\'contentblock\']/section/div[6]/select/option[1]"));
		Select obj4 = new Select(drop6);
		//obj4.selectByValue("2");
		//obj4.selectByValue("3");
		obj4.getAllSelectedOptions().add(a, drop6);
	}

}
