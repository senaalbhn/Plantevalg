package stepDefinitions.UiStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.*;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.PlantevalgMethods;
import utilities.ReusableMethods;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.locks.ReadWriteLock;

public class SearchStepDefinition {
    HjemmesidePage hjemmeside = new HjemmesidePage();
    SearchPage search = new SearchPage();
    Actions actions = new Actions(Driver.getDriver());
    Random random = new Random();
    BekreftPage bekreftPage = new BekreftPage();
    NyPlantePage nyPlantePage = new NyPlantePage();

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


    @And("Tilbake hovedsida")
    public void tilbakeHovedsida() {
        Driver.getDriver().get(ConfigReader.getProperty("Url"));
        ReusableMethods.wait(1);
        try {
            ReusableMethods.visibleWait(hjemmeside.nullstill, 3);
            hjemmeside.nullstill.click();
        } catch (ElementClickInterceptedException e) {
            System.out.println("Nullstill feil");
        }
        try {
            ReusableMethods.visibleWait(hjemmeside.nullstill, 3);
            hjemmeside.nullstill.click();
        } catch (ElementClickInterceptedException e) {
            System.out.println("Nullstill feil");
        }
    }

    //Plante Hovedgruppe
    @Given("Velg {string} po Plantegruppe filter")
    public void velgPoPlantegruppeFilter(String str) {
        WebElement plantegruppe = Driver.getDriver().findElement(By.cssSelector("div[title='" + str + "']"));
        plantegruppe.click();
        ReusableMethods.wait(1);
    }

    @Then("Bekreft alle planter er {string}")
    public void bekreftAllePlanterEr(String str) {
        PlantevalgMethods.scroll();
        List<WebElement> allePlanter = Driver.getDriver().findElements(By.cssSelector("a[class='_plantListElement_ekgvi_1'] div[class^='_nameAndDescription_']"));
        actions.click(allePlanter.get(random.nextInt(allePlanter.size()))).perform();
        PlantevalgMethods.bekreftTrueStr(bekreftPage.plantegruppe, str);

    }

    //Plante Undergruppe
    @Given("Velg {string} under {string} po Undergruppe filter")
    public void velgUnderPoUndergruppeFilter(String under, String hoved) {
        ReusableMethods.wait(1);
        hjemmeside.nullstill.click();
        WebElement plantegruppe = Driver.getDriver().findElement(By.cssSelector("div[title='" + hoved + "']"));
        plantegruppe.click();
        WebElement undergruppe = Driver.getDriver().findElement(By.cssSelector("div[title='" + under + "']"));
        ReusableMethods.visibleWait(undergruppe, 3);
        undergruppe.click();
        ReusableMethods.wait(1);


    }

    @Then("Bekreft alle planter er {string} under {string} Undergruppe")
    public void bekreftAllePlanterErUnderUndergruppe(String under, String hoved) {
        List<WebElement> allePlanter = Driver.getDriver().findElements(By.cssSelector("a[class='_plantListElement_ekgvi_1'] div[class^='_nameAndDescription_']"));
        actions.click(allePlanter.get(random.nextInt(allePlanter.size()))).perform();
        PlantevalgMethods.bekreftTrueStr(bekreftPage.undergruppe, under);
        Driver.getDriver().get(ConfigReader.getProperty("Url"));


    }

    //Form
    @Given("Velg {string} po Form filter")
    public void velgPoFormFilter(String str) {
        ReusableMethods.wait(1);
        try {
            WebElement form = Driver.getDriver().findElement(By.cssSelector("div[class^='_multiSelect']"));
            PlantevalgMethods.velgEnMultiSelect(form, str);
            PlantevalgMethods.scroll();
            ReusableMethods.wait(1);
        } catch (NoSuchElementException e) {
            search.avansert.click();
            search.form.click();
            actions.moveToLocation(1, 1).click().perform();
            WebElement form = Driver.getDriver().findElement(By.cssSelector("div[class^='_multiSelect']"));
            PlantevalgMethods.velgEnMultiSelect(form, str);
            PlantevalgMethods.scroll();
            ReusableMethods.wait(1);
        }
    }

    @Then("Bekreft alle planter har {string} form")
    public void bekreftAllePlanterHarForm(String str) {
        List<WebElement> allePlanter = Driver.getDriver().findElements(By.cssSelector("a[class='_plantListElement_ekgvi_1'] div[class^='_nameAndDescription_']"));
        actions.click(allePlanter.get(random.nextInt(allePlanter.size()))).perform();
        PlantevalgMethods.bekreftTrueStr(bekreftPage.form, str);
    }

