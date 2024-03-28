package tests.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;

import static org.hamcrest.Matchers.equalTo;
import static io.restassured.RestAssured.given;
public class checkSts {

    @Then("the response status code should be valid")
    public void the_response_status_code_should_be_valid() {
        given()
                .get(ApiEndPoint.USD_LATEST_ENDPOINT)
                .then()
                .statusCode(equalTo(200));
    }
    @And("the response body should contain a valid status")
    public void the_response_body_should_contain_a_valid_status() {
        given()
                .get(ApiEndPoint.USD_LATEST_ENDPOINT)
                .then()
                .body("result", equalTo("success"));
    }


}
