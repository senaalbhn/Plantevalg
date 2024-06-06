package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BekreftPage {
    public BekreftPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    //Navn og opprinnelse
    @FindBy (css = "div[title*='Opphav']")
    public WebElement opphav;
    @FindBy (css = "div[title*='Viltvoksende']")
    public WebElement viltvoksende;
    @FindBy (css = "div[title*='Produsert ']")
    public WebElement produsert ;
    @FindBy (css = "div[title*='Synonymer ']")
    public WebElement synonym ;
    @FindBy (css = "div[title*='Engelsk navn:']")
    public WebElement andresprk ;
    @FindBy (css = "div[title*='E-plante']")
    public WebElement ePlante;
    //Egenskaper
    @FindBy (css = "div[title*='Plantegruppe']")
    public WebElement plantegruppe;
    @FindBy (css = "div[title*='Undergruppe']")
    public WebElement undergruppe;
    @FindBy (css = "div[title*='Pollinator']")
    public WebElement pollinator;
    @FindBy (css = "div[title*='Spiselig']")
    public WebElement spiselig;
    @FindBy (css = "div[title*='Allergi']")
    public WebElement allergi;
    @FindBy (css = "div[title*='Restriksjoner']")
    public WebElement restriksjoner ;
    @FindBy (css = "div[title*='Vegetativ']")
    public WebElement vegetativ;
    @FindBy (css = "div[title*='Frø']")
    public WebElement fro;
    @FindBy (css = "div[title*='Naturlig']")
    public WebElement naturlig;
    //Størrelse og form
    @FindBy (css = "div[title*='Høyde']")
    public WebElement hoyde;
    @FindBy (css = "div[title*='Bredde']")
    public WebElement bredde;
    @FindBy (css = "div[title*='Form']")
    public WebElement form;
    @FindBy (css = "div[title*='Rottype']")
    public WebElement rottype;
    //Bruksområde
    @FindBy (css = "div[title*='Bruksområde:']")
    public WebElement bruksomrode;
    @FindBy (css = "div[title*='Solitær:']")
    public WebElement solitaer;
    @FindBy (css = "div[title*='Klippet hekk:']")
    public WebElement klippet;
    @FindBy (css = "div[title*='Dekkevne']")
    public WebElement dekkevne;
    @FindBy (css = "div[title*='Beskjæringsbehov']")
    public WebElement beskjaeringsbehov;
    //Plassering
    @FindBy (css = "div[title*='Lysforhold']")
    public WebElement lysforhold;
    @FindBy (css = "div[title*='Jord']")
    public WebElement jord;
    @FindBy (css = "div[title*='Fuktighetsforhold']")
    public WebElement fuktighetsforhold;
    @FindBy (css = "div[title*='Hardførhet innland']")
    public WebElement hardforhetinnland;
    @FindBy (css = "div[title*='Hardførhet kyst']")
    public WebElement hardforhetKyst;
    @FindBy (css = "div[title*='pH']")
    public WebElement pH;
    @FindBy (css = "div[title*='Salttoleranse']")
    public WebElement salttoleranse;
    @FindBy (css = "div[title*='Vindtoleranse']")
    public WebElement vindtoleranse;
    //Prydverdi
    @FindBy (css = "div[title*='Blomstringstid']")
    public WebElement blomstringstid;
    @FindBy (css = "div[title*='Remontering']")
    public WebElement remontering;
    @FindBy (xpath = "(//div[starts-with(@title,'Blomst')])[2]")
    public WebElement blomst;
    @FindBy (css = "div[title*='Blomst farge']")
    public WebElement blomstFarge;
    @FindBy (css = "div[title*='Blomst andre']")
    public WebElement blomstAndreFarger;
    @FindBy (css = "div[title*='Blomst prydverdi']")
    public WebElement blomstPrydverdi;
    @FindBy (css = "div[title*='Fylt:']")
    public WebElement fylt;
    @FindBy (css = "div[title*='Duft blad']")
    public WebElement duftBlad;
    @FindBy (xpath = "(//div[starts-with(@title,'Duft')])[1]")
    public WebElement duft;
    @FindBy (css = "div[title*='Fruktfarge']")
    public WebElement fruktfarge;
    @FindBy (css = "div[title*='Frukt tid']")
    public WebElement fruktTid;
    @FindBy (css = "div[title*='Bladfarge']")
    public WebElement bladfarge;
    @FindBy (css = "div[title*='Bladform']")
    public WebElement bladform;
    @FindBy (css = "div[title*='Bladstørrelse']")
    public WebElement bladstorrelse;
    @FindBy (css = "div[title*='Høstfarger']")
    public WebElement hostfarger;
    @FindBy (css = "div[title*='Vinter-karakter']")
    public WebElement vinterKarakter;
    @FindBy (css = "div[title*='Torner']")
    public WebElement torner;
    @FindBy (css = "div[title*='Stamme barkstruktur']")
    public WebElement stammeBarkstruktur;
    @FindBy (css = "div[title*='Stamme barkfarge']")
    public WebElement stammeBarkfarge;
    @FindBy (css = "div[title*='Skudd']")
    public WebElement skudd;

    //Tilleggsinformasjon
    @FindBy (css = "div[title*='Tilleggsopplysninger']")
    public WebElement tilleggsopplysninger;

    //Forskning
    @FindBy (xpath = "//b[text()='Forskeres erfaring med planten']//following-sibling::div")
    public WebElement forskeres;








}
