package jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AddMethods {
	static WebDriver driver;	
	
	@BeforeTest
	public void Launch()
			{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\git\\Jenkins\\WorkonJenkins\\drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
			}
	
	@Test
	public void Opensite(){
		
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		
		System.out.println("opened");
		System.out.println(driver.getTitle());
	
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
	}

}
