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


}
