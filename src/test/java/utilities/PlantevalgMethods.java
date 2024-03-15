package utilities;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import org.yaml.snakeyaml.constructor.Construct;
import org.yaml.snakeyaml.constructor.Constructor;
import pages.NyPlantePage;
import pojos.getRequest.AllergenicitiesPojo;
import pojos.getRequest.NamePojo;
import pojos.getRequest.PruningsPojo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class PlantevalgMethods {
    static NyPlantePage nyPlante = new NyPlantePage();
    static Actions actions = new Actions(Driver.getDriver());


    public static void velgEnFraRestriksjonerOgVern(int idx) {
        nyPlante.restriksjonerOgVern.click();

        WebElement valg = Driver.getDriver().findElement(By.xpath("(//*[@class='_option_2gb8b_78'])[" + idx + "]"));
        actions.click(valg).perform();
        ReusableMethods.wait(1);
        actions.moveToLocation(1, 1).click().perform();
        ReusableMethods.wait(1);
    }

    public static void velgEnMultiSelect(WebElement element, String str) {
        actions.click(element).perform();
        WebElement valg = Driver.getDriver().findElement(By.xpath("//*[text()='" + str + "']"));
        actions.click(valg).perform();
        actions.moveToLocation(1, 1).click().perform();
    }

    public static void klikkJaEllerNei(String str) {
        WebElement button = Driver.driver.findElement(By.xpath("(//a[@title='" + str + "'])[1]"));
        actions.click(button).perform();
    }

    public static void bekreft(WebElement element, String expectedData) {
        SoftAssert softAssert = new SoftAssert();
        String actual = element.getAttribute("title");
        String actualData = actual.split(":")[1].trim();
        softAssert.assertEquals(actualData, expectedData);
    }


    public static void velgPlante(String str) {

       String planteNavn= str.split(" ")[1];
       WebElement velg = Driver.getDriver().findElement(By.xpath("//span[contains(text(),'"+planteNavn+"')]"));
       actions.click(velg).perform();
    }

    public static void bekreftPlante (String str){
        String planteFirstNavnExpected= str.split(" ")[0];
        String planteSekundNavnExpected= str.split(" ")[1];
        String planteFirstNavnActual = Driver.getDriver().findElement(By.xpath("//span[contains(text(),'"+planteFirstNavnExpected+"')]")).getText();
        String planteSekundNavnActual = Driver.getDriver().findElement(By.xpath("//span[contains(text(),'"+planteSekundNavnExpected+"')]")).getText();
        System.out.println(planteFirstNavnExpected+" "+planteSekundNavnExpected);
        System.out.println(planteFirstNavnActual+" "+planteSekundNavnActual);
        Assert.assertEquals(planteFirstNavnExpected+" "+planteSekundNavnExpected,planteFirstNavnActual+" "+planteSekundNavnActual);

    }
    public static void velgBlomstFarge (String str){
        WebElement farge= Driver.getDriver().findElement(By.cssSelector("div[class='_buttons_1btq1_1'] button[title='"+str+"']"));
        actions.click(farge).perform();
    }

    public static void scroll(){
        ReusableMethods.scrollEnd();
        ReusableMethods.wait(1);
        ReusableMethods.scrollEnd();
        ReusableMethods.wait(1);
        ReusableMethods.scrollEnd();
        ReusableMethods.wait(1);
    }

}
