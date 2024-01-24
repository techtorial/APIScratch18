package api.test.techtorialwork.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @JsonIgnoreProperties(ignoreUnknown = true)
public class PJ_AppCompanyData {

    private String company_name;
    private String company_email;
    private String company_phone;
}
