package Assignment4;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Registration {
	public static void main(String[] args) throws AWTException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Elbert");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Diaz");
		driver.findElement(By.xpath("//textarea")).sendKeys("Quezon City");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("elbertdiaz08@gmail.com");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("12345678910");
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		driver.findElement(By.xpath(" //input[@id='checkbox2']")).click();
		driver.findElement(By.xpath("//div[@id='msdd']")).click();
		driver.findElement(By.xpath("//a[norma"+"lize-space()='Filipino']")).click();
		
		
		WebElement skill = driver.findElement(By.xpath("//select[@id='Skills']"));
		Select Selectdrp = new Select(skill);
		Selectdrp.selectByValue("Java");

		WebElement country = driver.findElement(By.xpath("//select[@id='countries']"));
		Select Selectdrp2 = new Select(country);
		Selectdrp2.selectByIndex(0);

		WebElement country2 = driver.findElement(By.xpath("//span[@role='combobox']"));
		country2.click();
		country2.sendKeys(Keys.chord(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER));

		WebElement year = driver.findElement(By.xpath("//select[@id='yearbox']"));
		Select Selectyr = new Select(year);
		Selectyr.selectByValue("1999");

		WebElement month = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select Selectmonth = new Select(month);
		Selectmonth.selectByValue("March");

		WebElement day = driver.findElement(By.xpath("//select[@id='daybox']"));
		Select Selectday = new Select(day);
		Selectday.selectByValue("26");

		driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("admin123");


		
		 WebElement button = driver.findElement(By.xpath("//input[@id='imagesrc']"));
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].click()", button);



	       Robot rb = new Robot();
	        rb.delay(2000);



	       StringSelection ss = new StringSelection("C:\\Users\\sdimayug\\OneDrive - Capgemini\\Desktop\\Selenium\\SeleniumTest.txt");
	        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);


	       // CTRL+V
	        rb.keyPress(KeyEvent.VK_CONTROL);
	        rb.keyPress(KeyEvent.VK_V);
	        rb.delay(2000);



	       rb.keyRelease(KeyEvent.VK_CONTROL);
	        rb.keyRelease(KeyEvent.VK_V);
	        rb.delay(2000);



	       // ENTER
	        rb.keyPress(KeyEvent.VK_ENTER);
	        rb.keyRelease(KeyEvent.VK_ENTER);

			driver.findElement(By.xpath("//button[@id='submitbtn']")).click();
	}
}
