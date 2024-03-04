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
    @FindBy (css = "a[title*='Avocado']>div[class^='_name']" )
    public WebElement forstePlante;
    @FindBy (xpath = "//button[@title='Nullstill']" )
    public WebElement nullstill;
    @FindBy (css = "input[placeholder='Søk i plantebasen']" )
    public WebElement sokefelte;




}
