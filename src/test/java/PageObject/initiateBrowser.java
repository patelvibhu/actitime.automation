package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class initiateBrowser {
	WebDriver driver;
	
	
  @BeforeTest
  public void setup() {
  
	System.setProperty("webdriver.chrome.driver","C:\\Users\\vibhi\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
	 driver=new ChromeDriver();
	driver.get("https://www.amazon.com");
	driver.manage().window().maximize();
	
  }
	
  @Test
  public void login() {
	 boolean logo = driver.findElement(By.id("nav-logo-sprites")).isDisplayed();
	  
	 System.out.println(logo);
	  
  }
  
  
  
  
@AfterTest
public void teardown() {
	driver.quit();
}
  
  
  
}
