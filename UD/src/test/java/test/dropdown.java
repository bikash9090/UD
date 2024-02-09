package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement dropdownlist = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
			
		// static dropdown

		Select dropdown = new Select(dropdownlist);
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());

		// passenger select dropdown

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		int i = 0;
		for (i = 0; i < 5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.cssSelector("#btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		;

		// dynamic dropdown

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value=\"BLR\"]")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		// driver.findElement(By.xpath("(//a[@value=\"MAA\"])[2]")).click(); //[2] index
		// of the element since the xpath have 2 elements
		driver.findElement(By.xpath("//div[@id=\"ctl00_mainContent_ddl_destinationStation1_CTNR\"]//a[@value=\"MAA\"]"))
				.click();// using parent child xpath

		// autosuggestive dropdown
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(2000);
		List<WebElement> suggestions = driver
				.findElements(By.xpath("//ul[@id=\"ui-id-1\"]//li[@class=\"ui-menu-item\"]"));
		System.out.println(suggestions);
		for (WebElement suggestion : suggestions) {
			if (suggestion.getText().equalsIgnoreCase("Indonesia")) {
				suggestion.click();
				break;
			}
			// handling checkbox
			driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
			System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
			// count the number of checkbox
			int checkbox = driver.findElements(By.cssSelector("input[type='checkbox']")).size();
			Assert.assertEquals(checkbox, 6);
			System.out.println(checkbox + "checkbox found");

		}
		

	}
}
