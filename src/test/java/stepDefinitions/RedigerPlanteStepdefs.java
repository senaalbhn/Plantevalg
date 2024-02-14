package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.PageFactory;
import pages.HjemmesidePage;
import pages.NyPlantePage;
import pages.PlanteSidePage;
import utilities.Driver;

public class RedigerPlanteStepdefs {
    HjemmesidePage hjemmeside= new HjemmesidePage();
    PlanteSidePage planteSide= new PlanteSidePage();
    NyPlantePage nyPlante= new NyPlantePage();
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
}
