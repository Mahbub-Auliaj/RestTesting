package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.*;

public class PostSteps {

    @Steps
    PostProduct postProduct;
    @Steps
    GetProduct getProduct;
    @Steps
    GetAllProduct getAllProduct;
    @Steps
    DeleteProduct deleteProduct;
    @Steps
    PostRating postRating;
    @Steps
    GetRating getRating;
    @Steps
    PostComment postComment;
    @Steps
    GetComment getComment;
    @Steps
    PostCategory postCategory;
    @Steps
    GetCategory getCategory;
    @Steps
    DeleteCategory deleteCategory;
    @Steps
    PostRegister postRegister;
    @Steps
    PostLogin postLogin;
    @Steps
    GetInfo getInfo;
    @Steps
    PostOrder postOrder;
    @Steps
    GetOrder getOrder;
    @Given("I set GET all product api endpoints")
    public void getApiAllProductEndpoints(){
        getAllProduct.setApiEndpoint();
    }
    @When("I send GET all product HTTP request")
    public void sendGetAllProductHttpRequest(){
        getAllProduct.sendGetHttpRequest();
    }
    @Then("I receive valid HTTP response code 200 1")
    public void receiveValidHttpResponse1(){
        getAllProduct.validateHttpResposeCode200();
    }
    @And("I receive valid get data for all product")
    public void receiveGetDataAllProduct(){
        getAllProduct.validateData();
    }
    @Given("I set POST new product api endpoints")
    public void setPostPRoductApiEndpoints(){
        postProduct.setPostApiEndpoint();
    }
    @When("I send POST new product HTTP request")
    public void sendPostProductHttpRequest(){
        postProduct.sendPostHttpRequest();
    }
    @Then("I receive valid HTTP response code 200 2")
    public void receiveValidHttpResponse2(){
        postProduct.receiveHttpResponseCode();
    }
    @And("I receive valid post data for new product")
    public void receivePostDataNewProduct(){
        postProduct.validateData();
    }
    @Given("I set GET product by id api endpoints")
    public void getSingleApiEnpoints(){
        getProduct.setApiEndpoint();
    }
    @When("I send GET product by id HTTP request")
    public void sendGetSingleHttpRequest(){
        getProduct.sendGetHttpRequest();
    }
    @Then("I receive valid HTTP response code 200 3")
    public void receiveValidHttpResponse3(){
        getProduct.validateHttpResposeCode200();
    }
    @And("I receive valid get data for single product")
    public void receiveValidGetDataSingleProduct(){
        getProduct.validateData();
    }
    @Given("I set DELETE product api endpoint")
    public void setDeleteProductApiEndpoint(){
        deleteProduct.setApiEndpoint();
    }
    @When("I send DELETE product HTTP request")
    public void sendDeleteProductHttpRequest(){
        deleteProduct.sendDeleteHttpRequest();
    }
    @Then("I receive valid HTTP response code 200 4")
    public void receiveValidHttpResponse4(){
        deleteProduct.validateHttpResposeCode200();
    }
    @Given("I set POST product rating api endpoints")
    public void setPostRatingApiEndpoints(){
        postRating.setPostApiEndpoint();
    }
    @When("I send POST product rating HTTP request")
    public void sendPostRatingHttpRequest(){
        postRating.sendPostHttpRequest();
    }
    @Then("I receive valid HTTP response code 200 5")
    public void receiveValidHttpResponse5(){
        postRating.receiveHttpResponseCode200();
    }
    @And("I receive valid post data for product rating")
    public void receivePostDataRating(){
        postRating.validateData();
    }
    @Given("I set GET product rating api endpoints")
    public void getRatingApiEndpoints(){
        getRating.setApiEndpoint();
    }
    @When("I send GET product rating HTTP request")
    public void sendGetRatingHttpRequest(){
        getRating.sendGetHttpRequest();
    }
    @Then("I receive valid HTTP response code 200 6")
    public void receiveValidHttpResponse6(){
        getRating.validateHttpResposeCode200();
    }
    @And("I receive valid get rating data for product")
    public void receiveValidGetDataRating(){
        getRating.validateDataSinglePost();
    }
    @Given("I set POST comment api endpoints")
    public void setPostCommentApiEndpoints(){
        postComment.setPostApiEndpoint();
    }
    @When("I send POST comment HTTP request")
    public void sendPostCommentHttpRequest(){
        postComment.sendPostHttpRequest();
    }
    @Then("I receive valid HTTP response code 200 7")
    public void receiveValidHttpResponse7(){
        postComment.receiveHttpResponseCode200();
    }
    @And("I receive valid post data for product comment")
    public void receivePostDataNewComment(){
        postComment.validateData();
    }
    @Given("I set GET comment api endpoints")
    public void getCommentApiEnpoints(){
        getComment.setApiEndpoint();
    }
    @When("I send GET comment HTTP request")
    public void sendGetCommentHttpRequest(){
        getComment.sendGetHttpRequest();
    }
    @Then("I receive valid HTTP response code 200 8")
    public void receiveValidHttpResponse8(){
        getComment.validateHttpResposeCode200();
    }
    @And("I receive valid get data for product comment")
    public void receiveValidGetDataCommentProduct(){
        getComment.validateData();
    }
    @Given("I set POST category api endpoints")
    public void setPostCategoryApiEndpoints(){
        postCategory.setPostApiEndpoint();
    }
    @When("I send POST category HTTP request")
    public void sendPostCategoryHttpRequest(){
        postCategory.sendPostHttpRequest();
    }
    @Then("I receive valid HTTP response code 200 9")
    public void receiveValidHttpResponse9(){
        postCategory.receiveHttpResponseCode200();
    }
    @And("I receive valid post data for new product category")
    public void receivePostDataNewCategory(){
        postCategory.validateDataNewPost();
    }

