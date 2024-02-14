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
    @FindBy (xpath = "(//*[@class='_nameAndDescription_1bimp_38'])[1]" )
    public WebElement forstePlante;
    @FindBy (xpath = "//button[@title='Nullstill']" )
    public WebElement nullstill;



}
