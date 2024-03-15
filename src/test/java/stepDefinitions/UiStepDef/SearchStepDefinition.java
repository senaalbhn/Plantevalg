package stepDefinitions.UiStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.HjemmesidePage;
import pages.SearchPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.PlantevalgMethods;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

public class SearchStepDefinition {
    HjemmesidePage hjemmeside = new HjemmesidePage();
    SearchPage search = new SearchPage();
    Actions actions = new Actions(Driver.getDriver());

    @Given("Klikk sokefelt og Skriv {string}")
    public void klikkSokefeltOgSkriv(String str) {
        hjemmeside.sokefelte.sendKeys(str);
    }

    @And("Klikk {string}")
    public void klikk(String str) {
        PlantevalgMethods.velgPlante(str);
    }

    @And("Bekreft apnes planteside til {string}")
    public void bekreftApnesPlantesideTil(String str) {
        PlantevalgMethods.bekreftPlante(str);
    }

//_iconButton_zwn2h_1  _hasBorder_zwn2h_24 _sizeSmall_zwn2h_60 _shadow_zwn2h_21 _background_zwn2h_18
//_iconButton_zwn2h_1  _hasBorder_zwn2h_24 _sizeSmall_zwn2h_60 _shadow_zwn2h_21 _background_zwn2h_18

    @And("Tilbake hovedsida")
    public void tilbakeHovedsida() {
        Driver.getDriver().get(ConfigReader.getProperty("Url"));
    }

    //Høyde
    @Given("Velg {string} og {string} po hoyde filter")
    public void velgOgPoHoydeFilter(String min, String max) {
        hjemmeside.nullstill.click();
        ReusableMethods.wait(1);
        search.hoyde.sendKeys(min, Keys.TAB, max, Keys.TAB);
        ReusableMethods.wait(1);
    }

    @Then("Bekreft alle planter er mellom {int} m- {int} m")
    public void bekreftAllePlanterErMellomMM(int min, int max) {
        PlantevalgMethods.scroll();
        List<WebElement> planter = Driver.getDriver().findElements(By.cssSelector("div[class='_nameAndDescription_ekgvi_36']+div h2"));
        for (WebElement w : planter) {
            if (w.getText().length() > 5) {
                if (w.getText().contains(",")) {
                    String a = w.getText().replace(",", ".");
                    double first = Double.parseDouble(a.split("-")[0].trim().replaceAll("[a-zA-Z]", ""));
                    double second = Double.parseDouble(a.split("-")[1].trim().replaceAll("[a-zA-Z]", ""));
                    System.out.println(first+"-"+second);
                    Assert.assertTrue(first >= min && first <= max);
                    Assert.assertTrue(second >= min && second <= max);
                } else {
                    int first = Integer.parseInt(w.getText().split("-")[0].trim().replaceAll("[a-zA-Z]", ""));
                    int second = Integer.parseInt(w.getText().split("-")[1].trim().replaceAll("[a-zA-Z]", ""));
                    System.out.println(first+"-"+second);;
                    Assert.assertTrue(first >= min && first <= max);
                    Assert.assertTrue(second >= min && second <= max);
                }
            } else {
                if (w.getText().contains(",")) {
                    String a = w.getText().replace(",", ".");
                    double first = Double.parseDouble(a.trim().replaceAll("[a-zA-Z]", ""));
                    System.out.println(first);
                    Assert.assertTrue(first >= min && first <= max);
                } else {
                    int first = Integer.parseInt(w.getText().trim().replaceAll("[a-zA-Z]", ""));
                    System.out.println(first);
                    Assert.assertTrue(first >= min && first <= max);

                }
            }
        }

    }



    //Hardforhet kyst
    @Given("Velg {string} og {string} po Hardforhet kyst filter")
    public void velgOgPoHardforhetKystFilter(String min, String max) {
        hjemmeside.nullstill.click();
        ReusableMethods.wait(1);
        search.HardforhetKyst.sendKeys(min, Keys.TAB, max, Keys.TAB);
        ReusableMethods.wait(1);
    }





    @And("Bekreft alle planter er mellom {int} - {int} Hardforhet kyst")
    public void bekreftAllePlanterErMellomHardforhetKyst(int min, int max) {
        PlantevalgMethods.scroll();
        List<WebElement> planter = Driver.getDriver().findElements(By.cssSelector("div[class='_nameAndDescription_ekgvi_36']+div+div div"));

        for (WebElement w : planter){
            if (w.getText().length() > 3) {
                    String first = w.getText().split("-")[0].replaceAll("[a-zA-Z]", "");
                    int a= Integer.parseInt(first);
                    System.out.println(a);
                    Assert.assertTrue(a >= min && a <= max);

            } else {
                String first = w.getText().replaceAll("[a-zA-Z]", "");
                int a= Integer.parseInt(first);
                System.out.println(a);
                Assert.assertTrue(a >= min && a <= max);
            }

        }
    }


    //Blomst hovedfarge
    @Given("Velg {string} po Blomst hovedfarge filter")
    public void velgPoBlomstHovedfargeFilter(String str) {
        hjemmeside.nullstill.click();
        search.avansert.click();
        search.blomstFarge.click();
        actions.moveToLocation(1, 1).click().perform();
        PlantevalgMethods.velgBlomstFarge(str);
        ReusableMethods.wait(2);

    }

    @And("Bekreft alle planter  har {string} Blomst hovedfarge")
    public void bekreftAllePlanterHarBlomstHovedfarge(String str) {
        PlantevalgMethods.scroll();
        List<WebElement> planter = Driver.getDriver().findElements(By.cssSelector("button[class='_iconButton_zwn2h_1  _hasBorder_zwn2h_24 _sizeSmall_zwn2h_60 _shadow_zwn2h_21 _background_zwn2h_18']"));
        for (WebElement w : planter) {
            Assert.assertTrue(w.getAttribute("title").contains("Blå"));
            System.out.println(w.getAttribute("title"));
        }
    }



}
