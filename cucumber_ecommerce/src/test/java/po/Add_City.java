package po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_City {
	public WebDriver driver;
	public Add_City(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//input[@id=\"useremail\"]")
	@CacheLookup
	WebElement login_username;
	
	@FindBy(xpath="//input[@id=\"password\"]")
	@CacheLookup
	WebElement login_password;
	
	@FindBy(xpath="//button[@class=\"btn btn-primary btn-flat m-b-30 m-t-30\"]")
	@CacheLookup
	WebElement login_btn;
	
	@FindBy(xpath="(//a[@class=\"sidebar-sub-toggle\"])[1]")
	@CacheLookup
	WebElement location_btn;
	
	@FindBy(xpath="(//a[@href=\"https://products.pisystindia.com/Ecommerce/admin/city\"])[1]")
	@CacheLookup
	WebElement city_mainpage;
	
	@FindBy(xpath="//div[@class=\"pull-right\"]//a")
	@CacheLookup
	WebElement add_city_btn;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	@CacheLookup
	WebElement add_btn;
	
	@FindBy(xpath="//input[@id=\"city\"]")
	@CacheLookup
	WebElement city_textbox;
	
	@FindBy(xpath="//li[@class=\"header-icon dib active\"]//span")
	@CacheLookup
	WebElement Main_Admin;
	
	@FindBy(xpath="//i[@class=\"ti-power-off\"]")
	@CacheLookup
	WebElement logout_btn;
	
	public void enter_credentials(String username , String password) {
		try {
			Thread.sleep(2000);
			login_username.sendKeys(username);
			Thread.sleep(2000);
			login_password.sendKeys(password);
			Thread.sleep(2000);
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void click_login() {
		try {
			Thread.sleep(2000);
			login_btn.click();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

	public void click_logout() {
		try {
			Thread.sleep(2000);
			Main_Admin.click();
			Thread.sleep(2000);
			logout_btn.click();
			Thread.sleep(2000);

		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void click_location() {
		try {
			Thread.sleep(2000);
			location_btn.click();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public void click_city() {
		try {
			Thread.sleep(2000);
			city_mainpage.click();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	
	}
	
	public void click_add_city() {
		try {
			Thread.sleep(2000);
			add_city_btn.click();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public void Enter_city(String text) {
		try {
			Thread.sleep(2000);
			city_textbox.sendKeys(text);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	} 
	
	public void click_add_buttn() {
		try {
			Thread.sleep(2000);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

	
	
}
