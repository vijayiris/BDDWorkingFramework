package StepDefinations;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.GoogleHomePageObject;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepDefinations extends BaseClass{
	
	

	@Before
	public void setup() throws IOException {
		
		driver  = new ChromeDriver();
		googleHome_Obj = new GoogleHomePageObject(driver);

		
	}
	
	
	@Given("User Hit Google Url")
	public void user_hit_google_url() throws IOException {
		googleHome_Obj.user_hit_google_url();
	}
	@Then("Google HomePage is Open")
	public void google_home_page_is_open() {
		googleHome_Obj.google_home_page_is_open();
	}
	@Then("User Verify Google  Home Page Header")
	public void user_verify_google_home_page_header() {
		googleHome_Obj.user_verify_google_home_page_header(); 
	}

	@Then("User Close the browser")
	public void user_close_the_browser() {
		googleHome_Obj.user_close_the_browser();
	}
	
	@Then("User Enter Text in Search fields")
	public void user_enter_text_in_search_fields() {
		googleHome_Obj.user_enter_text_in_search_fields();
	}
	@Then("User hit submit button")
	public void user_hit_submit_button() throws InterruptedException {
		googleHome_Obj.user_hit_submit_button();
	}
}
