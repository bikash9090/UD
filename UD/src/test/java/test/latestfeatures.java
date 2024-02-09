package test;

import org.openqa.selenium.By;
import static org.openqa.selenium.support.locators.RelativeLocator.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class latestfeatures {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement namebox = driver.findElement(By.cssSelector("[name='name']"));
		//driver.findElement(with(By.tagName("label")).above(nameEditBox)).getTest());

	}

}
