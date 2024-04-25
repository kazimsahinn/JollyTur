package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ultilities.Driver;

public class registerPage {

    public registerPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//*[@id='RegisterFormViewModel_FirstName']")
    public WebElement name;
    @FindBy(xpath = "//*[@id='RegisterFormViewModel_LastName']")
    public WebElement surname;
    @FindBy(xpath = "//*[@id='RegisterFormViewModel_UserPhone']")
    public WebElement phone;
    @FindBy(xpath = "//*[@id='RegisterFormViewModel_Email']")
    public WebElement ePosta;
    @FindBy(xpath = "//*[@id='RegisterFormViewModel_Password']")
    public WebElement password;
    @FindBy(xpath = "//*[@id='RegisterFormViewModel_userNewslatter']")
    public WebElement agreementCheckBox;
    @FindBy(xpath = "(//*[@class='login-box-header'])[1]")
    public WebElement signUpTitle;

    @FindBy(xpath = "(//*[@class='login-content-title'])[1]")
    public WebElement whyVacation;
    @FindBy(xpath = "(//*[@class='login-content-description'])[1]")
    public WebElement whyVacationText;
    @FindBy(xpath = "(//*[@class='login-content-title'])[2]")
    public WebElement whyJollyTour;
    @FindBy(xpath = "(//*[@class='login-content-description'])[2]")
    public WebElement whyJollyTourText;
    @FindBy(xpath = "(//*[@class='login-content-title'])[3]")
    public WebElement whyJollyTour2;
    @FindBy(xpath = "(//*[@class='login-content-description'])[3]")
    public WebElement whyJollyTourText2;
    @FindBy(xpath = "(//*[@class='login-content-title'])[4]")
    public WebElement advantages;
    @FindBy(xpath = "(//*[@class='login-content-description'])[4]")
    public WebElement advantagesText;

    @FindBy(xpath = "(//*[@class='box-link'])[1]")
    public WebElement clarificationText;
    @FindBy(xpath = "(//*[@class='modal-title'])[2]")
    public WebElement clarificationTitle;

    @FindBy(xpath = "(//*[@class='icon icon-close'])[2]")
    public WebElement closeClarificationText;


    @FindBy(xpath = "(//*[@class='box-link'])[3]")
    public WebElement membershipAgreement;
    @FindBy(xpath = "(//*[@class='modal-title'])[1]")
    public WebElement membershipAgreementTitle;

    @FindBy(xpath = "(//*[@class='icon icon-close'])[1]")
    public WebElement closeMembershipAgreement;

    @FindBy(xpath = "//*[@class='button full third']")
    public WebElement signUp;
    @FindBy(xpath = "//*[@class='recaptcha-checkbox-border']")
    public WebElement capthcha;

}
