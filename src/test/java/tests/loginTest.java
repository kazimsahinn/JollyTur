package tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import ultilities.ConfigReader;
import ultilities.Driver;
import ultilities.ReusableMethods;


public class loginTest {

    @Test
    public void testLogin() {

        homePage homePage = new homePage();
        registerPage registerPage = new registerPage();
        loginPage loginPage = new loginPage();

        Driver.getDriver().get(ConfigReader.getProperty("JollyTurURL"));
        ReusableMethods.waitForVisibility(homePage.logo,10); // logonun görünürlüğünü bekler.
        ReusableMethods.waitForVisibility(homePage.bildirimOnayiReddet,10);
        homePage.bildirimOnayiReddet.click();

        ReusableMethods.waitForClickablility(homePage.loginButton,10);
        homePage.loginButton.click();

        ReusableMethods.waitForVisibility(loginPage.welcomeTitle,10);
        Assert.assertTrue(loginPage.welcomeTitle.getText().contains("Hoş Geldiniz!"));
        Assert.assertTrue(loginPage.welcomeText.getText().contains("Geniş ve mutlu ailemizin bir üyesi olduğunuz için teşekkür ederiz. İlk günkü heyecanımızla, bir kez daha aramıza hoş geldiniz!"));
        Assert.assertTrue(loginPage.dontStayTitle.getText().contains("Hareketsiz Kalmayın!"));
        Assert.assertTrue(loginPage.dontStayText.getText().contains("Sitemizde vakit geçirirken, tatil geçmişinizi inceleyin, favori seyahat noktalarınızı işaretleyerek bir sonraki tatiliniz için şimdiden hayaller kurun."));
        Assert.assertTrue(loginPage.weAreAlwaysHereTitle.getText().contains("Her Zaman Buralardayız!"));
        Assert.assertTrue(loginPage.weAreALwaysHereText.getText().contains("Olur da aklınıza bir şey takılırsa, çağrı merkezimiz, canlı destek hattımız, sosyal medya hesaplarımız ve acentelerimizle yanı başınızdayız!"));

        ReusableMethods.waitForClickablility(loginPage.ePosta,10);
        loginPage.ePosta.sendKeys(ConfigReader.getProperty("eposta"));
        ReusableMethods.waitForClickablility(loginPage.password,10);
        loginPage.password.sendKeys(ConfigReader.getProperty("password"));

        Actions actions = new Actions(Driver.getDriver());
        actions.click(loginPage.rememberMe).perform();

        if (registerPage.capthcha.isDisplayed()){
           actions.click(registerPage.capthcha).perform();
        }else {
           return;
        }

        ReusableMethods.waitForClickablility(loginPage.loginButton,10);
        loginPage.loginButton.click();

        ReusableMethods.waitForVisibility(loginPage.userMenu,10);
        Assert.assertTrue(loginPage.userMenu.isDisplayed());

    }
}
