package test;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class action {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/howto/howto_css_dropdown.asp");
		
		
		
		Actions obj = new Actions(driver);
		
		
		obj.moveToElement(driver.findElement(By.xpath("//div[@class=\"dropdown dropdown2\"]"))).build().perform();
		//or it can eb aslo done
		WebElement store = driver.findElement(By.xpath("//div[@class=\"dropdown dropdown2\"]"));
		obj.moveToElement(store).build().perform();
		
		
		WebElement searchbox =driver.findElement(By.id("tnb-google-search-inner-container"));
		obj.moveToElement(searchbox).click().keyDown(Keys.SHIFT).sendKeys("Hellloo").build().perform();
		obj.moveToElement(searchbox).contextClick().build().perform();
		obj.moveToElement(searchbox).doubleClick().build().perform();
	    
			
	}

}
