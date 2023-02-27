package Assignment1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1Demo {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://bing.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[normalize-space()='Images']\r\n" + "")).click();

		List<WebElement> checksize = driver.findElements(By.xpath("//a[normalize-space()='Images']\r\n" + ""));
		System.out.println("number of : " + checksize.size());

		Thread.sleep(3000);

		driver.close();

	}
}
