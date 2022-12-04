package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AutomationExercisePage;
import utilities.ConfigReader;
import utilities.Driver;

public class AutomationLogin {
    AutomationExercisePage page =new AutomationExercisePage();
    @Given("Kullanici {string} sayfasina gider")
    public void kullanici_sayfasina_gider(String istenenUrl) {
        Driver.getDriver().get( ConfigReader.getProperty( istenenUrl ) );
    }
    @Then("Kullanici Signup butonuna tiklar")
    public void kullanici_signup_butonuna_tiklar() {
        page.signUpLink.click();

    }
    @Then("Kullanici mail bölümüne {string} gönderir")
    public void kullanici_mail_bölümüne_gönderir(String istenenMail) {
page.emailBox.sendKeys( ConfigReader.getProperty( istenenMail ) );
    }
    @Then("Kullanici password bölümüne {string} gönderirir")
    public void kullanici_password_bölümüne_gönderirir(String istenenPassword) {
page.passwordBox.sendKeys( ConfigReader.getProperty( istenenPassword ) );

    }
    @Then("Kullanici login butonuna tiklar")
    public void kullanici_login_butonuna_tiklar() {
page.loginButonu.click();
    }
    @Then("Kullanici Automation sayfasina giris yptigini test eder")
    public void kullanici_automation_sayfasina_giris_yptigini_test_eder() {
        Assert.assertTrue( page.logoutButonu.isDisplayed() );
    }

}
