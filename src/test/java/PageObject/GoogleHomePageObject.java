package PageObject;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import StepDefinations.BaseClass;

public class GoogleHomePageObject extends BaseClass{
	
	public WebDriver ldriver;
	public Properties prop;
	public String url;
	
   Utility util_obj = new Utility();
   

	public GoogleHomePageObject(WebDriver rDriver) throws IOException
	{
		ldriver=rDriver;
		PageFactory.initElements(rDriver, this);
	
	}
		
	@FindBy(xpath="(//input[@value = 'Google Search' and @type='submit'] )[2]")
	WebElement textOnGoogleHomePage;
	
	@FindBy(xpath="//textarea[@title='Search']")
	WebElement searchTextBox;
	
	
	
	
	
	public void user_hit_google_url() throws IOException {
	  ChromeOptions co = new ChromeOptions();
	  co.setBrowserVersion("122");
	  ldriver.get(util_obj.configProperties("url"));
	  //ldriver.get("https://www.google.co.in/");
	  ldriver.manage().window().maximize();
	}
	
	public void google_home_page_is_open() {
		
		boolean isElementPresent = textOnGoogleHomePage.isDisplayed();
		Assert.assertEquals(isElementPresent, true);
	}
	
	public void user_verify_google_home_page_header() {
		String pageTitle = driver.getTitle();
		Assert.assertEquals(pageTitle, "Google");
	}
	
	public void user_enter_text_in_search_fields() {
		searchTextBox.sendKeys("india");
	}
	
	public void user_hit_submit_button() throws InterruptedException {
		textOnGoogleHomePage.click();
		Thread.sleep(2000);
	}
	public void user_close_the_browser() {
		   ldriver.close();
		}
	

}
