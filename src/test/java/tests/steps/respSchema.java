package tests.steps;

import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Paths;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;

public class respSchema {
    @Then("the response should match the JSON schema")
    public void the_response_should_match_the_json_schema() throws IOException {

       String API_response = RestAssured.get(ApiEndPoint.USD_LATEST_ENDPOINT).asString();
       File schema_response = Paths.get("src/test/resources/schemas/schema.json").toFile();

        String schemaContent = FileUtils.readFileToString(schema_response, Charset.defaultCharset());

        given()
                .body(API_response)
                .then()
                .body(matchesJsonSchema(schemaContent));

    }
}
