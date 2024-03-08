package utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Authentication {
    public static void main(String[] args) {
        System.out.println("generate token()= "+generateToken(ConfigReader.getProperty("email"),ConfigReader.getProperty("password")));
    }
    public static String generateToken(String email, String password){
        String body = "{\n" +
                "  \"email\": \""+email+"\",\n" +
                "  \"password\": \""+password+"\"\n" +
                "}";

        Response response = given().body(body).contentType(ContentType.JSON).when().post("https://test-plantevalg.azurewebsites.net/api/user/signIn");
        return response.jsonPath().getString("tokens.accessToken");
    }
}
