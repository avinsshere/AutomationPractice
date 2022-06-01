package IntegrationTest.stepdefinitions;


import IntegrationTest.navigation.pages.createOrderPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import static java.lang.Thread.sleep;


public class createOrderStepDefinition {

    @Steps
    createOrderPage order;

    public void waitfortheelement() {
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Given("user is able to click on Dresses and search for another dress")
    public void click() {
        order.clickOnDress();
    }

    @When("user is able to click on another dress (.*)")
    public void clickOnPrintedDress(String productName) {
        order.clickOnPrintedDress(productName);
    }

    @And("User is able to select quantity as (.*) and size as (.*)")
    public void selectAs(String quantity, String size) {
        order.selectSpecified(quantity, size);
    }

    @And("user is able to click on Add to cart")
    public void clickAdd() {
        order.clickAdd();
    }

    @And("User is able to click on proceed to checkout")
    public void checkOut() {
        order.clickOnCheckOut();
    }

    @Then("Verify that product details is correct as (.*) (.*)")
    public void verifyOrder(String productName, String quantity) {
        order.verifyOrderDetails(productName, quantity);
    }

    @Then("User is on main page")
    public void clickHome() {
        order.clickOnHome();
    }

    @Then("User is on my account page")
    public void myAccount() {
    }

    @And("User choose payment option as pay by bank wire")
    public void userChoosePaymentOptionAsPayByBankWire() {
        order.chosePayment();
    }

    @Then("User confirm the order")
    public void userConfirmTheOrder() {
        order.confirmOrder();
    }
}
