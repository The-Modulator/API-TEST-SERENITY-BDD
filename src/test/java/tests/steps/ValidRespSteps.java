package tests.steps;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import static org.hamcrest.Matchers.equalTo;
import static io.restassured.RestAssured.given;

public class ValidRespSteps {
    @Given("the API is accessible")
    public void theAPIIsAccessible() {
    }

    @When("the user makes a request to the API")
    public void theUserMakesARequestToTheAPI() {

    }

    @Then("the response status code should be {int}")
    public void theResponseStatusCodeShouldBe(int expectedStatusCode) {
        given()
                .get(ApiEndPoints.USD_LATEST_ENDPOINT)
                .then()
                .statusCode(expectedStatusCode);
    }

    @Then("the response body should contain a valid price")
    public void theResponseBodyShouldContainAValidPrice() {
        given()
                .get(ApiEndPoints.USD_LATEST_ENDPOINT)
                .then()
                .body("rates.USD", equalTo(1));
    }
}

