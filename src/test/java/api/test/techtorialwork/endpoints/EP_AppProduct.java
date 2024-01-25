package api.test.techtorialwork.endpoints;

import api.test.techtorialwork.pojo.PJ_AppProduct;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import utils.ConfigReader;
import utils.PayLoadUtils;

public class EP_AppProduct {

    public void validatePostAppProduct(String name, String price, String description, String purchase_allow, String message) {

        RestAssured.baseURI = ConfigReader.readProperty("base_url");
        RestAssured.basePath = ConfigReader.readProperty("app_product");

        Response response = RestAssured.given().contentType(ContentType.JSON).accept(ContentType.JSON)
                .header("Authorization", ConfigReader.readProperty("bearer_token"))
                .body(PayLoadUtils.postProductPayload(name, Integer.parseInt(price), description, Integer.parseInt(purchase_allow)))
                .when().post().then().statusCode(200).log().body().extract().response();

        PJ_AppProduct deserializedResponse = response.as(PJ_AppProduct.class);

        Assert.assertEquals(message, deserializedResponse.getMessage());
    }
}
