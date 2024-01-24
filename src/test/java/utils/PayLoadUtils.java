package utils;

public class PayLoadUtils {

    public static String loginPayload(String email,String password){
        String body="{\n" +
                "    \"email\":\""+email+"\",\n" +
                "    \"password\":\""+password+"\"\n" +
                "}";
        return body;
    }
}
