package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamictable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vibhi\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();
		
		
		////*[@id="post-body-5867683659713562481"]/div/div[1]/table/tbody/tr[1]/th
		////*[@id="post-body-5867683659713562481"]/div/div[1]/table/tbody/tr[2]/th
		////*[@id="post-body-5867683659713562481"]/div/div[1]/table/tbody/tr[3]/th
		////*[@id="post-body-5867683659713562481"]/div/div[1]/table/tbody/tr[4]/th
		
		
		Thread.sleep(3000);
		
		String beforexpath = "//*[@id=\"post-body-5867683659713562481\"]/div/div[1]/table/tbody/tr[";
		 String afterxpath = "]/th";
		
		for (int i=1; i<=4; i++) {
		
		String actualxpath = beforexpath+i+afterxpath;
		WebElement element = driver.findElement(By.xpath(actualxpath));;
		System.out.println(element.getText());
		
		}
		driver.close();
		
	
	}
		
	}

