package Assignment2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2Demo {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();

		WebElement search = driver.findElement(By.xpath("//input[@id='sb_form_q']"));

		search.sendKeys("capgemini india");
		search.submit();

		List<WebElement> address = driver
				.findElements(By.xpath("//a[contains(text(),'Sohna Road, Near Universal Trade Tower, Sispal Vih')]"));

		for (WebElement ele : address) {
			System.out.println(ele.getText());
		}

	}
}
