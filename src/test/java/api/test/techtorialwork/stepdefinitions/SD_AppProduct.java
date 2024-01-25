package api.test.techtorialwork.stepdefinitions;

import api.test.techtorialwork.endpoints.EP_AppCompany;
import api.test.techtorialwork.endpoints.EP_AppProduct;
import io.cucumber.java.en.Then;

public class SD_AppProduct {
    EP_AppProduct epAppProduct=new EP_AppProduct();
    @Then("User calls App Product End point with {string},{string},{string},{string} and validates {string}")
    public void user_calls_app_product_end_point_with_and_validates(String name, String price, String description, String purchase_allow,
                                                                    String message) {
    epAppProduct.validatePostAppProduct(name,price,description,purchase_allow,message);
    }
}
