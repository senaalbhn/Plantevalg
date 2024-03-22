package stepDefinitions.UiStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AdminPage;
import pages.HjemmesidePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class AdminStepDefitions {
    Actions actions=new Actions(Driver.getDriver());
    AdminPage adminPage= new AdminPage();
    HjemmesidePage hjemmesidePage=new HjemmesidePage();

    @Given("Go til Plantevalg-Admin nettside")
    public void goTilPlantevalgAdminNettside() {
        Driver.getDriver().get(ConfigReader.getProperty("AdminUrlBilde"));
    }


    @And("Klikk Bilder")
    public void klikkBilder() {
        adminPage.bilder.click();
    }



    @And("Skriv {string} i sokefelt og velg plante")
    public void skrivISokefeltOgVelgPlante(String str) {
        hjemmesidePage.sokefelte.sendKeys(str);
        ReusableMethods.wait(1);
        Driver.getDriver().findElement(By.cssSelector("a[title^='"+str+"'] div[class^='_name_']")).click();
        ReusableMethods.wait(1);

    }

    @And("Bekreft {string} bilde er publisert")
    public void bekreftBildeErPublisert(String str) {
        List<WebElement> bilder= Driver.getDriver().findElements(By.cssSelector("._image_19w8c_1"));
        List<String> bildeinfo= new ArrayList<>();

        for (int i = 0; i < bilder.size() ; i++) {
            bildeinfo.add(adminPage.bildeInfo.getText());
            // for ile olmayabilir do ve while bir bak amac bilder listesi kadar kez neste bilde buttonuna basmak boylece her seferinde fotokilde bilgisini alidigimiz bir liste olcak ve sonra onu karsilastiracagiz
        }
        adminPage.storBilde.click();
        Assert.assertTrue(adminPage.bildeInfo.getText().contains(str));
        System.out.println(str + " bilde publisert");
    }

    @And("Velg {string} bilder som skal publisere")
    public void velgBilderSomSkalPublisere(String str) {
        Driver.getDriver().findElement(By.xpath("//div[text()='"+str+".jpg']//following-sibling::div[@class='_published_1c7c6_28']//descendant::div[starts-with(@class,'_checkbox_1drr8_1')]")).click();
        ReusableMethods.wait(1);
    }

    @And("Skriv i {string} i Fotokilde")
    public void skrivIIFotokilde(String str) {
        Driver.getDriver().findElement(By.xpath("(//div[text()='"+str+".jpg']//parent::div)[1]//following-sibling::div[@class='_bottom_1c7c6_40']//child::div[starts-with(@class,'_checkbox_1drr8_1')]")).click();
        adminPage.fotokilde.sendKeys(str);
        ReusableMethods.wait(1);
    }


    @And("Vente for lagring")
    public void venteForLagring() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(3));
        wait.until(ExpectedConditions.invisibilityOf(adminPage.busy));

    }

    @And("Klikk neste bilde")
    public void klikkNesteBilde() {
        adminPage.nesteBilde.click();
    }
}
