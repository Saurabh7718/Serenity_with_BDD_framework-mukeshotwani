package pages;

import org.junit.jupiter.api.Assertions;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class Loginpage extends PageObject {

	@FindBy(xpath = "//input[@id='email']")
	WebElementFacade email;

	@FindBy(xpath = "//img[@id='enterimg']")
	WebElementFacade enter;

	
	 
	
	@Step("this step will verify title")
	public void VerifyTitle() {
		String title = getDriver().getTitle();
		Assertions.assertTrue(title.contains("Index"));
	}

	@Step("this step will allow us to login application")
	public void EnterCredentials() {
		email.type("selenium");
		
	}
	
	@Step
	public void clickOnArrow() {
		enter.click();
	}

	

}
