package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static WebDriver driver;
	public void initialisation(String url) {
		
		
		System.setProperty("Webdriver.chrome.driver", "./Driver/chromedriver.exe");

		driver=new ChromeDriver();

		driver.get(url);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
	}
	
	
	
	
}
