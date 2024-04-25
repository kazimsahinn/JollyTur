package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ultilities.Driver;

public class loginPage {

    public loginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//*[@class='login-content-title'])[1]")
    public WebElement welcomeTitle;

    @FindBy(xpath = "(//*[@class='login-content-description'])[1]")
    public WebElement welcomeText;

    @FindBy(xpath = "(//*[@class='login-content-title'])[2]")
    public WebElement dontStayTitle;
    @FindBy(xpath = "(//*[@class='login-content-description'])[2]")
    public WebElement dontStayText;

    @FindBy(xpath = "(//*[@class='login-content-title'])[3]")
    public WebElement weAreAlwaysHereTitle;
    @FindBy(xpath = "(//*[@class='login-content-description'])[3]")
    public WebElement weAreALwaysHereText;

    @FindBy(xpath = "(//*[@class='primary-input user-email'])[1]")
    public WebElement ePosta;

    @FindBy(xpath = "//*[@class='primary-input user-login-password']")
    public WebElement password;
    @FindBy(xpath = "(//*[@class='iCheck-helper'])[1]")
    public WebElement rememberMe;
    @FindBy(xpath = "//*[@class='button full third']")
    public WebElement loginButton;




    @FindBy(xpath = "//*[@class='welcome-user']")
    public WebElement userMenu;

}
