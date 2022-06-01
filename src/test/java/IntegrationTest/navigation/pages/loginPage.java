package IntegrationTest.navigation.pages;


import IntegrationTest.navigation.elements.createAccountElements;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.guice.Injectors;
import net.thucydides.core.util.EnvironmentVariables;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Logger;

import static java.lang.Thread.sleep;
import static org.assertj.core.api.Assertions.assertThat;

public class loginPage extends PageObject {
    createAccountElements accountElements;
    Robot r1 = new Robot();
    private static Logger LOGGER = Logger.getLogger("InfoLogging");

    public loginPage() throws AWTException, FileNotFoundException {
    }

    public void waitfortheelement() {
        try {
            sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //  click on sign in button after providing the email and password
    public void clickSignIn() {
        waitfortheelement();
        accountElements.signInBtn.click();
    }

    //    login with email and password
    public void login(String email, String password) {
        accountElements.mailid.sendKeys(email);
        accountElements.password.sendKeys(password);
    }
//      verify the login authentication messages
    public void verifyErrorMessage(String errorMsg) {
        String actualError = accountElements.getDriver().findElement(By.xpath("//li[contains(text(),'" + errorMsg + "')]")).getText();
        Assert.assertEquals(actualError,errorMsg);
    }
}
