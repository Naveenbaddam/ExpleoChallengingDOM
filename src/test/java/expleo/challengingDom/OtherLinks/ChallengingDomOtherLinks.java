package expleo.challengingDom.OtherLinks;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import expleo.challengingDom.BaseTest.BaseTestCase;
import expleo.challengingDom_Screenshot.Screenshot;


public class ChallengingDomOtherLinks extends BaseTestCase

{
	@Test()
	
	// Verifying "Pork me on GitHub" link 
		
	public void verify_GitHubLink() throws IOException
	{
		WebElement gitHubLink = driver.findElement(By.xpath("//img[contains(@style,'position')]"));
		
		gitHubLink.click();
		
		log.info("Clicked on Pork me GitHub Link");
		
		Screenshot scrShot = new Screenshot(driver, "C://Users//badda//ExpleoChallengingDom//Screenshots//github.png");
		
		log.info("Screenshot of new Page after clicking Pork me on GitHub is taken");
		
		String actualUrl=driver.getCurrentUrl();
		
		
		String expectedUrl  = "https://github.com/saucelabs/the-internet";
		
		Assert.assertEquals(actualUrl, expectedUrl, "Pork me GitHub link is failed to click");
		
		driver.navigate().back();
		
		System.out.println("Pork me GitHub link is working as expected");
		
		log.info("verfy_githublink - testcase is passed");
	}
	
	@Test()
	
	// Verifying Canvas Presence
	
	public void verify_Canvas() throws IOException
	
	{
		WebElement canvs = driver.findElement(By.xpath("//canvas[@id='canvas']"));
		
		boolean b = canvs.isDisplayed();
		
		System.out.println(b +" - Canvas is presented on the page");
		
		Screenshot scrShot = new Screenshot(driver, "C://Users//badda//ExpleoChallengingDom//Screenshots//Canvas.png");
		
	    log.info("Screen shot of canvas on the page taken");
		
	    log.info("verify canvas - testcase is passed");
		
	}

}
