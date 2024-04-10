package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminPage {
    public AdminPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//div[text()='Bilder']")
    public WebElement bilder;
    @FindBy (css = "div._bottom_1c7c6_40 input[placeholder='Fotokilde']")
    public WebElement fotokilde;
    @FindBy (css = "div[class='_pageContent_1gqym_1'] ._image_1gqym_6")
    public WebElement storBilde;
    @FindBy (css = "div._label_1gqym_104")
    public WebElement bildeInfo;
    @FindBy (css = "button[title='>']")
    public WebElement nesteBilde;
    @FindBy (css = "div[class^='_busy_']")
    public WebElement busy;
    @FindBy (xpath = "//div[starts-with(text(),'Vennligst vent')]")
    public WebElement vent;
    @FindBy (css = "div[class^='_selectAll'] div[class^='_checkbox']")
    public WebElement velgAlle;
    @FindBy (css = "div[class^='_inputs_'] div[class^='_autocomplete'] input")
    public WebElement botaniskNavn;
    @FindBy (css = "div[class^='_autoCompleteResult']")
    public WebElement firstPlante;
   @FindBy (css = "div[class^='_photographer']")
    public WebElement infoFotoOgKilde;
   @FindBy (css = "div[class^='_name_3']")
    public WebElement biltetype;
   @FindBy (css = "label[title='Notis']+div input")
    public WebElement notis;
   @FindBy (css = "label[title='Notis']+div input")
    public WebElement hvor;
   @FindBy (css = "label[title='Notis']+div input")
    public WebElement postnummer;
   @FindBy (css = "label[title='Notis']+div input")
    public WebElement poststed;


}
