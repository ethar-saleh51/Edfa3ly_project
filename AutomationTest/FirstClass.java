package first.Class;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstClass {
 @Test 
	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver","C:/Users/DELL/Desktop/Testing/chromedriver/chromedriver.exe"); 
		WebDriver driver = new ChromeDriver() ;
		driver.get("https://www.edfa3ly.com/cart");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement textbox = driver.findElement(By.xpath("//input[@name='url']"));
		textbox.sendKeys("https://www.6pm.com/p/product/9409514");
		
		//driver.findElement(By.xpath("/html/body/div[7]/div[1]/div[1]/div[2]/div/div[2]/form/div[1]/div/div[1]/div/div[2]/div[2]/div[2]/input")).sendKeys("https://www.6pm.com/p/product/9409514");
		//String text = driver.findElement(By.xpath(" //*[@id=\"cart-basic-box\"]/div[3]/div[5]/div[2]/div/select")).getText();
		
		Thread.sleep(3000);
	WebElement element = driver.findElement(By.xpath("//select[@name='color']")); 
	Select sel = new Select (element); 
      sel.selectByVisibleText("Black Iris");
      
      Thread.sleep(3000); 
      WebElement element1 = driver.findElement(By.xpath("//select[@name='size']")); 
  	Select sel1 = new Select (element1); 
        sel1.selectByVisibleText("8");
        
        Thread.sleep(3000);
        
        WebElement element2  =driver.findElement(By.xpath("/html/body/div[7]/div[1]/div[1]/div[2]/div/div[2]/form/div[2]/div/span[1]/span[1]")) ; 
        element2.click();
        
        Thread.sleep(3000); 
        WebElement textbox1 = driver.findElement(By.id("domesticShippingAndTaxes")); 
		textbox1.sendKeys("20");
		
        
       
    	WebElement element4 = driver.findElement(By.xpath("/html/body/div[7]/div[1]/div[1]/div[2]/div/div[2]/form/div[1]/div/div[2]/div/div[2]/div/select")); 
    	Select sel2 = new Select (element4); 
          sel2.selectByVisibleText("Cancel the whole Order");
          
          
        
        
        

       WebElement textbox11=driver.findElement(By.xpath("//input[@value='Add item']"));
        textbox11.click();
        
        Thread.sleep(3000);
        WebElement textbox2= driver.findElement(By.xpath("//a[@type='text']"));
        textbox2.click(); 
        
       
       
	
 
		}

	}


