package stepDefinitions.UiStepDef;

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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HjemmesidePage;

import pages.NyPlantePage;
import pages.PlanteSidePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.PlantevalgMethods;
import utilities.ReusableMethods;
import org.testng.asserts.SoftAssert;

import javax.swing.*;
import java.awt.*;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class NyPlanteStepdefs {
    SoftAssert softAssert = new SoftAssert();
    HjemmesidePage hjemmeside = new HjemmesidePage();
    ReusableMethods reusableMethods = new ReusableMethods();
    NyPlantePage nyPlante = new NyPlantePage();
    Random random = new Random();
    List<WebElement> sprokList;
    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();
    String fakeSlekt;


    @Given("Go til Plantevalg-siden")
    public void go_til_plantevalg_siden() {
        Driver.getDriver().get(ConfigReader.getProperty("Url"));
    }

    @Then("Skriv i epost og passord, klikk Logg inn")
    public void skrivIEpostOgPassordKlikkLoggInn() {
        hjemmeside.epost.sendKeys(ConfigReader.getProperty("email"), Keys.TAB, ConfigReader.getProperty("password"), Keys.TAB, Keys.TAB, Keys.ENTER);

    }

    @Then("Klikk Ny Plnate")
    public void klikkNyPlnate() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(nyPlante.nyPlante));
        nyPlante.nyPlante.click();
    }
    //Botonisk Navn

    @And("Fyll ut Slekt, Artsepitet, Kultivar, Frøkilde, Underart, Varietet, Form, Varemerke")
    public void fyllUtSlektArtsepitetKultivarFrøkildeUnderartVarietetFormVaremerke() {
        fakeSlekt = faker.food().fruit();
        nyPlante.slekt.sendKeys("Avocadoo", Keys.TAB, "Artsepitet", Keys.TAB, "Kultivar", Keys.TAB, "Frøkilde", Keys.TAB, "Underart", Keys.TAB, "Varietet", Keys.TAB, "Form ", Keys.TAB, "Varemerke ");
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
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(nyPlante.neste));
        ReusableMethods.wait(1);
        nyPlante.neste.click();
    }

    @Then("Klikk Legg til under Opphav")
    public void klikkLeggTilUnderOpphav() {
        ReusableMethods.wait(1);
        nyPlante.leggTilOpphav.click();
    }

    @And("Fyll ut Slekt, Artsepitet for Primaer opprinnelse")
    public void fyllUtSlektArtsepitetForPrimaerOpprinnelse() {
        nyPlante.slektPrimaerOpprinnelse.sendKeys("SlektPrimaer", Keys.TAB, "ArtsepitetPrimaer");
    }

    @And("Fyll ut Slekt, Artsepitet for Sekundaer opprinnelse")
    public void fyllUtSlektArtsepitetForSekundaerOpprinnelse() {
        nyPlante.slektSekundaerOpprinnelse.sendKeys("SlektSekundaer", Keys.TAB, "ArtsepitetSekundear");
    }

    @And("Klikk Lagre")
    public void klikkLagre() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(nyPlante.lagreButton));
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
        ReusableMethods.click(nyPlante.slektSynonym);
        ReusableMethods.wait(1);
        ReusableMethods.sendKeysJS(nyPlante.slektSynonym, "SlektSynonym");
        ReusableMethods.click(Driver.getDriver().findElement(By.cssSelector("label[title='Artsepitet']+div input")));
        Driver.getDriver().findElement(By.cssSelector("label[title='Artsepitet']+div input")).sendKeys("ArtsepitetSynonym",Keys.TAB,"k",Keys.TAB,"f",Keys.TAB,"u",Keys.TAB,"v",Keys.TAB,"f",Keys.TAB,"v");
        ReusableMethods.wait(1);
        actions.sendKeys(nyPlante.slektSynonym,"SlektSynonym").perform();
    }

    @Then("Klikk Legg til under Andre sprok")
    public void klikkLeggTilUnderAndreSprok() {
        ReusableMethods.wait(1);
        nyPlante.leggTilSprok.click();
    }

    @And("Velg Engelsk som sprok")
    public void velgEngelskSomSprok() {
        ReusableMethods.wait(1);
        ReusableMethods.ddmIndex(Driver.getDriver().findElement(By.xpath("(//select)[1]")), 4);
       // WebElement sprok = Driver.getDriver().findElement(By.xpath("(//select)[1]"));
       // Select select = new Select(sprok);
      //  select.selectByIndex(4);
    }

    @And("Skriv i {string}")
    public void skrivINavn(String str) {
        ReusableMethods.wait(1);
        ReusableMethods.click(nyPlante.navn);
        ReusableMethods.wait(1);
        ReusableMethods.sendKeysJS(nyPlante.navn,str);
        ReusableMethods.wait(1);
        ReusableMethods.ddmIndex(Driver.getDriver().findElement(By.xpath("(//select)[1]")), 4);
        ReusableMethods.sendKeysJS(nyPlante.navn,str);
    }

    @Then("Klikk {string} for E-plante")
    public void klikkForEPlante(String str) {
        ReusableMethods.wait(2);
        nyPlante.ePlante.click();
    }

    //Egenskaper
    @Given("Klikk Egenskaper")
    public void klikkEgenskaper() {
        nyPlante.egenskaper.click();
        ReusableMethods.wait(1);
    }

    @And("Velg Traer")
    public void velgTraer() {
        nyPlante.plantegruppeTraer.click();
        ReusableMethods.visibleWait(nyPlante.plantegruppeTraerBekreft,10);
    }

    @And("Velg Alltidgronn")
    public void velgAlltidgronn() {
        nyPlante.plantegruppeAlltidgronn.click();
        ReusableMethods.visibleWait(nyPlante.plantegruppeAlltidgronnBekreft,10);
    }
    @And("Kontrol")
    public void kontrol() {


    }

    @Then("Velg {string} fra Pollinator-vennlig")
    public void velgEnFraPollinatorVennlig(String str) {
        ReusableMethods.wait(1);
        WebElement pollinatorVennlig = Driver.getDriver().findElement(By.cssSelector("label[title='Pollinator-vennlig']+div>select"));
        ReusableMethods.ddmVisibleText(pollinatorVennlig, str);
    }

    @Then("Velg {string} fra Matnyttig")
    public void velgFraMatnyttig(String str) {
        WebElement matnyttig = Driver.getDriver().findElement(By.cssSelector("label[title='Matnyttig']+div>select"));
        ReusableMethods.ddmVisibleText(matnyttig, str);
    }

    @Then("Velg {string} fra Allergi")
    public void velgFraAllergi(String str) {
        WebElement allergi = Driver.getDriver().findElement(By.cssSelector("label[title='Allergi']+div>select"));
        ReusableMethods.ddmVisibleText(allergi, str);
    }

    @Then("Velg {string} fra Naturlig levealder")
    public void velgFraNaturligLevealder(String str) {
        WebElement naturlig = Driver.getDriver().findElement(By.cssSelector("label[title='Naturlig levealder']+div>select"));
        ReusableMethods.ddmVisibleText(naturlig, str);
    }


    @Then("Velg {string} alternativ fra Restriksjoner og vern")
    public void velgAlternativFraRestriksjonerOgVern(String str) {
        PlantevalgMethods.velgEnMultiSelect(nyPlante.restriksjonerOgVern, str);
    }

    @Then("Klikk {string} for Vegetativ")
    public void klikkForVegetativ(String str) {
        nyPlante.vegetativ.click();
    }

    @Then("Klikk {string} for Fro")
    public void klikkNeiForFro(String str) {
        ReusableMethods.wait(1);
        nyPlante.fro.click();
    }

    //Størrelse og form
    @Given("Klikk Storrelse og form")
    public void klikkStorrelseOgForm() {
        nyPlante.storrelseOgForm.click();
        ReusableMethods.wait(1);
    }



    @And("Velg hoyde mellom {string} - {string}")
    public void velgHoydeMellom(String str, String str2) {
        ReusableMethods.wait(1);
        nyPlante.hoyde.sendKeys( str,Keys.TAB, str2, Keys.TAB);

    }


    @And("Velg {string} fra bredde")
    public void velgFraBredde(String str) {
        WebElement bredde = Driver.getDriver().findElement(By.xpath("(//select)[1]"));
        ReusableMethods.ddmVisibleText(bredde, str);
        //Select select= new Select(bredde);
        //List<WebElement> naturligList = select.getOptions();
        //select.selectByIndex(random.nextInt(naturligList.size()));
        //select.selectByIndex(2);
        //ReusableMethods.wait(1);

    }

    @Then("Velg {string} fra form")
    public void velgFraForm(String str) {
        WebElement form = Driver.getDriver().findElement(By.xpath("(//select)[2]"));
        ReusableMethods.ddmVisibleText(form, str);
        //Select select= new Select(form);
        //List<WebElement> naturligList = select.getOptions();
        //select.selectByIndex(random.nextInt(naturligList.size()));
        //select.selectByIndex(2);
        //ReusableMethods.wait(1);
    }

    @Then("Velg {string} fra rottype")
    public void velgFraRottype(String str) {
        WebElement rottype = Driver.getDriver().findElement(By.xpath("(//select)[3]"));
        ReusableMethods.ddmVisibleText(rottype, str);
        //Select select= new Select(rottype);
        //List<WebElement> naturligList = select.getOptions();
        //select.selectByIndex(random.nextInt(naturligList.size()));
        //select.selectByIndex(2);
        //ReusableMethods.wait(1);
    }


    //Bruksområde
    @Given("Klikk Bruksomrode")
    public void klikkBruksomrode() {
        nyPlante.bruksomrode.click();
    }

    @And("Klikk {string} Gruppe,Alle-trerekke,Fri hekk, Klippet hekk, Markdekkende, Slyng-klatreplante og Solitaer")
    public void klikkGruppeAlleTrerekkeFriHekkKlippetHekkMarkdekkendeSlyngKlatreplanteOgSolitaer(String str) {
        PlantevalgMethods.klikkJaEllerNei(str);
        PlantevalgMethods.klikkJaEllerNei(str);
        PlantevalgMethods.klikkJaEllerNei(str);
        PlantevalgMethods.klikkJaEllerNei(str);
        ReusableMethods.wait(1);
        PlantevalgMethods.klikkJaEllerNei(str);
        PlantevalgMethods.klikkJaEllerNei(str);
        PlantevalgMethods.klikkJaEllerNei(str);
    }


    @And("Skriv i {string} - {string} tregruppe")
    public void skrivITregruppe(String str, String str2) {
        nyPlante.tregruppe.sendKeys(str, Keys.TAB, str2);
    }

    @And("Skriv i {string} - {string} Busk gruppe")
    public void skrivIBuskGruppe(String str, String str2) {
        nyPlante.buskGruppe.sendKeys(str, Keys.TAB, str2);
    }


    @And("Skriv i {string} - {string} Solitaer")
    public void skrivISolitaer(String str, String str2) {
        nyPlante.solitaer.sendKeys(str, Keys.TAB, str2);
        ReusableMethods.wait(1);

    }

    @And("Skriv i {string} - {string} Klippet hekk")
    public void skrivIKlippetHekk(String str, String str2) {
        nyPlante.klippetHekk.sendKeys(str, Keys.TAB, str2, Keys.TAB);
        ReusableMethods.wait(1);
    }

    @Then("Velg {string} fra Dekkevne")
    public void velgFraDekkevne(String str) {
        WebElement dekkevne = Driver.getDriver().findElement(By.xpath("(//select)[1]"));
        ReusableMethods.ddmVisibleText(dekkevne, str);
    }

    @Then("Velg {string} fra Beskjaeringsbehov")
    public void velgFraBeskjaeringsbehov(String str) {
        WebElement beskjaeringsbehov = Driver.getDriver().findElement(By.xpath("(//select)[2]"));
        ReusableMethods.ddmVisibleText(beskjaeringsbehov, str);
        //Select select= new Select(beskjaeringsbehov);
        //List<WebElement> naturligList = select.getOptions();
        //select.selectByIndex(random.nextInt(naturligList.size()));
        //select.selectByIndex(2);
        //ReusableMethods.wait(1);
    }

    //Plassering
    @Given("Klikk Plassering")
    public void klikkPlassering() {
        nyPlante.plassering.click();
    }

    @And("Klikk {string} Lysforhold, Jord og Fuktighetsforhold")
    public void klikkLysforholdJordOgFuktighetsforhold(String str) {
        PlantevalgMethods.klikkJaEllerNei(str);
        PlantevalgMethods.klikkJaEllerNei(str);
        PlantevalgMethods.klikkJaEllerNei(str);
        PlantevalgMethods.klikkJaEllerNei(str);
        PlantevalgMethods.klikkJaEllerNei(str);
        PlantevalgMethods.klikkJaEllerNei(str);
        PlantevalgMethods.klikkJaEllerNei(str);
        PlantevalgMethods.klikkJaEllerNei(str);
        PlantevalgMethods.klikkJaEllerNei(str);
        ReusableMethods.wait(1);
        PlantevalgMethods.klikkJaEllerNei(str);
        PlantevalgMethods.klikkJaEllerNei(str);
    }


    @And("Skriv i {string} - {string} Innland")
    public void skrivIInnland(String str, String str2) {
        nyPlante.innland.sendKeys(str, Keys.TAB, str2);
    }

    @And("Skriv i {string} - {string} Kyst")
    public void skrivIKyst(String str, String str2) {
        nyPlante.kyst.sendKeys(Keys.TAB, str2);
        nyPlante.kyst.sendKeys(str);
    }

    @Then("Velg {string} alternativ fra pH")
    public void velgAlternativFraPH(String str) {
        PlantevalgMethods.velgEnMultiSelect(nyPlante.pH, str);
    }

    @Then("Velg {string} alternativ fra Salttoleranse")
    public void velgAlternativFraSalttoleranse(String str) {
        PlantevalgMethods.velgEnMultiSelect(nyPlante.salttoleranse, str);
    }

    @Then("Velg {string} fra Vindtoleranse")
    public void velgFraVindtoleranse(String str) {
        WebElement vindtoleranse = Driver.getDriver().findElement(By.xpath("(//select)[1]"));
        ReusableMethods.ddmVisibleText(vindtoleranse, str);
    }


    //Prydverdi
    @Given("Klikk Prydverdi")
    public void klikkPrydverdi() {
        nyPlante.prydverdi.click();
        ReusableMethods.wait(1);
    }

    @Then("Velg {string} fra Blomst en eller flere farger")
    public void velgFraBlomstEnEllerFlereFarger(String str) {
        PlantevalgMethods.velgEnMultiSelect(nyPlante.blomstEnEllerFlereFarger, str);
    }

    @Then("Velg {string} fra Blomst farge")
    public void velgFraBlomstFarge(String str) {
        PlantevalgMethods.velgEnMultiSelect(nyPlante.blomstFarge, str);
    }

    @Then("Velg {string} fra Blomst andre farger")
    public void velgFraBlomstAndreFarger(String str) {
        PlantevalgMethods.velgEnMultiSelect(nyPlante.blomstAndeFarger, str);
    }

    @Then("Velg {string} fra Blomst prydverdi")
    public void velgFraBlomstPrydverdi(String str) {
        WebElement blomstPrydverdi = Driver.getDriver().findElement(By.xpath("(//select)[1]"));
        ReusableMethods.ddmVisibleText(blomstPrydverdi, str);
    }

    @Then("Velg {string} fra Fylt")
    public void velgFraFylt(String str) {
        WebElement fylt = Driver.getDriver().findElement(By.xpath("(//select)[2]"));
        ReusableMethods.ddmVisibleText(fylt, str);
    }

    @And("Skriv {string} - {string} i Blomstringstid")
    public void skrivIBlomstringstid(String str1, String str2) {
        nyPlante.blomstringstid.sendKeys(str1, Keys.TAB, str2);
    }

    @And("Skriv {string} - {string} i Remontering-Gjenblomstring")
    public void skrivIRemonteringGjenblomstring(String str1, String str2) {
        nyPlante.remontering.sendKeys(str1, Keys.TAB, str2);
    }

    @And("Klikk {string} for Blomsterduft")
    public void klikkForBlomsterduft(String str) {
        nyPlante.blomsterduft.click();
    }

    @And("Klikk {string} for Duft blad og stenge")
    public void klikkForDuftBladOgStenge(String str) {
        nyPlante.duftBladStengel.click();
    }


    @Then("Velg {string} fra Fruktfarge")
    public void velgFraFruktfarge(String str) {
        WebElement fruktfarge = Driver.getDriver().findElement(By.xpath("(//select)[3]"));
        ReusableMethods.ddmVisibleText(fruktfarge, str);
        ReusableMethods.wait(1);

    }

    @Then("Velg {string} fra Frukt tid")
    public void velgFraFruktTid(String str) {
        PlantevalgMethods.velgEnMultiSelect(nyPlante.fruktTid, str);
        ReusableMethods.wait(1);
    }

    @Then("Velg {string} fra Bladfarge")
    public void velgFraBladfarge(String str) {
        PlantevalgMethods.velgEnMultiSelect(nyPlante.bladfarge, str);
        ReusableMethods.wait(1);
    }

    @Then("Velg {string} fra Bladform")
    public void velgFraBladform(String str) {
        PlantevalgMethods.velgEnMultiSelect(nyPlante.bladform, str);
        ReusableMethods.wait(1);
    }

    @Then("Velg {string} fra Bladstorrelse")
    public void velgFraBladstorrelse(String str) {
        WebElement bladstorrelse = Driver.getDriver().findElement(By.xpath("(//select)[4]"));
        ReusableMethods.ddmVisibleText(bladstorrelse, str);
    }

    @Then("Velg {string} fra Hostfarger")
    public void velgFraHostfarger(String str) {
        PlantevalgMethods.velgEnMultiSelect(nyPlante.hostfarger, str);
    }

    @Then("Velg {string} fra Vinterkarakter")
    public void velgFraVinterkarakter(String str) {
        PlantevalgMethods.velgEnMultiSelect(nyPlante.vinterkarakter, str);

    }

    @Then("Velg {string} fra Torner")
    public void velgFraTorner(String str) {
        WebElement torner = Driver.getDriver().findElement(By.xpath("(//select)[5]"));
        ReusableMethods.ddmVisibleText(torner, str);

    }

    @Then("Velg {string} fra Stamme barkstruktur")
    public void velgFraStammeBarkstruktur(String str) {
        PlantevalgMethods.velgEnMultiSelect(nyPlante.stammeBarkstruktur, str);
    }

    @Then("Velg {string} fra Stamme barkfarge")
    public void velgFraStammeBarkfarge(String str) {
        PlantevalgMethods.velgEnMultiSelect(nyPlante.stammeBarkfarge, str);

    }

    @Then("Velg {string} fra Skudd-greiner farge")
    public void velgFraSkuddGreinerFarge(String str) {
        PlantevalgMethods.velgEnMultiSelect(nyPlante.skuddGreinerFarge, str);
        ReusableMethods.wait(2);
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

    @And("Velg {string} type bilde")
    public void velgTypeBilde(String str) {
        WebElement typeBilde = Driver.getDriver().findElement(By.xpath("(//select)[1]"));
        ReusableMethods.ddmVisibleText(typeBilde, str);

    }

    @And("Velg {string} Fotograf")
    public void velgFotograf(String str) {
        WebElement fotograf = Driver.getDriver().findElement(By.xpath("(//select)[2]"));
        ReusableMethods.ddmVisibleText(fotograf, str);

    }

    @And("Skriv {string} i Fotokilde, {string} i Notis,{string} i Hvor er bilde tatt,{string} i Postnummer,{string} i Poststed")
    public void skrivIFotokildeINotisIHvorErBildeTattIPostnummerIPoststed(String str0, String str1, String str2, String str3, String str4) {
        nyPlante.fotokilde.sendKeys(str0, Keys.TAB, str1, Keys.TAB, str2, Keys.TAB, str3, Keys.TAB, str4);
    }

    @Then("Klikk Velg Bilde {string}")
    public void klikkVelgBilde(String str) {
        nyPlante.velgBilde.click();
        ReusableMethods.wait(1);
        String filbane = "C:\\Users\\SenaAlbahan\\Downloads\\" + str + ".jpg";
        ReusableMethods.uploadFile(filbane);
        ReusableMethods.visibleWait(nyPlante.bildeBekreftelse, 30);
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
        nyPlante.tilleggsopplysninger.sendKeys("Tilleggsopplysninger");
        ReusableMethods.wait(1);

    }

    @And("Skriv i Kommentar")
    public void skrivIKommentar() {
        nyPlante.kommentar.sendKeys("Kommentar");
        ReusableMethods.wait(1);

    }

    @And("Skriv i Forskeres erfaring med planten")
    public void skrivIForskeresErfaringMedPlanten() {
        nyPlante.forskeresErfaringMedPlanten.sendKeys("Forskeres erfaring med planten");
        ReusableMethods.wait(2);
    }

    //Forskning
    @Given("Klikk Forskning")
    public void klikkForskning() {
        nyPlante.forskning.click();
    }

    @Given("Klikk Legg til forskningsresultat")
    public void klikkLeggTilForskningsresultat() {
        ReusableMethods.wait(1);
        ReusableMethods.scrollEnd();
        nyPlante.leggTilForskningsresultat.click();
    }

    @Then("Skriv {string} i Forfattere,{string} i Ar, {string} i Tittel, {string} i Utgiver, {string} i Fra, {string} i Til, {string} ISBN, {string} i Tilgjengelig fra nett og Hentet dato")
    public void skrivIForfattereIArITittelIUtgiverIFraITilISBNITilgjengeligFraNettOgHentetDato(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7) {
        ReusableMethods.wait(2);
        nyPlante.forfattere.sendKeys(arg0, Keys.TAB, arg1, Keys.TAB, arg2, Keys.TAB, arg3, Keys.TAB, arg4, Keys.TAB, arg5, Keys.TAB, arg6, Keys.TAB, arg7);
        LocalDate myCurrentDate = LocalDate.now();
        String yearValue = String.valueOf(myCurrentDate.getYear());
        String montValue = String.valueOf(myCurrentDate.getMonthValue());
        String dayValue = String.valueOf(myCurrentDate.getDayOfMonth());
        actions.click(nyPlante.dato).sendKeys(yearValue,Keys.ARROW_LEFT,montValue,Keys.ARROW_LEFT,Keys.ARROW_LEFT,dayValue).perform();
        ReusableMethods.wait(1);
    }

    //Slett plante
    @Then("Slett Plante")
    public void slettPlante() {
        nyPlante.slettPlante.click();
        ReusableMethods.wait(1);
        nyPlante.slettPlanteJA.click();
    }

    @And("Lukk siden")
    public void lukkSiden() {
        ReusableMethods.wait(1);
        Driver.closeDriver();
    }


    @Given("Vente {int} sekunder")
    public void venteSekunder(int skn) {
        ReusableMethods.wait(skn);
    }


    @And("Bekreft navn finnes")
    public void bekreftNavnFinnes() {
        ReusableMethods.wait(1);
        Driver.getDriver().findElement(By.cssSelector("label[title='Engelsk navn']+div input")).sendKeys("English Name");
    }
}
