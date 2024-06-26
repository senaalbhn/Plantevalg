package stepDefinitions.ApiStepDef;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.util.JSONPObject;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Ignore;
import org.testng.asserts.SoftAssert;
import pojos.PostNyPlante.postRequest.BotanicalNamespojo;
import pojos.PostNyPlante.postRequest.Postpojo;
import pojos.PostNyPlante.postRequest.Qualitiespojo;
import pojos.PostNyPlante.postRequest.Synonymspojo;
import pojos.PostNyPlante.postResponse.ResponsePojo;
import pojos.getRequest.*;
import utilities.ConfigReader;

import java.util.ArrayList;
import java.util.List;

import static baseUrl.BaseUrl.setup;
import static baseUrl.BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiNyPlanteStepDef {
    Postpojo payload;
    BotanicalNamespojo botanicalNames;
    Qualitiespojo qualities;
    Response response;
    public static String id;
    ResponsePojo actualData;
    ArrayList<BotanicalNamespojo> botanicalName;
    GetPojo expectedData;
    GetPojo actualDataById;
    String planteId;
    ArrayList<AllergenicitiesPojo> allergenicities;


    @Given("URL er redigert for lagre plante")
    public void urlErRedigertForLagrePlante() {
        setup(ConfigReader.getProperty("email"), ConfigReader.getProperty("password"));
        spec.pathParams("first", "api", "second", "plant");

    }

    @Then("Payload er redigert for lagre plante")
    public void payloadErRedigertForLagrePlante() {

        botanicalNames = new BotanicalNamespojo("Avocadoo", "Artsepitet", false, true, "Kultivar", "Frøkilde", "Underart", "Varietet", "Form ", "Varemerke ", true, "PRIMARY");
        botanicalName = new ArrayList<BotanicalNamespojo>();
        botanicalName.add(new BotanicalNamespojo("Avocadoo", "Artsepitet", false, true, "Kultivar", "Frøkilde", "Underart", "Varietet", "Form ", "Varemerke ", true, "PRIMARY"));
        List<Synonymspojo> synonym = new ArrayList<>();
        qualities = new Qualitiespojo("Tilleggsopplysninger", "Kommentar", 6, 2, 0, 0, 250, 1000, 5, 1500, 5, 1500, 5, 1500, 5, 1500, 0, 0, 0, 3, 5, 4, 2, 0, true, true, 10, 7, "Forskeres erfaring med planten");
        payload = new Postpojo(true, null, synonym, botanicalName, qualities);
        System.out.println(payload);
    }

    @Then("POST-Request sendes for lagre plante")
    public void postRequestSendesForLagrePlante() {
        response = given(spec).body(payload).when().post("{first}/{second}");
        response.prettyPrint();
        id = response.jsonPath().getString("id");
        System.out.println(id);
        actualData = response.as(ResponsePojo.class);
    }

    @And("Det er verifisert at statuskoden er {int}")
    public void detErVerifisertAtStatuskodenEr(int statusCode) {
        assertEquals(statusCode, response.statusCode());
    }

    @And("Response body for opprette plante er verifisert")
    public void responseBodyForOpprettePlanteErVerifisert() {
        assertEquals(payload.isIsEPlant(), actualData.isIsEPlant());
        assertEquals(payload.getEPlantName(), actualData.getEPlantName());
        assertEquals(payload.getQualities().getComment(), actualData.getQualities().getComment());
        assertEquals(payload.getQualities().getAdditionalInfo(), actualData.getQualities().getAdditionalInfo());
        assertEquals(payload.getQualities().getFloweringTimeEnd(), actualData.getQualities().getFloweringTimeEnd());
        assertEquals(payload.getQualities().getFruitTimeEnd(), actualData.getQualities().getFruitTimeEnd());
        assertEquals(payload.getQualities().getFruitTimeStart(), actualData.getQualities().getFruitTimeStart());
        assertEquals(payload.getQualities().getMaximumGapCenterToCenter(), actualData.getQualities().getMaximumGapCenterToCenter());
        assertEquals(payload.getQualities().getMinimumGapCenterToCenter(), actualData.getQualities().getMinimumGapCenterToCenter());
        assertEquals(payload.getQualities().getMaximumGapShrubbery(), actualData.getQualities().getMaximumGapShrubbery());
        assertEquals(payload.getQualities().getMinimumGapShrubbery(), actualData.getQualities().getMinimumGapShrubbery());
        assertEquals(payload.getQualities().getMaximumGapSolitary(), actualData.getQualities().getMaximumGapSolitary());
        assertEquals(payload.getQualities().getMinimumGapSolitary(), actualData.getQualities().getMinimumGapSolitary());
        assertEquals(payload.getQualities().getMaximumGapTreeGroup(), actualData.getQualities().getMaximumGapTreeGroup());
        assertEquals(payload.getQualities().getMinimimGapTreeGroup(), actualData.getQualities().getMinimimGapTreeGroup());
        assertEquals(payload.getQualities().getMaximumGapTrimmedHedge(), actualData.getQualities().getMaximumGapTrimmedHedge());
        assertEquals(payload.getQualities().getMinimumGapTrimmedHedge(), actualData.getQualities().getMinimumGapTrimmedHedge());
        assertEquals(payload.getQualities().getMaximumHardinessCoast(), actualData.getQualities().getMaximumHardinessCoast());
        assertEquals(payload.getQualities().getMinimumHardinessCoast(), actualData.getQualities().getMinimumHardinessCoast());
        assertEquals(payload.getQualities().getMinimumHardinessInland(), actualData.getQualities().getMinimumHardinessInland());
        assertEquals(payload.getQualities().getMaximumHardinessInland(), actualData.getQualities().getMaximumHardinessInland());
        assertEquals(payload.getQualities().getMaximumHeight(), actualData.getQualities().getMaximumHeight());
        assertEquals(payload.getQualities().getMinimumHeight(), actualData.getQualities().getMinimumHeight());
        assertEquals(payload.getQualities().getMaximumNumberOfPlantsPerSquareMeter(), actualData.getQualities().getMaximumNumberOfPlantsPerSquareMeter());
        assertEquals(payload.getQualities().getMinimumNumberOfPlantsPerSquareMeter(), actualData.getQualities().getMinimumNumberOfPlantsPerSquareMeter());
        assertEquals(payload.getQualities().isOriginNorwegian(), actualData.getQualities().isOriginNorwegian());
        assertEquals(payload.getQualities().isProducedInNorway(), actualData.getQualities().isProducedInNorway());
        assertEquals(payload.getQualities().getRefloweringTimeEnd(), actualData.getQualities().getRefloweringTimeEnd());
        assertEquals(payload.getQualities().getRefloweringTimeStart(), actualData.getQualities().getRefloweringTimeStart());
        assertEquals(payload.getQualities().getResearchersExperience(), actualData.getQualities().getResearchersExperience());
        assertEquals(payload.getQualities().getFloweringTimeStart(), actualData.getQualities().getFloweringTimeStart());

    }


    @Given("URL er redigert for slette plante")
    public void urlErRedigertForSlettePlante() {
        setup(ConfigReader.getProperty("email"), ConfigReader.getProperty("password"));
        spec.pathParams("first", "api", "second", "plant", "third", id);
    }

    @Then("Delete-Request sendes for slette plante og mottas Response")
    public void deleteRequestSendesForSlettePlanteOgMottasResponse() {
        System.out.println(id);
        response = given(spec).when().delete("{first}/{second}/{third}");
        response.prettyPrint();
    }

    @Given("URL er redigert for redigere plante")
    public void urlErRedigertForRedigerePlante() {
        setup(ConfigReader.getProperty("email"), ConfigReader.getProperty("password"));
        spec.pathParams("first", "api", "second", "plant", "third", id);
    }

    @Then("Payload er redigert for redigere plante")
    public void payloadErRedigertForRedigerePlante() {
    }

    @Then("PATCH-Request sendes for redigere plante")
    public void patchRequestSendesForRedigerePlante() {
    }

    @And("Response body for redigere plante er verifisert")
    public void responseBodyForRedigerePlanteErVerifisert() {
    }

    ///////
    @Given("URL er redigert for hente planteinformasjon")
    public void urlErRedigertForHentePlanteinformasjon() {
        setup(ConfigReader.getProperty("email"), ConfigReader.getProperty("password"));
        spec.pathParams("first", "api", "second", "plants");
        response=given(spec).when().get("{first}/{second}");
        JsonPath json=response.jsonPath();
        List<String> idList=json.getList("findAll{it.primaryBotanicalName.startsWith('Avocadoo')}.id");
        planteId=idList.get(0);
        System.out.println(planteId);

        setup(ConfigReader.getProperty("email"), ConfigReader.getProperty("password"));
        spec.pathParams("first", "api", "second", "plant", "third", planteId);
    }
    ArrayList<CoveragesPojo> coverages ;
    ArrayList<EdibilitiesPojo> edibilities;
    ArrayList<GroupsPojo> groups;
    ArrayList<LightConditionsPojo> lightConditions;
    ArrayList<MoistureConditionsPojo> moistureConditions;
    ArrayList<NaturalLifespansPojo> naturlig;
    ArrayList<PhConditionsPojo> ph;
    ArrayList<PollinatorFriendlinessPojo> pollinator;
    ArrayList<PruningsPojo> prunings;
    ArrayList<ReproductionMethodsPojo> reproduction;
    ArrayList<NamePojo> nameAllergenicities;
    @Then("Redigeres forventede data for lagret planten")


    public void redigeresForventedeDataForLagretPlanten() {
        ArrayList<BotanicalNamesPojo> botanical = new ArrayList<BotanicalNamesPojo>();
        botanical.add(new BotanicalNamesPojo("Avocado", "Artsepitet", false, true, "Kultivar", "Frøkilde", "Underart", "Varietet", "Form", "Varemerke", true, "PRIMARY"));
        List<SynonymsPojo> synonym2 = new ArrayList<>();
        //allergenicities / Allergi
        nameAllergenicities = new ArrayList<NamePojo>();
        nameAllergenicities.add(new NamePojo("Hudkontakt"));
        allergenicities = new ArrayList<AllergenicitiesPojo>();
        allergenicities.add(new AllergenicitiesPojo(nameAllergenicities));
        //coverages / dekkevne
        ArrayList<NamePojo> nameDekkevne = new ArrayList<NamePojo>();
        nameDekkevne.add(new NamePojo("Liten"));
        coverages = new ArrayList<CoveragesPojo>();
        coverages.add(new CoveragesPojo(nameDekkevne));
        //edibilities / Matnyttig
        ArrayList<NamePojo> nameMatnyttig = new ArrayList<NamePojo>();
        nameMatnyttig.add(new NamePojo("Honningplante"));
        edibilities = new ArrayList<EdibilitiesPojo>();
        edibilities.add(new EdibilitiesPojo(nameMatnyttig));
        //groups / Plantegruppe
        ArrayList<NamePojo> namegroups = new ArrayList<NamePojo>();
        namegroups.add(new NamePojo("Trær"));
        groups = new ArrayList<GroupsPojo>();
        groups.add(new GroupsPojo(namegroups));
        //lightConditions / Lysforhold
        ArrayList<NamePojo> nameLightConditions = new ArrayList<NamePojo>();
        nameLightConditions.add(new NamePojo("Sol"));
        lightConditions = new ArrayList<LightConditionsPojo>();
        lightConditions.add(new LightConditionsPojo(nameLightConditions));
        //moistureConditions / Fuktighetsforhold
        ArrayList<NamePojo> nameMoistureConditions = new ArrayList<NamePojo>();
        nameMoistureConditions.add(new NamePojo("Tørt"));
        moistureConditions = new ArrayList<MoistureConditionsPojo>();
        moistureConditions.add(new MoistureConditionsPojo(nameMoistureConditions));
        //naturalLifespans / Naturlig levealder
        ArrayList<NamePojo> nameNaturlig = new ArrayList<NamePojo>();
        nameNaturlig.add(new NamePojo("Lang (100-300 år)"));
        naturlig = new ArrayList<NaturalLifespansPojo>();
        naturlig.add(new NaturalLifespansPojo(nameNaturlig));
        //phConditions / ph
        ArrayList<NamePojo> namePh = new ArrayList<NamePojo>();
        namePh.add(new NamePojo("Basisk >7"));
        ph = new ArrayList<PhConditionsPojo>();
        ph.add(new PhConditionsPojo(namePh));
        //pollinatorFriendliness / Pollinator
        ArrayList<NamePojo> namePollinator = new ArrayList<NamePojo>();
        namePollinator.add(new NamePojo("Ja"));
        pollinator = new ArrayList<PollinatorFriendlinessPojo>();
        pollinator.add(new PollinatorFriendlinessPojo(namePollinator));
        //prunings / Beskjæringsbehov
        ArrayList<NamePojo> namePrunings = new ArrayList<NamePojo>();
        namePrunings.add(new NamePojo("Middels"));
        prunings = new ArrayList<PruningsPojo>();
        prunings.add(new PruningsPojo(namePrunings));
        //reproductionMethods / r
        ArrayList<NamePojo> nameRepro = new ArrayList<NamePojo>();
        nameRepro.add(new NamePojo("Frø"));
        reproduction = new ArrayList<ReproductionMethodsPojo>();
        reproduction.add(new ReproductionMethodsPojo(nameRepro));
        //restrictionsAndProtections / Restriksjoner
        ArrayList<NamePojo> nameRestriksjoner  = new ArrayList<NamePojo>();
        nameRestriksjoner.add(new NamePojo("Søknadspliktig iht forskrift fremmede organismer vedl 5"));
        ArrayList<RestrictionsAndProtectionsPojo> restriction = new ArrayList<RestrictionsAndProtectionsPojo>();
        restriction.add(new RestrictionsAndProtectionsPojo(nameRestriksjoner));
        //rootTypes / Rottype
        ArrayList<NamePojo> rootTypesName  = new ArrayList<NamePojo>();
        rootTypesName.add(new NamePojo("Pålerot"));
        ArrayList<RootTypesPojo> rootTypes = new ArrayList<RootTypesPojo>();
        rootTypes.add(new RootTypesPojo(rootTypesName));
        //saltTolerances / Salttoleranse
        ArrayList<NamePojo> nameSalt  = new ArrayList<NamePojo>();
        nameSalt.add(new NamePojo("Svak mot salt i jord"));
        ArrayList<SaltTolerancesPojo> saltTolerances = new ArrayList<SaltTolerancesPojo>();
        saltTolerances.add(new SaltTolerancesPojo(nameSalt));
        //shapes / Form
        ArrayList<NamePojo> nameShapes  = new ArrayList<NamePojo>();
        nameShapes.add(new NamePojo("Klatrende"));
        ArrayList<ShapesPojo> shapes = new ArrayList<ShapesPojo>();
        shapes.add(new ShapesPojo(nameShapes));
       saltTolerances.add(new SaltTolerancesPojo(nameSalt));
        //soils / Jord
        ArrayList<NamePojo> nameSoils  = new ArrayList<NamePojo>();
        nameSoils.add(new NamePojo("Tung, leirrik jord med dårlig dreneringsevne"));
        ArrayList<SoilsPojo> soils = new ArrayList<SoilsPojo>();
        soils.add(new SoilsPojo(nameSoils));
        //subGroups / Undergruppe
        ArrayList<NamePojo> nameSubGroups  = new ArrayList<NamePojo>();
        nameSubGroups.add(new NamePojo("Alltidgrønn"));
        ArrayList<SubGroupsPojo> subGroups = new ArrayList<SubGroupsPojo>();
        subGroups.add(new SubGroupsPojo(nameSubGroups));
        //usages / Bruksområde
        ArrayList<NamePojo> nameUsages  = new ArrayList<NamePojo>();
        nameUsages.add(new NamePojo("Solitær"));
        ArrayList<UsagesPojo> usages = new ArrayList<UsagesPojo>();
        usages.add(new UsagesPojo(nameUsages));
        //widths / Bredde
        ArrayList<NamePojo> nameWidths   = new ArrayList<NamePojo>();
        nameWidths.add(new NamePojo("Smal (<1/2 av høyde"));
        ArrayList<WidthsPojo> widths = new ArrayList<WidthsPojo>();
        widths.add(new WidthsPojo(nameWidths));
       //windTolerances / Vindtoleranse
        ArrayList<NamePojo> nameWindTolerances   = new ArrayList<NamePojo>();
        nameWindTolerances.add(new NamePojo("Tåler noe vind"));
        ArrayList<WindTolerancesPojo> windTolerances = new ArrayList<WindTolerancesPojo>();
        windTolerances.add(new WindTolerancesPojo(nameWindTolerances));
       //flowerOneOrMoreColors / Blomst
        ArrayList<NamePojo> nameFlowerOneOrMoreColors   = new ArrayList<NamePojo>();
        nameFlowerOneOrMoreColors.add(new NamePojo("Flere farger innen arten"));
        ArrayList<FlowerOneOrMoreColorsPojo> flowerOneOrMoreColors = new ArrayList<FlowerOneOrMoreColorsPojo>();
        flowerOneOrMoreColors.add(new FlowerOneOrMoreColorsPojo(nameFlowerOneOrMoreColors));
       //flowerPrimaryColors / Blomst farge
        ArrayList<NamePojo> nameFlowerPrimaryColors   = new ArrayList<NamePojo>();
        nameFlowerPrimaryColors.add(new NamePojo("Hvit"));
        ArrayList<FlowerPrimaryColorsPojo> flowerPrimaryColors = new ArrayList<FlowerPrimaryColorsPojo>();
        flowerPrimaryColors.add(new FlowerPrimaryColorsPojo(nameFlowerPrimaryColors));
       //flowerOtherColors / Blomst andre farger
        ArrayList<NamePojo> nameFlowerOtherColors = new ArrayList<NamePojo>();
        nameFlowerOtherColors.add(new NamePojo("Lilla"));
        ArrayList<FlowerOtherColorsPojo> flowerOtherColors = new ArrayList<FlowerOtherColorsPojo>();
        flowerOtherColors.add(new FlowerOtherColorsPojo(nameFlowerOtherColors));
       //flowerFills / Fylt
        ArrayList<NamePojo> nameFlowerFills   = new ArrayList<NamePojo>();
        nameFlowerFills.add(new NamePojo("Ja"));
        ArrayList<FlowerFillsPojo> flowerFills = new ArrayList<FlowerFillsPojo>();
        flowerFills.add(new FlowerFillsPojo(nameFlowerFills));
       //scentedFlowers / Duft
        ArrayList<NamePojo> nameScentedFlowers   = new ArrayList<NamePojo>();
        nameScentedFlowers.add(new NamePojo("Ja"));
        ArrayList<ScentedFlowersPojo> scentedFlowers = new ArrayList<ScentedFlowersPojo>();
        scentedFlowers.add(new ScentedFlowersPojo(nameScentedFlowers));
       //fruitColors / Fruktfarge
        ArrayList<NamePojo> nameFruitColors   = new ArrayList<NamePojo>();
        nameFruitColors.add(new NamePojo("Svart"));
        ArrayList<FruitColorsPojo> fruitColors = new ArrayList<FruitColorsPojo>();
        fruitColors.add(new FruitColorsPojo(nameFruitColors));
       //leafColors / Bladfarge
        ArrayList<NamePojo> nameLeafColors   = new ArrayList<NamePojo>();
        nameLeafColors.add(new NamePojo("Flerfarget/broket"));
        ArrayList<LeafColorsPojo> leafColors = new ArrayList<LeafColorsPojo>();
        leafColors.add(new LeafColorsPojo(nameLeafColors));
       //leafShapes / Bladform
        ArrayList<NamePojo> nameLeafShapes   = new ArrayList<NamePojo>();
        nameLeafShapes.add(new NamePojo("Fliket"));
        ArrayList<LeafShapesPojo> leafShapes = new ArrayList<LeafShapesPojo>();
        leafShapes.add(new LeafShapesPojo(nameLeafShapes));
       //leafSizes / Bladstørrelse
        ArrayList<NamePojo> nameLeafSizes = new ArrayList<NamePojo>();
        nameLeafSizes.add(new NamePojo("Liten"));
        ArrayList<LeafSizesPojo> leafSizes = new ArrayList<LeafSizesPojo>();
        leafSizes.add(new LeafSizesPojo(nameLeafSizes));
       //scentedLeaves /
        ArrayList<NamePojo> nameScentedLeaves   = new ArrayList<NamePojo>();
        nameScentedLeaves.add(new NamePojo("Ja"));
        ArrayList<ScentedLeavesPojo> scentedLeaves = new ArrayList<ScentedLeavesPojo>();
        scentedLeaves.add(new ScentedLeavesPojo(nameScentedLeaves));
       //autumnColors / Høstfarger
        ArrayList<NamePojo> nameAutumnColors = new ArrayList<NamePojo>();
        nameAutumnColors.add(new NamePojo("Guloransje"));
        ArrayList<AutumnColorsPojo> autumnColors = new ArrayList<AutumnColorsPojo>();
        autumnColors.add(new AutumnColorsPojo(nameAutumnColors));
       //winterCharacteristics / Vinter-karakte
        ArrayList<NamePojo> nameWinterCharacteristics   = new ArrayList<NamePojo>();
        nameWinterCharacteristics.add(new NamePojo("Silhuett"));
        ArrayList<WinterCharacteristicsPojo> winterCharacteristics = new ArrayList<WinterCharacteristicsPojo>();
        winterCharacteristics.add(new WinterCharacteristicsPojo(nameWinterCharacteristics));
       //trunkBarkStructures / Stamme barkstruktur
        ArrayList<NamePojo> nameTrunkBarkStructures= new ArrayList<NamePojo>();
        nameTrunkBarkStructures.add(new NamePojo("Stripete"));
        ArrayList<TrunkBarkStructuresPojo> trunkBarkStructures = new ArrayList<TrunkBarkStructuresPojo>();
        trunkBarkStructures.add(new TrunkBarkStructuresPojo(nameTrunkBarkStructures));
       //trunkBarkColors / Stamme barkfarge
        ArrayList<NamePojo> nameTrunkBarkColors   = new ArrayList<NamePojo>();
        nameTrunkBarkColors.add(new NamePojo("Uanselig (brun)"));
        ArrayList<TrunkBarkColorsPojo> trunkBarkColors = new ArrayList<TrunkBarkColorsPojo>();
        trunkBarkColors.add(new TrunkBarkColorsPojo(nameTrunkBarkColors));
       //shootsBranchColors / Skudd/greiner farge
        ArrayList<NamePojo> nameShootsBranchColors   = new ArrayList<NamePojo>();
        nameShootsBranchColors.add(new NamePojo("Rødbrun"));
        ArrayList<ShootsBranchColorsPojo> shootsBranchColors = new ArrayList<ShootsBranchColorsPojo>();
        shootsBranchColors.add(new ShootsBranchColorsPojo(nameShootsBranchColors));
       //thorns / torner
        ArrayList<NamePojo> nameThorns   = new ArrayList<NamePojo>();
        nameThorns.add(new NamePojo("Kan ha torner"));
        ArrayList<ThornsPojo> thorns = new ArrayList<ThornsPojo>();
        thorns.add(new ThornsPojo(nameThorns));
       //fruitTimes / Frukt tid
        ArrayList<NamePojo> nameFruitTimes   = new ArrayList<NamePojo>();
        nameFruitTimes.add(new NamePojo("Sommer"));
        ArrayList<FruitTimesPojo> fruitTimes = new ArrayList<FruitTimesPojo>();
        fruitTimes.add(new FruitTimesPojo(nameFruitTimes));
       //flowerOrnamentalValues / Blomst prydverdi
        ArrayList<NamePojo> nameFlowerOrnamentalValues   = new ArrayList<NamePojo>();
        nameFlowerOrnamentalValues.add(new NamePojo("Lite betydelig"));
        ArrayList<FlowerOrnamentalValuesPojo> flowerOrnamentalValues = new ArrayList<FlowerOrnamentalValuesPojo>();
        flowerOrnamentalValues.add(new FlowerOrnamentalValuesPojo(nameFlowerOrnamentalValues));

        //researchResultMappings / Stamme barkfarge
        ArrayList <ReferencesPojo> referencesPojos= new ArrayList<ReferencesPojo>();
        referencesPojos.add(new ReferencesPojo());
        ResearchResultPojo resultPojo= new ResearchResultPojo(referencesPojos);
        ArrayList<ResearchResultMappingsPojo> researchResultMappings = new ArrayList<ResearchResultMappingsPojo>();
        researchResultMappings.add(new ResearchResultMappingsPojo(resultPojo));

        QualitiesPojo qualitie = new QualitiesPojo("Tilleggsopplysninger", "Kommentar", 6, 2, 0, 0, 250, 1000, 5, 1500, 5, 1500, 5, 1500, 5, 1500, 0, 0, 0, 3, 5, 4, 2, 0, true, true, 10, 7, "Forskeres erfaring med planten", true, true, allergenicities,coverages,edibilities, groups,null,null,lightConditions,moistureConditions,naturlig,ph,pollinator,prunings,reproduction, restriction,rootTypes,saltTolerances,shapes,soils,subGroups,usages,widths,windTolerances,flowerOneOrMoreColors,flowerPrimaryColors,flowerOtherColors,flowerFills,scentedFlowers,fruitColors,leafColors,leafShapes,leafSizes,scentedLeaves,autumnColors,winterCharacteristics,trunkBarkStructures,trunkBarkColors,shootsBranchColors,thorns,fruitTimes,flowerOrnamentalValues,researchResultMappings);
        expectedData = new GetPojo(qualitie, synonym2, botanical, true, null, "Avocadoo x Artsepitet ssp. Underart var. Varietet f. Form  'Kultivar' fk. Frøkilde Varemerke ®");
                                                                                                               //Avocadoo x Artsepitet ssp. Underart var. Varietet f. Form 'Kultivar' fk. Frøkilde Varemerke®
    }

    @Then("GET-Request sendes for hente planteinformasjon")
    public void getRequestSendesForHentePlanteinformasjon() {
        System.out.println(planteId);
        response = given(spec).when().get("{first}/{second}/{third}");
        actualDataById=response.as(GetPojo.class);

    }

    @And("Response body for forventede data for lagret planten er verifisert")
    public void responseBodyForForventedeDataForLagretPlantenErVerifisert() {
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(actualDataById.getPrimaryBotanicalName(),expectedData.getPrimaryBotanicalName());
        softAssert.assertEquals(actualDataById.isIsEPlant(),expectedData.isIsEPlant());
        softAssert.assertEquals(actualDataById.getQualities().getAdditionalInfo(),expectedData.getQualities().getAdditionalInfo());
        softAssert.assertEquals(actualDataById.getQualities().getComment(),expectedData.getQualities().getComment());
        softAssert.assertEquals(actualDataById.getQualities().getFloweringTimeEnd(),expectedData.getQualities().getFloweringTimeEnd());
        softAssert.assertEquals(actualDataById.getQualities().getFloweringTimeStart(),expectedData.getQualities().getFloweringTimeStart());
        softAssert.assertEquals(actualDataById.getQualities().getFruitTimeEnd(),expectedData.getQualities().getFruitTimeEnd());
        softAssert.assertEquals(actualDataById.getQualities().getFruitTimeStart(),expectedData.getQualities().getFruitTimeStart());
        softAssert.assertEquals(actualDataById.getQualities().getMaximumHeight(),expectedData.getQualities().getMaximumHeight());
        softAssert.assertEquals(actualDataById.getQualities().getMinimumHeight(),expectedData.getQualities().getMinimumHeight());
        softAssert.assertEquals(actualDataById.getQualities().getMinimimGapTreeGroup(),expectedData.getQualities().getMinimimGapTreeGroup());
        softAssert.assertEquals(actualDataById.getQualities().getMaximumGapTreeGroup(),expectedData.getQualities().getMaximumGapTreeGroup());
        softAssert.assertEquals(actualDataById.getQualities().getMaximumGapShrubbery(),expectedData.getQualities().getMaximumGapShrubbery());
        softAssert.assertEquals(actualDataById.getQualities().getMinimumGapShrubbery(),expectedData.getQualities().getMinimumGapShrubbery());
        softAssert.assertEquals(actualDataById.getQualities().getMinimumGapSolitary(),expectedData.getQualities().getMinimumGapSolitary());
        softAssert.assertEquals(actualDataById.getQualities().getMaximumGapSolitary(),expectedData.getQualities().getMaximumGapSolitary());
        softAssert.assertEquals(actualDataById.getQualities().getMinimumGapTrimmedHedge(),expectedData.getQualities().getMinimumGapTrimmedHedge());
        softAssert.assertEquals(actualDataById.getQualities().getMaximumGapCenterToCenter(),expectedData.getQualities().getMaximumGapCenterToCenter());
        softAssert.assertEquals(actualDataById.getQualities().getMinimumGapCenterToCenter(),expectedData.getQualities().getMinimumGapCenterToCenter());
        softAssert.assertEquals(actualDataById.getQualities().getMaximumNumberOfPlantsPerSquareMeter(),expectedData.getQualities().getMaximumNumberOfPlantsPerSquareMeter());
        softAssert.assertEquals(actualDataById.getQualities().getMinimumNumberOfPlantsPerSquareMeter(),expectedData.getQualities().getMinimumNumberOfPlantsPerSquareMeter());
        softAssert.assertEquals(actualDataById.getQualities().getMaximumHardinessCoast(),expectedData.getQualities().getMaximumHardinessCoast());
        softAssert.assertEquals(actualDataById.getQualities().getMinimumHardinessCoast(),expectedData.getQualities().getMinimumHardinessCoast());
        softAssert.assertEquals(actualDataById.getQualities().getMinimumHardinessInland(),expectedData.getQualities().getMinimumHardinessInland());
        softAssert.assertEquals(actualDataById.getQualities().getMaximumHardinessInland(),expectedData.getQualities().getMaximumHardinessInland());
        softAssert.assertEquals(actualDataById.getQualities().isOriginNorwegian(),expectedData.getQualities().isOriginNorwegian());
        softAssert.assertEquals(actualDataById.getQualities().isProducedInNorway(),expectedData.getQualities().isProducedInNorway());
        softAssert.assertEquals(actualDataById.getQualities().getRefloweringTimeStart(),expectedData.getQualities().getRefloweringTimeStart());
        softAssert.assertEquals(actualDataById.getQualities().getRefloweringTimeEnd(),expectedData.getQualities().getRefloweringTimeEnd());
        softAssert.assertEquals(actualDataById.getQualities().getResearchersExperience(),expectedData.getQualities().getResearchersExperience());
        softAssert.assertEquals(actualDataById.getQualities().isSeed(),expectedData.getQualities().isSeed(),"Frø");
        softAssert.assertEquals(actualDataById.getQualities().isVegetative(),expectedData.getQualities().isVegetative(),"Vegetativ");
        /*
        softAssert.assertTrue(actualDataById.getQualities().getAllergenicities().contains("Hudkontakt"));
        softAssert.assertTrue(actualDataById.getQualities().getCoverages().contains("Liten"));
        softAssert.assertTrue(actualDataById.getQualities().getEdibilities().contains("Honningplante"));
        softAssert.assertTrue(actualDataById.getQualities().getGroups().contains("Trær"));
        List<String> lys= List.of("Sol","Skygge","Halvskygge");
        softAssert.assertTrue(actualDataById.getQualities().getLightConditions().containsAll(lys));
        softAssert.assertTrue(actualDataById.getQualities().getMoistureConditions().containsAll(moistureConditions));
        softAssert.assertTrue(actualDataById.getQualities().getNaturalLifespans().containsAll(naturlig));
        softAssert.assertTrue(actualDataById.getQualities().getPhConditions().containsAll(ph));
        softAssert.assertTrue(actualDataById.getQualities().getPollinatorFriendliness().containsAll(pollinator));
        softAssert.assertTrue(actualDataById.getQualities().getPrunings().containsAll(prunings));
        softAssert.assertTrue(actualDataById.getQualities().getReproductionMethods().containsAll(reproduction));
        softAssert.assertTrue(actualDataById.getQualities().getRestrictionsAndProtections().containsAll(expectedData.getQualities().getRestrictionsAndProtections()));
        softAssert.assertTrue(actualDataById.getQualities().getRootTypes().containsAll(expectedData.getQualities().getRootTypes()));
        softAssert.assertTrue(actualDataById.getQualities().getSaltTolerances().containsAll(expectedData.getQualities().getSaltTolerances()));
        softAssert.assertTrue(actualDataById.getQualities().getShapes().containsAll(expectedData.getQualities().getShapes()));
        softAssert.assertTrue(actualDataById.getQualities().getSoils().containsAll(expectedData.getQualities().getSoils()));
        softAssert.assertTrue(actualDataById.getQualities().getSubGroups().containsAll(expectedData.getQualities().getSubGroups()));
        softAssert.assertTrue(actualDataById.getQualities().getUsages().containsAll(expectedData.getQualities().getUsages()));
        softAssert.assertTrue(actualDataById.getQualities().getWidths().containsAll(expectedData.getQualities().getWidths()));
        softAssert.assertTrue(actualDataById.getQualities().getWindTolerances().containsAll(expectedData.getQualities().getWindTolerances()));
        softAssert.assertTrue(actualDataById.getQualities().getFlowerOneOrMoreColors().containsAll(expectedData.getQualities().getFlowerOneOrMoreColors()));
        softAssert.assertTrue(actualDataById.getQualities().getFlowerPrimaryColors().containsAll(expectedData.getQualities().getFlowerPrimaryColors()));
        softAssert.assertTrue(actualDataById.getQualities().getFlowerOtherColors().containsAll(expectedData.getQualities().getFlowerOtherColors()));
        softAssert.assertTrue(actualDataById.getQualities().getFlowerFills().containsAll(expectedData.getQualities().getFlowerFills()));
        softAssert.assertTrue(actualDataById.getQualities().getScentedFlowers().containsAll(expectedData.getQualities().getScentedFlowers()));
        softAssert.assertTrue(actualDataById.getQualities().getFruitColors().containsAll(expectedData.getQualities().getFruitColors()));
        softAssert.assertTrue(actualDataById.getQualities().getLeafColors().containsAll(expectedData.getQualities().getLeafColors()));
        softAssert.assertTrue(actualDataById.getQualities().getLeafShapes().containsAll(expectedData.getQualities().getLeafShapes()));
        softAssert.assertTrue(actualDataById.getQualities().getLeafSizes().containsAll(expectedData.getQualities().getLeafSizes()));
        softAssert.assertTrue(actualDataById.getQualities().getAutumnColors().containsAll(expectedData.getQualities().getAutumnColors()));
        softAssert.assertTrue(actualDataById.getQualities().getWinterCharacteristics().containsAll(expectedData.getQualities().getWinterCharacteristics()));
        softAssert.assertTrue(actualDataById.getQualities().getTrunkBarkStructures().containsAll(expectedData.getQualities().getTrunkBarkStructures()));
        softAssert.assertTrue(actualDataById.getQualities().getTrunkBarkColors().containsAll(expectedData.getQualities().getTrunkBarkColors()));
        softAssert.assertTrue(actualDataById.getQualities().getShootsBranchColors().containsAll(expectedData.getQualities().getShootsBranchColors()));
        softAssert.assertTrue(actualDataById.getQualities().getThorns().containsAll(expectedData.getQualities().getThorns()));
        softAssert.assertTrue(actualDataById.getQualities().getFruitTimes().containsAll(expectedData.getQualities().getFruitTimes()));
        softAssert.assertTrue(actualDataById.getQualities().getFlowerOrnamentalValues().containsAll(expectedData.getQualities().getFlowerOrnamentalValues()));
        softAssert.assertTrue(actualDataById.getQualities().getResearchResultMappings().containsAll(expectedData.getQualities().getResearchResultMappings()));
        */

        softAssert.assertAll();
    }

    @Given("IDen til det registrerte anlegget innhentes")
    public void idenTilDetRegistrerteAnleggetInnhentes() {
        setup(ConfigReader.getProperty("email"), ConfigReader.getProperty("password"));
        spec.pathParams("first", "api", "second", "plants");
        response=given(spec).when().get("{first}/{second}");
        JsonPath json=response.jsonPath();
        List<String> idList=json.getList("findAll{it.primaryBotanicalName.startsWith('Avocadoo')}.id");
        planteId=idList.get(0);
        System.out.println(planteId);


    }
}


//Avocadoo x Artsepitet ssp. Underart var. Varietet f. Form  'Kultivar' fk. Frøkilde Varemerke ®
//Avocadoo x Artsepitet ssp. Underart var. Varietet f. Form 'Kultivar' fk. Frøkilde Varemerke ®