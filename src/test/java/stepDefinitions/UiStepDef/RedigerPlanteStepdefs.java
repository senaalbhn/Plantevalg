package stepDefinitions.UiStepDef;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HjemmesidePage;
import pages.NyPlantePage;
import pages.PlanteSidePage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

public class RedigerPlanteStepdefs {
    HjemmesidePage hjemmeside= new HjemmesidePage();
    PlanteSidePage planteSide= new PlanteSidePage();
    NyPlantePage nyPlante= new NyPlantePage();
    Faker faker= new Faker();
    String fakeSlekt2;
    Actions actions= new Actions(Driver.getDriver());
    public RedigerPlanteStepdefs() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @Given("Klikk Plante")
    public void klikkPlante() {
        hjemmeside.forstePlante.click();
    }

    @Then("Klikk Rediger")
    public void klikkRediger() {
        planteSide.rediger.click();
    }

    //Botanisk navn
    @Then("Bytt Slekt, Artsepitet, Kultivar, Frøkilde, Underart, Varietet, Form, Varemerke")
    public void byttSlektArtsepitetKultivarFrøkildeUnderartVarietetFormVaremerke() {
        fakeSlekt2=faker.harryPotter().character();
        nyPlante.slekt.sendKeys(Keys.CONTROL, "a",Keys.CONTROL,"Avocadoo2", Keys.TAB, "Artsepitet2",Keys.TAB, "Kultivar2", Keys.TAB, "Frøkilde2", Keys.TAB, "Underart2", Keys.TAB, "Varietet2", Keys.TAB, "Form2", Keys.TAB, "Varemerke2");
    }

    @And("Velg Hybrid mellom slekter")
    public void velgHybridMellomSlekter() {
        nyPlante.hybridMellomSlekter.click();
    }


    //Navn og opprinnelse
    @Then("Klikk Opphav")
    public void klikkOpphav() {
        planteSide.opphav.click();
    }

    @And("Bytt Slekt, Artsepitet for Primaer opprinnelse")
    public void byttSlektArtsepitetForPrimaerOpprinnelse() {
        planteSide.opphavPrimaerSlekt.sendKeys(Keys.CONTROL, "a",Keys.CONTROL,"PrimaerSlekt2", Keys.TAB,"PrimaerArtsepitet2",Keys.TAB,"Kl",Keys.TAB,"Fr",Keys.TAB,"Un",Keys.TAB,"Vr",Keys.TAB,"Fr",Keys.TAB,"Vm");
        planteSide.varemerkeButtonForOpphavOgSynonym.click();
    }

    @And("Bytt Slekt, Artsepitet for Sekundaer opprinnelse")
    public void byttSlektArtsepitetForSekundaerOpprinnelse() {
        planteSide.opphavSekundaerSlekt.sendKeys(Keys.CONTROL, "a",Keys.CONTROL,"SekundaerSlekt2", Keys.TAB,"SekundaerArtsepitet2",Keys.TAB,"Kl2",Keys.TAB,"Fr2",Keys.TAB,"Un2",Keys.TAB,"Vr2",Keys.TAB,"Fr2",Keys.TAB,"Vm2");
        planteSide.varemerkeButtonForOpphav2.click();
    }


    @Then("Klikk Synonymer som har registert for")
    public void klikkSynonymerSomHarRegistertFor() {
        planteSide.registrertSynonym.click();
    }

    @And("Bytt Slekt, Artsepitet for Primaer opprinnelse i Synonym")
    public void byttSlektArtsepitetForPrimaerOpprinnelseISynonym() {
        ReusableMethods.wait(2);
        actions.click(planteSide.synonymPrimaerSlekt).keyDown(Keys.CONTROL).sendKeys("a").sendKeys("x").keyUp(Keys.CONTROL).perform();
        planteSide.synonymPrimaerSlekt.sendKeys(faker.cat().name(), Keys.TAB,"PrimaerArtsepitet3",Keys.TAB,"Kl3",Keys.TAB,"Fr3",Keys.TAB,"Un3",Keys.TAB,"Vr3",Keys.TAB,"Fr3",Keys.TAB,"Vm3");
        planteSide.varemerkeButtonForOpphavOgSynonym.click();
        ReusableMethods.wait(1);
        planteSide.lagre.click();
    }
    @And("Fyll ut Slekt, Artsepitet for Primaer opprinnelse iSynonym")
    public void fyllUtSlektArtsepitetForPrimaerOpprinnelseISynonym() {
        ReusableMethods.wait(2);
        actions.click(planteSide.synonymPrimaerSlekt).keyDown(Keys.CONTROL).sendKeys("a").sendKeys("x").keyUp(Keys.CONTROL).perform();
        planteSide.synonymPrimaerSlekt.sendKeys("PrimaerSlekt4", Keys.TAB,"PrimaerArtsepitet4",Keys.TAB,"Kl4",Keys.TAB,"Fr4",Keys.TAB,"Un4",Keys.TAB,"Vr4",Keys.TAB,"Fr4",Keys.TAB,"Vm4");
        planteSide.varemerkeButtonForOpphavOgSynonym.click();
    }

