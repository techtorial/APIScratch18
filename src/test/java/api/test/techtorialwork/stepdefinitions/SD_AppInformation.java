package api.test.techtorialwork.stepdefinitions;

import api.test.techtorialwork.endpoints.EP_AppInformation;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SD_AppInformation {
    EP_AppInformation epAppInformation=new EP_AppInformation();

    @Then("User validates {string},{string},{string},and {string} from App response payload")
    public void user_validates_and_from_app_response_payload(String message, String companyName, String companyEmail, String companyWebsite) {
    epAppInformation.validateAppInformation(message,companyName,companyEmail,companyWebsite);
    }
}
