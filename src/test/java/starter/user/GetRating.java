package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class GetRating {
    protected static String url = "https://altashop-api.fly.dev/api/products";

    @Step("I set GET product rating api endpoints")
    public String setApiEndpoint() {
        return url + "/14486/ratings" ;
    }
    @Step("I send GET product rating HTTP request")
    public void sendGetHttpRequest() {
        SerenityRest.given().get(setApiEndpoint());
    }
    @Step("I receive valid HTTP response code 200 6")
    public void validateHttpResposeCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid get rating data for product")
    public void validateDataSinglePost() {
        restAssuredThat(response -> response.body("data",notNullValue()));
    }
}
