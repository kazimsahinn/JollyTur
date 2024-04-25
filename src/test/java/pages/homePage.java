package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ultilities.Driver;

import java.time.Duration;

public class homePage {
    public homePage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//*[@id='web_push_hayir']")
    public WebElement bildirimOnayiReddet;
    @FindBy(xpath = "//*[@class='col-xs-6 p-initial']")
    public WebElement logo;
    @FindBy(xpath = "//*[@class='link login']")
    public WebElement loginButton;
    @FindBy(xpath = "//*[@class='link login rgster']")
    public WebElement signUpButton;
    @FindBy(xpath = "(//*[@class='link'])[1]")
    public WebElement phoneNumber;
    @FindBy(xpath = "(//*[@class='link'])[2]")
    public WebElement help;
    @FindBy(xpath = "//*[@class='link list-dropdown']")
    public WebElement salesOffices;

    @FindBy(xpath = "(//*[@class='link'])[3]")
    public WebElement blog;
    @FindBy(xpath = "//*[@class='icon icon-notification open-event']")
    public WebElement notifications;
    @FindBy(xpath = "//a[.='Otel']")
    public WebElement menuOtel;
    @FindBy(css = ".navigation--menu [href='/yurtici-oteller']")
    public WebElement yurtIciOteller;
    @FindBy(css = ".navigation--menu .nav-content [href='/kibris-otelleri']")
    public WebElement kibrisOtelleri;
    @FindBy(css = ".navigation--menu [href='/sehir-otelleri']")
    public WebElement sehirOtelleri;
    @FindBy(css = "[href='/yurtdisi-oteller']")
    public WebElement yurtDisiOtelleri;
    @FindBy(xpath = "//a[.='Tur']")
    public WebElement menuTur;
    @FindBy(css = ".navigation--menu [href='/kultur-turlari']")
    public WebElement kulturTurlari;
    @FindBy(css = ".navigation--menu [href='/yurtdisi-turlar']")
    public WebElement yurtdisiTurlari;
    @FindBy(xpath = "//a[.='Gemi']")
    public WebElement gemi;
    @FindBy(xpath = "//a[.='Kıbrıs']")
    public WebElement kibris;
    @FindBy(xpath = "//a[.='Uçak Bileti']")
    public WebElement ucakBileti;
    @FindBy(xpath = "//a[.='Erken Rezervasyon']")
    public WebElement erkenRezervasyon;
    @FindBy(xpath = "//a[.='Kampanyalar']")
    public WebElement kampanyalar;









}
