package expleo.challengingDom.footer;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import expleo.challengingDom.BaseTest.BaseTestCase;
import expleo.challengingDom.pages.ChallengingDomPage;



public class ChallengingDomFooterTest extends BaseTestCase

{
	ChallengingDomPage page = PageFactory.initElements(driver, ChallengingDomPage.class);
	
	@Test(priority = 1)
    public void test_footer_text()
	{
		ChallengingDomPage page = PageFactory.initElements(driver, ChallengingDomPage.class);
		
		String footer_text =page.getFooter();
        
        Assert.assertEquals(footer_text, "Powered by Elemental Selenium");
        
        log.info("Footer text is " + footer_text);
        log.info("test_footer_text - testcase is passed");
    }


    @Test(priority = 2)
    public void test_footer_link() 
    {
    	ChallengingDomPage page = PageFactory.initElements(driver, ChallengingDomPage.class);
    	
    	String footer_link = page.getFooterlink();
        
        Assert.assertEquals(footer_link, "http://elementalselenium.com/");
        
       log.info("footer link is "+ footer_link);
       log.info("test_footer_link - testcase is passed");
       
    }

}
