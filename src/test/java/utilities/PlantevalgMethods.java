package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import pages.NyPlantePage;

public class PlantevalgMethods {
    static NyPlantePage nyPlante= new NyPlantePage();
    static Actions actions= new Actions(Driver.getDriver());



    public static void velgEnFraRestriksjonerOgVern(int idx) {
        nyPlante.restriksjonerOgVern.click();
        ReusableMethods.wait(1);
        WebElement valg= Driver.getDriver().findElement(By.xpath("(//*[@class='_option_2gb8b_78'])["+idx+"]"));
        actions.click(valg).perform();
        ReusableMethods.wait(1);
        actions.moveToLocation(1,1).click().perform();
        ReusableMethods.wait(1);
    }
    public static void velgEnMultiSelect(WebElement element, String str) {
        actions.click(element).perform();
        ReusableMethods.wait(1);
        WebElement valg= Driver.getDriver().findElement(By.xpath("//*[text()='"+str+"']"));
        actions.click(valg).perform();
        actions.moveToLocation(1,1).click().perform();
    }

    public static void klikkJaEllerNei (String str) {
        WebElement button = Driver.driver.findElement(By.xpath("(//a[@title='"+str+"'])[1]"));
        actions.click(button).perform();
    }
    public static void bekreft(WebElement element,String expectedData){
        SoftAssert softAssert = new SoftAssert();
        String actual= element.getAttribute("title");
        String actualData= actual.split(":")[1].trim();
        softAssert.assertEquals(actualData,expectedData);
    }



}
