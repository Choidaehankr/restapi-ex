package restapi.ex.sample.sampleapi.common.response;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import org.springframework.http.HttpStatus;
import restapi.ex.sample.sampleapi.common.enums.ExceptionEnum;

@Getter
@ToString
public class ApiExceptionEntity {
    private String errorCode;
    private String errorMessage;

    @Builder
    public ApiExceptionEntity(HttpStatus status, String errorCode, String errorMessage){
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }
}
