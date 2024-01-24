package api.test.techtorialwork.endpoints;

import api.test.techtorialwork.pojo.PJ_AppCompany;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import utils.ConfigReader;

public class EP_AppCompany {

    public void validateCompanyInformation(String message,String name,String email,String phone){
        RestAssured.baseURI= ConfigReader.readProperty("base_url");
        RestAssured.basePath= ConfigReader.readProperty("app_company");

        Response response = RestAssured.given().accept(ContentType.JSON)
                .header("Authorization", ConfigReader.readProperty("bearer_token"))
                .when().get().then().statusCode(200).log().body().extract().response();

        PJ_AppCompany deserializedResponse=response.as(PJ_AppCompany.class);//deserializing

        Assert.assertEquals(message,deserializedResponse.getMessage());
        Assert.assertEquals(name,deserializedResponse.getData().getCompany_name());
        Assert.assertEquals(email,deserializedResponse.getData().getCompany_email());
        Assert.assertEquals(phone,deserializedResponse.getData().getCompany_phone());
    }
}
