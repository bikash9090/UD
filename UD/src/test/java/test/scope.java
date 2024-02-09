package test;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scope {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		// count the number of pages  //a-isthe tag for link
    int tags = driver.findElements(By.tagName("a")).size();
    System.out.println(tags);
    
    //print number of links in footer only.
    
    WebElement footer = driver.findElement(By.id("gf-BIG"));
    System.out.println(footer.findElements(By.tagName("a")).size());
    WebElement fottercol = footer.findElement(By.xpath("//td/ul[1]"));
    int linkss = fottercol.findElements(By.tagName("a")).size();
    System.out.println(linkss);
    
    //click on each link of the column
    for(int i = 1;i<fottercol.findElements(By.tagName("a")).size();i++) {
    	
    	String differenttab = Keys.chord(Keys.CONTROL,Keys.ENTER);
    fottercol.findElements(By.tagName("a")).get(i).sendKeys(differenttab);
    }
    Set<String> openwindow = driver.getWindowHandles();
                 Iterator<String> opened = openwindow.iterator();
                 while(opened.hasNext()) {
                	 driver.switchTo().window(opened.next());
                	 System.out.println(driver.getTitle());
                	 
                 }
                 
    
    
    }
    
    
    
        
    
    
    
    
	}
    		
	

