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
    @FindBy (css = "div[class='_busy_1su0p_50']")
    public WebElement busy;


}
