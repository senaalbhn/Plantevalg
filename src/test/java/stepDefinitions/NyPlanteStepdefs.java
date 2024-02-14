package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.junit.Ignore;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.HjemmesidePage;

import pages.NyPlantePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import org.testng.asserts.SoftAssert;
import javax.swing.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class NyPlanteStepdefs {
    SoftAssert softAssert = new SoftAssert();
    HjemmesidePage hjemmeside= new HjemmesidePage();
    ReusableMethods reusableMethods=new ReusableMethods();
    NyPlantePage nyPlante= new NyPlantePage();
    Random random= new Random();
    List<WebElement> sprokList;
    Actions actions= new Actions(Driver.getDriver());
    Faker faker= new Faker();
    String fakeSlekt;



    @Given("Go til Plantevalg-siden")
    public void go_til_plantevalg_siden() {
        Driver.getDriver().get(ConfigReader.getProperty("Url"));
    }

    @Then("Skriv i epost og passord, klikk Logg inn")
    public void skrivIEpostOgPassordKlikkLoggInn() {
        hjemmeside.epost.sendKeys(ConfigReader.getProperty("email"), Keys.TAB, ConfigReader.getProperty("password"), Keys.TAB, Keys.TAB,Keys.ENTER);

    }

    @Then("Klikk Ny Plnate")
    public void klikkNyPlnate() {
        //ReusableMethods.wait(1);
        nyPlante.nyPlante.click();
    }
    //Botonisk Navn

    @And("Fyll ut Slekt, Artsepitet, Kultivar, Frøkilde, Underart, Varietet, Form, Varemerke")
    public void fyllUtSlektArtsepitetKultivarFrøkildeUnderartVarietetFormVaremerke() {
        fakeSlekt=faker.harryPotter().character();
        nyPlante.slekt.sendKeys(fakeSlekt, Keys.TAB, "Artsepitet",Keys.TAB, "Kultivar", Keys.TAB, "Frøkilde", Keys.TAB, "Underart", Keys.TAB, "Varietet", Keys.TAB, "Form ", Keys.TAB, "Varemerke ");
    }

    @And("Velg Hybrid mellom arter")
    public void velgHybridMellomArter() {
        nyPlante.hybridMellomArter.click();
    }

    @And("Velg varemerke {string}")
    public void velgVaremerke(String str) {
        nyPlante.varemerkeButton.click();
    }

    @And("Klikk Lagre og Fortsette")
    public void klikkLagreOgFortsette() {
        ReusableMethods.wait(1);
        nyPlante.lagreOgFortsette.click();
    }

    //Navn og opprinnelse

    @Given("Klikk Navn og opprinnelse")
    public void klikkNavnOgOpprinnelse() {
        ReusableMethods.wait(2);
        nyPlante.navnOgOpprinnelse.click();
    }

    @Then("Klikk Legg til under Opphav")
    public void klikkLeggTilUnderOpphav() {
        ReusableMethods.wait(1);
        nyPlante.leggTilOpphav.click();
    }

    @And("Fyll ut Slekt, Artsepitet for Primaer opprinnelse")
    public void fyllUtSlektArtsepitetForPrimaerOpprinnelse() {
        nyPlante.slektPrimaerOpprinnelse.sendKeys("SlektPrimaer", Keys.TAB,"ArtsepitetPrimaer");
    }

    @And("Fyll ut Slekt, Artsepitet for Sekundaer opprinnelse")
    public void fyllUtSlektArtsepitetForSekundaerOpprinnelse() {
        nyPlante.slektSekundaerOpprinnelse.sendKeys("SlektSekundaer", Keys.TAB,"ArtsepitetSekundaer");
    }

    @And("Klikk Lagre")
    public void klikkLagre() {
        ReusableMethods.wait(1);
        nyPlante.lagreButton.click();
    }

    @Then("Klikk {string} for Viltvoksende i Norge og Produsert i Norge")
    public void klikkJaForViltvoksendeINorgeOgProdusertINorge(String str) {
        nyPlante.viltvoksendeINorge.click();
        nyPlante.produsertINorge.click();
    }

    @Then("Klikk Legg til under Synonymer botanisk navn")
    public void klikkLeggTilUnderSynonymerBotaniskNavn() {
        ReusableMethods.wait(1);
        nyPlante.leggTilSynonymer.click();
    }

    @And("Fyll ut Slekt, Artsepitet for Primaer opprinnelse i Synonym")
    public void fyllUtSlektArtsepitetForPrimaerOpprinnelseISynonym() {
        nyPlante.slektSynonym.sendKeys("SlektPrimaer2", Keys.TAB,"ArtsepitetPrimaer2");
    }

    @Then("Klikk Legg til under Andre sprok")
    public void klikkLeggTilUnderAndreSprok() {
        ReusableMethods.wait(1);
        nyPlante.leggTilSprok.click();
    }

    @And("Velg Engelsk som sprok")
    public void velgEngelskSomSprok() {
        //ReusableMethods.wait(1);
        WebElement sprok = Driver.getDriver().findElement(By.xpath("(//select)[1]"));
        Select select= new Select(sprok);
        //List<WebElement> sprokList = select.getOptions();
        //select.selectByIndex(random.nextInt(sprokList.size()));
        select.selectByIndex(4);
    }

    @And("Skriv i {string}")
    public void skrivINavn(String str) {
        nyPlante.navn.sendKeys(str);
    }

    @Then("Klikk {string} for E-plante")
    public void klikkForEPlante(String str) {
        ReusableMethods.wait(1);
        nyPlante.ePlante.click();
    }

    //Egenskaper
    @Given("Klikk Egenskaper")
    public void klikkEgenskaper() {
        nyPlante.egenskaper.click();
    }

    @And("Velg Traer")
    public void velgTraer() {
        nyPlante.plantegruppeTraer.click();
    }

    @And("Velg Alltidgronn")
    public void velgAlltidgronn() {
        ReusableMethods.wait(1);
        nyPlante.plantegruppeAlltidgronn.click();
        ReusableMethods.wait(1);
    }

    @Then("Velg {string} fra Pollinator-vennlig")
    public void velgEnFraPollinatorVennlig(String str) {
        WebElement pollinatorVennlig = Driver.getDriver().findElement(By.xpath("(//select)[1]"));
        //Select select= new Select(pollinatorVennlig);
        //List<WebElement> pollinatorVennligList = select.getOptions();
        //select.selectByIndex(random.nextInt(pollinatorVennligList.size()));
        //select.selectByIndex(2);
        //ReusableMethods.wait(1);
        ReusableMethods.ddmVisibleText(pollinatorVennlig,str);
    }

    @Then("Velg {string} fra Matnyttig")
    public void velgFraMatnyttig(String str) {
        WebElement matnyttig = Driver.getDriver().findElement(By.xpath("(//select)[2]"));
        //Select select= new Select(matnyttig);
        //List<WebElement> matnyttigList = select.getOptions();
        //select.selectByIndex(random.nextInt(matnyttigList.size()));
        //select.selectByIndex(2);
        //ReusableMethods.wait(1);
        ReusableMethods.ddmVisibleText(matnyttig,str);
    }

    @Then("Velg {string} fra Allergi")
    public void velgFraAllergi(String str) {
        WebElement allergi = Driver.getDriver().findElement(By.xpath("(//select)[3]"));
        ReusableMethods.ddmVisibleText(allergi,str);
        //Select select= new Select(allergi);
        //List<WebElement> allergiList = select.getOptions();
        //select.selectByIndex(random.nextInt(allergiList.size()));
        //select.selectByIndex(2);
        //ReusableMethods.wait(1);
    }

    @Then("Velg {string} fra Naturlig levealder")
    public void velgFraNaturligLevealder(String str) {
        WebElement naturlig = Driver.getDriver().findElement(By.xpath("(//select)[4]"));
        ReusableMethods.ddmVisibleText(naturlig,str);
        //Select select= new Select(naturlig);
        //List<WebElement> naturligList = select.getOptions();
        //select.selectByIndex(random.nextInt(naturligList.size()));
        //select.selectByIndex(2);
        //ReusableMethods.wait(1);
    }

    @Then("Velg en fra Restriksjoner og vern")
    public void velgEnFraRestriksjonerOgVern() {
        nyPlante.restriksjonerOgVern.click();
        ReusableMethods.wait(1);
        nyPlante.restriksjonerOgVernValg.click();
        actions.click().perform();

    }

    @Then("Klikk {string} for Vegetativ")
    public void klikkForVegetativ(String str) {
        nyPlante.vegetativ.click();
    }

    @Then("Klikk {string} for Fro")
    public void klikkNeiForFro(String str) {
        nyPlante.fro.click();
    }

    //Størrelse og form
    @Given("Klikk Storrelse og form")
    public void klikkStorrelseOgForm() {
        nyPlante.storrelseOgForm.click();
    }

    @And("Velg hoyde")
    public void velgHoyde() {
        nyPlante.hoyde.sendKeys("5",Keys.TAB, "15");
    }

    @And("Velg en fra bredde")
    public void velgEnFraBredde() {
        WebElement bredde = Driver.getDriver().findElement(By.xpath("(//select)[1]"));
        Select select= new Select(bredde);
        //List<WebElement> naturligList = select.getOptions();
        //select.selectByIndex(random.nextInt(naturligList.size()));
        select.selectByIndex(2);
        //ReusableMethods.wait(1);

    }

    @Then("Velg en fra form")
    public void velgEnFraForm() {
        WebElement form = Driver.getDriver().findElement(By.xpath("(//select)[2]"));
        Select select= new Select(form);
        //List<WebElement> naturligList = select.getOptions();
        //select.selectByIndex(random.nextInt(naturligList.size()));
        select.selectByIndex(2);
        //ReusableMethods.wait(1);

    }

    @Then("Velg en fra rottype")
    public void velgEnFraRottype() {
        WebElement rottype = Driver.getDriver().findElement(By.xpath("(//select)[3]"));
        Select select= new Select(rottype);
        //List<WebElement> naturligList = select.getOptions();
        //select.selectByIndex(random.nextInt(naturligList.size()));
        select.selectByIndex(2);
        //ReusableMethods.wait(1);
    }

    //Bruksområde
    @Given("Klikk Bruksomrode")
    public void klikkBruksomrode() {
        nyPlante.bruksomrode.click();
    }

    @And("Klikk Gruppe,Alle-trerekke,Fri hekk, Klippet hekk, Markdekkende, Slyng-klatreplante og Solitaer")
    public void klikkGruppeAlleTrerekkeFriHekkKlippetHekkMarkdekkendeSlyngKlatreplanteOgSolitaer() {
        nyPlante.bruksomrodeValg.click();
        nyPlante.bruksomrodeValg.click();
        nyPlante.bruksomrodeValg.click();
        nyPlante.bruksomrodeValg.click();
        nyPlante.bruksomrodeValg.click();
        nyPlante.bruksomrodeValg.click();
        nyPlante.bruksomrodeValg.click();
    }

    @And("Skriv i tregruppe")
    public void skrivITregruppe() {
        nyPlante.tregruppe.sendKeys("5",Keys.TAB, "15");
    }

    @And("Skriv i Busk gruppe")
    public void skrivIBuskGruppe() {
        nyPlante.buskGruppe.sendKeys("5",Keys.TAB, "15");
    }

    @And("Skriv i Solitaer")
    public void skrivISolitaer() {
        nyPlante.solitaer.sendKeys("5",Keys.TAB, "15");
    }

    @And("Skriv i Klippet hekk")
    public void skrivIKlippetHekk() {
        nyPlante.klippetHekk.sendKeys("5",Keys.TAB, "15");
    }

    @Then("Velg en fra Dekkevne")
    public void velgEnFraDekkevne() {
        WebElement dekkevne = Driver.getDriver().findElement(By.xpath("(//select)[1]"));
        Select select= new Select(dekkevne);
        //List<WebElement> naturligList = select.getOptions();
        //select.selectByIndex(random.nextInt(naturligList.size()));
        select.selectByIndex(2);
        //ReusableMethods.wait(1);
    }

    @Then("Velg en fra Beskjaeringsbehov")
    public void velgEnFraBeskjaeringsbehov() {
        WebElement beskjaeringsbehov = Driver.getDriver().findElement(By.xpath("(//select)[2]"));
        Select select= new Select(beskjaeringsbehov);
        //List<WebElement> naturligList = select.getOptions();
        //select.selectByIndex(random.nextInt(naturligList.size()));
        select.selectByIndex(2);
        //ReusableMethods.wait(1);
    }

    //Plassering
    @Given("Klikk Plassering")
    public void klikkPlassering() {
        nyPlante.plassering.click();
    }

    @And("Klikk Lysforhold, Jord og Fuktighetsforhold")
    public void klikkLysforholdJordOgFuktighetsforhold() {
        nyPlante.lysforholdOgJordOgFuktighetsforhold.click();
        nyPlante.lysforholdOgJordOgFuktighetsforhold.click();
        nyPlante.lysforholdOgJordOgFuktighetsforhold.click();
        nyPlante.lysforholdOgJordOgFuktighetsforhold.click();
        nyPlante.lysforholdOgJordOgFuktighetsforhold.click();
        nyPlante.lysforholdOgJordOgFuktighetsforhold.click();
        nyPlante.lysforholdOgJordOgFuktighetsforhold.click();
        nyPlante.lysforholdOgJordOgFuktighetsforhold.click();
        nyPlante.lysforholdOgJordOgFuktighetsforhold.click();
        nyPlante.lysforholdOgJordOgFuktighetsforhold.click();
        nyPlante.lysforholdOgJordOgFuktighetsforhold.click();
    }

    @And("Skriv i Innland")
    public void skrivIInnland() {
        nyPlante.innland.sendKeys("3", Keys.TAB,"7");
    }

    @And("Skriv i Kyst")
    public void skrivIKyst() {
        nyPlante.kyst.sendKeys("2", Keys.TAB,"6");
    }

    @Then("Velg en fra pH")
    public void velgEnFraPH() {
        nyPlante.pH.click();
        nyPlante.pHValg.click();
        actions.click().perform();
    }

    @Then("Velg en fra Salttoleranse")
    public void velgEnFraSalttoleranse() {
        nyPlante.salttoleranse.click();
        nyPlante.salttoleranseValg.click();
        actions.click().perform();
        ReusableMethods.wait(1);
    }

    @Then("Vindtoleranse")
    public void vindtoleranse() {
        WebElement vindtoleranse = Driver.getDriver().findElement(By.xpath("(//select)[1]"));
        Select select= new Select(vindtoleranse);
        //List<WebElement> naturligList = select.getOptions();
        //select.selectByIndex(random.nextInt(naturligList.size()));
        select.selectByIndex(2);
        ReusableMethods.wait(1);
    }

    //Prydverdi
    @Given("Klikk Prydverdi")
    public void klikkPrydverdi() {
        nyPlante.prydverdi.click();
        ReusableMethods.wait(1);
    }

    @Then("Velg en fra Blomst en eller flere farger")
    public void velgEnFraBlomstEnEllerFlereFarger() {
        nyPlante.blomstEnEllerFlereFarger.click();
        nyPlante.blomstEnEllerFlereFargerValg.click();
        actions.click().perform();

       /*List<WebElement> options= Driver.getDriver().findElements(By.xpath("//*[@class='_option_2gb8b_78']"));
        WebElement valg= Driver.getDriver().findElement(By.xpath("(//*[@class='_option_2gb8b_78'])["+ random.nextInt(options.size())+ "]"));
        options.forEach(t-> System.out.println(t.getText()));
        actions.click(valg).perform();
        actions.click().perform();*/
    }

    @Then("Velg en fra Blomst farge")
    public void velgEnFraBlomstFarge() {
        nyPlante.blomstFarge.click();
        nyPlante.blomstFargeValg.click();
        actions.click().perform();
    }

    @Then("Velg en fra Blomst andre farger")
    public void velgEnFraBlomstAndreFarger() {
        nyPlante.blomstAndeFarger.click();
        nyPlante.blomstAndeFargerValg.click();
        actions.click().perform();
    }

    @Then("Velg en fra Blomst prydverdi")
    public void velgEnFraBlomstPrydverdi() {
        WebElement blomstPrydverdi = Driver.getDriver().findElement(By.xpath("(//select)[1]"));
        Select select= new Select(blomstPrydverdi);
        select.selectByIndex(2);
    }

    @Then("Velg en fra Fylt")
    public void velgEnFraFylt() {
        WebElement fylt = Driver.getDriver().findElement(By.xpath("(//select)[2]"));
        Select select= new Select(fylt);
        select.selectByIndex(2);
    }

    @And("Skriv i Blomstringstid")
    public void skrivIBlomstringstid() {
        nyPlante.blomstringstid.sendKeys("2", Keys.TAB,"6");
    }

    @And("Skriv i Remontering-Gjenblomstring")
    public void skrivIRemonteringGjenblomstring() {
        nyPlante.remontering.sendKeys("3", Keys.TAB, "7");
    }

    @And("Klikk Nei for Blomsterduft")
    public void klikkNeiForBlomsterduft() {
        nyPlante.velgNei.click();
    }

    @And("Klikk Nei for Duft blad og stenge")
    public void klikkNeiForDuftBladOgStenge() {
        nyPlante.velgNei.click();
    }

    @Then("Velg en fra Fruktfarge")
    public void velgEnFraFruktfarge() {
        WebElement fruktfarge = Driver.getDriver().findElement(By.xpath("(//select)[3]"));
        Select select= new Select(fruktfarge);
        select.selectByIndex(2);
    }

    @Then("Velg en fra Frukt tid")
    public void velgEnFraFruktTid() {
        nyPlante.fruktTid.click();
        nyPlante.fruktTidValg.click();
        actions.click().perform();
    }

    @Then("Velg en fra Bladfarge")
    public void velgEnFraBladfarge() {
        nyPlante.bladfarge.click();
        nyPlante.bladfargeValg.click();
        actions.click().perform();
    }

    @Then("Velg en fra Bladform")
    public void velgEnFraBladform() {
        nyPlante.bladform.click();
        nyPlante.bladformValg.click();
        actions.click().perform();
    }

    @Then("Velg en fra Bladstørrelse")
    public void velgEnFraBladstørrelse() {
        WebElement bladstørrelse = Driver.getDriver().findElement(By.xpath("(//select)[4]"));
        Select select= new Select(bladstørrelse);
        select.selectByIndex(2);
    }

    @Then("Velg en fra Høstfarger")
    public void velgEnFraHøstfarger() {
        nyPlante.hostfarger.click();
        nyPlante.hostfargerValg.click();
        actions.click().perform();
    }

    @Then("Velg en fra Vinterkarakter")
    public void velgEnFraVinterkarakter() {
        nyPlante.vinterkarakter.click();
        nyPlante.vinterkarakterValg.click();
        actions.click().perform();
    }

    @Then("Velg en fra Torner")
    public void velgEnFraTorner() {
        WebElement torner = Driver.getDriver().findElement(By.xpath("(//select)[5]"));
        Select select= new Select(torner);
        select.selectByIndex(2);
    }

    @Then("Velg en fra Stamme barkstruktur")
    public void velgEnFraStammeBarkstruktur() {
        nyPlante.stammeBarkstruktur.click();
        nyPlante.stammeBarkstrukturValg.click();
        actions.click().perform();
    }

    @Then("Velg en fra Stamme barkfarge")
    public void velgEnFraStammeBarkfarge() {
        nyPlante.stammeBarkfarge.click();
        nyPlante.stammeBarkfargeValg.click();
        actions.click().perform();
    }

    @Then("Velg en fra Skudd-greiner farge")
    public void velgEnFraSkuddGreinerFarge() {
        nyPlante.skuddGreinerFarge.click();
        nyPlante.skuddGreinerFargeValg.click();
        actions.click().perform();
    }


    //Bilder
    @Given("Klikk Bilde")
    public void klikkBilde() {
        nyPlante.bilder.click();
    }

    @Then("Klikk Legg Til")
    public void klikkLeggTil() {
        nyPlante.leggTilBilde.click();
    }

    @And("Velg type bilde")
    public void velgTypeBilde() {
        WebElement typeBilde = Driver.getDriver().findElement(By.xpath("(//select)[1]"));
        Select select= new Select(typeBilde);
        select.selectByIndex(1);
    }

    @And("Velg Fotograf")
    public void velgFotograf() {
        WebElement fotograf = Driver.getDriver().findElement(By.xpath("(//select)[2]"));
        Select select= new Select(fotograf);
        select.selectByIndex(2);
    }

    @And("Skriv i Fotokilde,Notis,Hvor er bilde tatt,Postnummer,Poststed")
    public void skrivIFotokildeNotisHvorErBildeTattPostnummerPoststed() {
        nyPlante.fotokilde.sendKeys("Fotokilde", Keys.TAB, "Notis", Keys.TAB,"Hvor er bilde tatt", Keys.TAB, "Hvor er bilde tatt", Keys.TAB, "Poststed");
    }

    @Then("Klikk Velg Bilde")
    public void klikkVelgBilde() {
        nyPlante.velgBilde.click();
        ReusableMethods.wait(1);
        String filbane = "C:\\Users\\SenaAlbahan\\Downloads\\eple.jpg";
        ReusableMethods.uploadFile(filbane);
        ReusableMethods.visibleWait(nyPlante.bildeBekreftelse, 30);
        //ReusableMethods.wait(6);
    }

    @Then("Klikk Lagre og Lukk")
    public void klikkLagreOgLukk() {
        nyPlante.lagreOgLukk.click();
    }


    //Tilleggsinformasjon

    @Given("Klikk Tilleggsinformasjon")
    public void klikkTilleggsinformasjon() {
        nyPlante.tilleggsinformasjon.click();
    }

    @Then("Skriv i Tilleggsopplysninger")
    public void skrivITilleggsopplysninger() {
        nyPlante.tilleggsopplysninger.sendKeys(faker.harryPotter().quote());
    }

    @And("Skriv i Kommentar")
    public void skrivIKommentar() {
        nyPlante.kommentar.sendKeys(faker.harryPotter().quote());
    }

    @And("Skriv i Forskeres erfaring med planten")
    public void skrivIForskeresErfaringMedPlanten() {
        nyPlante.forskeresErfaringMedPlanten.sendKeys(faker.harryPotter().quote());
    }

    //Forskning
    @Given("Klikk Forskning")
    public void klikkForskning() {
        nyPlante.forskning.click();
    }

    @Given("Klikk Legg til forskningsresultat")
    public void klikkLeggTilForskningsresultat() {
        nyPlante.leggTilForskningsresultat.click();
    }

    @Then("Skriv i Forfattere, Ar, Tittel, Utgiver, Fra, Til, ISBN, Tilgjengelig fra nett og Hentet dato")
    public void skrivIForfattereArTittelUtgiverFraTilISBNTilgjengeligFraNettOgHentetDato() {
        nyPlante.forfattere.sendKeys("Forfattere",Keys.TAB,"2024",Keys.TAB,"Tittel",Keys.TAB,"Utgiver",Keys.TAB,"1",Keys.TAB,"2",Keys.TAB,"ISBN0000",Keys.TAB,"https://www.example.com/file.pdf",Keys.TAB,"12122024");
    }

    //Slett plante
    @Then("Slett Plante")
    public void slettPlante() {
        ReusableMethods.wait(15);
        nyPlante.slettPlante.click();
      ReusableMethods.wait(1);
        nyPlante.slettPlanteJA.click();
    }

    @And("Lukk siden")
    public void lukkSiden() {
        ReusableMethods.wait(1);
        Driver.closeDriver();
    }

}
