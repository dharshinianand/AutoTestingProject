package leafGround;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonExample {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver= new EdgeDriver();
		
		driver.get("http://leafground.com/pages/radio.html");
		driver.manage().window().maximize();
		
		
		WebElement butt = driver.findElement(By.xpath("//*[@id=\'yes\']"));
		butt.click();
		
		WebElement butt1 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/label[2]"));
		if (butt1.isSelected()) {
			System.out.println("The 'unchecked Button' is the default button");
		}else 
		{
		System.out.println("The 'checked Button' is the default button");
		}
		
		//WebElement butt2 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/label[3]"));
		//if (butt2.isSelected()) {
		//	System.out.println("The 'checked Button' is the default button");
		//}
		
		WebElement butt3 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/input[2]"));
		if (butt3.isSelected()) {
			System.out.println("Its Done!!");
		}
		else {
			butt3.click();
			System.out.println("Now I'm Selected");
		}
	}
}

