package test;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.trukky.com/");
		 String currentURL = driver.getCurrentUrl();
	        System.out.println("Current URL: " + currentURL);

	        // Get and print the title
	        String pageTitle = driver.getTitle();
	        System.out.println("Page Title: " + pageTitle);
		driver.manage().window().maximize();

		// -------------------------------------------------------------------------
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Enter pickup city']")));

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(
				"//div[@style='background-color:rgba(255, 255, 255, 0.8);width:100%;height:100%;top:0;left:0;z-index:1000;display:flex;align-items:center;justify-content:center;position:absolute']")));
		WebElement pickup = driver.findElement(By.xpath("//input[@placeholder='Enter pickup city']"));
		pickup.click();
		pickup.sendKeys("Hyderabad");
		List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class='tabs']//li"));
		for (WebElement sugg : suggestions) {
			if (sugg.getText().contains("Hyderabad")) {
				sugg.click();
				break;

			}
		}
		// --------------------------------------------------------------------------

		WebElement drop = driver.findElement(By.xpath("//input[@placeholder='Enter drop city']"));
		drop.click();
		drop.sendKeys("Delhi");
		List<WebElement> suggestion2 = driver.findElements(By.xpath("//div[@class='tabs']//li"));
		for (WebElement sugg2 : suggestion2) {
			if (sugg2.getText().contains("New Delhi")) {
				sugg2.click();
				break;
			}
		}
		//=---------------------------------------------------------------------------
		
		
		driver.findElement(By.className("submitBtn")).click();
		
		//-----------------------------------------------------------------------------

		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"__next\"]/div/main/div/ul/li[2]")));
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/ul/li[2]")).click();

		
		
		try {
			WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(15));
			wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("li:nth-child(1) div:nth-child(1)")));
			driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/ul/li[1]/div")).click();
		} catch (StaleElementReferenceException e) {
			WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(15));
			wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("li:nth-child(1) div:nth-child(1)")));
			driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/ul/li[1]/div")).click();
		}
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@id=\"__next\"]/div/main/div[1]/div/div[1]")));
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div[1]/div/div[1]")).click();
		
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@class='jsx-1905266029']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"form_0\"]/div[1]/div[2]/select/option[7]")));
	driver.findElement(By.xpath("//*[@id=\"form_0\"]/div[1]/div[2]/select/option[7]")).click();
	WebElement noit = driver.findElement(By.xpath("//*[@id=\"form_0\"]/div[2]/div/div[2]/input"));
	noit.click();
	noit.sendKeys("3");
	driver.findElement(By.xpath("//*[@id=\"form_0\"]/div[3]/button")).click();
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div[2]/button")).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"__next\"]/div/main/div[1]/div/div/div[2]/div/div/div/div[2]/button[29]/abbr")));
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div[1]/div/div/div[2]/div/div/div/div[2]/button[29]/abbr")).click();
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div[2]/button")).click();
	
	
	
	try {

		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"__next\"]/div/main/div[1]/form/div/input")));
        WebElement inputBox = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div[1]/form/div/input")); inputBox.click();
        inputBox.sendKeys("1234567899");

    } catch (Exception e) {
    	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"__next\"]/div/main/div[1]/form/div/input")));
        WebElement inputBox = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div[1]/form/div/input")); inputBox.click();
        inputBox.sendKeys("1234567899");
    }
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div[2]/button")).click();
	
	
		
		
		
		
		
		

	}
}
