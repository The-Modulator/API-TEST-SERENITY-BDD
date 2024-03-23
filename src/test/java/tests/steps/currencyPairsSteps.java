package tests.steps;

import io.cucumber.java.en.Then;
import io.restassured.RestAssured;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;

public class currencyPairsSteps {
    @Then("the response should contain {int} currency pairs")
    public void theResponseShouldContainCurrencyPairs(int expectedCurrencyPairs) {

        RestAssured.given()
                .get(ApiEndPoints.USD_LATEST_ENDPOINT)
                .then()
                .body("rates.size()", equalTo(expectedCurrencyPairs));
    }
}
