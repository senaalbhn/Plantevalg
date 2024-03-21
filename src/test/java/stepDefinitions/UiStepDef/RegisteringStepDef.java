package stepDefinitions.UiStepDef;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.HjemmesidePage;
import pages.NyPlantePage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class RegisteringStepDef {
    NyPlantePage nyPlante=new NyPlantePage();
    Faker faker=new Faker();
    HjemmesidePage hjemmesidePage= new HjemmesidePage();
    Actions actions=new Actions(Driver.getDriver());
    String slekt="Pizza";
    String artsepitet = "Pizzason";
    String slekt2="Ostekake";
    String artsepitet2 = "Ostekakeson";
    @And("Bekreft plante ikke lagres")
    public void bekreftPlanteIkkeLagres() {
        hjemmesidePage.sokefelte.sendKeys(slekt+" "+artsepitet);
        ReusableMethods.wait(1);
        List<WebElement> allePlanter = Driver.getDriver().findElements(By.cssSelector("a[class='_plantListElement_ekgvi_1']"));
        Assert.assertEquals(1, allePlanter.size());

    }
    @And("Fyll ut Slekt, Artsepitet")
    public void fyllUtSlektArtsepitet() {
        nyPlante.slekt.sendKeys(slekt, Keys.TAB,artsepitet);
        ReusableMethods.wait(1);
        nyPlante.lagreOgFortsette.click();
        nyPlante.neste.click();
        ReusableMethods.wait(1);
        nyPlante.ePlante.click();
        nyPlante.neste.click();
        ReusableMethods.wait(1);
        nyPlante.plantegruppeTraer.click();
        nyPlante.fro.click();
        nyPlante.vegetativ.click();

    }
    @And("Fyll ut Slekt, Artsepitet med forkjellig navn")
    public void fyllUtSlektArtsepitetMedForkjelligNavn() {
        nyPlante.slekt.sendKeys(slekt2, Keys.TAB,artsepitet2);
        ReusableMethods.wait(1);
        nyPlante.lagreOgFortsette.click();
        nyPlante.neste.click();

    }
    @And("Fyll ut Slekt, Artsepitet med samme navn med forste plante")
    public void fyllUtSlektArtsepitetMedSammeNavnMedForstePlante() {
        actions.keyDown(nyPlante.slekt,Keys.CONTROL).sendKeys("x").keyUp(Keys.CONTROL).keyDown(nyPlante.artsepitet,Keys.CONTROL).sendKeys("x").keyUp(Keys.CONTROL).perform();
        nyPlante.slekt.sendKeys(slekt, Keys.TAB,artsepitet);
        ReusableMethods.wait(2);
        nyPlante.neste.click();
        ReusableMethods.wait(1);
        nyPlante.ePlante.click();
        nyPlante.produsertINorge.click();
        nyPlante.viltvoksendeINorge.click();
        ReusableMethods.wait(1);
        nyPlante.neste.click();
        ReusableMethods.wait(1);
        nyPlante.plantegruppeTraer.click();
        nyPlante.fro.click();
        ReusableMethods.wait(1);
        nyPlante.vegetativ.click();
    }


    @And("Klikk Plante som lagres sist")
    public void klikkPlanteSomLagresSist() {
        hjemmesidePage.sokefelte.sendKeys(slekt2);
        ReusableMethods.wait(4);
        Driver.getDriver().findElement(By.xpath("//span[contains(text(),'"+slekt2+"')]")).click();
        ReusableMethods.wait(4);
    }

    @And("Bekreft plante lagres")
    public void bekreftPlanteLagres() {
        hjemmesidePage.sokefelte.sendKeys(slekt);
        ReusableMethods.wait(1);
        List<WebElement> allePlanter = Driver.getDriver().findElements(By.xpath("//span[contains(text(),'"+slekt+"')]"));
        Assert.assertEquals(1, allePlanter.size());
    }


    @And("Bekreft plante ikke lagres med nytt navn")
    public void bekreftPlanteIkkeLagresMedNyttNavn() {
        hjemmesidePage.sokefelte.sendKeys(slekt+" "+artsepitet);
        ReusableMethods.wait(1);
        List<WebElement> allePlanter = Driver.getDriver().findElements(By.cssSelector("a[class='_plantListElement_ekgvi_1']"));
        Assert.assertEquals(1, allePlanter.size());
    }

    @And("Klikk Neste")
    public void klikkNeste() {
        nyPlante.neste.click();
        nyPlante.neste.click();
        nyPlante.neste.click();
        nyPlante.neste.click();
        nyPlante.neste.click();
    }


    @And("Bekreftelse plante lagres")
    public void bekreftelsePlanteLagres() {
        hjemmesidePage.sokefelte.sendKeys("Avocadoo");
        ReusableMethods.wait(1);
        List<WebElement> allePlanter = Driver.getDriver().findElements(By.cssSelector("a[class='_plantListElement_ekgvi_1']"));
        Assert.assertEquals(1, allePlanter.size());
    }
}
