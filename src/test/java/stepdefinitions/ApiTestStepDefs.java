package stepdefinitions;

import io.cucumber.java.en.*;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class ApiTestStepDefs {
    Response response;
    @Given("user sends GET request to {string}")
    public void user_sends_get_request_to(String endPoint) {

      Response response =   given().when().get(endPoint);
      response.prettyPrint();

    }
    @Then("HTTP status code should be {int}")
    public void http_status_code_should_be(Integer statusCode) {

        assertEquals(200,response.getStatusCode());

    }
    }
