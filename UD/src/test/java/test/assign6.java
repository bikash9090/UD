package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assign6 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//input[@id=\"checkBoxOption2\"]")).click();
	    String text =driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();
	    System.out.println(text);
	    
	    WebElement elements = driver.findElement(By.id("dropdown-class-example"));
	    Select drop= new Select(elements);
	    drop.selectByVisibleText(text);
	    driver.findElement(By.name("enter-name")).sendKeys(text);
	    driver.findElement(By.id("alertbtn")).click();
	    String alertext = driver.switchTo().alert().getText();
	    if(alertext.contains(text)) {
	    	System.out.println("found");
	    	
	    	    }
	   
	    
		}
	    
	    
}
