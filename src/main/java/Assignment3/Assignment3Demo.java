package Assignment3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3Demo {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
		
		   List<WebElement> links = driver.findElements(By.tagName("a"));

	       for (int i = 0; i < links.size(); i++) {
	            System.out.println(links.get(i).getText());
	          
	        }

		
		
	}

}
