package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class PostCategory {
    protected String url = "https://altashop-api.fly.dev/api/categories";

    @Step("I set POST category api endpoints")
    public String setPostApiEndpoint() {
        return url ;
    }
    @Step("I send POST category HTTP request")
    public void sendPostHttpRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name","gaming");
        requestBody.put("description","for gaming purposes");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpoint());
    }


    @Step("I receive valid HTTP response code 200 9")
    public void receiveHttpResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid post data for new product category")
    public void validateDataNewPost() {
        restAssuredThat(response -> response.body("data",notNullValue()));;
    }
}
