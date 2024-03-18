package utilities;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import org.yaml.snakeyaml.constructor.Construct;
import org.yaml.snakeyaml.constructor.Constructor;
import pages.HjemmesidePage;
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
    static HjemmesidePage hjemmeside= new HjemmesidePage();



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

    public static void bekreftEquals(WebElement element, String expectedData) {
        String actual = element.getAttribute("title");
        String actualData = actual.split(":")[1].trim();
        Assert.assertEquals(actualData, expectedData);
        System.out.println(actual.split(":")[0]+" til "+Driver.getDriver().findElement(By.xpath("(//span[@class='_italic_yzjvg_6'])[1]")).getText()+ " er lik eller inneholder "+expectedData+ " som forventet" );
    }
    public static void bekreftTrueStr(WebElement element, String expectedData) {
        SoftAssert softAssert = new SoftAssert();
        String actual = element.getAttribute("title");
        String actualData = actual.split(":")[1].trim();
        softAssert.assertTrue(actualData.contains(expectedData));
        System.out.println(actual.split(":")[0]+" til "+Driver.getDriver().findElement(By.xpath("(//span[@class='_italic_yzjvg_6'])[1]")).getText()+ " er lik eller inneholder "+expectedData+ " som forventet" );
    }
    public static void bekreftTrue(WebElement element, int min, int max) {
        String actual = element.getAttribute("title").split(":")[1];

        if (actual.length() > 5) {
            if (actual.contains(",")) {
                String a = actual.replace(",", ".");
                double first = Double.parseDouble(a.split("-")[0].trim().replaceAll("[a-zA-Z]", ""));
                double second = Double.parseDouble(a.split("-")[1].trim().replaceAll("[a-zA-Z]", ""));
                Assert.assertTrue(first >= min && first <= max);
                Assert.assertTrue(second >= min && second <= max);
            } else {
                int first = Integer.parseInt(actual.split("-")[0].trim().replaceAll("[a-zA-Z]", ""));
                int second = Integer.parseInt(actual.split("-")[1].trim().replaceAll("[a-zA-Z]", ""));
                Assert.assertTrue(first >= min && first <= max);
                Assert.assertTrue(second >= min && second <= max);
            }
        } else {
            if (actual.contains(",")) {
                String a = actual.replace(",", ".");
                double first = Double.parseDouble(a.trim().replaceAll("[a-zA-Z]", ""));
                Assert.assertTrue(first >= min && first <= max);
            } else {
                int first = Integer.parseInt(actual.trim().replaceAll("[a-zA-Z]", ""));
                Assert.assertTrue(first >= min && first <= max);

            }
        }
        System.out.println(element.getAttribute("title").split(":")[0]+" til "+Driver.getDriver().findElement(By.xpath("(//span[@class='_italic_yzjvg_6'])[1]")).getText()+  " er mellom eller lik: "+min+"-"+max+" som forventet" );
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

    public static void velgLysforhold(String str){
        WebElement farge= Driver.getDriver().findElement(By.cssSelector("button[class^='_iconButton_zwn2h_1'][title='"+str+"']"));
        actions.click(farge).perform();
    }
    public static void velgFuktighetsforhold(String str){
        WebElement farge= Driver.getDriver().findElement(By.xpath("//div[text()='"+str+"']//preceding-sibling::div//child::div[starts-with(@class,'_checkbox')]"));
        actions.click(farge).perform();
    }

    public static void avansertFiltre(String str){
        ReusableMethods.wait(1);
        hjemmeside.nullstill.click();
        actions.click(Driver.driver.findElement(By.cssSelector("button[title='Avansert']"))).perform();
        actions.click(Driver.getDriver().findElement(By.cssSelector("div[title='"+str+"']+a"))).perform();
        actions.moveToLocation(1, 1).click().perform();
    }

    public static void filterMedSlider(String str,String min,String max){
        ReusableMethods.wait(1);
        WebElement filter= Driver.getDriver().findElement(By.xpath("(//div[text()='"+str+"']//following-sibling::div//child::input)[1]"));
        filter.sendKeys(min, Keys.TAB, max, Keys.TAB);
        ReusableMethods.wait(1);
    }

}
