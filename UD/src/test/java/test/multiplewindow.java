package test;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class multiplewindow {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> winid = driver.getWindowHandles();
		System.out.println(winid);
		Iterator<String> it = winid.iterator();
		String parrentwindow = it.next();// control on the first window that is the parent window
		String childwindow= it.next();
		driver.switchTo().window(childwindow);
		driver.get("https://rahulshettyacademy.com/");
		String coursename = driver.findElements(By.xpath("//div/h2//a")).get(1).getText();
		System.out.println(coursename);
		driver.switchTo().window(parrentwindow);
		driver.findElement(By.cssSelector("[name='name']")).sendKeys(coursename);
		

	}

}