    @Given("I set GET category api endpoints")
    public void getCategoryApiEnpoints(){
        getCategory.setApiEndpoint();
    }
    @When("I send GET category HTTP request")
    public void sendGetCategoryHttpRequest(){
        getCategory.sendGetHttpRequest();
    }
    @Then("I receive valid HTTP response code 200 10")
    public void receiveValidHttpResponse10(){
        getCategory.validateHttpResposeCode200();
    }
    @And("I receive valid get data for product category")
    public void receiveValidGetDataCategoryProduct(){
        getCategory.validateDataSinglePost();
    }
    @Given("I set DELETE category api endpoint")
    public void setDeleteCategoryApiEndpoint(){
        deleteCategory.setApiEndpoint();
    }
    @When("I send DELETE category HTTP request")
    public void sendDeleteCategoryHttpRequest(){
        deleteCategory.sendDeleteHttpRequest();
    }
    @Then("I receive valid HTTP response code 200 11")
    public void receiveValidHttpResponse11(){
        deleteCategory.validateHttpResposeCode200();
    }
    @Given("I set POST register api endpoints")
    public void setPostRegisterApiEndpoints(){
        postRegister.setPostApiEndpoint();
    }
    @When("I send POST register HTTP request")
    public void sendPostRegisterHttpRequest(){
        postRegister.sendPostHttpRequest();
    }
    @Then("I receive valid HTTP response code 200 12")
    public void receiveValidHttpResponse12(){
        postRegister.receiveHttpResponseCode200();
    }
    @And("I receive valid post data for new user")
    public void receivePostDataNewUser(){
        postRegister.validateData();
    }
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
    @Given("I set GET user info api endpoints")
    public void getUserInfoApiEnpoints(){
        getInfo.setApiEndpoint();
    }
    @When("I send GET user info HTTP request")
    public void sendGetUserInfoHttpRequest(){
        getInfo.sendGetHttpRequest();
    }
    @Then("I receive valid HTTP response code 200 14")
    public void receiveValidHttpResponse14(){
        getInfo.validateHttpResposeCode200();
    }
    @And("I receive valid get data for user information")
    public void receiveValidGetDataUserInfo(){
        getInfo.validateDataSinglePost();
    }
    @Given("I set POST order api endpoints")
    public void setPostOrderApiEndpoints(){
        postOrder.setPostApiEndpoint();
    }
    @When("I send POST order HTTP request")
    public void sendPostOrderHttpRequest(){
        postOrder.sendPostHttpRequest();
    }
    @Then("I receive valid HTTP response code 200 15")
    public void receiveValidHttpResponse15(){
        postOrder.receiveHttpResponseCode200();
    }
    @And("I receive valid post data for new order")
    public void receivePostDataOrder(){
        postOrder.validateData();
    }
    @Given("I set GET order api endpoints")
    public void getOrderApiEnpoints(){
        getOrder.setApiEndpoint();
    }
    @When("I send GET order HTTP request")
    public void sendGetOrderHttpRequest(){
        getOrder.sendGetHttpRequest();
    }
    @Then("I receive valid HTTP response code 200 16")
    public void receiveValidHttpResponse16(){
        getOrder.validateHttpResposeCode200();
    }
    @And("I receive valid get data for order")
    public void receiveValidGetDataOrder(){
        getOrder.validateData();
    }
}
