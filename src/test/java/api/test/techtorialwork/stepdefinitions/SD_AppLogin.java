package api.test.techtorialwork.stepdefinitions;

import api.test.techtorialwork.endpoints.EP_AppLogin;
import io.cucumber.java.en.Then;

public class SD_AppLogin {
    EP_AppLogin epAppLogin=new EP_AppLogin();
    @Then("User calls App Login end point and validates {string} from response payload")
    public void user_calls_app_login_end_point_and_validates_from_response_payload(String message) {
       epAppLogin.loginEndPoint(message);
    }

    @Then("User calls App Login end point {string},{string} and validates the {string} from response payload")
    public void user_calls_app_login_end_point_and_validates_the_from_response_payload(String email, String password, String message) {
        epAppLogin.loginEndPointNegative(email,password,message);
    }

}
