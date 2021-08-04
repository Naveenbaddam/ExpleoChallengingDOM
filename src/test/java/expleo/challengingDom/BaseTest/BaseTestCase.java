package expleo.challengingDom.BaseTest;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import expleo.challengingDom.pages.ChallengingDomPage;

public class BaseTestCase

{
public static WebDriver driver;

public Logger log = Logger.getLogger(BaseTestCase.class);
	
	@BeforeSuite	
    // Setup method
	
	public void Launch_App()
	{
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		log.info("Firefox browser launched");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("https://the-internet.herokuapp.com/challenging_dom");
		
		log.info("ChallengingDom application launched successfully");
		
	}
			
		
	@AfterSuite
	
	// Tear down method
	
	public void Close_App()
	{
		log.info("Application closed successfully");
		
		driver.quit();
		
		
		
	}

}



