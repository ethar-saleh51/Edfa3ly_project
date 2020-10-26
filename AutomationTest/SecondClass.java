package first.Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondClass {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:/Users/DELL/Desktop/Testing/chromedriver/chromedriver.exe"); 
		WebDriver driver = new ChromeDriver() ;
		driver.get("https://www.edfa3ly.com/cart");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement textbox = driver.findElement(By.xpath("//input[@name='url']"));
		textbox.sendKeys("https://www.goat.com/sneakers/shane-sb-premium-light-orewood-brown-cv5500-200");
		
	}

}
