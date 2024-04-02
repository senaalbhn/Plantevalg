package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class NyPlantePage {

    public NyPlantePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[contains(text(),'Ny plante')]")
    public WebElement nyPlante;

    //Botonisk Navn
    @FindBy(xpath = "(//*[@placeholder='Fritekst'])[1]")
    public WebElement slekt;
    @FindBy(css = "label[title='Artsepitet']+div input")
    public WebElement artsepitet;
    @FindBy(xpath = "//*[@class='_circle_16oj8_28']")
    public WebElement varemerkeButton;
    @FindBy(xpath = "//*[text()='Hybrid mellom arter (x)']")
    public WebElement hybridMellomArter;
    @FindBy(xpath = "//*[text()='Hybrid mellom slekter (X)']")
    public WebElement hybridMellomSlekter;
    @FindBy(xpath = "//button[@title='Lagre og fortsett']")
    public WebElement lagreOgFortsette;
    @FindBy(xpath = "//button[@title='Neste']")
    public WebElement neste;

    //Navn og opprinnelse
    @FindBy(css = "a[title^='Navn']")
    public WebElement navnOgOpprinnelse;
    @FindBy(xpath = "//div[@class='_origins_1692g_1']//parent::button")
    public WebElement leggTilOpphav;
    @FindBy(xpath = "(//label[@title='Slekt']//following-sibling::div//input)[1]")
    public WebElement slektPrimaerOpprinnelse;
    @FindBy(xpath = "(//label[@title='Slekt']//following-sibling::div//input)[2]")
    public WebElement slektSekundaerOpprinnelse;
    @FindBy(xpath = "//button[@title='Lagre']")
    public WebElement lagreButton;
    @FindBy(xpath = "//div[@title='Viltvoksende i Norge']//following-sibling::a")
    public WebElement viltvoksendeINorge;
    @FindBy(xpath = "//div[@title='Produsert i Norge']//following-sibling::a")
    public WebElement produsertINorge;
    @FindBy(css = "div[class^='_synonyms'] button")
    public WebElement leggTilSynonymer;
    @FindBy(css = "label[title='Slekt']+._inputWrapper_ce2pu_79>input")
    public WebElement slektSynonym;
    @FindBy(css = "div[class^='_plantS'] button")
    public WebElement leggTilSprok;
    @FindBy(xpath = "//select")
    public WebElement sprok;
    @FindBy(css = "label[title='Navn']+div>input")
    public WebElement navn;
    @FindBy(xpath = "//div[@class='_ePlant_1692g_72']//descendant::a")
    public WebElement ePlante;

    //Egenskaper
    @FindBy(css = "a[title^='Ege']")
    public WebElement egenskaper;
    @FindBy(css = "div[title^='Tr']")
    public WebElement plantegruppeTraer;
    @FindBy(css = "div[title^='All']")
    public WebElement plantegruppeAlltidgronn;
    @FindBy(xpath = "//div[(@class='_plantGroupCard_1i63u_1 _selected_1i63u_39')and(@title='Trær')]")
    public WebElement plantegruppeTraerBekreft;
    @FindBy(xpath = "//div[(@class='_plantGroupCard_1i63u_1 _selected_1i63u_39')and(@title='Alltidgrønn')]")
    public WebElement plantegruppeAlltidgronnBekreft;
    @FindBy(xpath = "//div[(@class='_plantGroupCard_1i63u_1 _selected_1i63u_39')and(@title='Løvfellende')]")
    public WebElement plantegruppeLovfellendeBekreft;

    @FindBy(xpath = "//*[@class='_input_2gb8b_44']")
    public WebElement restriksjonerOgVern;
    @FindBy(xpath = "(//*[@class='_option_2gb8b_78'])[1]")
    public WebElement restriksjonerOgVernValg;
    @FindBy(xpath = "//div[@title='Vegetativ']//following-sibling::a")
    public WebElement vegetativ;
    @FindBy(xpath = "//div[@title='Frø']//following-sibling::a")
    public WebElement fro;

    //Størrelse og form
    @FindBy(css = "a[title^='St']")
    public WebElement storrelseOgForm;
    @FindBy(xpath = "(//input[@type='text'])[1]")
    public WebElement hoyde;

    //Bruksområde
    @FindBy(css = "a[title^='Br']")
    public WebElement bruksomrode;
    @FindBy(xpath = "//div[@title='Gruppe']//following-sibling::a")
    public WebElement bruksomrodeValg;
    @FindBy(xpath = "(//input[@type='text'])[1]")
    public WebElement tregruppe;
    @FindBy(xpath = "(//input[@type='text'])[3]")
    public WebElement buskGruppe;
    @FindBy(xpath = "(//input[@type='text'])[5]")
    public WebElement solitaer;
    @FindBy(xpath ="(//input[@type='text'])[7]")
    public WebElement klippetHekk;

    //Plassering
    @FindBy(css = "a[title^='Pla']")
    public WebElement plassering;
    @FindBy(xpath = "(//a[@title='Nei'])[1]")
    public WebElement lysforholdOgJordOgFuktighetsforhold;
    @FindBy(xpath = "(//input[@type='text'])[1]")
    public WebElement innland;
    @FindBy(xpath = "(//input[@type='text'])[3]")
    public WebElement kyst;
    @FindBy(xpath = "(//*[@class='_input_2gb8b_44'])[1]")
    public WebElement pH;
    @FindBy(xpath = "(//*[@class='_option_2gb8b_78'])[1]")
    public WebElement pHValg;
    @FindBy(xpath = "(//*[@class='_input_2gb8b_44'])[2]")
    public WebElement salttoleranse;
    @FindBy(xpath = "(//*[@class='_option_2gb8b_78'])[1]")
    public WebElement salttoleranseValg;

    //Prydverdi
    @FindBy(css = "a[title^='Pr']")
    public WebElement prydverdi;
    @FindBy(xpath = "//span[.='Blomst en eller flere farger']//parent::label//parent::div//child::div[@class='_input_2gb8b_44']")
    public WebElement blomstEnEllerFlereFarger;
    @FindBy(xpath = "(//*[@class='_option_2gb8b_78'])[2]")
    public WebElement blomstEnEllerFlereFargerValg;
    @FindBy(xpath = "//span[text()='Blomst farge']//parent::label//parent::div//child::div[@class='_input_2gb8b_44']")
    public WebElement blomstFarge;
    //@FindBy(xpath = "(//*[@class='_input_2gb8b_44'])[2]")
    //public WebElement blomstFarge;
    @FindBy(xpath = "(//*[@class='_option_2gb8b_78'])[2]")
    public WebElement blomstFargeValg;
    @FindBy(xpath = "//span[text()='Blomst andre farger']//parent::label//parent::div//child::div[@class='_input_2gb8b_44']")
    public WebElement blomstAndeFarger;
    @FindBy(xpath = "(//*[@class='_option_2gb8b_78'])[2]")
    public WebElement blomstAndeFargerValg;
    @FindBy(xpath = "(//input[@type='text'])[1]")
    public WebElement blomstringstid;
    @FindBy(xpath = "(//input[@type='text'])[3]")
    public WebElement remontering;
    @FindBy(xpath = "(//a[@title='Nei'])[1]")
    public WebElement velgNei;
    @FindBy(xpath = "//div[@title='Blomsterduft']//following-sibling::a")
    public WebElement blomsterduft;
    @FindBy(xpath = "//div[@title='Duft blad og stengel']//following-sibling::a")
    public WebElement duftBladStengel;
    @FindBy(xpath = "//span[text()='Frukt tid']//parent::label//parent::div//child::div[@class='_input_2gb8b_44']")
    public WebElement fruktTid;
    @FindBy(xpath = "(//*[@class='_option_2gb8b_78'])[2]")
    public WebElement fruktTidValg;
    @FindBy(xpath = "//span[text()='Bladfarge']//parent::label//parent::div//child::div[@class='_input_2gb8b_44']")
    public WebElement bladfarge;
    @FindBy(xpath = "(//*[@class='_option_2gb8b_78'])[2]")
    public WebElement bladfargeValg;
    @FindBy(xpath = "//span[text()='Bladform']//parent::label//parent::div//child::div[@class='_input_2gb8b_44']")
    public WebElement bladform;
    @FindBy(xpath = "(//*[@class='_option_2gb8b_78'])[2]")
    public WebElement bladformValg;
    @FindBy(xpath = "//span[text()='Høstfarger']//parent::label//parent::div//child::div[@class='_input_2gb8b_44']")
    public WebElement hostfarger;
    @FindBy(xpath = "(//*[@class='_option_2gb8b_78'])[2]")
    public WebElement hostfargerValg;
    @FindBy(xpath = "//span[text()='Vinterkarakter']//parent::label//parent::div//child::div[@class='_input_2gb8b_44']")
    public WebElement vinterkarakter;
    @FindBy(xpath = "(//*[@class='_option_2gb8b_78'])[2]")
    public WebElement vinterkarakterValg;
    @FindBy(xpath = "//span[text()='Stamme barkstruktur']//parent::label//parent::div//child::div[@class='_input_2gb8b_44']")
    public WebElement stammeBarkstruktur;
    @FindBy(xpath = "(//*[@class='_option_2gb8b_78'])[2]")
    public WebElement stammeBarkstrukturValg;
    @FindBy(xpath = "//span[text()=' Stamme barkfarge']//parent::label//parent::div//child::div[@class='_input_2gb8b_44']")
    public WebElement stammeBarkfarge;
    @FindBy(xpath = "(//*[@class='_option_2gb8b_78'])[2]")
    public WebElement stammeBarkfargeValg;
    @FindBy(xpath = "//span[text()='Skudd/greiner farge']//parent::label//parent::div//child::div[@class='_input_2gb8b_44']")
    public WebElement skuddGreinerFarge;
    @FindBy(xpath = "(//*[@class='_option_2gb8b_78'])[2]")
    public WebElement skuddGreinerFargeValg;
    //Bilder
    @FindBy(xpath = "//*[@title='Bilder']")
    public WebElement bilder;
    @FindBy(xpath = "//button[@title='Legg til']")
    public WebElement leggTilBilde;
    @FindBy(xpath = "//button[@title='Velg bilde']")
    public WebElement velgBilde;
    @FindBy(xpath = "//label[@title='Fotokilde']//following-sibling::div//child::input")
    public WebElement fotokilde;
    @FindBy(xpath = "//button[@title='Lagre og lukk']")
    public WebElement lagreOgLukk;
    @FindBy(xpath = "//button[@title='Slett']")
    public WebElement slettBilde;
    @FindBy(xpath = "//div[@class='_image_ggpid_1 '][starts-with(@style,'background-image:')]")
    public WebElement bildeBekreftelse;


    //Tilleggsinformasjon
    @FindBy(xpath = "//a[@title='Tilleggsinformasjon']")
    public WebElement tilleggsinformasjon;
    @FindBy(xpath = "(//textarea)[1]")
    public WebElement tilleggsopplysninger;
    @FindBy(xpath = "(//textarea)[2]")
    public WebElement kommentar;
    @FindBy(xpath = "(//textarea)[3]")
    public WebElement forskeresErfaringMedPlanten;

    //Forskning
    @FindBy(xpath = "//a[@title='Forskning']")
    public WebElement forskning;
    @FindBy(xpath = "//button[@title='Legg til forskningsresultat']")
    public WebElement leggTilForskningsresultat;
    @FindBy(css = "label[title^='Forfattere']+div input")
    public WebElement forfattere ;
    @FindBy(xpath = "//button[@title='Legg til .pdf fra PC/Mac']")
    public WebElement leggTilPfd;
    @FindBy(css = "input[type='date']")
    public WebElement dato;


    //Slett Plante
    @FindBy(xpath = "//button[@title='Slett plante']")
    public WebElement slettPlante;
    @FindBy(xpath = "//button[@title='Ja']")
    public WebElement slettPlanteJA;


}
