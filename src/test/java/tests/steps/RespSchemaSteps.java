package tests.steps;

import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Paths;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static org.hamcrest.Matchers.equalTo;

public class RespSchemaSteps {

        @Then("the response should match the JSON schema")
        public void theResponseShouldMatchTheJSONSchema()throws IOException {
            String response = RestAssured.get(ApiEndPoints.USD_LATEST_ENDPOINT).asString();
            File schemaPath = Paths.get("src/test/resources/schemas/schema.json").toFile(); // Path to your JSON schema file
// Read the content of the schema file
            String schemaContent = FileUtils.readFileToString(schemaPath, Charset.defaultCharset());

            // Validate the response against the JSON schema
           given()
                    .contentType("application/json")
                    .body(response)
                    .when()
                    .then()
                    .body(matchesJsonSchema(schemaContent));




        }
    }

