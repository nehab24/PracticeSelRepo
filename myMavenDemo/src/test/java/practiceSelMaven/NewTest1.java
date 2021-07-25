package practiceSelMaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class NewTest1 {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\harsh\\OneDrive\\Desktop\\Krishna Training\\chromedriver.exe");
		//Launch the browser
		    WebDriver driver = new ChromeDriver();
		    
		    driver.manage().window().maximize();
		    
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		    
	          driver.get("https://www.ebay.com/");
	          
	          Actions act  = new Actions(driver);
	          
	          WebElement motors = driver.findElement(By.xpath("//*[@id='mainContent']/div[1]/ul/li[3]/a"));
	         act.moveToElement(motors).build().perform();
	
  }
}
