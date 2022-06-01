package IntegrationTest.navigation.pages;


import IntegrationTest.navigation.elements.createOrderElements;

import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.guice.Injectors;
import net.thucydides.core.util.EnvironmentVariables;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;
import static org.assertj.core.api.Assertions.assertThat;

public class createOrderPage extends PageObject {
    createOrderElements orderElements;
    Robot r1 = new Robot();

    public createOrderPage() throws AWTException {
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
        orderElements.getDriver().get(URL);
    }

    public String getConfigurationDetails(String nameURL) {
        EnvironmentVariables props = Injectors.getInjector().getInstance(EnvironmentVariables.class);
        String configDetails = EnvironmentSpecificConfiguration.from(props).getProperty(nameURL);
        return configDetails;
    }

    public JavascriptExecutor JavaScriptExecutor() {
        JavascriptExecutor js = (JavascriptExecutor) orderElements.getDriver();
        return js;
    }
//  proceed to checkout
    public void clickOnCheckOut() {
        getDriver().switchTo().defaultContent();
        waitfortheelement();
        orderElements.checkOut.click();
        orderElements.checkOut2.click();
        orderElements.checkOut3.click();
        waitfortheelement();
        orderElements.acceptTermsCb.click();
        waitfortheelement();
        orderElements.checkOut3.click();
        waitfortheelement();
    }
//  verifying the product details before payment
    public void verifyOrderDetails(String productName, String quantity) {
        WebElement product = orderElements.getDriver().findElement(By.xpath("//*[@id='cart_summary']/tbody/tr/td[2]/p/a[contains(text(),'" + productName + "')]"));
        String value = product.getText();
        waitfortheelement();
        Assert.assertEquals(value, productName);//td[@class='cart_quantity text-center' ]/span[text()=3]
        WebElement quantity1 = orderElements.getDriver().findElement(By.xpath("//td[@class='cart_quantity text-center' ]/span[text()=" + quantity + "]"));
        String actualQuantity = quantity1.getText();
        waitfortheelement();
        Assert.assertEquals(quantity, actualQuantity);
        waitfortheelement();
    }
//  selecting the product category
    public void clickOnDress() {
        orderElements.dresses.click();
    }
//  selecting the product
    public void clickOnPrintedDress(String productName) {
        WebElement selectDress = orderElements.getDriver().findElement(By.xpath("//img[@title='" + productName + "']"));
        selectDress.click();
    }
//  specify the quantity and size of product
    public void selectSpecified(String quantity, String size) {
        getDriver().switchTo().frame(0);
        getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        orderElements.selectQuantity.clear();
        orderElements.selectQuantity.sendKeys(quantity);
        waitfortheelement();
        selectFromDropdown(orderElements.selectSize, size);
    }
// add to cart
    public void clickAdd() {
        orderElements.addToCart.click();
    }
//  chose payment option
    public void chosePayment() {
        orderElements.payByBankWire.click();
    }
// confirm the order after payment
    public void confirmOrder() {
        orderElements.confirmOrder.click();
        waitfortheelement();
        String actualMessage = orderElements.confirmationMsg.getText();
        String expectedMessage = "Your order on My Store is complete.";
        Assert.assertEquals(actualMessage,expectedMessage);
                
    }
//  back to home after payment
    public void clickOnHome() {
        orderElements.homeIcon.click();
    }
}
