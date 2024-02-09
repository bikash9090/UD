package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assig7 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//scrolling the entire page
		
		JavascriptExecutor js  = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(3000);
		int noc = driver.findElements(By.xpath("//table[@class=\"table-display\"]//tr")).size();
	    System.out.println(noc);
	   int nor= driver.findElements(By.xpath("//table[@class=\"table-display\"]//th")).size();
		System.out.println(nor);
		String text = driver.findElement(By.xpath("//table[@class=\"table-display\"]//tr[3]")).getText();
		System.out.println(text);

	}

}
