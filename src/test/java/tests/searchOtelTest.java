package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import ultilities.ConfigReader;
import ultilities.Driver;
import ultilities.ReusableMethods;

public class searchOtelTest {

    @Test
    public void testSearchOtel() {

        homePage homePage  = new homePage();
        searchPage searchPage = new searchPage();

        Driver.getDriver().get(ConfigReader.getProperty("JollyTurURL"));

        ReusableMethods.waitForVisibility(homePage.logo,10);
        ReusableMethods.waitForVisibility(homePage.bildirimOnayiReddet,10);
        homePage.bildirimOnayiReddet.click();

        ReusableMethods.waitForClickablility(homePage.otel,10);
        homePage.otel.click();
        ReusableMethods.waitForVisibility(homePage.gidilecekYer,10);
        homePage.gidilecekYer.sendKeys("Antalya");
        ReusableMethods.waitForVisibility(homePage.girisTarihi,10);
        homePage.girisTarihi.click();
        homePage.tarihSayfasiDegis.click();
        ReusableMethods.waitForClickablility(homePage.birinciTarih,10);
        homePage.birinciTarih.click();
        homePage.ikinciTarih.click();
        homePage.yetiskinSayisiArti.click();
        homePage.yetiskinSayisiArti.click();
        homePage.hemenAra.click();


        ReusableMethods.waitForVisibility(searchPage.aramaSonucu,10);
        Assert.assertTrue(searchPage.aramaSonucu.isDisplayed());



        Driver.getDriver().close();














    }




}
