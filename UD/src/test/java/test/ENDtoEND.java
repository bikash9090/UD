package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ENDtoEND {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		driver.findElement(By.xpath("//a[@value=\"BLR\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id=\"ctl00_mainContent_ddl_destinationStation1_CTNR\"]//a[@value=\"MAA\"]")).click();
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		int i = 0;
		for (i = 0; i < 5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.cssSelector("#btnclosepaxoption")).click();
		WebElement currency =driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select option = new Select(currency);
		option.selectByValue("AED");
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
		
		

	}

}
