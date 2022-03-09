package UserInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement dd = driver.findElement(By.cssSelector("#ctl00_mainContent_DropDownListCurrency"));
		dd.click();


		Select obj = new Select(dd);
		//obj.selectByIndex(1);
		//System.out.println(dd.getText());
		//obj.selectByVisibleText("AED");
		//Thread.sleep(3000L);
		obj.selectByValue("AED");

	}

}
