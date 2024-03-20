package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SearchPage {
    public SearchPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(css = "button[title='Avansert']")
    public WebElement avansert;

    @FindBy(xpath = "(//div[text()='Høyde']//following-sibling::div//child::input)[1]")
    public WebElement hoyde;
    @FindBy(xpath = "(//div[@class='_label_17x55_2 textStyleMenu' and text()='Hardførhet kyst']//following::input)[1]")
    public WebElement HardforhetKyst;
    @FindBy(xpath = "(//div[@class='_label_17x55_2 textStyleMenu' and text()='Hardførhet innland']//following::input)[1]")
    public WebElement hardforhetInnland;
    @FindBy(xpath = "//div[text()='E-plante']//following-sibling::div//child::a")
    public WebElement eplante;

    @FindBy(css = "div[title='Blomsterfarge']+a")
    public WebElement blomstFarge;

    @FindBy(css = "div[title='Fuktighetsforhold']+a")
    public WebElement fuktighetsforhold;

    @FindBy(css = "div[title='Form']+a")
    public WebElement form;





}
