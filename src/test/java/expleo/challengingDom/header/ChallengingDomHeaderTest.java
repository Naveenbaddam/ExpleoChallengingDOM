package expleo.challengingDom.header;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import expleo.challengingDom.BaseTest.BaseTestCase;

public class ChallengingDomHeaderTest extends BaseTestCase
{
	
    @Test()
	
	// Verifying the application Page title
	
	public void verify_Pagetitle()
	{
		String pageTitle = driver.getTitle();
		
		System.out.println("The Title of the page is - " +pageTitle);
		
		Assert.assertEquals(pageTitle, "The Internet", "PageTitle doesn't matched");
	}
	
	@Test()
	
	// Verifying 'Challenging DOM' presence
	
	public void verify_ChallengingDOM()
	{
		String expected = "Challenging DOM";
		
		String actual = driver.findElement(By.xpath("//*[text()='Challenging DOM']")).getText();
		
		Assert.assertEquals(actual, expected);
		
		System.out.println("Challenging DOM is presented on the page");
		
		log.info("verify_ChallengingDOM - testcase is passed");
	}
	
	@Test
	
	// Verifying page description
	
	public void verify_pageDescription()
	{
		String expected = "The hardest part in automated web testing is finding the best locators";
		
		String actual = driver.findElement(By.xpath("//*[@id=\"content\"]/div/p")).getText();
		
		System.out.println(actual);
		
		Assert.assertTrue(actual.contains(expected),"Page description is not presented on the page");
		
		System.out.println("Page Description is presented in the page");
		
		log.info("verify_pageDescriprtion - testcase is passed");
		
	}


}