    @Then("Klikk po og bytte det tidligere lagrede sproket")
    public void klikkPoOgBytteDetTidligereLagredeSproket() {
        planteSide.synonymerNavn.sendKeys(Keys.CONTROL,"a",Keys.CONTROL," ","New English Name");
    }
    @Then("Klikk Legg til")
    public void klikkLeggTil() {
        planteSide.leggTil.click();
    }

    @And("Skriv i Synonymer til")
    public void skrivISynonymerTil() {
        planteSide.synonymerTil.sendKeys("Synonymer til Engelsk navn");
    }

    @Then("Klikk Legg til flere sprok under Andre sprok")
    public void klikkLeggTilFlereSprokUnderAndreSprok() {
    planteSide.flereSprook.click();
    }

    @And("Velg Norsk som sprok")
    public void velgNorskSomSprok() {
        ReusableMethods.wait(1);
        WebElement sprok = Driver.getDriver().findElement(By.xpath("(//select)[1]"));
        Select select= new Select(sprok);
        //List<WebElement> sprokList = select.getOptions();
        //select.selectByIndex(random.nextInt(sprokList.size()));
        select.selectByIndex(2);
    }

    @And("Skriv i Norsk Navn")
    public void skrivINorskNavn() {
        planteSide.andreSprokNavn.sendKeys("Norsk Navn",Keys.TAB,Keys.ENTER);
    }



    @And("Velg Lovfellende")
    public void velgLovfellende() {
        planteSide.lovfellende.click();
        ReusableMethods.visibleWait(nyPlante.plantegruppeLovfellendeBekreft,10);
    }


    @Then("Velg en annen fra form")
    public void velgEnAnnenFraForm() {
        WebElement form = Driver.getDriver().findElement(By.xpath("//select"));
        Select select= new Select(form);
        //List<WebElement> naturligList = select.getOptions();
        //select.selectByIndex(random.nextInt(naturligList.size()));
        select.selectByIndex(4);
        //ReusableMethods.wait(1);
    }

// Bildet
    @Then("Klikk po og bytte det tidligere lagrede Bildet")
    public void klikkPoOgBytteDetTidligereLagredeBildet() {
        planteSide.registertBilde.click();
    }
//Tilleggsinformasjon
    @Then("Bytt Tilleggsopplysninger")
    public void byttTilleggsopplysninger() {
        nyPlante.tilleggsopplysninger.sendKeys("Bytte Tilleggsopplysninger");
    }

    @And("Bytt Kommentar")
    public void byttKommentar() {
        nyPlante.kommentar.sendKeys("Byttet Kommentar");
    }

    @And("Bytt Forskeres erfaring med planten")
    public void byttForskeresErfaringMedPlanten() {
        nyPlante.forskeresErfaringMedPlanten.sendKeys("Byttet Forskeres erfaring med planten");
    }
//Forskningen
    @Then("Klikk redigere forskningen")
    public void klikkRedigereForskningen() {
        planteSide.redigereForskning.click();
    }

    @And("Skriv i Oppsummering av forskningen, Steder for forskning og utproving, Oppsummering av forskningen vedrorende denne planten")
    public void skrivIOppsummeringAvForskningenStederForForskningOgUtprovingOppsummeringAvForskningenVedrorendeDennePlanten() {
        ReusableMethods.wait(2);
        planteSide.oppsummeringAvForskningen.sendKeys(faker.backToTheFuture().quote(),Keys.TAB, faker.backToTheFuture().quote(), Keys.TAB, faker.backToTheFuture().quote());
    }

    @And("Klikk Legg til referanse")
    public void klikkLeggTilReferanse() {
        planteSide.leggTilReferanse.click();
    }

    @And("Klikk Knytt til flere")
    public void klikkKnyttTilFlere() {
        planteSide.apneForskning.click();
        planteSide.knyttTilFlere.click();
    }

    @And("Skriv {string} i searchbox og velg planten, skriv {string} i textbox og klikk knytt")
    public void skrivISearchboxOgVelgPlantenSkrivITextboxOgKlikkKnytt(String str, String str2) {
        planteSide.knyttForskningSearch.sendKeys(str);
        planteSide.planteForKnytt.click();
        planteSide.planteForKnyttInfo.sendKeys(faker.backToTheFuture().quote());
        planteSide.knyttButton.click();
    }

    @And("Vent til nytt bilde")
    public void ventTilNyttBilde() {
        ReusableMethods.wait(20);
    }
}
