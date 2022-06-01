package IntegrationTest.stepdefinitions;

import IntegrationTest.navigation.pages.createPersonalInfoPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import static java.lang.Thread.sleep;

public class createPersonalInfoStepDefinition {

    @Steps
    createPersonalInfoPage info;

    public void waitfortheelement() {
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @When("User is able to click title as Mr")
    public void selectTitle() {
        info.clickOnMr();
    }

    @When("User is able to provide firstName as (.*)")
    public void user_is_able_to_provide_firstName_as(String firstName) {
        info.sendFirstName(firstName);
    }

    @When("User is able to provide lastName as (.*)")
    public void user_is_able_to_provide_lastName_as(String lastName) {
        info.sendLastName(lastName);
    }

    @When("User is able to provide passWord as (.*)")
    public void user_is_able_to_provide_passWord_as(String password) {
        info.sendPassword(password);
    }

    @When("User is able to provide city as (.*)")
    public void user_is_able_to_provide_city_as(String city) {
        info.sendCity(city);
    }

    @And("User is able to provide state as California")
    public void state() {
        info.selectState();
    }

    @And("User is able to provide zip code as (.*)")
    public void sendZip(String zip) {
        info.zipCode(zip);
    }

    @And("User is able to provide address as (.*)")
    public void sendAddress(String address) {
        info.address(address);
    }

    @And("User is able to provide mobile number as (.*)")
    public void sendMobile(String mob) {
        info.sendMobileNumber(mob);
    }

    @And("User is able to provide an alias address as (.*)")
    public void aliasAddress(String alias) {
        info.sendAlias(alias);
    }

    @And("User click on Register button")
    public void submit() {
        info.register();
    }

    @Then("Navigate to my-account page verify the correct (.*) and (.*) is displayed")
    public void verifyName(String firstName, String lastName) {
        info.verifyLogin(firstName, lastName);
    }

    @Given("user complete the purchase")
    public void completePurchase() {

    }

    @And("User is able to sign out")
    public void signOut() {
        info.clickOnSignOut();
    }

    @Then("User navigate to signIn page")
    public void mainPage() {

    }

}
