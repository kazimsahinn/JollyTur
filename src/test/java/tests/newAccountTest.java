package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import ultilities.ConfigReader;
import ultilities.Driver;
import ultilities.ReusableMethods;

import java.time.Duration;


public class newAccountTest {

    @Test
    public void testNewAccount() {

        homePage homePage = new homePage();
        registerPage registerPage = new registerPage();


        Driver.getDriver().get(ConfigReader.getProperty("JollyTurURL"));
        ReusableMethods.waitForVisibility(homePage.logo,10); // logonun görünürlüğünü bekler.
        ReusableMethods.waitForVisibility(homePage.bildirimOnayiReddet,10);
        homePage.bildirimOnayiReddet.click();



        homePage.signUpButton.click();
        ReusableMethods.waitForClickablility(registerPage.name,10);
        Assert.assertTrue(registerPage.whyVacation.isDisplayed());
        Assert.assertTrue(registerPage.whyVacationText.getText().contains("Yapılan araştırmalar gösteriyor ki, hayatta mutluluk, yaptığınız küçük kaçamaklarla doğrudan ilişkili. Bu yüzden siz siz olun, ömrünüzde tek bir yılı dahi tatilsiz geçirmeyin."));
        Assert.assertTrue(registerPage.whyJollyTour.isDisplayed());
        Assert.assertTrue(registerPage.whyJollyTourText.getText().contains("Çünkü bütün sene çok çalıştınız. Çok sıkılıp bunaldığınız o anlarda hep tatili düşlediniz. Sizin düşleriniz, bizim işimiz ve biz işimizi ciddiye alıyor, size pek çok avantaj sunuyoruz."));
        Assert.assertTrue(registerPage.whyJollyTour2.isDisplayed());
        Assert.assertTrue(registerPage.whyJollyTourText2.getText().contains("Çünkü size Türkiye’nin cennet noktalarında ve Kıbrıs’ta onlarca otel sunuyoruz. Ben kaşifim, yerimde duramam derseniz, yurt içinde ve yurt dışında tarih, doğa, kültür ve farklı lezzet keşifleri; ayrıca 20.000 fersah gemi turları öneriyoruz."));
        Assert.assertTrue(registerPage.advantages.isDisplayed());
        Assert.assertTrue(registerPage.advantagesText.getText().contains("Size özel indirimler ve kampanyalar, tatil planınızın başından sonuna kadar hizmet kalite garantisi, seyahat danışmanlarının desteği, sektöründe efsaneleşmiş tur rehberlerinin bilgi birikimi ve samimiyeti."));



        registerPage.name.sendKeys(ConfigReader.getProperty("name"));
        ReusableMethods.waitForVisibility(registerPage.surname,10);
        registerPage.surname.sendKeys(ConfigReader.getProperty("surname"));
        ReusableMethods.waitForClickablility(registerPage.phone,10);
        registerPage.phone.sendKeys(ConfigReader.getProperty("phoneNumber"));
        ReusableMethods.waitForClickablility(registerPage.ePosta,10);
        registerPage.ePosta.sendKeys(ConfigReader.getProperty("eposta"));
        ReusableMethods.waitForClickablility(registerPage.password,10);
        registerPage.password.sendKeys(ConfigReader.getProperty("password"));
        Actions actions = new Actions(Driver.getDriver());
        actions.click(registerPage.agreementCheckBox).perform();


        registerPage.clarificationText.click();
        ReusableMethods.waitForVisibility(registerPage.clarificationTitle,10);
        Assert.assertTrue(registerPage.clarificationTitle.getText().contains("Aydınlatma Metni"));
        registerPage.closeClarificationText.click();

        ReusableMethods.waitForVisibility(registerPage.membershipAgreement,10);
        registerPage.membershipAgreement.click();
        ReusableMethods.waitForVisibility(registerPage.membershipAgreementTitle,10);
        Assert.assertTrue(registerPage.membershipAgreementTitle.getText().contains("Üyelik Sözleşmesi"));
        registerPage.closeMembershipAgreement.click();

        if (registerPage.capthcha.isDisplayed()){
           actions.click(registerPage.capthcha).perform();
        }else {
            return;
        }
        ReusableMethods.waitForClickablility(registerPage.signUp,10);
        registerPage.signUp.click();






















    }
}
