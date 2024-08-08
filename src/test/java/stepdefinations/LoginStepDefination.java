package stepdefinations;

import com.qa.factory.DriverFactory;
import com.qa.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefination {

	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	private String actTitle;

	@Given("User is on Login Page")
	public void user_is_on_login_page() {
		DriverFactory.getDriver().get("https://phptravels.net/login");

	}

	@When("User gets the page title")
	public void user_gets_the_page() {
		actTitle = loginPage.getLoginPageTitle();
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String title) throws InterruptedException {
		actTitle = loginPage.getLoginPageTitle();
		Assert.assertEquals(title, actTitle);
		Thread.sleep(5000);
	}

	@When("User enter username {string} in username field")
	public void user_enter_username_in_username_field(String userName) {
		loginPage.enterUsername(userName);
	}

	@When("User enter password {string} in password field")
	public void user_enter_password_in_password_field(String password) {
		loginPage.enterPassword(password);
	}

	@When("User clicks on Login button")
	public void user_clicks_on_login_button() {
		loginPage.clickOnLoginButton();
	}

	@Then("User gets the title of the homepage")
	public void user_gets_the_title_of_the_homepage() {

	}

}
