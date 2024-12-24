package pages;

import org.junit.jupiter.api.Assertions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;

public class Homepage extends PageObject {
	
	@Step("this step will verify the home page")
	public void verifyHomePage() {
		String current_url = getDriver().getCurrentUrl();
		Assertions.assertTrue(current_url.contains("Register"));
	}

}
