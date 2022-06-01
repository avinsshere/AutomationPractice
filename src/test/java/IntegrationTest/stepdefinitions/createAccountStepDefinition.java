package IntegrationTest.stepdefinitions;

import IntegrationTest.navigation.pages.createAccountPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import static java.lang.Thread.sleep;


public class createAccountStepDefinition {

    @Steps
    createAccountPage account;

    @Given("Open chrome and start Application")
    public void openChromeAndStartApplication() throws InterruptedException {
        account.OpenApplication();
    }

    @When("User is able to click on sign in button and divert to sign in page")
    public void user_is_able_to_click_on_sign_in_button_and_divert_to_sign_in_page() {
        account.clickElement();
    }

    @When("User is able to provide email")
    public void user_is_able_to_provide_email() {
        account.sendEmail();
    }

    @When("Click on Create an Account button")
    public void clickCreateAccount() {
        account.clickCreate();
    }

    @Then("Navigate to Create an Account Page")
    public void navigate_to_Create_an_Account_Page() {
        account.verifyPage();
    }

    @Given("User is on Create an Account Page")
    public void userIsOnCreateAnAccountPage() {
    }
}
