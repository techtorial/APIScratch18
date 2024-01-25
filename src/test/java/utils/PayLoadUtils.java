package utils;

public class PayLoadUtils {

    public static String loginPayload(String email,String password){
        String body="{\n" +
                "    \"email\":\""+email+"\",\n" +
                "    \"password\":\""+password+"\"\n" +
                "}";
        return body;
    }

    public static String postProductPayload(String name,int price,String description,int purchase_allow){
        String body="{\n" +
                "    \"name\":\""+name+"\",\n" +
                "    \"price\":"+price+",\n" +
                "    \"description\":\""+description+"\",\n" +
                "    \"purchase_allow\":\""+purchase_allow+"\"\n" +
                "}";
        return body;
    }
}
