package starter.stepdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import pages.Homepage;
import pages.Loginpage;

public class loginToApplication {
	
	@Managed
	WebDriver driver;
	
	@Steps
	Homepage home;
	
	@Steps
	Loginpage login;
	
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    login.open();
	}

	@When("user enter admin as username")
	public void user_enter_admin_as_username() {
	   login.VerifyTitle();
		login.EnterCredentials();
	   
	}

	@When("click on arrow buttton")
	public void click_on_arrow_buttton() {
	    login.clickOnArrow();
	}

	@Then("user should be able to login")
	public void user_should_be_able_to_login() {
	    home.verifyHomePage();
	}




}
