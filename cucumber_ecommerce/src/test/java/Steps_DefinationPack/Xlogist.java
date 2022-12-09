package Steps_DefinationPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import po.Add_Country;

public class Xlogist {
	
	public WebDriver driver;
	public Xlogist(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
	
	public Add_Country obj;
    
    @Given("User Launches Chrome browser")
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
    	obj = new Add_Country(driver);
    }
    
    @When("User open an URL {string}")
	public void user_opens_url(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.get(string);

	}

	@When("User enter Username as {string} and Password as {string}")
	public void user_enters_username_as_and_password_as(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		obj.enter_credentials(string, string2);
	    
	}

	@Then("User clicks on Login button")
	public void user_clicking_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    obj.click_login();
	}

	@Then("User clicks on Locations button")
	public void user_clicking_on_locations_button() {
	    // Write code here that turns the phrase above into concrete actions
		obj.click_location();
	}

	@Then("User clicks on Country button")
	public void user_clincking_on_city_button() {
	    // Write code here that turns the phrase above into concrete actions
		obj.click_country();
	}

	@Then("User clicks on Add Country button")
	public void user_clicking_on_add_city_button() {
	    // Write code here that turns the phrase above into concrete actions
		obj.click_add_country();
	}

	@Then("Enter Country name as {string}")
	public void enters_city_name_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		obj.Enter_country(string);
	}


	@Then("User clicks on Add button")
	public void user_clicking_on_add_button() {
	    // Write code here that turns the phrase above into concrete actions
		obj.click_add_buttn();
	}


	@Then("User clicks on Logout button")
	public void user_clicking_on_logout_button() {
	    // Write code here that turns the phrase above into concrete actions
		obj.click_logout();
	}
	
}
