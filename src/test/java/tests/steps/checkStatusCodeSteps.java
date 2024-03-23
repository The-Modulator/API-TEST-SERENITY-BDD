package tests.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;

public class checkStatusCodeSteps {
    @Then("the response status code should be valid")
    public void theResponseStatusCodeShouldBeValid() {
        RestAssured.given()
                .get(ApiEndPoints.USD_LATEST_ENDPOINT)
                .then()
                .statusCode(equalTo(200));
    }

    @And("the response body should contain a valid status")
    public void theResponseBodyShouldContainAValidStatus() {
        given()
                .get(ApiEndPoints.USD_LATEST_ENDPOINT)
                .then()
                .body("result", equalTo("success"));
    }
}
