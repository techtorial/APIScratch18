package api.test.techtorialwork.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @JsonIgnoreProperties(ignoreUnknown = true)
public class PJ_AppInformation {

    private String message;
    private PJ_AppInformationData data;
}
