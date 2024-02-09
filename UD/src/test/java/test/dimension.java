package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dimension {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement testbox = driver.findElement(By.cssSelector("[name='name']"));
		System.out.println(testbox.getRect().getDimension().getHeight());
		System.out.println(testbox.getRect().getDimension().getWidth());

	}

}
