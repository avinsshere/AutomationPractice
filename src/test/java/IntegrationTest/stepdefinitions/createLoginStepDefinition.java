package IntegrationTest.stepdefinitions;

import IntegrationTest.navigation.pages.loginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import net.thucydides.core.annotations.Steps;


import static java.lang.Thread.sleep;


public class createLoginStepDefinition {

    @Steps
    loginPage loginPage;

    public void waitfortheelement() {
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("User is able to click on sign in button")
    public void SignIn()
    {
        loginPage.clickSignIn();
    }

    @And("User is able to login as registered details as (.*) (.*)")
    public void userIsAbleToLoginAsRegisteredDetailsAsEmailPass(String email, String password) {
        loginPage.login(email, password);
    }

    @Then("User verify the (.*)")
    public void userVerifyTheErrorMsg(String errorMsg) {
        loginPage.verifyErrorMessage(errorMsg);

    }
}
