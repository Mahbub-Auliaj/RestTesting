package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class GetAllProduct {
    protected static String url = "https://altashop-api.fly.dev/api/products";

    @Step("I set GET all product api endpoints")
    public String setApiEndpoint() {
        return url ;
    }
    @Step("I send GET all product HTTP request")
    public void sendGetHttpRequest() {
        SerenityRest.given().get(setApiEndpoint());
    }
    @Step("I receive valid HTTP response code 200 1")
    public void validateHttpResposeCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid get data for all product")
    public void validateData() {
        restAssuredThat(response -> response.body("data",notNullValue()));
    }
}
