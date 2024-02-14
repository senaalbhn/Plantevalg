package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pages.HjemmesidePage;
import pages.NyPlantePage;
import pages.PlanteSidePage;
import utilities.Driver;

public class RedigerPlanteStepdefs {
    HjemmesidePage hjemmeside= new HjemmesidePage();
    PlanteSidePage planteSide= new PlanteSidePage();
    NyPlantePage nyPlante= new NyPlantePage();
    Faker faker= new Faker();
    String fakeSlekt2;
    public RedigerPlanteStepdefs() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @Given("Klikk Plante")
    public void klikkPlante() {
        hjemmeside.nullstill.click();
        hjemmeside.nullstill.click();
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
        nyPlante.slekt.sendKeys(fakeSlekt2, Keys.TAB, "Artsepitet2",Keys.TAB, "Kultivar2", Keys.TAB, "Frøkilde2", Keys.TAB, "Underart", Keys.TAB, "Varietet2", Keys.TAB, "Form2", Keys.TAB, "Varemerke2");

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
        nyPlante.slektPrimaerOpprinnelse.sendKeys("PrimaerSlekt2", Keys.TAB,"PrimaerArtsepitet2");
    }

    @And("Bytt Slekt, Artsepitet for Sekundaer opprinnelse")
    public void byttSlektArtsepitetForSekundaerOpprinnelse() {
        nyPlante.slektSekundaerOpprinnelse.sendKeys("SekundaerSlekt2", Keys.TAB,"SekundaerArtsepitet2");
    }


    @Then("Klikk Synonymer som har registert for")
    public void klikkSynonymerSomHarRegistertFor() {
        planteSide.registrertSynonym.click();
    }

    @And("Bytt Slekt, Artsepitet for Primaer opprinnelse i Synonym")
    public void byttSlektArtsepitetForPrimaerOpprinnelseISynonym() {
        nyPlante.slektSynonym.sendKeys("PrimaerSlekt", Keys.TAB,"PrimaerArtsepitet");
    }

    @Then("Klikk po og bytte det tidligere lagrede sproket")
    public void klikkPoOgBytteDetTidligereLagredeSproket() {
        nyPlante.slektPrimaerOpprinnelse.sendKeys("New English Name");
    }
    @Then("Klikk Legg til")
    public void klikkLeggTil() {
        nyPlante.leggTilBilde.click();
    }

    @And("Skriv i Synonymer til")
    public void skrivISynonymerTil() {
        planteSide.synonymerTil.sendKeys("Synonymer til Engelsk navn");
    }

    @Then("Klikk Legg til flere sprok under Andre sprok")
    public void klikkLeggTilFlereSprokUnderAndreSprok() {
    nyPlante.leggTilSprok.click();
    }

    @And("Velg Norsk som sprok")
    public void velgNorskSomSprok() {
        WebElement sprok = Driver.getDriver().findElement(By.xpath("(//select)[1]"));
        Select select= new Select(sprok);
        //List<WebElement> sprokList = select.getOptions();
        //select.selectByIndex(random.nextInt(sprokList.size()));
        select.selectByIndex(2);
    }

    @Then("Klikk Ja for E-plante")
    public void klikkJaForEPlante() {
    }


    @And("Velg Stauder")
    public void velgStauder() {
    }

    @And("Velg Bregne")
    public void velgBregne() {
    }

    @Then("Velg en annen fra Restriksjoner og vern")
    public void velgEnAnnenFraRestriksjonerOgVern() {
    }
}
