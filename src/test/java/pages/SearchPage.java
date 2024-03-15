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

    @FindBy(xpath = "(//input[@type='text'])[2]")
    public WebElement hoyde;
    @FindBy(xpath = "(//div[@class='_label_17x55_2 textStyleMenu' and text()='Hardførhet kyst']//following::input)[1]")
    public WebElement HardforhetKyst;


    @FindBy(css = "div[title='Blomsterfarge']+a")
    public WebElement blomstFarge;

}
