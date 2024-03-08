package stepDefinitions.ApiStepDef;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import org.junit.Ignore;
import pojos.PostNyPlante.postRequest.BotanicalNamespojo;
import pojos.PostNyPlante.postRequest.Postpojo;
import pojos.PostNyPlante.postRequest.Qualitiespojo;
import pojos.PostNyPlante.postRequest.Synonymspojo;
import pojos.PostNyPlante.postResponse.ResponsePojo;
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
    ArrayList <BotanicalNamespojo> botanicalName;


    @Given("URL er redigert for lagre plante")
    public void urlErRedigertForLagrePlante() {
        setup(ConfigReader.getProperty("email"),ConfigReader.getProperty("password"));
        spec.pathParams("first","api","second","plant");

    }
    @Then("Payload er redigert for lagre plante")
    public void payloadErRedigertForLagrePlante() {

        botanicalNames=new BotanicalNamespojo("Avocado","Artsepitet",false,true,"Kultivar","Frøkilde","Underart","Varietet","Form","Varemerke",true,"PRIMARY");
        botanicalName = new ArrayList<BotanicalNamespojo>();
        botanicalName.add(new BotanicalNamespojo("Avocado","Artsepitet",false,true,"Kultivar","Frøkilde","Underart","Varietet","Form","Varemerke",true,"PRIMARY"));
        List <Synonymspojo> synonym = new ArrayList<>();
        qualities= new Qualitiespojo("Tilleggsopplysninger","Kommentar",6,2,0,0,250,1000,5,1500,5,1500,5,1500,5,1500,0,0,0,3,5,4,2,0,true,true,10,7,"Forskeres erfaring med planten");
        payload = new Postpojo(true, null,synonym, botanicalName,qualities);
        System.out.println(payload);
    }

    @Then("POST-Request sendes for lagre plante")
    public void postRequestSendesForLagrePlante() {
        response= given(spec).body(payload).when().post("{first}/{second}");
        response.prettyPrint();
        id=response.jsonPath().getString("id");
        System.out.println(id);
        actualData= response.as(ResponsePojo.class);
    }

    @And("Det er verifisert at statuskoden er {int}")
    public void detErVerifisertAtStatuskodenEr(int statusCode) {
        assertEquals(statusCode,response.statusCode());
    }

    @And("Response body for opprette plante er verifisert")
    public void responseBodyForOpprettePlanteErVerifisert() {
        assertEquals(payload.isIsEPlant(),actualData.isIsEPlant());
        assertEquals(payload.getEPlantName(),actualData.getEPlantName());
        assertEquals(payload.getQualities().getComment(),actualData.getQualities().getComment());
        assertEquals(payload.getQualities().getAdditionalInfo(),actualData.getQualities().getAdditionalInfo());
        assertEquals(payload.getQualities().getFloweringTimeEnd(),actualData.getQualities().getFloweringTimeEnd());
        assertEquals(payload.getQualities().getFruitTimeEnd(),actualData.getQualities().getFruitTimeEnd());
        assertEquals(payload.getQualities().getFruitTimeStart(),actualData.getQualities().getFruitTimeStart());
        assertEquals(payload.getQualities().getMaximumGapCenterToCenter(),actualData.getQualities().getMaximumGapCenterToCenter());
        assertEquals(payload.getQualities().getMinimumGapCenterToCenter(),actualData.getQualities().getMinimumGapCenterToCenter());
        assertEquals(payload.getQualities().getMaximumGapShrubbery(),actualData.getQualities().getMaximumGapShrubbery());
        assertEquals(payload.getQualities().getMinimumGapShrubbery(),actualData.getQualities().getMinimumGapShrubbery());
        assertEquals(payload.getQualities().getMaximumGapSolitary(),actualData.getQualities().getMaximumGapSolitary());
        assertEquals(payload.getQualities().getMinimumGapSolitary(),actualData.getQualities().getMinimumGapSolitary());
        assertEquals(payload.getQualities().getMaximumGapTreeGroup(),actualData.getQualities().getMaximumGapTreeGroup());
        assertEquals(payload.getQualities().getMinimimGapTreeGroup(),actualData.getQualities().getMinimimGapTreeGroup());
        assertEquals(payload.getQualities().getMaximumGapTrimmedHedge(),actualData.getQualities().getMaximumGapTrimmedHedge());
        assertEquals(payload.getQualities().getMinimumGapTrimmedHedge(),actualData.getQualities().getMinimumGapTrimmedHedge());
        assertEquals(payload.getQualities().getMaximumHardinessCoast(),actualData.getQualities().getMaximumHardinessCoast());
        assertEquals(payload.getQualities().getMinimumHardinessCoast(),actualData.getQualities().getMinimumHardinessCoast());
        assertEquals(payload.getQualities().getMinimumHardinessInland(),actualData.getQualities().getMinimumHardinessInland());
        assertEquals(payload.getQualities().getMaximumHardinessInland(),actualData.getQualities().getMaximumHardinessInland());
        assertEquals(payload.getQualities().getMaximumHeight(),actualData.getQualities().getMaximumHeight());
        assertEquals(payload.getQualities().getMinimumHeight(),actualData.getQualities().getMinimumHeight());
        assertEquals(payload.getQualities().getMaximumNumberOfPlantsPerSquareMeter(),actualData.getQualities().getMaximumNumberOfPlantsPerSquareMeter());
        assertEquals(payload.getQualities().getMinimumNumberOfPlantsPerSquareMeter(),actualData.getQualities().getMinimumNumberOfPlantsPerSquareMeter());
        assertEquals(payload.getQualities().isOriginNorwegian(),actualData.getQualities().isOriginNorwegian());
        assertEquals(payload.getQualities().isProducedInNorway(),actualData.getQualities().isProducedInNorway());
        assertEquals(payload.getQualities().getRefloweringTimeEnd(),actualData.getQualities().getRefloweringTimeEnd());
        assertEquals(payload.getQualities().getRefloweringTimeStart(),actualData.getQualities().getRefloweringTimeStart());
        assertEquals(payload.getQualities().getResearchersExperience(),actualData.getQualities().getResearchersExperience());
        assertEquals(payload.getQualities().getFloweringTimeStart(),actualData.getQualities().getFloweringTimeStart());

    }


    @Given("URL er redigert for slette plante")
    public void urlErRedigertForSlettePlante() {
        setup(ConfigReader.getProperty("email"),ConfigReader.getProperty("password"));
        spec.pathParams("first","api","second","plant","third",id);
    }

    @Then("Delete-Request sendes for slette plante og mottas Response")
    public void deleteRequestSendesForSlettePlanteOgMottasResponse() {
        System.out.println(id);
        response=given(spec).when().delete("{first}/{second}/{third}");
        response.prettyPrint();
    }

    @Given("URL er redigert for redigere plante")
    public void urlErRedigertForRedigerePlante() {
        setup(ConfigReader.getProperty("email"),ConfigReader.getProperty("password"));
        spec.pathParams("first","api","second","plant","third",id);
    }

    @Then("Payload er redigert for redigere plante")
    public void payloadErRedigertForRedigerePlante() {
    }

    @Then("POST-Request sendes for redigere plante")
    public void postRequestSendesForRedigerePlante() {
    }

    @And("Response body for redigere plante er verifisert")
    public void responseBodyForRedigerePlanteErVerifisert() {
    }
}
