package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.QualityDemyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class QalityDemyStepDefinitions {
    QualityDemyPage demyPage=new QualityDemyPage();
    @Given("Kullanici quality demy sayfasina gider")
    public void kullanici_quality_demy_sayfasina_gider() {
        Driver.getDriver().get( ConfigReader.getProperty( "myUrl" ));
        ReusableMethods.bekle(2);
        demyPage.acceptCookies.click();
    }
    @When("Email ve password dilgilerini girerek giris yapar")
    public void email_ve_password_dilgilerini_girerek_giris_yapar() {
        demyPage.loginLink.click();
        demyPage.emailBox.sendKeys(ConfigReader.getProperty("myGecerliEmailInsBora"));
        demyPage.passwordBox.sendKeys(ConfigReader.getProperty("myGecerliPasswordInsBora"));
        demyPage.loginButton.click();
    }
    @Then("Basarili bir sekilde giris yapildigini test eder")
    public void basarili_bir_sekilde_giris_yapildigini_test_eder() {
        Assert.assertTrue(demyPage.demyPicture.isDisplayed());
    }
    @Then("Sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();

    }
}
