package tests.steps;

import io.cucumber.java.en.Then;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.lessThanOrEqualTo;

public class respTime {

    @Then("API response time is not less than {int} seconds")
    public void api_response_time_is_not_less_than_seconds(Integer apiTime) {
        given()
                .get(ApiEndPoint.USD_LATEST_ENDPOINT)
                .then()
                .time(lessThanOrEqualTo(apiTime * 1000L));
    }
}
