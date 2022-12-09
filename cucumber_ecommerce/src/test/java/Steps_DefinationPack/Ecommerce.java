package Steps_DefinationPack;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import po.Add_City;

public class Ecommerce {

	public WebDriver driver;
	public Ecommerce(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
	    public Add_City obj;
	    
	    @Given("User Launch Chrome browser")
	    public void user_launch_chrome_browser() {
	    	WebDriverManager.chromedriver().setup();
	    	driver = new ChromeDriver();
	    	driver.manage().window().maximize();
	    	try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	obj = new Add_City(driver);
	    }
	
	

	@When("User opens URL {string}")
	public void user_opens_url(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.get(string);

	}

	@When("User enters Username as {string} and Password as {string}")
	public void user_enters_username_as_and_password_as(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		obj.enter_credentials(string, string2);
	    
	}

	@Then("User clicking on Login button")
	public void user_clicking_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    obj.click_login();
	}

	@Then("User clicking on Locations button")
	public void user_clicking_on_locations_button() {
	    // Write code here that turns the phrase above into concrete actions
		obj.click_location();
	}

	@Then("User clincking on City button")
	public void user_clincking_on_city_button() {
	    // Write code here that turns the phrase above into concrete actions
		obj.click_city();
	}

	@Then("User clicking on Add City button")
	public void user_clicking_on_add_city_button() {
	    // Write code here that turns the phrase above into concrete actions
		obj.click_add_city();
	}

	@Then("Enters City name as {string}")
	public void enters_city_name_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		obj.Enter_city(string);
	}


	@Then("User clicking on Add button")
	public void user_clicking_on_add_button() {
	    // Write code here that turns the phrase above into concrete actions
		obj.click_add_buttn();
	}


	@Then("User clicking on Logout button")
	public void user_clicking_on_logout_button() {
	    // Write code here that turns the phrase above into concrete actions
		obj.click_logout();
	}
}
