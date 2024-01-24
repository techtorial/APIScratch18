package api.test.techtorialwork.endpoints;

import api.test.techtorialwork.pojo.PJ_AppInformation;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import utils.ConfigReader;

public class EP_AppInformation {

    public Response appInformationEndPoint(){

        RestAssured.baseURI= ConfigReader.readProperty("base_url");
        RestAssured.basePath=ConfigReader.readProperty("app_information");

        Response response=RestAssured.given().accept(ContentType.JSON)
                .when().get().then().statusCode(200).log().body().extract().response();

        return response;
    }

    public void validateAppInformation(String message,String companyName,String companyEmail,String companyWebsite){
        PJ_AppInformation deserializedResponse=appInformationEndPoint().as(PJ_AppInformation.class);

        Assert.assertEquals(message,deserializedResponse.getMessage());
        Assert.assertEquals(companyName,deserializedResponse.getData().getCompany_name());
        Assert.assertEquals(companyEmail,deserializedResponse.getData().getCompany_email());
        Assert.assertEquals(companyWebsite,deserializedResponse.getData().getWebsite());

    }
}
