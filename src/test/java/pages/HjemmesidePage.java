package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HjemmesidePage {
    public HjemmesidePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy (xpath = "//*[@type='email']" )
    public WebElement epost;
    @FindBy (xpath = "//span[contains(text(),'Avocadoo')]" )
    public WebElement forstePlante;
    @FindBy (xpath = "//span[text()='Avocadoo']" )
    public WebElement redigertetPlante;
    @FindBy (xpath = "//button[@title='Nullstill']" )
    public WebElement nullstill;
    @FindBy (css = "input[placeholder='Søk i plantebasen']" )
    public WebElement sokefelte;




}
