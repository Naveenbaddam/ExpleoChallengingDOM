package CrossBroserTesting;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.log4j.Logger;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import expleo.challengingDom.pages.ChallengingDomPage;

public class ChallengingDOMCrossBrowser 

{
	Logger logs = Logger.getLogger(ChallengingDOMCrossBrowser.class);
	   DesiredCapabilities cap=null;
	   @Parameters("browser")
	   
	   @Test
	   public void Gd(String Br) throws MalformedURLException, InterruptedException
	   {
		   
		   if (Br.equalsIgnoreCase("firefox"))
		   {
			   
			   cap=new DesiredCapabilities();
			   cap.setBrowserName("firefox");
			   cap.setPlatform(Platform.WINDOWS);
			    	
	    	}
		   
		   else if (Br.equalsIgnoreCase("chrome"))
		   {
			   cap=new DesiredCapabilities();
			   cap.setBrowserName("chrome");
			   cap.setPlatform(Platform.WINDOWS);
			   
		}
		   
		   RemoteWebDriver driver=new RemoteWebDriver(new URL("http://192.168.1.11:4444/wd/hub"),cap);
		   
		   logs.info("Application launched on Remotly");
		   
		   driver.manage().window().maximize();
		   
		   driver.get("http://the-internet.herokuapp.com/challenging_dom");
		   
		   ChallengingDomPage page = PageFactory.initElements(driver, ChallengingDomPage.class);
		   
		   page.getHeader();
		   
		   logs.info("header of the page is challenging DOM");
		   
		   page.getContent();
		   
		   logs.info("content of the page is presented on the page");
		   
		   String footer = page.getFooter();
		   
		   logs.info("footer - powered by elemental selenium - presented on the page");
		   
		   System.out.println(footer);
		   
		   driver.close();
		   
		   logs.info("Application is closed");
	   
	   }
	}


