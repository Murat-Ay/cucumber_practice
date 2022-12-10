package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pages.AmazonPage;
import utilities.Driver;

public class AmazonStepDefinitions {
    AmazonPage amazonPage=new AmazonPage();
    @Then("Kullanici amazon arama kutusunda {string} arama yapar")
    public void kullanici_amazon_arama_kutusunda_arama_yapar(String istenenMeyve) {
amazonPage.amazonAramaKutusu.sendKeys( istenenMeyve+ Keys.ENTER );
    }
    @Then("Kullanici arattigi {string} test eder")
    public void kullanici_arattigi_test_eder(String testMeyve) {
        Assert.assertTrue( amazonPage.amazonAramaSonucuTest.getText().contains( testMeyve ));
    }
    @Then("Kullanici arama kutusundaki drop down menusunden {string} secer")
    public void kullanici_arama_kutusundaki_drop_down_menüsünden_secer(String string) {
        Select select=new Select( amazonPage.dropDownMenu  );
        select.selectByVisibleText( "kategori" );

    }
}
