package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class GetComment {
    protected static String url = "https://altashop-api.fly.dev/api/products/2/comments";

    @Step("I set GET comment api endpoints")
    public String setApiEndpoint() {
        return url ;
    }
    @Step("I send GET comment HTTP request")
    public void sendGetHttpRequest() {
        SerenityRest.given().get(setApiEndpoint());
    }
    @Step("I receive valid HTTP response code 200 8")
    public void validateHttpResposeCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid get data for product comment")
    public void validateData() {
        restAssuredThat(response -> response.body("data",notNullValue()));
    }
}