    //Høyde
    @Given("Velg {string} og {string} po hoyde filter")
    public void velgOgPoHoydeFilter(String min, String max) {
        ReusableMethods.wait(1);
        ;
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
                    Assert.assertTrue(first >= min && first <= max);
                    Assert.assertTrue(second >= min && second <= max);
                } else {
                    int first = Integer.parseInt(w.getText().split("-")[0].trim().replaceAll("[a-zA-Z]", ""));
                    int second = Integer.parseInt(w.getText().split("-")[1].trim().replaceAll("[a-zA-Z]", ""));
                    Assert.assertTrue(first >= min && first <= max);
                    Assert.assertTrue(second >= min && second <= max);
                }
            } else {
                if (w.getText().contains(",")) {
                    String a = w.getText().replace(",", ".");
                    double first = Double.parseDouble(a.trim().replaceAll("[a-zA-Z]", ""));
                    Assert.assertTrue(first >= min && first <= max);
                } else {
                    int first = Integer.parseInt(w.getText().trim().replaceAll("[a-zA-Z]", ""));
                    Assert.assertTrue(first >= min && first <= max);

                }
            }
        }
        actions.click(planter.get(random.nextInt(planter.size()))).perform();
        PlantevalgMethods.bekreftTrue(bekreftPage.hoyde, min, max);

    }

    //Fuktighetsforhold
    @Given("Velg {string} po Fuktighetsforhold filter")
    public void velgPoFuktighetsforholdFilter(String str) {
        ReusableMethods.wait(1);
        try {
            PlantevalgMethods.velgFuktighetsforhold(str);
            PlantevalgMethods.scroll();
            ReusableMethods.wait(1);
        } catch (NoSuchElementException e) {
            search.avansert.click();
            search.fuktighetsforhold.click();
            actions.moveToLocation(1, 1).click().perform();
            PlantevalgMethods.velgFuktighetsforhold(str);
            ReusableMethods.wait(1);
        }
    }

    @Then("Bekreft alle planter har {string} Fuktighetsforhold")
    public void bekreftAllePlanterHarFuktighetsforhold(String str) {
        List<WebElement> planterMedValgOption = Driver.getDriver().findElements(By.cssSelector("div[class='_img_1ropy_12 '][title='" + str + "']"));
        List<WebElement> allePlanter = Driver.getDriver().findElements(By.cssSelector("a[class='_plantListElement_ekgvi_1']"));
        System.out.println("planterMedValgOption = " + planterMedValgOption.size());
        System.out.println("allePlanter = " + allePlanter.size());
        Assert.assertEquals(planterMedValgOption.size(), allePlanter.size());

        actions.click(planterMedValgOption.get(random.nextInt(planterMedValgOption.size()))).perform();
        PlantevalgMethods.bekreftTrueStr(bekreftPage.fuktighetsforhold, str);
    }

    //Hardforhet Innland
    @Given("Velg {string} og {string} po Hardforhet Innland filter")
    public void velgOgPoHardforhetInnlandFilter(String min, String max) {
        ReusableMethods.wait(1);
        search.hardforhetInnland.sendKeys(min, Keys.TAB, max, Keys.TAB);
        ReusableMethods.wait(1);
    }

    @And("Bekreft alle planter er mellom {int} - {int} Hardforhet Innland")
    public void bekreftAllePlanterErMellomHardforhetInnland(int min, int max) {
        PlantevalgMethods.scroll();
        List<WebElement> planter = Driver.getDriver().findElements(By.cssSelector("div[class='_nameAndDescription_ekgvi_36']+div+div div"));
        for (WebElement w : planter) {
            if (w.getText().length() > 3) {
                String first = w.getText().split("-")[1].replaceAll("[a-zA-Z]", "");
                int a = Integer.parseInt(first);
                Assert.assertTrue(a >= min && a <= max);

            } else {
                String first = w.getText().replaceAll("[a-zA-Z]", "");
                int a = Integer.parseInt(first);
                Assert.assertTrue(a >= min && a <= max);
            }

        }

        actions.click(planter.get(random.nextInt(planter.size()))).perform();
        PlantevalgMethods.bekreftTrue(bekreftPage.hardforhetinnland, min, max);

    }

    //Hardforhet kyst
    @Given("Velg {string} og {string} po Hardforhet kyst filter")
    public void velgOgPoHardforhetKystFilter(String min, String max) {

        ReusableMethods.wait(1);
        search.HardforhetKyst.sendKeys(min, Keys.TAB, max, Keys.TAB);
        ReusableMethods.wait(1);
    }

    @And("Bekreft alle planter er mellom {int} - {int} Hardforhet kyst")
    public void bekreftAllePlanterErMellomHardforhetKyst(int min, int max) {
        PlantevalgMethods.scroll();
        List<WebElement> planter = Driver.getDriver().findElements(By.cssSelector("div[class='_nameAndDescription_ekgvi_36']+div+div div"));

        for (WebElement w : planter) {
            if (w.getText().length() > 3) {
                String first = w.getText().split("-")[0].replaceAll("[a-zA-Z]", "");
                int a = Integer.parseInt(first);
                Assert.assertTrue(a >= min && a <= max);

            } else {
                String first = w.getText().replaceAll("[a-zA-Z]", "");
                int a = Integer.parseInt(first);
                Assert.assertTrue(a >= min && a <= max);
            }

        }
        actions.click(planter.get(random.nextInt(planter.size()))).perform();
        PlantevalgMethods.bekreftTrue(bekreftPage.hardforhetKyst, min, max);
    }


    //Lysforhold
    @Given("Velg {string} po Lysforhold filter")
    public void velgPoLysforholdFilter(String str) {
        ReusableMethods.wait(1);

        PlantevalgMethods.velgLysforhold(str);
        PlantevalgMethods.scroll();
    }

    @And("Bekreft alle planter  har {string} Lysforhold")
    public void bekreftAllePlanterHarLysforhold(String str) {
        List<WebElement> planterMedValgOption = Driver.getDriver().findElements(By.cssSelector("div[class='_img_1ropy_12 '][title='" + str + "']"));
        List<WebElement> allePlanter = Driver.getDriver().findElements(By.cssSelector("a[class='_plantListElement_ekgvi_1']"));
        System.out.println("planterMedValgOption = " + planterMedValgOption.size());
        System.out.println("allePlanter = " + allePlanter.size());
        Assert.assertEquals(planterMedValgOption.size(), allePlanter.size());

        actions.click(planterMedValgOption.get(random.nextInt(planterMedValgOption.size()))).perform();
        PlantevalgMethods.bekreftTrueStr(bekreftPage.lysforhold, str);
    }

    //Blomst hovedfarge
    @Given("Velg {string} po Blomst hovedfarge filter")
    public void velgPoBlomstHovedfargeFilter(String str) {
        ReusableMethods.wait(2);
            try {
                PlantevalgMethods.velgBlomstFarge(str);
                ReusableMethods.wait(2);
            } catch (NoSuchElementException e) {
                search.avansert.click();
                search.blomstFarge.click();
                actions.moveToLocation(1, 1).click().perform();
                PlantevalgMethods.velgBlomstFarge(str);
                ReusableMethods.wait(2);
            }

    }

    @And("Bekreft alle planter  har {string} Blomst hovedfarge")
    public void bekreftAllePlanterHarBlomstHovedfarge(String str) {
        try {
            PlantevalgMethods.scroll();
            List<WebElement> planter = Driver.getDriver().findElements(By.cssSelector("button[class='_iconButton_zwn2h_1  _hasBorder_zwn2h_24 _sizeSmall_zwn2h_60 _shadow_zwn2h_21 _background_zwn2h_18']"));
            for (WebElement w : planter) {
                List <String> actualData = List.of(w.getAttribute("title").replaceAll(" ","").split(","));
                Assert.assertTrue(actualData.contains(str));
                System.out.println(w.getAttribute("title"));
            }
            actions.click(planter.get(random.nextInt(planter.size()))).perform();
            PlantevalgMethods.bekreftTrueStr(bekreftPage.blomstFarge, str);
        } catch (NoSuchElementException e) {
            tilbakeHovedsida();
        }
    }

    //E-plante
    @Given("Velg E-plante")
    public void velgEPlante() {
        ReusableMethods.wait(2);
        PlantevalgMethods.avansertFiltre("E-plante");
        search.eplante.click();
        ReusableMethods.wait(1);
    }

    @Then("Bekreft alle planter er E-Plante")
    public void bekreftAllePlanterErEPlante() {
        List<WebElement> allePlanter = Driver.getDriver().findElements(By.cssSelector("a[class='_plantListElement_ekgvi_1'] div[class^='_nameAndDescription_']"));
        actions.click(allePlanter.get(random.nextInt(allePlanter.size()))).perform();
        PlantevalgMethods.bekreftEquals(bekreftPage.ePlante, "Ja");
    }

    //Blomstringstid
    @Given("Velg {string} og {string} po {string} filter")
    public void velgOgPoFilter(String min, String max, String filter) {
        ReusableMethods.wait(2);
        PlantevalgMethods.avansertFiltre(filter);
        ReusableMethods.wait(2);
        PlantevalgMethods.filterMedSlider(filter, min, max);
    }

    @Then("Bekreft alle planter er mellom {int} - {int} Blomstringstid")
    public void bekreftAllePlanterErMellomBlomstringstid(int min, int max) {
        List<WebElement> planter = Driver.getDriver().findElements(By.cssSelector("div[class='_nameAndDescription_ekgvi_36']+div+div+div+div h2"));

        for (WebElement w : planter) {
            if (w.getText().length() > 3) {
                String first = w.getText().split("-")[0].trim();
                String second = w.getText().split("-")[1].trim();
                int intFirst;
                int intSecond;
                switch (first) {
                    case "jan":
                        intFirst = 1;
                        Assert.assertTrue(intFirst >= min && intFirst <= max);
                        break;
                    case "feb":
                        intFirst = 2;
                        Assert.assertTrue(intFirst >= min && intFirst <= max);
                        break;
                    case "mar":
                        intFirst = 3;
                        Assert.assertTrue(intFirst >= min && intFirst <= max);
                        break;
                    case "apr":
                        intFirst = 4;
                        Assert.assertTrue(intFirst >= min && intFirst <= max);
                        break;
                    case "mai":
                        intFirst = 5;
                        Assert.assertTrue(intFirst >= min && intFirst <= max);
                        break;
                    case "jun":
                        intFirst = 6;
                        Assert.assertTrue(intFirst >= min && intFirst <= max);
                        break;
                    case "jul":
                        intFirst = 7;
                        Assert.assertTrue(intFirst >= min && intFirst <= max);
                        break;
                    case "aug":
                        intFirst = 8;
                        Assert.assertTrue(intFirst >= min && intFirst <= max);
                        break;
                    case "sep":
                        intFirst = 9;
                        Assert.assertTrue(intFirst >= min && intFirst <= max);
                        break;
                    case "okt":
                        intFirst = 10;
                        Assert.assertTrue(intFirst >= min && intFirst <= max);
                        break;
                    case "nov":
                        intFirst = 11;
                        Assert.assertTrue(intFirst >= min && intFirst <= max);
                        break;
                    case "des":
                        intFirst = 12;
                        Assert.assertTrue(intFirst >= min && intFirst <= max);
                        break;
                }
                switch (second) {
                    case "jan":
                        intSecond = 1;
                        Assert.assertTrue(intSecond >= min && intSecond <= max);
                        break;
                    case "feb":
                        intSecond = 2;
                        Assert.assertTrue(intSecond >= min && intSecond <= max);
                        break;
                    case "mar":
                        intSecond = 3;
                        Assert.assertTrue(intSecond >= min && intSecond <= max);
                        break;
                    case "apr":
                        intSecond = 4;
                        Assert.assertTrue(intSecond >= min && intSecond <= max);
                        break;
                    case "mai":
                        intSecond = 5;
                        Assert.assertTrue(intSecond >= min && intSecond <= max);
                        break;
                    case "jun":
                        intSecond = 6;
                        Assert.assertTrue(intSecond >= min && intSecond <= max);
                        break;
                    case "jul":
                        intSecond = 7;
                        Assert.assertTrue(intSecond >= min && intSecond <= max);
                        break;
                    case "aug":
                        intSecond = 8;
                        Assert.assertTrue(intSecond >= min && intSecond <= max);
                        break;
                    case "sep":
                        intSecond = 9;
                        Assert.assertTrue(intSecond >= min && intSecond <= max);
                        break;
                    case "okt":
                        intSecond = 10;
                        Assert.assertTrue(intSecond >= min && intSecond <= max);
                        break;
                    case "nov":
                        intSecond = 11;
                        Assert.assertTrue(intSecond >= min && intSecond <= max);
                        break;
                    case "des":
                        intSecond = 12;
                        Assert.assertTrue(intSecond >= min && intSecond <= max);
                        break;
                }

            } else {

                String first = w.getText().trim();
                int intFirst;
                switch (first) {
                    case "jan":
                        intFirst = 1;
                        Assert.assertTrue(intFirst >= min && intFirst <= max);
                        break;
                    case "feb":
                        intFirst = 2;
                        Assert.assertTrue(intFirst >= min && intFirst <= max);
                        break;
                    case "mar":
                        intFirst = 3;
                        Assert.assertTrue(intFirst >= min && intFirst <= max);
                        break;
                    case "apr":
                        intFirst = 4;
                        Assert.assertTrue(intFirst >= min && intFirst <= max);
                        break;
                    case "mai":
                        intFirst = 5;
                        Assert.assertTrue(intFirst >= min && intFirst <= max);
                        break;
                    case "jun":
                        intFirst = 6;
                        Assert.assertTrue(intFirst >= min && intFirst <= max);
                        break;
                    case "jul":
                        intFirst = 7;
                        Assert.assertTrue(intFirst >= min && intFirst <= max);
                        break;
                    case "aug":
                        intFirst = 8;
                        Assert.assertTrue(intFirst >= min && intFirst <= max);
                        break;
                    case "sep":
                        intFirst = 9;
                        Assert.assertTrue(intFirst >= min && intFirst <= max);
                        break;
                    case "okt":
                        intFirst = 10;
                        Assert.assertTrue(intFirst >= min && intFirst <= max);
                        break;
                    case "nov":
                        intFirst = 11;
                        Assert.assertTrue(intFirst >= min && intFirst <= max);
                        break;
                    case "des":
                        intFirst = 12;
                        Assert.assertTrue(intFirst >= min && intFirst <= max);
                        break;
                }
            }
        }
        //planteside bekreft
        actions.click(planter.get(random.nextInt(planter.size()))).perform();
        String actual = bekreftPage.blomstringstid.getAttribute("title").split(":")[1];

        if (actual.length() > 5) {
            String first = actual.split("-")[0].trim();
            String second = actual.split("-")[1].trim();
            int intFirst;
            int intSecond;
            switch (first) {
                case "jan":
                    intFirst = 1;
                    Assert.assertTrue(intFirst >= min && intFirst <= max);
                    break;
                case "feb":
                    intFirst = 2;
                    Assert.assertTrue(intFirst >= min && intFirst <= max);
                    break;
                case "mar":
                    intFirst = 3;
                    Assert.assertTrue(intFirst >= min && intFirst <= max);
                    break;
                case "apr":
                    intFirst = 4;
                    Assert.assertTrue(intFirst >= min && intFirst <= max);
                    break;
                case "mai":
                    intFirst = 5;
                    Assert.assertTrue(intFirst >= min && intFirst <= max);
                    break;
                case "jun":
                    intFirst = 6;
                    Assert.assertTrue(intFirst >= min && intFirst <= max);
                    break;
                case "jul":
                    intFirst = 7;
                    Assert.assertTrue(intFirst >= min && intFirst <= max);
                    break;
                case "aug":
                    intFirst = 8;
                    Assert.assertTrue(intFirst >= min && intFirst <= max);
                    break;
                case "sep":
                    intFirst = 9;
                    Assert.assertTrue(intFirst >= min && intFirst <= max);
                    break;
                case "okt":
                    intFirst = 10;
                    Assert.assertTrue(intFirst >= min && intFirst <= max);
                    break;
                case "nov":
                    intFirst = 11;
                    Assert.assertTrue(intFirst >= min && intFirst <= max);
                    break;
                case "des":
                    intFirst = 12;
                    Assert.assertTrue(intFirst >= min && intFirst <= max);
                    break;
            }
            switch (second) {
                case "jan":
                    intSecond = 1;
                    Assert.assertTrue(intSecond >= min && intSecond <= max);
                    break;
                case "feb":
                    intSecond = 2;
                    Assert.assertTrue(intSecond >= min && intSecond <= max);
                    break;
                case "mar":
                    intSecond = 3;
                    Assert.assertTrue(intSecond >= min && intSecond <= max);
                    break;
                case "apr":
                    intSecond = 4;
                    Assert.assertTrue(intSecond >= min && intSecond <= max);
                    break;
                case "mai":
                    intSecond = 5;
                    Assert.assertTrue(intSecond >= min && intSecond <= max);
                    break;
                case "jun":
                    intSecond = 6;
                    Assert.assertTrue(intSecond >= min && intSecond <= max);
                    break;
                case "jul":
                    intSecond = 7;
                    Assert.assertTrue(intSecond >= min && intSecond <= max);
                    break;
                case "aug":
                    intSecond = 8;
                    Assert.assertTrue(intSecond >= min && intSecond <= max);
                    break;
                case "sep":
                    intSecond = 9;
                    Assert.assertTrue(intSecond >= min && intSecond <= max);
                    break;
                case "okt":
                    intSecond = 10;
                    Assert.assertTrue(intSecond >= min && intSecond <= max);
                    break;
                case "nov":
                    intSecond = 11;
                    Assert.assertTrue(intSecond >= min && intSecond <= max);
                    break;
                case "des":
                    intSecond = 12;
                    Assert.assertTrue(intSecond >= min && intSecond <= max);
                    break;
            }

        } else {

            String first = actual.trim();
            int intFirst;
            switch (first) {
                case "jan":
                    intFirst = 1;
                    Assert.assertTrue(intFirst >= min && intFirst <= max);
                    break;
                case "feb":
                    intFirst = 2;
                    Assert.assertTrue(intFirst >= min && intFirst <= max);
                    break;
                case "mar":
                    intFirst = 3;
                    Assert.assertTrue(intFirst >= min && intFirst <= max);
                    break;
                case "apr":
                    intFirst = 4;
                    Assert.assertTrue(intFirst >= min && intFirst <= max);
                    break;
                case "mai":
                    intFirst = 5;
                    Assert.assertTrue(intFirst >= min && intFirst <= max);
                    break;
                case "jun":
                    intFirst = 6;
                    Assert.assertTrue(intFirst >= min && intFirst <= max);
                    break;
                case "jul":
                    intFirst = 7;
                    Assert.assertTrue(intFirst >= min && intFirst <= max);
                    break;
                case "aug":
                    intFirst = 8;
                    Assert.assertTrue(intFirst >= min && intFirst <= max);
                    break;
                case "sep":
                    intFirst = 9;
                    Assert.assertTrue(intFirst >= min && intFirst <= max);
                    break;
                case "okt":
                    intFirst = 10;
                    Assert.assertTrue(intFirst >= min && intFirst <= max);
                    break;
                case "nov":
                    intFirst = 11;
                    Assert.assertTrue(intFirst >= min && intFirst <= max);
                    break;
                case "des":
                    intFirst = 12;
                    Assert.assertTrue(intFirst >= min && intFirst <= max);
                    break;
            }


        }

        System.out.println(bekreftPage.blomstringstid.getAttribute("title").split(":")[0] + " til " + Driver.getDriver().findElement(By.xpath("(//span[@class='_italic_yzjvg_6'])[1]")).getText() + " er mellom eller lik: " + min + "-" + max + " som forventet");


    }


    @Given("Bruk sokefelt for finne planter")
    public void brukSokefeltForFinnePlanter() {
        PlantevalgMethods.scroll();
        PlantevalgMethods.scroll();
        PlantevalgMethods.scroll();


        List<WebElement> plante = Driver.getDriver().findElements(By.xpath("(//div[@class='_name_ekgvi_36'])[" + random.nextInt(150) + "]//child::span//child::span"));
        String planteName = "";
        for (WebElement w : plante) {
            planteName = planteName + w.getText() + " ";
        }
        System.out.println("planteName = " + planteName);
        hjemmeside.sokefelte.sendKeys(planteName.trim());
        ReusableMethods.wait(1);
        WebElement planteForventet = Driver.getDriver().findElement(By.cssSelector("div[class='_illustration_ekgvi_25']"));

        planteForventet.click();

        List<WebElement> planteValg = Driver.getDriver().findElements(By.xpath("//div[@class='_component_yzjvg_1']//child::span//child::span"));
        String planteNameValg = "";
        for (WebElement w : planteValg) {
            planteNameValg = planteNameValg + w.getText() + " ";
        }
        System.out.println("planteNameValg = " + planteNameValg);
        Assert.assertEquals(planteName.trim(), planteNameValg.trim());


    }
}
