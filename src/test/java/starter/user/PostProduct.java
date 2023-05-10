package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class PostProduct {
    protected String url = "https://altashop-api.fly.dev/api/products";

    @Step("I set POST new product api endpoints")
    public String setPostApiEndpoint() {
        return url ;
    }
    @Step("I send POST new product HTTP request")
    public void sendPostHttpRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "Sony PS5");
        requestBody.put("description","play has no limits");
        requestBody.put("price",299);

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpoint());
    }


    @Step("I receive valid HTTP response code 200 2")
    public void receiveHttpResponseCode() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid post data for new product")
    public void validateData() {
        restAssuredThat(response -> response.body("data",notNullValue()));
    }
}
