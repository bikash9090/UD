package test;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class srolltablejavascrexe {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//scrolling the entire page
		
		JavascriptExecutor js  = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(3000);
		js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=5000");
		List<WebElement> tabledata = driver.findElements(By.xpath("//div[@class=\"tableFixHead\"]//td[4]"));
		int sum = 0;
		for(int i =0;i<tabledata.size();i++) {
		String val = tabledata.get(i).getText();
		int value = Integer.parseInt(val);
		System.out.println(value);
		sum = sum+value;
		System.out.println(sum);
		}
		String[] totalam = driver.findElement(By.className("totalAmount")).getText().split(":");
		String total = totalam[1].trim();
		int sum2 = Integer.parseInt(total);
		System.out.println(sum2);
		Assert.assertEquals(sum, sum2);
			
		}
		
		}


	

