package leafGround;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowManagement {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("http://leafground.com/");
		driver.manage().window().maximize();
		
		String oldWindow = driver.getWindowHandle();
		
		WebElement window = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[11]/a"));
		Thread.sleep(3000L);
		window.click();
				
		WebElement wind1 = driver.findElement(By.id("home"));
		Thread.sleep(3000L);
		wind1.click();
		Set<String> windowHandle = driver.getWindowHandles();
		
		for (String string : windowHandle) {
			driver.switchTo().window(string);
		}
		
		WebElement button = driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[2]/a"));
		Thread.sleep(3000L);
		button.click();
		Thread.sleep(3000L);
		driver.close();
		
		driver.switchTo().window(oldWindow);
		Thread.sleep(3000L);
		WebElement button1 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		Thread.sleep(3000L);
		button1.click();
		//Set<String> fullwindows = driver.getWindowHandles();
		int noOfWindows = driver.getWindowHandles().size();
		System.out.println("Number of Windows opened are "+ noOfWindows);
		driver.close();
		//for (String windowopened : fullwindows) {
		//	if(!windowopened.equals(oldWindow)) {
		//		driver.close();
		//	}

		//}
		driver.switchTo().window(oldWindow);
		WebElement closeWindow = driver.findElement(By.id("color"));
		Thread.sleep(3000L);
		Set<String> allwindows = driver.getWindowHandles();
		closeWindow.click();
		
		for (String childwindow : allwindows) {
			if(!childwindow.equals(oldWindow)) {
				driver.close();
			}
			else {
				System.out.println("You are in Parent Window");
			}
		}
	
	}

	}


