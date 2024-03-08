package baseUrl;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import utilities.ConfigReader;

import static utilities.Authentication.generateToken;

public class BaseUrl {
    public static void main(String[] args) {
        setup(ConfigReader.getProperty("email"), ConfigReader.getProperty("password"));
    }
    public static RequestSpecification spec;
    public static void setup(String email, String password) {
        spec = new RequestSpecBuilder()
                .setBaseUri("https://test-plantevalg.azurewebsites.net/")
                .addHeader("Authorization","Bearer " + generateToken(email, password))
                .setContentType(ContentType.JSON)
                .build();
    }
}
