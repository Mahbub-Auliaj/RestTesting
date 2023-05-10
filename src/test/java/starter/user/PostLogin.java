package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class PostLogin {
    protected String url = "https://altashop-api.fly.dev/api/auth/login";

    @Step("I set POST login api endpoints")
    public String setPostApiEndpoint() {
        return url ;
    }
    @Step("I send POST login HTTP request")
    public void sendPostHttpRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email","someone@mail.com");
        requestBody.put("password","123123");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpoint());
    }


    @Step("I receive valid HTTP response code 200 13")
    public void receiveHttpResponseCode201() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid post data for login user")
    public void validateDataNewPost() {
        restAssuredThat(response -> response.body("data",notNullValue()));
    }
}
