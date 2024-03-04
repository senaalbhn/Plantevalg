package stepDefinitions.ApiStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import pojos.PostNyPlante.post.BotanicalNamespojo;
import pojos.PostNyPlante.post.PostPlantepojo;
import pojos.PostNyPlante.post.Qualitiespojo;
import utilities.ConfigReader;

import java.util.Collections;

import static baseUrl.BaseUrl.setup;
import static baseUrl.BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class ApiNyPlanteStepDef {
    PostPlantepojo payload;
    BotanicalNamespojo botanicalNames;
    Qualitiespojo qualities;
    Response response;
    public static int id;


    @Given("URL er redigert for lagre plante")
    public void urlErRedigertForLagrePlante() {
        setup(ConfigReader.getProperty("email"),ConfigReader.getProperty("password"));
        spec.pathParams("first","api","second","plant");
    }
    @Then("Payload er redigert for lagre plante")
    public void payloadErRedigertForLagrePlante() {
        payload = new PostPlantepojo("true",null, Collections.singletonList(botanicalNames),qualities);
        botanicalNames=new BotanicalNamespojo("PRIMARY","Avocado","Artsepitet","false","true","Kultivar","Frøkilde","Underart","Varietet","Form","Varemerke","true");
        qualities= new Qualitiespojo("Tilleggsopplysninger","Kommentar","6","2",null,null,"250","1000","5","1500","5","1500","5","1500","5","1500",null,null,null,"3","5","4","2",null,"true","true","10","7","Forskeres erfaring med planten");

    }

    @Then("POST-Request sendes for lagre plante")
    public void postRequestSendesForLagrePlante() {
        response= given(spec).body(payload).when().post("{first}/{second}");
        response.prettyPrint();
        id=response.jsonPath().getInt("object.userId");
        System.out.println(id);
        //actualData= response.as(PostResponsePojo.class);
    }

    @And("Det er verifisert at statuskoden er {int}")
    public void detErVerifisertAtStatuskodenEr(int statusCode) {
        assertEquals(response.statusCode(),statusCode);
    }

    @And("Response body for opprette plante er verifisert")
    public void responseBodyForOpprettePlanteErVerifisert() {
    }


}
