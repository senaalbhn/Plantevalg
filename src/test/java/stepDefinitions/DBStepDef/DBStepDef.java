package stepDefinitions.DBStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static stepDefinitions.ApiStepDef.ApiNyPlanteStepDef.id;

import java.sql.*;

public class DBStepDef {

    Connection connection;
    ResultSet resultSet;
    Statement statement;

    @Given("Databaseforbindelse er etablert")
    public void databaseforbindelseErEtablert() throws SQLException {
        connection= DriverManager.getConnection("jdbc:sqlserver://;serverName=plantevalg.database.windows.net;databaseName=test_plantevalg;encrypt=true","plantevalg","sb7THAWkum2@9kR");
    }



    @When("Foresporsel sendes for fo registrert planteinformasjon")
    public void foresporselSendesForFoRegistrertPlanteinformasjon() throws SQLException {
        statement=connection.createStatement();
        resultSet=statement.executeQuery("SELECT * FROM test_plantevalg.plants.BotanicalNames WHERE Genus='Avocadoo'");
    }

    @Then("Registrert planteinformasjon er verifisert")
    public void registrertPlanteinformasjonErVerifisert() throws SQLException {
        resultSet.next();
        Assert.assertEquals("Kultivar",resultSet.getString("Cultivar"));
    }

    @And("Tilkoblingen er frakoblet")
    public void tilkoblingenErFrakoblet() throws SQLException {
        statement.close();
        connection.close();
    }
}
