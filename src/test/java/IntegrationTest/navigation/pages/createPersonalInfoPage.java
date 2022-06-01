package IntegrationTest.navigation.pages;

import IntegrationTest.navigation.elements.createPersonalInfoElements;
import net.serenitybdd.core.pages.PageObject;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.util.logging.Logger;

import static java.lang.Thread.sleep;
import static org.assertj.core.api.Assertions.assertThat;

public class createPersonalInfoPage extends PageObject {
    createPersonalInfoElements infoElement;
    Robot r1 = new Robot();
    private static Logger LOGGER = Logger.getLogger("InfoLogging");

    public createPersonalInfoPage() throws AWTException {
    }

    public void waitfortheelement() {
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
//  select the title
    public void clickOnMr() {
        waitfortheelement();
        waitfortheelement();
        infoElement.mr.click();
    }
//  Provide the first name
    public void sendFirstName(String data) {
        infoElement.firstName.sendKeys(data);
        waitfortheelement();
    }
// Provide the last name
    public void sendLastName(String data) {
        infoElement.lastName.sendKeys(data);
    }
// set password in registration
    public void sendPassword(String data) {
        infoElement.passWord.sendKeys(data);
    }
//  entering city
    public void sendCity(String city) {
        infoElement.city.sendKeys(city);
    }
//  select state
    public void selectState() {
        Select state = new Select(infoElement.state);
        state.selectByVisibleText("California");
    }
// provide zip code
    public void zipCode(String zip) {
        infoElement.post.sendKeys("12345");
    }
// provide the address
    public void address(String address) {
        infoElement.address1.sendKeys(address);
    }
//  set the mobile number
    public void sendMobileNumber(String mob) {
        infoElement.mobile.sendKeys(mob);
    }
//  provide the alias address
    public void sendAlias(String alias) {
        infoElement.myAddress.sendKeys(alias);
    }
// click on register
    public void register() {
        infoElement.submit.click();
    }
//  verify the login after registration
    public void verifyLogin(String firstName, String lastName) {
        waitfortheelement();
        waitfortheelement();
        String actualName = infoElement.nameUsername.getText();
        String expectedName = firstName + " " + lastName;
        waitfortheelement();
        Assert.assertEquals(actualName, expectedName);
    }
//  sign out after registration, purchase
    public void clickOnSignOut() {
        infoElement.signOut.click();
    }
}
