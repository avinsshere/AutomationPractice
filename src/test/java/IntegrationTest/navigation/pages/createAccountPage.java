package IntegrationTest.navigation.pages;


import IntegrationTest.navigation.elements.createAccountElements;
import com.gargoylesoftware.htmlunit.html.DomElement;
import com.github.javafaker.Faker;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.guice.Injectors;
import net.thucydides.core.util.EnvironmentVariables;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.util.Locale;
import java.util.logging.Logger;

import static java.lang.Thread.sleep;
import static org.assertj.core.api.Assertions.assertThat;

public class createAccountPage extends PageObject {
    createAccountElements accountElements;
    Robot r1 = new Robot();
    private static Logger LOGGER = Logger.getLogger("InfoLogging");
    Faker faker = new Faker(new Locale("en-AU"));

    public createAccountPage() throws AWTException {
    }

    public void waitfortheelement() {
        try {
            sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void OpenApplication() {
        String URL = getConfigurationDetails("webdriver.base.url");
        accountElements.getDriver().get(URL);
    }

    public String getConfigurationDetails(String nameURL) {
        EnvironmentVariables props = Injectors.getInjector().getInstance(EnvironmentVariables.class);
        String configDetails = EnvironmentSpecificConfiguration.from(props).getProperty(nameURL);
        return configDetails;
    }

    public JavascriptExecutor JavaScriptExecutor() {
        JavascriptExecutor js = (JavascriptExecutor) accountElements.getDriver();
        return js;
    }

    /*----------code-----------*/
//  Click on Sign in button
    public void clickElement() {
        waitForElement();
        accountElements.clickSignIn.click();
    }
//  enter the email
    public void sendEmail() {
        waitForElement();
        String email = faker.internet().safeEmailAddress();
        accountElements.emailAddress.sendKeys(email);
    }
//  click on create an account
    public void clickCreate() {
        waitfortheelement();
        accountElements.clickOncreate.click();
    }
//  Verify the navigaion to registration page
    public void verifyPage() {
        waitfortheelement();
        String expectedTitle = "Login - My Store";
        String actualTitle = accountElements.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        System.out.println(getDriver().getTitle());
    }

}
