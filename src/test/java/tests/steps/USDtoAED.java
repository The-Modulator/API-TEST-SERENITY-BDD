package tests.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.lessThanOrEqualTo;

public class USDtoAED {

    @When("the user requests USD price against AED")
    public void the_user_requests_usd_price_against_aed() {

    }
    @Then("the response should contain a price within the range of {float} - {float}")
    public void the_response_should_contain_a_price_within_the_range_of(float minValue, float maxValue) {
        given()
                .get(ApiEndPoint.USD_LATEST_ENDPOINT)
                .then()
                .body("conversion_rates.AED",greaterThanOrEqualTo(minValue))
                .and()
                .body("conversion_rates.AED", lessThanOrEqualTo(maxValue));
    }


}
