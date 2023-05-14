package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.*;

public class PostSteps {

    @Steps
    PostLogin postLogin;


    @Given("I set POST login api endpoints")
    public void setPostLoginApiEndpoints(){
        postLogin.setPostApiEndpoint();
    }
    @When("I send POST login HTTP request")
    public void sendPostLoginHttpRequest(){
        postLogin.sendPostHttpRequest();
    }
    @Then("I receive valid HTTP response code 200 13")
    public void receiveValidHttpResponse13(){
        postLogin.receiveHttpResponseCode201();
    }
    @And("I receive valid post data for login user")
    public void receivePostDataLoginUser(){
        postLogin.validateDataNewPost();
    }


}
