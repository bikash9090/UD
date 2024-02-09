package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assig8 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//input[@class=\"inputs ui-autocomplete-input\"]")).sendKeys("ind");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		List<WebElement> suggestions = driver.findElements(By.className("ui-menu-item-wrapper"));
		System.out.println(suggestions);
		for(WebElement sugg : suggestions) {
			if(sugg.getText().equalsIgnoreCase("Indonesia")) {
				sugg.click();
			String text = driver.findElement(By.xpath("//input[@id=\"autocomplete\"]")).getAttribute("value");
			System.out.println(text);
			}
	
		 }
	}
}


