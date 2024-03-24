package stepDefinitions.UiStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
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
import utilities.PlantevalgMethods;
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

// Bilder
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
            bildeinfo.add(adminPage.bildeInfo.getText().split(",")[1].replaceAll("[^a-zA-Z0-9]",""));
            adminPage.nesteBilde.click();
        }
        Assert.assertTrue(bildeinfo.contains(str));
        System.out.println( str + " bilde publisert");
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
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.invisibilityOf(adminPage.busy));

    }

    @And("Klikk neste bilde")
    public void klikkNesteBilde() {
        adminPage.nesteBilde.click();
    }

    @And("Klikk plantebilde")
    public void klikkPlantebilde() {
        adminPage.storBilde.click();
    }

    @And("Velg {string} bilder som hovedbilde")
    public void velgBilderSomHovedbilde(String str) {
        Driver.getDriver().findElement(By.xpath("//div[text()='"+str+".jpg']//following-sibling::div[@class='_mainPicture_1c7c6_22']//descendant::div[starts-with(@class,'_checkbox_1drr8_1')]")).click();
        ReusableMethods.wait(1);
    }

    @And("Bekreft {string} bilde er hovedbilde")
    public void bekreftBildeErHovedbilde(String str) {
        String bilde=adminPage.bildeInfo.getText().split(",")[1].replaceAll("[^a-zA-Z0-9]","");
        Assert.assertEquals(str,bilde);
        System.out.println( str + " bilde er hovedbilde");
    }
//Plantegrupper Filter
    @Given("Velg {string} po Plantegruppe")
    public void velgPoPlantegruppe(String str) {
        Driver.getDriver().findElement(By.xpath("//div[starts-with(@class,'_plantGroups')]//child::div[text()='"+str+"']")).click();
    }

    @And("Bekreft alle planter er {string} po admin side")
    public void bekreftAllePlanterErPoAdminSide(String str) {
        ReusableMethods.wait(2);
        List<WebElement> allePlanter = Driver.getDriver().findElements(By.cssSelector("a[class^='_plantListElement'] div[class^='_nameAndDescription_']"));
        List<WebElement> planterMedFilter = Driver.getDriver().findElements(By.xpath("//div[starts-with(@class,'_nameAndDescription')]//child::div[text()='"+str+"']"));
        System.out.println("Det er " + planterMedFilter.size()+" "+str+" i siden");
        System.out.println("Det er " + allePlanter.size()+"planter i siden");
        Assert.assertEquals(allePlanter.size(),planterMedFilter.size());

    }

    @Given("Velg {string} under {string} po Undergruppe")
    public void velgUnderPoUndergruppe(String undergruppe, String hovedgruppe) {
        Driver.getDriver().findElement(By.xpath("//div[starts-with(@class,'_plantGroups')]//child::div[text()='"+hovedgruppe+"']")).click();
        Driver.getDriver().findElement(By.xpath("(//div[text()='"+hovedgruppe+"']//following-sibling::div//child::div[text()='"+undergruppe+"'])[1]")).click();
    }


    @And("Bekreft alle planter er {string} under {string} po admin side")
    public void bekreftAllePlanterErUnderPoAdminSide(String undergruppe, String hovedgruppe) {
        ReusableMethods.wait(2);
        List<WebElement> allePlanter = Driver.getDriver().findElements(By.cssSelector("a[class^='_plantListElement'] div[class^='_nameAndDescription_']"));
        List<WebElement> planterMedHovedGruppe = Driver.getDriver().findElements(By.xpath("//div[starts-with(@class,'_nameAndDescription')]//child::div[text()='"+hovedgruppe+"']"));
        List<WebElement> planterMedUnderGruppe = Driver.getDriver().findElements(By.xpath("//div[starts-with(@class,'_nameAndDescription')]//following-sibling::div//child::div[text()='"+undergruppe+"']"));
        System.out.println("Det er " + planterMedHovedGruppe.size()+" "+hovedgruppe+" i siden");
        System.out.println("Det er " + planterMedUnderGruppe.size()+" "+undergruppe+" i siden");
        System.out.println("Det er " + allePlanter.size()+" planter i siden");
        Assert.assertEquals(allePlanter.size(),planterMedUnderGruppe.size());
    }

    @And("Vent lasting")
    public void ventLasting() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.invisibilityOf(adminPage.vent));

    }

    @Then("Velg alle")
    public void velgAlle() {
        adminPage.velgAlle.click();
    }

    @And("Skriv {string} i botanisk navn")
    public void skrivIBotaniskNavn(String str) {
        adminPage.botaniskNavn.sendKeys(str);
        adminPage.firstPlante.click();

    }

    @And("Bekreft {string} er lagret")
    public void bekreftErLagret(String str) {
        List<WebElement> fotokilder= Driver.getDriver().findElements(By.cssSelector("div[class^='_photographer_']"));
        List<String> fotoKilderPlante= new ArrayList<>();
        for (WebElement w : fotokilder){
            fotoKilderPlante.add(w.getText().split("-")[1].replaceAll("[^a-zA-Z0-9]",""));
            System.out.println(fotoKilderPlante);
        }
        Assert.assertTrue(fotoKilderPlante.contains(str));
        System.out.println( str + " bilde er lagret");
    }

    @And("Velg {string} bilder som skal redigere")
    public void velgBilderSomSkalRedigere(String str) {
        Driver.getDriver().findElement(By.xpath("//div[text()='"+str+".jpg']//parent::div[@class='_top_1c7c6_5']//following-sibling::div[starts-with(@class,'_bottom_')]//child::div[starts-with(@class,'_checkbox_')]")).click();

    }

    @And("Klikk Hvor er bilde tatt for bilde {string}")
    public void klikkHvorErBildeTattForBilde(String str) {
        Driver.getDriver().findElement(By.xpath("//div[text()='"+str+".jpg']//parent::div[@class='_top_1c7c6_5']//following-sibling::div[starts-with(@class,'_bottom_')]//child::button")).click();

    }



    @And("Bekreft redigering i bildeinformasjon som {string} type bilde,{string} Fotograf, {string} i Fotokilde, {string} i Notis,{string} i Hvor er bilde tatt,{string} i Postnummer,{string} i Poststed")
    public void bekreftRedigeringIBildeinformasjonSomTypeBildeFotografIFotokildeINotisIHvorErBildeTattIPostnummerIPoststed(String type, String foto, String fotokilde, String notis, String hvor, String postnummer, String poststed) {
        Assert.assertEquals(notis,adminPage.notis.getAttribute("value"));
        Assert.assertEquals(hvor,adminPage.hvor.getAttribute("value"));
        Assert.assertEquals(postnummer,adminPage.postnummer.getAttribute("value"));
        Assert.assertEquals(poststed,adminPage.poststed.getAttribute("value"));
        actions.moveToLocation(1, 1).click().perform();
        Assert.assertEquals(foto+" - "+fotokilde, adminPage.infoFotoOgKilde.getText());
        Assert.assertEquals(type, adminPage.biltetype.getText());
    }
}
