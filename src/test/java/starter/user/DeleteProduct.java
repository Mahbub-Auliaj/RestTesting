package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteProduct {
    protected static String url = "https://altashop-api.fly.dev/api/products";

    @Step("I set DELETE product api endpoint")
    public String setApiEndpoint() {
        return url + "/12907" ;
    }
    @Step("I send DELETE product HTTP request")
    public void sendDeleteHttpRequest() {
        SerenityRest.given().delete(setApiEndpoint());
    }
    @Step("I receive valid HTTP response code 200 4")
    public void validateHttpResposeCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

}
