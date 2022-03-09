package UserInterface;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class TestSuiteExample {
	//Open the chrome browser and go to
	//google.com and navigate to yahoo.com and to gmail.com
	
	ChromeDriver driver;	
	//WebDriver driver;
	long startTime = System.currentTimeMillis();
	
	@BeforeSuite
		public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		//System.setProperty("webdriver.chrome.driver",
		//		"C:\\work\\drivers\\chromedriver_win32\\chromedriver.exe");
		//driver = new ChromeDriver();
	}
	
	@Test
	public void OpenChrome() {

		driver.get("https://www.google.com/");
		System.out.println("My Current URL is " + driver.getCurrentUrl());
	}

	@Test
	public void OpenYahoo() {

		driver.get("https://in.search.yahoo.com/?fr2=inr");
		System.out.println("My Current URL is " + driver.getCurrentUrl());
	}

	@Test
	public void OpenGmail() {

		driver.get("https://mail.google.com/mail/u/0/#inbox");
		System.out.println("My Current URL is " + driver.getCurrentUrl());
	}

	@AfterSuite
	public void closeBrowser() {
		driver.quit();
		long endTime = System.currentTimeMillis();
		long totalTime = (endTime-startTime);
		System.out.println("Total time Duration is "+ totalTime);

	}
}