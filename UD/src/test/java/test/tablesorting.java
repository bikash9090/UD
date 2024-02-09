package test;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tablesorting {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//tr//th[1]")).click();
		List<WebElement> name = driver.findElements(By.xpath("//tbody//tr//td[1]"));   //list of webelements
	    List<String> originlist = name.stream().map(a->a.getText()).collect(Collectors.toList());
	    List<String> sortedlst = originlist.stream().sorted().collect(Collectors.toList());
	    Assert.assertTrue(originlist.equals(sortedlst));
	    
	    List<String> price;
	    
	    do {
	    List<WebElement> nextpage = driver.findElements(By.xpath("//tbody//tr//td[1]"));   //again list of webelements in the next page
	    price = nextpage.stream().filter(s->s.getText().contains("Rice")).map(s->getprice(s)).collect(Collectors.toList());     ////operation on webelement 
	    price.forEach(a->System.out.println(a));
	    System.out.println(price);
	    if(price.size()<=0) // if the price size is <0 it means the elemnt is not found on the page hence click on the paginator for next page
	    {
	    	driver.findElement(By.xpath("//a[@aria-label=\"Next\"]")).click();
	    	
	    }
	    }while (price.size()<=0);
	    	}
	    
	    
	 

	private static String getprice(WebElement s) {
		String finalprice = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return finalprice;

	}

}
