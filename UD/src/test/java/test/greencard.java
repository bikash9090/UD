package test;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class greencard {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		String[] myitems = {"Brinjal" ,"Carrot"};
		//convert the array to array list to use easy methods 
		
		List myitem = Arrays.asList(myitems);
		
		
		List<WebElement> products = driver.findElements(By.xpath("//h4[@class=\"product-name\"]"));
		for (int i = 0;i<products.size();i++)
		{
			String name = products.get(i).getText();
			System.out.println(name);
			//if(name.contains("Brinjal"))
			if(myitem.contains(name));	
			{
				List<WebElement> found = driver.findElements(By.xpath("//button[text()='ADD TO CART']"));
				found.get(i).click();
			
				
				
				
			}
			
		}
	}

}
