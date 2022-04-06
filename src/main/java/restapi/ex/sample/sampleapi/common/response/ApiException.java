package restapi.ex.sample.sampleapi.common.response;


import lombok.Getter;
import restapi.ex.sample.sampleapi.common.enums.ExceptionEnum;

@Getter
public class ApiException extends RuntimeException {
    private ExceptionEnum error;

    public ApiException(ExceptionEnum e) {
        super(e.getMessage());
        this.error = e;
        throw new ApiException(ExceptionEnum.SECURITY_01);  // ?
    }
}
