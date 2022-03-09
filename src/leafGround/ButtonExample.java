package leafGround;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonExample {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();

		//open the leafground.com
		driver.get("http://leafground.com/");
		driver.manage().window().maximize();

		//finding the position of a element using Point Class from Selenium
		WebElement butt = driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[2]/a"));		 
		butt.click();
		WebElement findposition = driver.findElement(By.id("position"));
		Point xypoint = findposition.getLocation();
		System.out.println("The X-position is " + xypoint.getX());
		System.out.println("The Y-position is " + xypoint.getY());
		
		//Finding color of element using getattribute and CssSelector
		WebElement color = driver.findElement(By.id("color"));
		System.out.println("The colour of the box is " + color.getAttribute("style"));
		System.out.println("The Box color By CssSelector is "+ color.getCssValue("background-color"));
		
		//Finding Size of element(height and width)
		WebElement size = driver.findElement(By.id("size"));
		int height = size.getSize().height;
		System.out.println("The height of the element is "+ height);
		int width = size.getSize().width;
		System.out.println("The width of the element is "+ width);
		
		WebElement home = driver.findElement(By.id("home"));
		home.click();
	}

}
