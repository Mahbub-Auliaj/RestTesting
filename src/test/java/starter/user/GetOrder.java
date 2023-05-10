package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class GetOrder {
    protected static String url = "https://altashop-api.fly.dev/api/orders";

    @Step("I receive valid post data for new order")
    public String setApiEndpoint() {
        return url ;
    }
    @Step("I send GET order HTTP request")
    public void sendGetHttpRequest() {
        SerenityRest.given().header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkpvaG4gRG9lIiwiRW1haWwiOiJzb21lb25lQG1haWwuY29tIn0.WvBSxcQEqqniC1v08LzkrHcELegs0b7vtjGPWiaEWcI")
                .get(setApiEndpoint());
    }
    @Step("I receive valid HTTP response code 200 16")
    public void validateHttpResposeCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid get data for order")
    public void validateData() {
        restAssuredThat(response -> response.body("data",notNullValue()));
    }
}
