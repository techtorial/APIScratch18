package api.test.techtorialwork.endpoints;

import api.test.techtorialwork.pojo.PJ_AppLogin;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import utils.ConfigReader;
import utils.PayLoadUtils;

public class EP_AppLogin {

    public void loginEndPoint(String message){
        RestAssured.baseURI= ConfigReader.readProperty("base_url");
        RestAssured.basePath=ConfigReader.readProperty("app_login");

        Response response=RestAssured.given().accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .body(PayLoadUtils.loginPayload(ConfigReader.readProperty("email"),
                        ConfigReader.readProperty("password")))
                .when().post().then().statusCode(200).log().body().extract().response();

            PJ_AppLogin deserializedResponse=response.as(PJ_AppLogin.class);

        Assert.assertEquals(message,deserializedResponse.getMessage());
    }

    public void loginEndPointNegative(String email,String password,String message){
        RestAssured.baseURI= ConfigReader.readProperty("base_url");
        RestAssured.basePath=ConfigReader.readProperty("app_login");

        Response response=RestAssured.given().accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .body(PayLoadUtils.loginPayload(email,password))
                .when().post().then().statusCode(403).log().body().extract().response();

        PJ_AppLogin deserializedResponse=response.as(PJ_AppLogin.class);

        Assert.assertEquals(message,deserializedResponse.getMessage());
    }


}
