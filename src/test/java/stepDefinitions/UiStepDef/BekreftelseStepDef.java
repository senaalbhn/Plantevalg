package stepDefinitions.UiStepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.BekreftPage;
import utilities.Driver;
import utilities.PlantevalgMethods;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class BekreftelseStepDef {
    SoftAssert softAssert = new SoftAssert();
    BekreftPage bekreft= new BekreftPage();



    @Given("Bekreft alle informasjon til planten")
    public void bekreftAlleInformasjonTilPlanten() {
        ////////////////////////Botanical Navn////////////////////////
        String actualName=
                Driver.getDriver().findElement(By.xpath("(//span[@class='_italic_yzjvg_6'])[1]")).getText()+" "+                //Avocadoo
                        Driver.getDriver().findElement(By.xpath("(//span//child::span)[2]")).getText()+" "+                     //x
                        Driver.getDriver().findElement(By.xpath("(//span[@class='_italic_yzjvg_6'])[2]")).getText()+" ssp. "+   //artsepitet
                        Driver.getDriver().findElement(By.xpath("(//span[@class='_italic_yzjvg_6'])[3]")).getText()+" var. "+   //Underart
                        Driver.getDriver().findElement(By.xpath("(//span[@class='_italic_yzjvg_6'])[4]")).getText()+" f. "+     //Varietet
                        Driver.getDriver().findElement(By.xpath("(//span[@class='_italic_yzjvg_6'])[5]")).getText()+" "+        //Form
                        Driver.getDriver().findElement(By.xpath("(//span//child::span)[10]")).getText()+" "+                    //Kultivar
                        Driver.getDriver().findElement(By.xpath("(//span//child::span)[11]")).getText()+" "+                    //Frøkilde
                        Driver.getDriver().findElement(By.xpath("(//span//descendant::span)[12]")).getText();      //Varemerke
        System.out.println(actualName);
        String expectedName="Avocadoo x artsepitet ssp. Underart var. Varietet f. Form 'Kultivar' fk Frøkilde Varemerke ™";
        System.out.println(expectedName);
        softAssert.assertEquals(actualName,expectedName);
        ////////////////////////Navn og opprinnelse////////////////////////
        //Opphav
        String opphav= bekreft.opphav.getAttribute("title");
        String actualOpphav= opphav.split(":")[1].trim();
        String expectedOpphav="SlektPrimaer artsepitetprimaer X SlektSekundaer artsepitetsekundaer";
        softAssert.assertEquals(actualOpphav,expectedOpphav);
        //Synonym
        //Andre Språk
        //Viltvoksende i Norge
        String viltvoksende= bekreft.viltvoksende.getAttribute("title");
        String actualVil= viltvoksende.split(":")[1].trim();
        String expectedVil="Ja";
        softAssert.assertEquals(actualVil,expectedVil);
        //Produsert i Norge
        String produsert= bekreft.produsert.getAttribute("title");
        String actualPro= produsert.split(":")[1].trim();
        String expectedPro="Ja";
        softAssert.assertEquals(actualPro,expectedPro);
        //E-Plante
        String eplante= bekreft.ePlante.getAttribute("title");
        String actualE= eplante.split(":")[1].trim();
        String expectedE="Ja";
        softAssert.assertEquals(actualE,expectedE);
        ////////////////////////Egenskaper////////////////////////
        //plantegruppe
        String plantegruppe= bekreft.plantegruppe.getAttribute("title");
        String actualPlantegr= plantegruppe.split(":")[1].trim();
        String expectedPlantegr="Trær";
        softAssert.assertEquals(actualPlantegr,expectedPlantegr);
        //Undergruppe
        String undergruppe= bekreft.undergruppe.getAttribute("title");
        String actualUndergruppe= undergruppe.split(":")[1].trim();
        String expectedUndergruppe="Alltidgrønn";
        softAssert.assertEquals(actualUndergruppe,expectedUndergruppe);
        //Pollinator
        String pollinator= bekreft.pollinator.getAttribute("title");
        String actualPollinator= pollinator.split(":")[1].trim();
        String expectedPollinator="Ja";
        softAssert.assertEquals(actualPollinator,expectedPollinator);
        //Matnyttig
        String matnyttig= bekreft.matnyttig.getAttribute("title");
        String actualMatnyttig= matnyttig.split(":")[1].trim();
        String expectedMatnyttig="Honningplante";
        softAssert.assertEquals(actualMatnyttig,expectedMatnyttig);
        //Allergi
        String Allergi= bekreft.allergi.getAttribute("title");
        String actualAllergi= Allergi.split(":")[1].trim();
        String expectedAllergi="Hudkontakt";
        softAssert.assertEquals(actualAllergi,expectedAllergi);
        //Naturlig levealder
        String naturlig= bekreft.naturlig.getAttribute("title");
        String actualNaturlig= naturlig.split(":")[1].trim();
        String expectedNaturlig="Lang (100-300 år)";
        softAssert.assertEquals(actualNaturlig,expectedNaturlig);
        //Restriksjoner og vern
        String restriksjoner= bekreft.restriksjoner.getAttribute("title");
        String actualRestriksjoner= restriksjoner.split(":")[1].trim();
        String expectedRestriksjoner="Søknadspliktig iht forskrift fremmede organismer vedl 5";
        softAssert.assertEquals(actualRestriksjoner,expectedRestriksjoner);
        //Vegetativ
        String vegetativ= bekreft.vegetativ.getAttribute("title");
        String actualVegetativ= vegetativ.split(":")[1].trim();
        String expectedVegetativ="Ja";
        softAssert.assertEquals(actualVegetativ,expectedVegetativ);
        //Frø
        String fro= bekreft.fro.getAttribute("title");
        String actualFro= fro.split(":")[1].trim();
        String expectedFro="Ja";
        softAssert.assertEquals(actualUndergruppe,expectedUndergruppe);
        ////////////////////////Størrelse og form////////////////////////
        //Høyde
        String hoyde= bekreft.hoyde.getAttribute("title");
        String actualHoyde= hoyde.split(":")[1].trim();
        String expectedHoyde="1cm - 10m";
        softAssert.assertEquals(actualHoyde,expectedHoyde);
        //Bredde
        String bredde= bekreft.bredde.getAttribute("title");
        String actualBredde= bredde.split(":")[1].trim();
        String expectedBredde="Smal (<1/2 av høyde)";
        softAssert.assertEquals(actualBredde,expectedBredde);
        //Form
        String form= bekreft.form.getAttribute("title");
        String actualForm= form.split(":")[1].trim();
        String expectedForm="Klatrende";
        softAssert.assertEquals(actualForm,expectedForm);
        //Rottype
        String rottype= bekreft.rottype.getAttribute("title");
        String actualRottype= rottype.split(":")[1].trim();
        String expectedRottype="Pålerot";
        softAssert.assertEquals(actualRottype,expectedRottype);
        ////////////////////////Bruksområde////////////////////////
        //Bruksområde
        String bruksom= bekreft.bruksomrode.getAttribute("title");
        String actualBruksom= bruksom.split(":")[1].trim();
        String expectedBruksom="Solitær, Gruppe, Markdekkende, Allé/trerekke, Fri hekk, Slyng-/klatreplante, Klippet hekk";
        softAssert.assertEquals(actualBruksom,expectedBruksom);
        //Solitær
        String solitaer= bekreft.solitaer.getAttribute("title");
        String actualSolitaer= solitaer.split(":")[1].trim();
        String expectedSolitaer="5cm - 15m";
        softAssert.assertEquals(actualSolitaer,expectedSolitaer);
        //Klippet hekk
        String klippet= bekreft.klippet.getAttribute("title");
        String actualKlippet= klippet.split(":")[1].trim();
        String expectedKlippet="5cm - 15m";
        softAssert.assertEquals(actualKlippet,expectedKlippet);
        //Dekkevne
        String dekkevne= bekreft.dekkevne.getAttribute("title");
        String actualDekkevne= dekkevne.split(":")[1].trim();
        String expectedDekkevne="Liten";
        softAssert.assertEquals(actualDekkevne,expectedDekkevne);
        //Beskjæringsbehov
        String beskjaeringsbehov= bekreft.beskjaeringsbehov.getAttribute("title");
        String actualBeskjaeringsbehov= beskjaeringsbehov.split(":")[1].trim();
        String expectedBeskjaeringsbehov="Middels";
        softAssert.assertEquals(actualBeskjaeringsbehov,expectedBeskjaeringsbehov);
        ////////////////////////Plassering////////////////////////
        //Lysforhold
        String lysforhold= bekreft.lysforhold.getAttribute("title");
        String actualLysforhold= lysforhold.split(":")[1].trim();
        String expectedLysforhold="Sol, Skygge, Halvskygge";
        softAssert.assertEquals(actualLysforhold,expectedLysforhold);
        //Jord
        String jord= bekreft.jord.getAttribute("title");
        String actualJord= jord.split(":")[1].trim();
        String expectedJord="Tung, leirrik jord med dårlig dreneringsevne, Mineraljord med middels dreneringsevne, Moldrik jord med god dreneringsevne, Lett sandrik jord med god dreneringsevne";
        softAssert.assertEquals(actualJord,expectedJord);
        //Fuktighetsforhold
        String fuktighet= bekreft.fuktighetsforhold.getAttribute("title");
        String actualFuktighets= fuktighet.split(":")[1].trim();
        String expectedFuktighets="Tørt, Vannmettet, Jevnt fuktig/aldri helt tørt, Periodevis fuktig eller tørt";
        softAssert.assertEquals(actualFuktighets,expectedFuktighets);
        //Hardførhet innland
        String hardforhetinnland= bekreft.hardforhetinnland.getAttribute("title");
        String actualHardinnland= hardforhetinnland.split(":")[1].trim();
        String expectedHardinnland="H2 - H4";
        softAssert.assertEquals(actualHardinnland,expectedHardinnland);
        //Hardførhet kyst
        String hardforhetKyst= bekreft.hardforhetKyst.getAttribute("title");
        String actualHardKyst= hardforhetKyst.split(":")[1].trim();
        String expectedHardKyst="H3 - H5";
        softAssert.assertEquals(actualHardKyst,expectedHardKyst);
        //pH
        String pH= bekreft.pH.getAttribute("title");
        String actualPh= pH.split(":")[1].trim();
        String expectedPh="Basisk >7";
        softAssert.assertEquals(actualPh,expectedPh);
        //Salttoleranse
        String salttoleranse= bekreft.salttoleranse.getAttribute("title");
        String actualSalttoleranse= salttoleranse.split(":")[1].trim();
        String expectedSalttoleranse="Svak mot salt i jord";
        softAssert.assertEquals(actualSalttoleranse,expectedSalttoleranse);
        //Vindtoleranse
        String vindtoleranse= bekreft.vindtoleranse.getAttribute("title");
        String actualVindtoleranse= vindtoleranse.split(":")[1].trim();
        String expectedVindtoleranse="Tåler noe vind";
        softAssert.assertEquals(actualVindtoleranse,expectedVindtoleranse);
        ////////////////////////Prydverdi////////////////////////
        //Blomstringstid
        String blomstringstid= bekreft.blomstringstid.getAttribute("title");
        String actualBlomstringstid= blomstringstid.split(":")[1].trim();
        String expectedBlomstringstid="februar - juni";
        softAssert.assertEquals(actualBlomstringstid,expectedBlomstringstid);
        //Remontering
        String remontering= bekreft.remontering.getAttribute("title");
        String actualRemontering= remontering.split(":")[1].trim();
        String expectedRemontering="juli - oktober";
        softAssert.assertEquals(actualRemontering,expectedRemontering);
        //Blomst
        String blomst= bekreft.blomst.getAttribute("title");
        String actualBlomst= blomst.split(":")[1].trim();
        String expectedBlomst="Flere farger innen arten";
        softAssert.assertEquals(actualBlomst,expectedBlomst);
        //Blomst farge
        String blomstFarge= bekreft.blomstFarge.getAttribute("title");
        String actualblomstFarge= blomstFarge.split(":")[1].trim();
        String expectedblomstFarge="Hvit";
        softAssert.assertEquals(actualblomstFarge,expectedblomstFarge);
        //Blomst andre farger
        String blomstAndreFarger= bekreft.blomstAndreFarger.getAttribute("title");
        String actualblomstAndreFarger= blomstAndreFarger.split(":")[1].trim();
        String expectedblomstAndreFarger="Lilla";
        softAssert.assertEquals(actualblomstAndreFarger,expectedblomstAndreFarger);
        //Blomst prydverdi
        String blomstPrydverdi= bekreft.blomstPrydverdi.getAttribute("title");
        String actualblomstPrydverdi= blomstPrydverdi.split(":")[1].trim();
        String expectedblomstPrydverdi="Lite betydelig";
        softAssert.assertEquals(actualblomstPrydverdi,expectedblomstPrydverdi);
        //Flyt
        String flyt= bekreft.fylt.getAttribute("title");
        String actualFlyt= flyt.split(":")[1].trim();
        String expectedFlyt="Ja";
        softAssert.assertEquals(actualFlyt,expectedFlyt);
        //Duft
        String duft= bekreft.duft.getAttribute("title");
        String actualDuft= duft.split(":")[1].trim();
        String expectedDuft="Ja";
        softAssert.assertEquals(actualDuft,expectedDuft);
        //Duft Blad
        String duftBlad= bekreft.duftBlad.getAttribute("title");
        String actualduftBlad= duftBlad.split(":")[1].trim();
        String expectedduftBlad="Ja";
        softAssert.assertEquals(actualduftBlad,expectedduftBlad);
        //Fruktfarge
        String fruktfarge= bekreft.fruktfarge.getAttribute("title");
        String actualFruktfarge= fruktfarge.split(":")[1].trim();
        String expectedFruktfarge="Svart";
        softAssert.assertEquals(actualFruktfarge,expectedFruktfarge);
        //Frukt tid
        String fruktTid= bekreft.fruktTid.getAttribute("title");
        String actualfruktTid= fruktTid.split(":")[1].trim();
        String expectedfruktTid="Sommer";
        softAssert.assertEquals(actualfruktTid,expectedfruktTid);
        //Blad Farge
        String bladfarge= bekreft.bladfarge.getAttribute("title");
        String actualBladFarge= bladfarge.split(":")[1].trim();
        String expectedBladFarge="Flerfarget/broket";
        softAssert.assertEquals(actualBladFarge,expectedBladFarge);
        //Bladform
        String bladform= bekreft.bladform.getAttribute("title");
        String actualBladform= bladform.split(":")[1].trim();
        String expectedBladform="Fliket";
        softAssert.assertEquals(actualBladform,expectedBladform);
        //Bladstørrelse
        String bladstorrelse= bekreft.bladstorrelse.getAttribute("title");
        String actualBladstorrelse= bladstorrelse.split(":")[1].trim();
        String expectedBladstorrelse="Liten";
        softAssert.assertEquals(actualBladstorrelse,expectedBladstorrelse);
        //Høstfarger
        String hostfarger= bekreft.hostfarger.getAttribute("title");
        String actualHostfarger= hostfarger.split(":")[1].trim();
        String expectedHostfarger="Guloransje";
        softAssert.assertEquals(actualHostfarger,expectedHostfarger);
        //Torner
        String torner= bekreft.torner.getAttribute("title");
        String actualTorner= torner.split(":")[1].trim();
        String expectedTorner="Kan ha torner";
        softAssert.assertEquals(actualTorner,expectedTorner);
        //Vinter-karakter
        String vinterKarakter= bekreft.vinterKarakter.getAttribute("title");
        String actualvinterKarakter= vinterKarakter.split(":")[1].trim();
        String expectedvinterKarakter="Silhuett";
        softAssert.assertEquals(actualvinterKarakter,expectedvinterKarakter);
        //Stamme barkstruktur
        String stammeBarkstruktur= bekreft.stammeBarkstruktur.getAttribute("title");
        String actualstammeBarkstruktur= stammeBarkstruktur.split(":")[1].trim();
        String expectedstammeBarkstruktur="Stripete";
        softAssert.assertEquals(actualstammeBarkstruktur,expectedstammeBarkstruktur);
        //Stamme barkfarge
        String stammeBarkfarge= bekreft.stammeBarkfarge.getAttribute("title");
        String actualstammeBarkfarge= stammeBarkfarge.split(":")[1].trim();
        String expectedstammeBarkfarge="Uanselig (brun)";
        softAssert.assertEquals(actualstammeBarkfarge,expectedstammeBarkfarge);
        //Skudd/greiner farge
        String skudd= bekreft.skudd.getAttribute("title");
        String actualSkudd= skudd.split(":")[1].trim();
        String expectedSkudd="Rødbrun";
        softAssert.assertEquals(actualSkudd,expectedSkudd);

        ////////////////////////Tilleggsinformasjon////////////////////////
        //Tilleggsinformasjon
        String tilleggsopplysninger= bekreft.tilleggsopplysninger.getAttribute("title");
        String actualTilleggs= tilleggsopplysninger.split(":")[1].trim();
        String expectedTilleggs="Tilleggsopplysninger";
        softAssert.assertEquals(actualTilleggs,expectedTilleggs);

        ////////////////////////Forskning////////////////////////
        //Forskeres Erfaring med planten
        String forskeresErfaring= bekreft.forskeres.getText();
        String actualforskeresErfaring= forskeresErfaring.trim();
        String expectedforskeresErfaring="Forskeres erfaring med planten";
        softAssert.assertEquals(actualforskeresErfaring,expectedforskeresErfaring);
        //Forskningsresultater
        String actualForskningsresultater = Driver.getDriver().findElement(By.xpath("(//div[@class=' ']//child::span)[1]")).getText()+" "+
                Driver.getDriver().findElement(By.xpath("(//div[@class=' ']//child::span)[2]")).getText()+" "+
                Driver.getDriver().findElement(By.xpath("(//div[@class=' ']//child::span)[3]")).getText()+" "+
                Driver.getDriver().findElement(By.xpath("(//div[@class=' ']//child::span)[4]")).getText()+
                Driver.getDriver().findElement(By.xpath("(//div[@class=' ']//child::span)[5]")).getText()+" "+
                Driver.getDriver().findElement(By.xpath("(//div[@class=' ']//child::span)[6]")).getText()+" "+
                Driver.getDriver().findElement(By.xpath("(//div[@class=' ']//child::span)[7]")).getText()+" "+
                Driver.getDriver().findElement(By.xpath("(//div[@class=' ']//child::span)[9]")).getText();
        LocalDate myCurrentDate = LocalDate.now();
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("d.M.yyyy");
        String date = dtf1.format(myCurrentDate);
        String expectedForskningsresultater ="Forfattere (2024) Tittel Utgiver, side 1-2. ISBN ISBN123456. Tilgjengelig fra: https://www.example.com/file.pdf (Hentet "+date+")";
        System.out.println(actualForskningsresultater);
        System.out.println(expectedForskningsresultater);
        softAssert.assertEquals(actualForskningsresultater,expectedForskningsresultater);

        softAssert.assertAll();
    }

    @Given("Bekreft alle informasjon til planten etter redigere")
    public void bekreftAlleInformasjonTilPlantenEtterRedigere() {
        ////////////////////////Botanical Navn////////////////////////
        String actualName=
                        Driver.getDriver().findElement(By.xpath("(//span//child::span)[1]")).getText()+" "+                     //x
                        Driver.getDriver().findElement(By.xpath("(//span[@class='_italic_yzjvg_6'])[1]")).getText()+" "+        //Avocadoo
                        Driver.getDriver().findElement(By.xpath("(//span[@class='_italic_yzjvg_6'])[2]")).getText()+" ssp. "+   //artsepitet
                        Driver.getDriver().findElement(By.xpath("(//span[@class='_italic_yzjvg_6'])[3]")).getText()+" var. "+   //Underart
                        Driver.getDriver().findElement(By.xpath("(//span[@class='_italic_yzjvg_6'])[4]")).getText()+" f. "+     //Varietet
                        Driver.getDriver().findElement(By.xpath("(//span[@class='_italic_yzjvg_6'])[5]")).getText()+" "+        //Form
                        Driver.getDriver().findElement(By.xpath("(//span//child::span)[10]")).getText()+" "+                    //Kultivar
                        Driver.getDriver().findElement(By.xpath("(//span//child::span)[11]")).getText()+" "+                    //Frøkilde
                        Driver.getDriver().findElement(By.xpath("(//span//descendant::span)[12]")).getText();      //Varemerke
        System.out.println(actualName);
        String expectedName="X Avocado2 artsepitet2 ssp. Underart2 var. Varietet2 f. Form 'Kultivar2' fk Frøkilde2 Varemerke2 ®";
        System.out.println(expectedName);
        softAssert.assertEquals(actualName,expectedName);
        ////////////////////////Navn og opprinnelse////////////////////////
        //Opphav
        String opphav= bekreft.opphav.getAttribute("title");
        String actualOpphav= opphav.split(":")[1].trim();
        String expectedOpphav="PrimaerSlekt2 primaerartsepitet2 Un Vr Fr 'Kl' Fr ™ X SekundaerSlekt2 sekundaerartsepitet2 Un2 Vr2 Fr2 'Kl2' Fr2 ™";
        softAssert.assertEquals(actualOpphav,expectedOpphav);
        //Synonym
        //Andre Språk
        //Viltvoksende i Norge
        String viltvoksende= bekreft.viltvoksende.getAttribute("title");
        String actualVil= viltvoksende.split(":")[1].trim();
        String expectedVil="Nei";
        softAssert.assertEquals(actualVil,expectedVil);
        //Produsert i Norge
        String produsert= bekreft.produsert.getAttribute("title");
        String actualPro= produsert.split(":")[1].trim();
        String expectedPro="Nei";
        softAssert.assertEquals(actualPro,expectedPro);
        //E-Plante
        String eplante= bekreft.ePlante.getAttribute("title");
        String actualE= eplante.split(":")[1].trim();
        String expectedE="Nei";
        softAssert.assertEquals(actualE,expectedE);
        ////////////////////////Egenskaper////////////////////////
        //plantegruppe
        String plantegruppe= bekreft.plantegruppe.getAttribute("title");
        String actualPlantegr= plantegruppe.split(":")[1].trim();
        String expectedPlantegr="Trær";
        softAssert.assertEquals(actualPlantegr,expectedPlantegr);
        //Undergruppe
        String undergruppe= bekreft.undergruppe.getAttribute("title");
        String actualUndergruppe= undergruppe.split(":")[1].trim();
        String expectedUndergruppe="Løvfellende";
        softAssert.assertEquals(actualUndergruppe,expectedUndergruppe);
        //Pollinator
        String pollinator= bekreft.pollinator.getAttribute("title");
        String actualPollinator= pollinator.split(":")[1].trim();
        String expectedPollinator="Ukjent";
        softAssert.assertEquals(actualPollinator,expectedPollinator);
        //Matnyttig
        String matnyttig= bekreft.matnyttig.getAttribute("title");
        String actualMatnyttig= matnyttig.split(":")[1].trim();
        String expectedMatnyttig="Spiselig";
        softAssert.assertEquals(actualMatnyttig,expectedMatnyttig);
        //Allergi
        String Allergi= bekreft.allergi.getAttribute("title");
        String actualAllergi= Allergi.split(":")[1].trim();
        String expectedAllergi="Sterk blomsterduft";
        softAssert.assertEquals(actualAllergi,expectedAllergi);
        //Naturlig levealder
        String naturlig= bekreft.naturlig.getAttribute("title");
        String actualNaturlig= naturlig.split(":")[1].trim();
        String expectedNaturlig="Middels (20-50 år)";
        softAssert.assertEquals(actualNaturlig,expectedNaturlig);
        //Restriksjoner og vern
        String restriksjoner= bekreft.restriksjoner.getAttribute("title");
        String actualRestriksjoner= restriksjoner.split(":")[1].trim();
        String expectedRestriksjoner="Søknadspliktig iht forskrift fremmede organismer vedl 5, Forbudt iht forskrift fremmede organismer vedl 1";
        softAssert.assertEquals(actualRestriksjoner,expectedRestriksjoner);
        //Vegetativ
        String vegetativ= bekreft.vegetativ.getAttribute("title");
        String actualVegetativ= vegetativ.split(":")[1].trim();
        String expectedVegetativ="Nei";
        softAssert.assertEquals(actualVegetativ,expectedVegetativ);
        //Frø
        String fro= bekreft.fro.getAttribute("title");
        String actualFro= fro.split(":")[1].trim();
        String expectedFro="Nei";
        softAssert.assertEquals(actualUndergruppe,expectedUndergruppe);
        ////////////////////////Størrelse og form////////////////////////
        //Høyde
        String hoyde= bekreft.hoyde.getAttribute("title");
        String actualHoyde= hoyde.split(":")[1].trim();
        String expectedHoyde="1m - 28,9m";
        softAssert.assertEquals(actualHoyde,expectedHoyde);
        //Bredde
        String bredde= bekreft.bredde.getAttribute("title");
        String actualBredde= bredde.split(":")[1].trim();
        String expectedBredde="Bred (>1/2 av høyde)";
        softAssert.assertEquals(actualBredde,expectedBredde);
        //Form
        String form= bekreft.form.getAttribute("title");
        String actualForm= form.split(":")[1].trim();
        String expectedForm="Slyngende";
        softAssert.assertEquals(actualForm,expectedForm);
        //Rottype
        String rottype= bekreft.rottype.getAttribute("title");
        String actualRottype= rottype.split(":")[1].trim();
        String expectedRottype="Hjerterot";
        softAssert.assertEquals(actualRottype,expectedRottype);
        ////////////////////////Bruksområde////////////////////////
        //Bruksområde

        //Solitær
        String solitaer= bekreft.solitaer.getAttribute("title");
        String actualSolitaer= solitaer.split(":")[1].trim();
        String expectedSolitaer="15,67m - 25m";
        softAssert.assertEquals(actualSolitaer,expectedSolitaer);
        //Klippet hekk
        String klippet= bekreft.klippet.getAttribute("title");
        String actualKlippet= klippet.split(":")[1].trim();
        String expectedKlippet="15,67m - 25m";
        softAssert.assertEquals(actualKlippet,expectedKlippet);
        //Dekkevne
        String dekkevne= bekreft.dekkevne.getAttribute("title");
        String actualDekkevne= dekkevne.split(":")[1].trim();
        String expectedDekkevne="Stor";
        softAssert.assertEquals(actualDekkevne,expectedDekkevne);
        //Beskjæringsbehov
        String beskjaeringsbehov= bekreft.beskjaeringsbehov.getAttribute("title");
        String actualBeskjaeringsbehov= beskjaeringsbehov.split(":")[1].trim();
        String expectedBeskjaeringsbehov="Lite";
        softAssert.assertEquals(actualBeskjaeringsbehov,expectedBeskjaeringsbehov);
        ////////////////////////Plassering////////////////////////
        //Lysforhold

        //Jord

        //Fuktighetsforhold

        //Hardførhet innland
        String hardforhetinnland= bekreft.hardforhetinnland.getAttribute("title");
        String actualHardinnland= hardforhetinnland.split(":")[1].trim();
        String expectedHardinnland="H1 - H7";
        softAssert.assertEquals(actualHardinnland,expectedHardinnland);
        //Hardførhet kyst
        String hardforhetKyst= bekreft.hardforhetKyst.getAttribute("title");
        String actualHardKyst= hardforhetKyst.split(":")[1].trim();
        String expectedHardKyst="H6 - H8";
        softAssert.assertEquals(actualHardKyst,expectedHardKyst);
        //pH
        String pH= bekreft.pH.getAttribute("title");
        String actualPh= pH.split(":")[1].trim();
        String expectedPh="Middels 5,5-7, Basisk >7";
        softAssert.assertEquals(actualPh,expectedPh);
        //Salttoleranse
        String salttoleranse= bekreft.salttoleranse.getAttribute("title");
        String actualSalttoleranse= salttoleranse.split(":")[1].trim();
        String expectedSalttoleranse="Toleranse for salt i luft, Svak mot salt i jord";
        softAssert.assertEquals(actualSalttoleranse,expectedSalttoleranse);
        //Vindtoleranse
        String vindtoleranse= bekreft.vindtoleranse.getAttribute("title");
        String actualVindtoleranse= vindtoleranse.split(":")[1].trim();
        String expectedVindtoleranse="Bør stå i le";
        softAssert.assertEquals(actualVindtoleranse,expectedVindtoleranse);
        ////////////////////////Prydverdi////////////////////////
        //Blomstringstid
        String blomstringstid= bekreft.blomstringstid.getAttribute("title");
        String actualBlomstringstid= blomstringstid.split(":")[1].trim();
        String expectedBlomstringstid="januar - mai";
        softAssert.assertEquals(actualBlomstringstid,expectedBlomstringstid);
        //Remontering
        String remontering= bekreft.remontering.getAttribute("title");
        String actualRemontering= remontering.split(":")[1].trim();
        String expectedRemontering="august - desember";
        softAssert.assertEquals(actualRemontering,expectedRemontering);
        //Blomst
        String blomst= bekreft.blomst.getAttribute("title");
        String actualBlomst= blomst.split(":")[1].trim();
        String expectedBlomst="Flerfarget blomst, Flere farger innen arten";
        softAssert.assertEquals(actualBlomst,expectedBlomst);
        //Blomst farge
        String blomstFarge= bekreft.blomstFarge.getAttribute("title");
        String actualblomstFarge= blomstFarge.split(":")[1].trim();
        String expectedblomstFarge="Hvit, Svart";
        softAssert.assertEquals(actualblomstFarge,expectedblomstFarge);
        //Blomst andre farger
        String blomstAndreFarger= bekreft.blomstAndreFarger.getAttribute("title");
        String actualblomstAndreFarger= blomstAndreFarger.split(":")[1].trim();
        String expectedblomstAndreFarger="Lilla, Rosa";
        softAssert.assertEquals(actualblomstAndreFarger,expectedblomstAndreFarger);
        //Blomst prydverdi
        String blomstPrydverdi= bekreft.blomstPrydverdi.getAttribute("title");
        String actualblomstPrydverdi= blomstPrydverdi.split(":")[1].trim();
        String expectedblomstPrydverdi="Spesielt flott";
        softAssert.assertEquals(actualblomstPrydverdi,expectedblomstPrydverdi);
        //Flyt
        String flyt= bekreft.fylt.getAttribute("title");
        String actualFlyt= flyt.split(":")[1].trim();
        String expectedFlyt="Nei";
        softAssert.assertEquals(actualFlyt,expectedFlyt);
        //Duft

        //Duft Blad

        //Fruktfarge
        String fruktfarge= bekreft.fruktfarge.getAttribute("title");
        String actualFruktfarge= fruktfarge.split(":")[1].trim();
        String expectedFruktfarge="Uanselig/grønn/brun";
        softAssert.assertEquals(actualFruktfarge,expectedFruktfarge);
        //Frukt tid
        String fruktTid= bekreft.fruktTid.getAttribute("title");
        String actualfruktTid= fruktTid.split(":")[1].trim();
        String expectedfruktTid="Sommer, Seinhøst";
        softAssert.assertEquals(actualfruktTid,expectedfruktTid);
        //Blad Farge
        String bladfarge= bekreft.bladfarge.getAttribute("title");
        String actualBladFarge= bladfarge.split(":")[1].trim();
        String expectedBladFarge="Grå/sølv";
        softAssert.assertEquals(actualBladFarge,expectedBladFarge);
        //Bladform
        String bladform= bekreft.bladform.getAttribute("title");
        String actualBladform= bladform.split(":")[1].trim();
        String expectedBladform="Rund, Fliket";
        softAssert.assertEquals(actualBladform,expectedBladform);
        //Bladstørrelse
        String bladstorrelse= bekreft.bladstorrelse.getAttribute("title");
        String actualBladstorrelse= bladstorrelse.split(":")[1].trim();
        String expectedBladstorrelse="Middels";
        softAssert.assertEquals(actualBladstorrelse,expectedBladstorrelse);
        //Høstfarger
        String hostfarger= bekreft.hostfarger.getAttribute("title");
        String actualHostfarger= hostfarger.split(":")[1].trim();
        String expectedHostfarger="Rødlilla, Guloransje";
        softAssert.assertEquals(actualHostfarger,expectedHostfarger);
        //Torner
        String torner= bekreft.torner.getAttribute("title");
        String actualTorner= torner.split(":")[1].trim();
        String expectedTorner="Uten torner";
        softAssert.assertEquals(actualTorner,expectedTorner);
        //Vinter-karakter
        String vinterKarakter= bekreft.vinterKarakter.getAttribute("title");
        String actualvinterKarakter= vinterKarakter.split(":")[1].trim();
        String expectedvinterKarakter="Silhuett, Frø-/Fruktstand";
        softAssert.assertEquals(actualvinterKarakter,expectedvinterKarakter);
        //Stamme barkstruktur
        String stammeBarkstruktur= bekreft.stammeBarkstruktur.getAttribute("title");
        String actualstammeBarkstruktur= stammeBarkstruktur.split(":")[1].trim();
        String expectedstammeBarkstruktur="Glatt, Stripete";
        softAssert.assertEquals(actualstammeBarkstruktur,expectedstammeBarkstruktur);
        //Stamme barkfarge
        String stammeBarkfarge= bekreft.stammeBarkfarge.getAttribute("title");
        String actualstammeBarkfarge= stammeBarkfarge.split(":")[1].trim();
        String expectedstammeBarkfarge="Uanselig (brun), Gul (grønn)";
        softAssert.assertEquals(actualstammeBarkfarge,expectedstammeBarkfarge);
        //Skudd/greiner farge
        String skudd= bekreft.skudd.getAttribute("title");
        String actualSkudd= skudd.split(":")[1].trim();
        String expectedSkudd="Grå, Rødbrun";
        softAssert.assertEquals(actualSkudd,expectedSkudd);

        ////////////////////////Tilleggsinformasjon////////////////////////
        //Tilleggsinformasjon
        String tilleggsopplysninger= bekreft.tilleggsopplysninger.getAttribute("title");
        String actualTilleggs= tilleggsopplysninger.split(":")[1].trim();
        String expectedTilleggs="Tilleggsopplysninger";
        softAssert.assertEquals(actualTilleggs,expectedTilleggs);

        ////////////////////////Forskning////////////////////////
        //Forskeres Erfaring med planten
        String forskeresErfaring= bekreft.forskeres.getText();
        String actualforskeresErfaring= forskeresErfaring.trim();
        String expectedforskeresErfaring="Forskeres erfaring med planten";
        softAssert.assertEquals(actualforskeresErfaring,expectedforskeresErfaring);
        //Forskningsresultater
        String actualForskningsresultater = Driver.getDriver().findElement(By.xpath("(//div[@class=' ']//child::span)[1]")).getText()+" "+
                Driver.getDriver().findElement(By.xpath("(//div[@class=' ']//child::span)[2]")).getText()+" "+
                Driver.getDriver().findElement(By.xpath("(//div[@class=' ']//child::span)[3]")).getText()+" "+
                Driver.getDriver().findElement(By.xpath("(//div[@class=' ']//child::span)[4]")).getText()+
                Driver.getDriver().findElement(By.xpath("(//div[@class=' ']//child::span)[5]")).getText()+" "+
                Driver.getDriver().findElement(By.xpath("(//div[@class=' ']//child::span)[6]")).getText()+" "+
                Driver.getDriver().findElement(By.xpath("(//div[@class=' ']//child::span)[7]")).getText()+" "+
                Driver.getDriver().findElement(By.xpath("(//div[@class=' ']//child::span)[9]")).getText();
        LocalDate myCurrentDate = LocalDate.now();
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("d.M.yyyy");
        String date = dtf1.format(myCurrentDate);
        String expectedForskningsresultater ="Forfattere (2024) Tittel Utgiver, side 1-2. ISBN ISBN123456. Tilgjengelig fra: https://www.example.com/file.pdf (Hentet "+date+")";
        System.out.println(actualForskningsresultater);
        System.out.println(expectedForskningsresultater);
        softAssert.assertEquals(actualForskningsresultater,expectedForskningsresultater);

        softAssert.assertAll();
    }
}
