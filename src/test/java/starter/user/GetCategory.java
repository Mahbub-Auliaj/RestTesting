package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class GetCategory {
    protected static String url = "https://altashop-api.fly.dev/api/categories";

    @Step("I set GET category api endpoints")
    public String setApiEndpoint() {
        return url + "/12509" ;
    }
    @Step("I send GET category HTTP request")
    public void sendGetHttpRequest() {
        SerenityRest.given().get(setApiEndpoint());
    }
    @Step("I receive valid HTTP response code 200 10")
    public void validateHttpResposeCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid get data for product category")
    public void validateDataSinglePost() {
        restAssuredThat(response -> response.body("data",notNullValue()));
    }
}
