package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PlanteSidePage {
    public PlanteSidePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//*[@class='_children_1su0p_15'])[2]" )
    public WebElement rediger;
    @FindBy(xpath = "(//*[@class='_children_1su0p_15'])[2]" )
    public WebElement slettPlante;


    //Navn og opprinnelse
    @FindBy(xpath = "//*[@class='_origin_1692g_1']" )
    public WebElement opphav;
    @FindBy(xpath = "//*[@class='_synonym_1692g_14']" )
    public WebElement registrertSynonym;
    @FindBy(xpath = "(//*[@placeholder='Fritekst'])[2]")
    public WebElement synonymerTil;

}
