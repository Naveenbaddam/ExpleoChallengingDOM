package expleo.challengingDom.Tests;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import expleo.challengingDom.BaseTest.BaseTestCase;
import expleo.challengingDom.pages.ChallengingDomPage;

public class ChallengingDomTests extends BaseTestCase

{
	
        @Test()
	    public void test_table_headers() 
	     {
		    ChallengingDomPage page = PageFactory.initElements(driver, ChallengingDomPage.class);
		    
	        List<String> expectedList = Arrays.asList("Lorem", "Ipsum", "Dolor", "Sit", "Amet", "Diceret", "Action");
	        
	        Assert.assertEquals(page.getHeadersAsString(), expectedList.toArray());
	        
	        log.info("Table contains (Lorem,Ipsum,Dolor,Sit,Amet,Diceret,Action) as headers");
	        
	        log.info("test_table_header - testcase is passed");
	    }

	    @Test()
	    public void test_table_size_should_be_10() 
	    {
	    	ChallengingDomPage page = PageFactory.initElements(driver, ChallengingDomPage.class);
	    	
	    	int size_ofTable = page.getSize();
	        
	        Assert.assertEquals(size_ofTable, 10);
	    	
	        log.info("Table size is exactly Ten");
	        
	        log.info("verify table size - testcase is passed");
	    }
	
        @Test()
	    public void test_edit_presents_at_all_table_rows() 
        {
        	List<WebElement> edit_elements = driver.findElements(By.xpath("//a[text()='edit']"));
        	
        	System.out.println(edit_elements);
        		
        		for(WebElement edit_element : edit_elements)
            	{
        			
        			String edit = edit_element.getText();
        			
	                Assert.assertEquals(edit, "edit");
	                
	                log.info("edit is presented on Table ");
	                
	                log.info("verify edit - testcase is passed");
            	}
         }
        
        @Test()
	    public void test_delete_presents_at_all_table_rows() 
        {
        	List<WebElement> delete_elements = driver.findElements(By.xpath("//a[text()='delete']"));
        	
        	System.out.println(delete_elements);
        		
        		for(WebElement delete_element : delete_elements)
            	{
        			String delete = delete_element.getText();
        			
	                Assert.assertEquals(delete, "delete");
	                
	                log.info("delete is presented on Table ");
	                
	                log.info("verify delete - testcase is passed");
            	}

}
}
