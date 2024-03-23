package tests.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.lessThanOrEqualTo;

public class USDtoAEDSteps {
    @When("the user requests USD price against AED")
    public void theUserRequestsUSDPriceAgainstAED() {

    }

    @Then("the response should contain a price within the range of {float} - {float}")
    public void theResponseShouldContainAPriceWithinTheRangeOf(float minPrice, float maxPrice) {
        given()
                .get(ApiEndPoints.USD_LATEST_ENDPOINT)
                .then()
                .body("rates.AED", greaterThanOrEqualTo(minPrice))
                .and()
                .body("rates.AED", lessThanOrEqualTo(maxPrice));
    }
}
