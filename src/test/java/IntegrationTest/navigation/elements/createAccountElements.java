package IntegrationTest.navigation.elements;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class createAccountElements extends PageObject {


    @FindBy(className = "login")
    public WebElement clickSignIn;

    @FindBy(id = "email_create")
    public WebElement emailAddress;

    @FindBy(id = "email")
    public WebElement mailid;

    @FindBy(id = "passwd")
    public WebElement password;

    @FindBy(id = "SubmitCreate")
    public WebElement clickOncreate;

    @FindBy(id = "SubmitLogin")
    public WebElement signInBtn;

    public createAccountElements(WebDriver driver) {
        super(driver);
    }
}
