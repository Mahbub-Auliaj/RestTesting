package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteCategory {
    protected static String url = "https://altashop-api.fly.dev/api/categories";

    @Step("I set DELETE category api endpoint")
    public String setApiEndpoint() {
        return url + "/1" ;
    }
    @Step("I send DELETE category HTTP request")
    public void sendDeleteHttpRequest() {
        SerenityRest.given().delete(setApiEndpoint());
    }
    @Step("I receive valid HTTP response code 200 11")
    public void validateHttpResposeCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }
}
