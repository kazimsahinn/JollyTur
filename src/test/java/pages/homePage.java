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

    @FindBy(xpath = "//*[@class='tab tab-button active']")
    public WebElement otel;
    @FindBy(xpath = "//*[@id='travelHotelSearch']")
    public WebElement gidilecekYer;
    @FindBy(xpath = "(//*[@class='big-title'])[1]")
    public WebElement girisTarihi;
    @FindBy(xpath = "(//*[@class='big-title'])[2]")
    public WebElement cikisTarihi;

    @FindBy(xpath = "(//*[@class='big-title'])[3]")
    public WebElement odaVeKisiSayisi;
    @FindBy(xpath = "(//*[@class='list action-button'])[1]")
    public WebElement hemenAra;
    @FindBy(xpath = "//*[@class='ui-icon ui-icon-circle-triangle-e']")
    public WebElement tarihSayfasiDegis;
    @FindBy(xpath = "(//*[@class='ui-state-default'])[12]")
    public WebElement birinciTarih;
    @FindBy(xpath = "(//*[@class='ui-state-default'])[17]")
    public WebElement ikinciTarih;

    @FindBy(xpath = "(//*[@data-val='2'])[1]")
    public WebElement yetiskinSayisiGuncel;

    @FindBy(xpath = "(//*[@class='inc button buttonSelect'])[1]")
    public WebElement yetiskinSayisiArti;
    @FindBy(xpath = "(//*[@class='dec button buttonSelect'])[1]")
    public WebElement yetiskinSayisiEksi;

    @FindBy(xpath = "(//*[@class='inc button buttonSelect'])[2]")
    public WebElement cocukSayisiArti;
    @FindBy(xpath = "(//*[@class='dec button buttonSelect'])[2]")
    public WebElement cocukSayisiEksi;

    @FindBy(xpath = "//*[@class='add-room ']")
    public WebElement odaEkle;

    @FindBy(xpath = "(//*[@class='inc button buttonSelect'])[3]")
    public WebElement ikinciOdaYetiskinSayisiArti;
    @FindBy(xpath = "(//*[@class='dec button buttonSelect'])[3]")
    public WebElement ikinciOdaYetiskinSayisiEksi;

    @FindBy(xpath = "(//*[@class='inc button buttonSelect'])[4]")
    public WebElement ikinciOdaCocukSayisiArti;
    @FindBy(xpath = "(//*[@class='dec button buttonSelect'])[4]")
    public WebElement ikinciOdaCocukSayisiEksi;
    @FindBy(xpath = "(//*[@name='firstChildAge'])[2]")
    public WebElement cocukYasi;

    @FindBy(xpath = "//*[@class='button primary small trigger-search float-right inline']")
    public WebElement kisiSayisiUygula;




}
