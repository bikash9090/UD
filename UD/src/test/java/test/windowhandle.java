package test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowhandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.xpath("//a[@target=\"_blank\"]")).click();
		
		// the new window is opened byt the driver control is on the parent window only so we need to go to the opened or desired window
		Set <String> openwindows =driver.getWindowHandles(); //gets all the opened window
		Iterator<String> it =openwindows.iterator();          //to iterate on all the open windows
		String Parentwin = it.next();                          //index starts from 0   
		String childwin= it.next();                              // 0 to next  i.e 1 window
		
		driver.switchTo().window(childwin);                       //switched to the chid window
		
	 //String email = driver.findElement(By.linkText("mentor@rahulshettyacademy.com")).getText();
	 //System.out.println(email);
		
		//or it can be aslo done
		
		String got = driver.findElement(By.xpath("//p[@class=\"im-para red\"]")).getText();
		String[] splitname = got.split("at");
		
		String email = splitname[1].trim().split(" ")[0];
		
	 driver.switchTo().window(Parentwin);
	 driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys(email);
	 driver.findElement(By.id("password")).sendKeys("learning");
	 driver.findElement(By.xpath("//input[@id='signInBtn']")).click();
	
		
		

	}

}
