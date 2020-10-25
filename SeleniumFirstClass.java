package selenuim.First.Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFirstClass {
	
	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chorome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32.exe");
		WebDriver driver= new ChromeDriver(); 
		driver.get("https://www.edfa3ly.com/cart");
		driver.findElement(By.xpath("//*[@id=\"cart-basic-box\"]/div[2]/div[2]/div[2]/input/]")).clear();
		driver.findElement(By.xpath("//*[@id=\"cart-basic-box\"]/div[2]/div[2]/div[2]/input/]")).sendKeys("https://www.6pm.com/p/product/9409514");
		String text = driver.findElement(By.xpath(" //*[@id=\"cart-basic-box\"]/div[3]/div[5]/div[2]/div/select")).getText();
		
		if (text.contains("Black Iris")) {
			driver.findElement(By.xpath(" //*[@id=\"cart-basic-box\"]/div[3]/div[5]/div[2]/div/select")).click();
			
		}else
		{
			System.out.println("this is not black Iris color");
		}

		
		driver.close();
	
				
		
	}
	

}


