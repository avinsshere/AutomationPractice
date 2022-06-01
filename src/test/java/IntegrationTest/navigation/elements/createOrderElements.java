package IntegrationTest.navigation.elements;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.PageUrls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class createOrderElements extends PageObject {


    @FindBy(xpath = "//*[text()='Add to cart']")
    public WebElement addToCart;

    @FindBy(xpath = "//a[@title='Proceed to checkout']")
    public WebElement checkOut;

    @FindBy(xpath = "(//a[@title='Proceed to checkout'])[2]")
    public WebElement checkOut2;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement checkOut3;

    @FindBy(xpath = "//*[@id='uniform-cgv']")
    public WebElement acceptTermsCb;

    @FindBy(id = "group_1")
    public WebElement selectSize;

    @FindBy(xpath = "(//*[@title='Dresses'] )[2]")
    public WebElement dresses;

    @FindBy(id = "quantity_wanted")
    public WebElement selectQuantity;

    @FindBy(xpath = "//div[@id='HOOK_PAYMENT']/div[1]/div/p/a[@title='Pay by bank wire']")
    public WebElement payByBankWire;

    @FindBy(xpath = "//button[@type='submit']/span[contains(text(),'I confirm my order')]")
    public WebElement confirmOrder;

    @FindBy(xpath = "//strong[contains(text(),'Your order on My Store is complete.')]")
    public WebElement confirmationMsg;

    @FindBy(xpath = "//*[@class='icon-home']")
    public WebElement homeIcon;


    public createOrderElements(WebDriver driver) {
        super(driver);
    }
}
