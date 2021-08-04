package expleo.challengingDom.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ChallengingDomPage

{
	 @FindBy(xpath = "//h3")
	    WebElement header;
	 
	 @FindBy(xpath = "//p")
	    WebElement content;
	 
	 @FindBy(id = "page-footer")
	    WebElement footer;
	 
	 @FindBy(xpath = "//*[@id='page-footer']//a")
	    WebElement footerLink;
	 
	 @FindBy(xpath = "//div[@class='large-2 columns']//a")
	    List<WebElement> buttons;
	 
	 @FindBy(xpath = "//thead")
	    WebElement headers;

	 @FindBy(xpath = "//tbody//tr")
	 List<WebElement> rows;
	 
	 @FindBy(xpath="//a[@class='button']")
	 WebElement button1;

	 @FindBy(xpath="//a[@class='button alert']")
	 WebElement button2;

	 @FindBy(xpath="//a[@class='button success']")
	 WebElement button3;

	 @FindBy(xpath=".//a[1]")
	 WebElement edit;

	 @FindBy(xpath=".//a[2]")
	 WebElement delete;
	 
	 
	 
	 public void getHeader() 
	 {
		 header.getText();
     }
	 
	 public void getContent()
	 {
		 content.getText();
     }

	 public void click_on_table1()
	 {
	 	button1.click();
	 }
	 public void click_on_table2()
	 {
	 	button2.click();
	 }

	 public void click_on_table3()
	 {
	 	button3.click();
	 }

	 public void click_on_edit()
	 {
	 	edit.click();
	 }

	 public void click_on_delete()
	 {
	 	delete.click();
	 }
	 
	 public String getFooter()
	 {
		 return footer.getText();
		 
     }
	 
	 public String getFooterlink()
	 {
		 return footerLink.getAttribute("href");
	 }
	 
	 public List<WebElement> getButtons()
	 {
	        return buttons;
	 }
	 public int getSize() 
	 {
            return rows.size();
	 }	 
	 
	 public String[] getHeadersAsString()
	 {
	        
	        return headers.getText().split(" ");
	 }
	 
	 public String getEditText() 
	 
	 {
		 return edit.getText();
	 }
	     
	 public String getDeleteText() 
	 {
		 return delete.getText();
	 }
	 
	 
}