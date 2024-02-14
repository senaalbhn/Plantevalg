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
    @FindBy(xpath = "//*[@class='_circle_16oj8_28']")
    public WebElement varemerkeButton;
    @FindBy(xpath = "//*[text()='Hybrid mellom arter (x)']")
    public WebElement hybridMellomArter;
    @FindBy(xpath = "//*[text()='Hybrid mellom slekter (X)']")
    public WebElement hybridMellomSlekter;
    @FindBy(xpath = "//button[@title='Lagre og fortsett']")
    public WebElement lagreOgFortsette;
    @FindBy(xpath = "//button[@class='_button_1su0p_1 textStyleMenu _colorDarkGray_1su0p_99']")
    public WebElement neste;

    //Navn og opprinnelse
    @FindBy(xpath = "(//div//a)[5]")
    public WebElement navnOgOpprinnelse;
    @FindBy(xpath = "(//*[@class='_button_1su0p_1 textStyleMenu _colorLightCyan_1su0p_114'])[1]")
    public WebElement leggTilOpphav;
    @FindBy(xpath = "(//*[@placeholder='Fritekst'])[1]")
    public WebElement slektPrimaerOpprinnelse;
    @FindBy(xpath = "(//*[@placeholder='Fritekst'])[9]")
    public WebElement slektSekundaerOpprinnelse;
    @FindBy(xpath = "//button[ .='Lagre']")
    public WebElement lagreButton;
    @FindBy(xpath = "(//*[@class='_togglePart_16oj8_10'])[1]")
    public WebElement viltvoksendeINorge;
    @FindBy(xpath = "(//*[@class='_togglePart_16oj8_10'])[2]")
    public WebElement produsertINorge;
    @FindBy(xpath = "(//*[@class='_button_1su0p_1 textStyleMenu _colorLightCyan_1su0p_114'])[1]")
    public WebElement leggTilSynonymer;
    @FindBy(xpath = "(//*[@placeholder='Fritekst'])[1]")
    public WebElement slektSynonym;
    @FindBy(xpath = "(//*[@class='_button_1su0p_1 textStyleMenu _colorLightCyan_1su0p_114'])[2]")
    public WebElement leggTilSprok;
    @FindBy(xpath = "//select")
    public WebElement sprok;
    @FindBy(xpath = "//input")
    public WebElement navn;
    @FindBy(xpath = "(//*[@class='_togglePart_16oj8_10'])[3]")
    public WebElement ePlante;

    //Egenskaper
    @FindBy(xpath = "(//div//a)[6]")
    public WebElement egenskaper;
    @FindBy(xpath = "(//*[@class='_plantGroupCard_1797k_1'])[1]")
    public WebElement plantegruppeTraer;
    @FindBy(xpath = "(//*[@class='_plantGroupCard_1797k_1'])[5]")
    public WebElement plantegruppeAlltidgronn;
    @FindBy(xpath = "//*[@class='_input_2gb8b_44']")
    public WebElement restriksjonerOgVern;
    @FindBy(xpath = "(//*[@class='_option_2gb8b_78'])[1]")
    public WebElement restriksjonerOgVernValg;
    @FindBy(xpath = "(//*[@class='_togglePart_16oj8_10'])[1]")
    public WebElement vegetativ;
    @FindBy(xpath = "(//*[@class='_togglePart_16oj8_10'])[2]")
    public WebElement fro;

    //Størrelse og form
    @FindBy(xpath = "(//div//a)[7]")
    public WebElement storrelseOgForm;
    @FindBy(xpath = "(//input[@type='text'])[1]")
    public WebElement hoyde;

    //Bruksområde
    @FindBy(xpath = "(//div//a)[8]")
    public WebElement bruksomrode;
    @FindBy(xpath = "(//a[@title='Nei'])[1]")
    public WebElement bruksomrodeValg;
    @FindBy(xpath = "(//input[@type='text'])[1]")
    public WebElement tregruppe;
    @FindBy(xpath = "(//input[@type='text'])[3]")
    public WebElement buskGruppe;
    @FindBy(xpath = "(//input[@type='text'])[5]")
    public WebElement solitaer;
    @FindBy(xpath = "(//input[@type='text'])[7]")
    public WebElement klippetHekk;

    //Plassering
    @FindBy(xpath = "(//div//a)[9]")
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
    @FindBy(xpath = "//*[@title='Prydverdi']")
    public WebElement prydverdi;

    @FindBy(xpath = "(//*[@class='_input_2gb8b_44'])[1]")
    public WebElement blomstEnEllerFlereFarger;
    @FindBy(xpath = "(//*[@class='_option_2gb8b_78'])[2]")
    public WebElement blomstEnEllerFlereFargerValg;
    @FindBy(xpath = "(//*[@class='_input_2gb8b_44'])[2]")
    public WebElement blomstFarge;
    @FindBy(xpath = "(//*[@class='_option_2gb8b_78'])[2]")
    public WebElement blomstFargeValg;
    @FindBy(xpath = "(//*[@class='_input_2gb8b_44'])[3]")
    public WebElement blomstAndeFarger;
    @FindBy(xpath = "(//*[@class='_option_2gb8b_78'])[2]")
    public WebElement blomstAndeFargerValg;
    @FindBy(xpath = "(//input[@type='text'])[1]")
    public WebElement blomstringstid;
    @FindBy(xpath = "(//input[@type='text'])[3]")
    public WebElement remontering;
    @FindBy(xpath = "(//a[@title='Nei'])[1]")
    public WebElement velgNei;
    @FindBy(xpath = "(//*[@class='_input_2gb8b_44'])[4]")
    public WebElement fruktTid;
    @FindBy(xpath = "(//*[@class='_option_2gb8b_78'])[2]")
    public WebElement fruktTidValg;
    @FindBy(xpath = "(//*[@class='_input_2gb8b_44'])[5]")
    public WebElement bladfarge;
    @FindBy(xpath = "(//*[@class='_option_2gb8b_78'])[2]")
    public WebElement bladfargeValg;
    @FindBy(xpath = "(//*[@class='_input_2gb8b_44'])[6]")
    public WebElement bladform;
    @FindBy(xpath = "(//*[@class='_option_2gb8b_78'])[2]")
    public WebElement bladformValg;
    @FindBy(xpath = "(//*[@class='_input_2gb8b_44'])[7]")
    public WebElement hostfarger;
    @FindBy(xpath = "(//*[@class='_option_2gb8b_78'])[2]")
    public WebElement hostfargerValg;
    @FindBy(xpath = "(//*[@class='_input_2gb8b_44'])[8]")
    public WebElement vinterkarakter;
    @FindBy(xpath = "(//*[@class='_option_2gb8b_78'])[2]")
    public WebElement vinterkarakterValg;
    @FindBy(xpath = "(//*[@class='_input_2gb8b_44'])[9]")
    public WebElement stammeBarkstruktur;
    @FindBy(xpath = "(//*[@class='_option_2gb8b_78'])[2]")
    public WebElement stammeBarkstrukturValg;
    @FindBy(xpath = "(//*[@class='_input_2gb8b_44'])[10]")
    public WebElement stammeBarkfarge;
    @FindBy(xpath = "(//*[@class='_option_2gb8b_78'])[2]")
    public WebElement stammeBarkfargeValg;
    @FindBy(xpath = "(//*[@class='_input_2gb8b_44'])[11]")
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
    @FindBy(xpath = "/html/body/div/div/div/div[2]/div/div[5]/div[2]/div/div[2]/div[2]/div/div[2]/div/div[3]/div/input")
    public WebElement fotokilde;
    @FindBy(xpath = "//button[@title='Lagre og lukk']")
    public WebElement lagreOgLukk;
    @FindBy(xpath = "//button[@title='Slett']")
    public WebElement slettBilde;
    @FindBy(xpath = "//div[contains(@style, 'background-image') and contains(@class, '_image_ggpid_1')]")
    public WebElement bildeBekreftelse;


    //Tilleggsinformasjon
    @FindBy(xpath = "//*[@title='Tilleggsinformasjon']")
    public WebElement tilleggsinformasjon;
    @FindBy(xpath = "(//textarea)[1]")
    public WebElement tilleggsopplysninger;
    @FindBy(xpath = "(//textarea)[2]")
    public WebElement kommentar;
    @FindBy(xpath = "(//textarea)[3]")
    public WebElement forskeresErfaringMedPlanten;

    //Forskning
    @FindBy(xpath = "//*[@title='Forskning']")
    public WebElement forskning;
    @FindBy(xpath = "//button[@title='Legg til forskningsresultat']")
    public WebElement leggTilForskningsresultat;
    @FindBy(xpath = "/html/body/div/div/div/div[2]/div/div[5]/div[1]/div[3]/div[2]/div[2]/div/div[2]/div[1]/div/div/input")
    public WebElement forfattere ;
    @FindBy(xpath = "//button[@title='Legg til .pdf fra PC/Mac']")
    public WebElement leggTilPfd;

    //Slett Plante
    @FindBy(xpath = "//button[@title='Slett plante']")
    public WebElement slettPlante;
    @FindBy(xpath = "//button[@title='Ja']")
    public WebElement slettPlanteJA;


}
