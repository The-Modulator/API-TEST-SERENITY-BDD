package tests.steps;

import io.cucumber.java.en.Then;
import io.restassured.RestAssured;

import static org.hamcrest.Matchers.lessThan;


public class RespTimeSteps {
    @Then("the response time should not be less than {int} seconds")
    public void theResponseTimeShouldNotBeLessThanSeconds(int minResponseTimeInSeconds) {
        RestAssured.given()
                .get(ApiEndPoints.USD_LATEST_ENDPOINT)
                .then()
                .time(lessThan(minResponseTimeInSeconds * 1000L));
    }
}
