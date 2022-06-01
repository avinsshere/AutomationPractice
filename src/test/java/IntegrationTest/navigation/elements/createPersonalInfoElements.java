package IntegrationTest.navigation.elements;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class createPersonalInfoElements extends PageObject {

    @FindBy(id = "uniform-id_gender1")
    public WebElement mr;

    @FindBy(id = "customer_firstname")
    public WebElement firstName;

    @FindBy(id = "customer_lastname")
    public WebElement lastName;

    @FindBy(id = "passwd")
    public WebElement passWord;

    @FindBy(id = "address1")
    public WebElement address1;

    @FindBy(id = "city")
    public WebElement city;

    @FindBy(id = "id_state")
    public WebElement state;

    @FindBy(id = "postcode")
    public WebElement post;

    @FindBy(id = "phone_mobile")
    public WebElement mobile;

    @FindBy(id = "alias")
    public WebElement myAddress;

    @FindBy(id = "submitAccount")
    public WebElement submit;

    @FindBy(xpath = "//a[@title='View my customer account']")
    public WebElement nameUsername;

    @FindBy(xpath = "//a[@class='logout']")
    public WebElement signOut;

    public createPersonalInfoElements(WebDriver driver) {
        super(driver);
    }
}
