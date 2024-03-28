package tests.steps;

import io.cucumber.java.en.Then;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;


public class currencyPair {

    @Then("the API must return {int} currency pair")
    public void the_api_must_return_currency_pair(int expectedCurrencyPairs) {
        given()
                .get(ApiEndPoint.USD_LATEST_ENDPOINT)
                .then()
                .body("conversion_rates.size()", equalTo(expectedCurrencyPairs));

    }
}
