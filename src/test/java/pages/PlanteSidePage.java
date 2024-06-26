package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PlanteSidePage {
    public PlanteSidePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "button[title='Rediger']" )
    public WebElement rediger;
    @FindBy(css = "button[title='Slett plante']" )
    public WebElement slettPlante;


    //Navn og opprinnelse
    @FindBy(xpath = "//*[@class='_origin_1692g_1']" )
    public WebElement opphav;
    @FindBy(xpath = "//*[@class='_synonym_1692g_14']" )
    public WebElement registrertSynonym;
    @FindBy(xpath = "(//*[@placeholder='Fritekst'])[2]")
    public WebElement textforPrimaerOpprinnelseOgSynonymerTil;
    @FindBy(xpath = "(//*[@class='_togglePart_16oj8_10'])[4]")
    public WebElement varemerkeButtonForOpphavOgSynonym;
    @FindBy(xpath = "(//*[@class='_togglePart_16oj8_10'])[5]")
    public WebElement varemerkeButtonForOpphav2;
    @FindBy(xpath = "(//*[@placeholder='Fritekst'])[10]")
    public WebElement sekundaerOpprinnelse;
    @FindBy(xpath = "(//button[@title='Legg til'])[2]")
    public WebElement leggTil;
    @FindBy(xpath = "(//label[@title='Slekt']//following-sibling::div//input)[1]")
    public WebElement opphavPrimaerSlekt;
    @FindBy(xpath = "(//label[@title='Slekt']//following-sibling::div//input)[2]")
    public WebElement opphavSekundaerSlekt;
    @FindBy(css = "label[title='Slekt']+div input")
    public WebElement synonymPrimaerSlekt;
    @FindBy(css = "label[title='Slekt']+div input")
    public WebElement synonymerNavn;
    @FindBy(xpath = "(//*[@placeholder='Fritekst'])[2]")
    public WebElement synonymerTil;
    @FindBy(css = "button[title*='flere språk']")
    public WebElement flereSprook;

    @FindBy(xpath = "(//input)[3]")
    public WebElement andreSprokNavn;
    @FindBy(css = "button[title='Lagre']")
    public WebElement lagre;

    //Egenskaper
    @FindBy(css = "div[title^='Løv']")
    public WebElement lovfellende;

    //Bruksområde
    //Bildet
    @FindBy(xpath = "//button[@class='_iconButton_zwn2h_1 _colorDarkGray_zwn2h_111 _hasBorder_zwn2h_24 _sizeSmall_zwn2h_60 _shadow_zwn2h_21 _background_zwn2h_18']")
    public WebElement registertBilde;
    //Forskning
    @FindBy(css = "div[class=' textStyleHeaderSmall']+div button")
    public WebElement redigereForskning;
    @FindBy(css = "div[class=' textStyleHeaderSmall']+div+div button")
    public WebElement apneForskning;
    @FindBy(xpath = "(//textarea)[1]")
    public WebElement oppsummeringAvForskningen;
    @FindBy(xpath = "(//textarea)[2]")
    public WebElement stederForForskningen;
    @FindBy(xpath = "(//textarea)[3]")
    public WebElement oppsummeringAvForskningenVedrorendeDennePlanten;
    @FindBy(xpath = "//*[@title='Knytt til flere']")
    public WebElement knyttTilFlere;
    @FindBy(xpath = "//*[@class='textStyleMenuBold ']")
    public WebElement planteForKnytt;
    @FindBy(xpath = "(//textarea)[4]")
    public WebElement planteForKnyttInfo;
    @FindBy(xpath = "//*[@title='Knytt']")
    public WebElement knyttButton;

    @FindBy(xpath = "//*[@title='Legg til referanse']")
    public WebElement leggTilReferanse;
    @FindBy(xpath = "//input")
    public WebElement knyttForskningSearch;




}
