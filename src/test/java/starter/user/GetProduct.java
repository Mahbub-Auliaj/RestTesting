package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class GetProduct {
    protected static String url = "https://altashop-api.fly.dev/api/products";

    @Step("I set GET product by id api endpoints")
    public String setApiEndpoint() {
        return url ;
    }
    @Step("I send GET product by id HTTP request")
    public void sendGetHttpRequest() {
        SerenityRest.given().get(setApiEndpoint());
    }
    @Step("I receive valid HTTP response code 200 3")
    public void validateHttpResposeCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid get data for single product")
    public void validateData() {
        restAssuredThat(response -> response.body("data",notNullValue()));
    }
}
