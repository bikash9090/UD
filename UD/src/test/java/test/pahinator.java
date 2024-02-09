package test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class pahinator {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//input[@id=\"search-field\"]")).sendKeys("Strawberry");
		List<WebElement> searched = driver.findElements(By.xpath("//tbody//tr//td[1]"));
	   List<WebElement> elemfound = searched.stream().filter(a->a.getText().contains("Strawberry")).collect(Collectors.toList());
	   //elefound has the found result
	   Assert.assertEquals(searched,elemfound);
	   
	   
	   
	   List<String> price = elemfound.stream().filter(a->a.getText().contains("Strawberry")).map(a->getprice(a)).collect(Collectors.toList());
	   price.forEach(s->System.out.println(s));
	}
	   private static String getprice(WebElement a) {
			String finalprice = a.findElement(By.xpath("following-sibling::td[1]")).getText();
			return finalprice;
	    }
	}


